
package com.infosys.app.serviceImpl;

import java.io.IOException;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.infosys.app.exception.EmailException;

import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMessage.RecipientType;

@Service
public class EmailServiceImpl {
	Logger logger = LoggerFactory.getLogger(RoomtypeServiceImpl.class);
	@Autowired
	JavaMailSender mailSender;
	final Configuration configuration;

	public EmailServiceImpl(Configuration configuration) {
		this.configuration = configuration;
	}

	public String sendEmail(String amenitiesjsonData) throws EmailException, IOException, TemplateException {

		JSONObject jsonObject = new JSONObject(amenitiesjsonData);
		JSONArray jsonArray = jsonObject.getJSONArray("amenties");
		String[] amenities = new String[jsonArray.length()];
		int index = 0;
		for (Object obj : jsonArray) {
			amenities[index++] = obj.toString();
		}

		logger.info("amenities1 amenities" + amenities);
		MimeMessage message = mailSender.createMimeMessage();

		try {

			logger.info("Started creating mail");

			LocalDateTime currentDate = LocalDateTime.now();
			message.setFrom("biswajitnayak815@gmail.com");

			message.setSubject("Successfully Added Room");

			message.setRecipients(RecipientType.TO, "biswajitnayak814@gmail.com");

			String htmlTemplate = "<p>Dear ${name},</p>"

					+ " <p>You have successfully added ${roomType} room.Please see your added room details as below:</p>"

					+ " <p>Room Type : ${roomType}</p>" + " <p>Added Date : ${BookingDate}</p>"

					+ " <p>Amenities Details :</p>";

			if (amenities.length == 0)

				htmlTemplate = htmlTemplate + " <p>&emsp;&emsp;No amenities added</p>";

			else {

				for (String amenity : amenities) {

					htmlTemplate = htmlTemplate + " <p>&emsp;&emsp;-" + amenity + "</p>";

				}

			}

			htmlTemplate = htmlTemplate + " <p>Thanks and Regards,</p>" + " <p>Infy-Hotel Team</p>";

			htmlTemplate = htmlTemplate.replace("${name}", "Biswajit");

			htmlTemplate = htmlTemplate.replace("${roomType}", "superior");

			htmlTemplate = htmlTemplate.replace("${BookingDate}", currentDate.toString());

			message.setContent(htmlTemplate, "text/html; charset=utf-8");
			logger.info("Created mail");

		} catch (MessagingException e) {
		//logger.error(e.getMessage());
			throw new EmailException(e.getMessage());
			//return "error";

		}

		mailSender.send(message);

		logger.info("Successfully sent mail");

		return "Successfully sent mail";

	}
	 public  String getEmailContent(String amenitiesjsonData,String roomType) throws IOException, TemplateException {
	        StringWriter stringWriter = new StringWriter();
	        Map<String, Object> model = new HashMap<>();
	        JSONObject jsonObject = new JSONObject(amenitiesjsonData);
			JSONArray jsonArray = jsonObject.getJSONArray("amenties");
			String[] amenities = new String[jsonArray.length()];
			LocalDateTime currentDate = LocalDateTime.now();
			int index = 0;
			for (Object obj : jsonArray) {
				amenities[index++] = obj.toString();
			}
	        model.put("user", "Biswajit");
	        model.put("roomType",roomType);
	        model.put("amenities",amenities);
	        model.put("BookingDate",currentDate.toString());
	        
	       // configuration.getTemplate("MailSend.ftlh").process(model, stringWriter);
	        configuration.getTemplate("RoomAddEmail.html").process(model, stringWriter);
	        return stringWriter.getBuffer().toString();
	    }
	  
	   public void sendEmailFreeTemplate(String amenitiesjsonData,String roomType) throws MessagingException, IOException, TemplateException {
	        MimeMessage mimeMessage = mailSender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
	        helper.setSubject("WELCOME TO INFY ADD ROOM");
	        helper.setTo("biswajitnayak814@gmail.com");
	        String emailContent = getEmailContent( amenitiesjsonData,roomType);
	        helper.setText(emailContent, true);
	        mailSender.send(mimeMessage);
	    }
	   
}

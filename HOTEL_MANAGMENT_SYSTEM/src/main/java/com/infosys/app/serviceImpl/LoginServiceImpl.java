package com.infosys.app.serviceImpl;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.app.Repository.loginRepository;
import com.infosys.app.dto.LoginDTO;
import com.infosys.app.entity.Login;
import com.infosys.app.service.LoginService;


@Service
public class LoginServiceImpl implements LoginService {
	/*
	 * @Autowired PasswordEncoder passwordEncoder;
	 */
	
	@Autowired
	loginRepository logrepo;
	
	@Override
	public String addUser(LoginDTO loginDto) {
		Login login = new Login();
		login.setPassword(Base64.getEncoder().encodeToString(loginDto.getPassword().getBytes()));
		login.setUserName(loginDto.getUserName());
		Login logindata=logrepo.save(login);
		
		return logindata.getUserName()+"  :: user added sucessfully";
	}

}

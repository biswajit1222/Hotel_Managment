/*
 * package com.infosys.app.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.Customizer; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfiguration; import
 * org.springframework.security.config.http.SessionCreationPolicy; import
 * org.springframework.security.web.SecurityFilterChain; import static
 * org.springframework.security.config.Customizer.withDefaults;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class AppWebSecurity {
 * 
 * 
 * @Bean public SecurityFilterChain filterChain(HttpSecurity http) throws
 * Exception {
 * 
 * 
 * http.authorizeHttpRequests((auth)-> auth
 * .requestMatchers("/infy/homepage").permitAll());
 * //.anyRequest().authenticated()) .httpBasic(withDefaults());
 * //.anyRequest().permitAll()); return http.build();
 * 
 * 
 * 
 * // http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
 * 
 * http.authorizeRequests((auth)->
 * auth.requestMatchers("/infy/homepage").permitAll()
 * .anyRequest().authenticated()).httpBasic(); return http.build();
 * 
 * http .authorizeHttpRequests((requests) -> requests
 * .requestMatchers("/").permitAll() .anyRequest().authenticated() )
 * .formLogin((form) -> form .loginPage("/homepage") .permitAll() )
 * .logout((logout) -> logout.permitAll());
 * 
 * return http.build(); } }
 */
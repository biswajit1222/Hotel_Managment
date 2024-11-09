/*
 * package com.infosys.app.config;
 * 
 * import org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity;
 * 
 * @Configuration
 * 
 * //@EnableWebSecurity public class TestConfig {
 * 
 * 
 * @Order(2) protected SecurityFilterChain filterChain(HttpSecurity http) throws
 * Exception { http.csrf().disable();
 * 
 * 
 * http.authorizeHttpRequests( (auth) ->
 * auth.requestMatchers("/infy/**").permitAll().anyRequest().authenticated());
 * 
 * 
 * http.authorizeHttpRequests().anyRequest().authenticated().and().formLogin().
 * and().httpBasic();
 * 
 * return http.build(); }
 * 
 * @Order(1)
 * 
 * 
 * 
 * @Bean
 * 
 * @Order(1) protected SecurityFilterChain filterChainhome(HttpSecurity http)
 * throws Exception { http.csrf().disable(); http.authorizeHttpRequests( (auth)
 * ->
 * auth.requestMatchers("infy/homepage").permitAll().anyRequest().permitAll());
 * return http.build(); }
 * 
 * @Bean
 * 
 * @Order(2) protected SecurityFilterChain filter2(HttpSecurity http) throws
 * Exception { http.authorizeHttpRequests( (auth) ->
 * auth.requestMatchers("/infy/ManageBooking").permitAll().anyRequest().
 * authenticated()); return http.build();
 * 
 * }
 * 
 * 
 * 
 * 
 * @Bean protected SecurityFilterChain filter3(HttpSecurity http) throws
 * Exception { http.csrf().disable(); http.authorizeHttpRequests( (auth) ->
 * auth.requestMatchers("infy/homepage").permitAll()
 * .requestMatchers("infy/ManageBooking").authenticated()
 * .anyRequest().permitAll()); return http.build();
 * 
 * }
 * 
 * 
 * 
 * }
 */
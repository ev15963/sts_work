package com.javateam.springSecuritySample1;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PasswordEncoderGenerator {

	private static final Logger log = LoggerFactory.getLogger(PasswordEncoderGenerator.class);
	
	@Test
	public void test() {

		log.info("test");
		int i = 0;
		while (i < 10) {
			String password = "abcd12234";
			
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String hashedPassword = passwordEncoder.encode(password);
	
			log.info("hashedpassword : "+hashedPassword);
			i++;
		}
	} //

} //

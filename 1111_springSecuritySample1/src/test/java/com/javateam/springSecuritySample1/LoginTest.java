/**
 * 
 */
package com.javateam.springSecuritySample1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

// spring security
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.*;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.authenticated;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.formLogin;


// import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.web.FilterChainProxy;

import lombok.extern.java.Log;


/**
 * 濡쒓렇�씤 �넻�빀 �뀒�뒪�듃
 * @author java
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
        "file:src/main/webapp/WEB-INF/spring/root-context.xml",
        "file:src/main/webapp/WEB-INF/spring/security-context.xml"})
@WebAppConfiguration
@Log
public class LoginTest {
	
	private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
	
	@Autowired
	private WebApplicationContext wac;
	
	@Autowired
    private FilterChainProxy springSecurityFilterChain;
	
	@Autowired
	private AuthController authController;
	
	private MockMvc mockMvc;
	
	private String id;
	private String pw;
	private String role;
	
	@Before
	public void init() {
		
		mockMvc = MockMvcBuilders.webAppContextSetup(wac)
		// mockMvc = MockMvcBuilders.standaloneSetup(authController)
			     .apply(springSecurity(springSecurityFilterChain))
			     .build();
		 
		id = "spring";
		pw = "1234";
		role = "USER"; // ROLE_UESR => USER
	}

	@Test
	// @WithMockUser(username = "admin", authorities = { "ROLE_ADMIN", "ROLE_USER" })
	public void test() throws Exception {
		
		log.info("##### 濡쒓렇�씤 �뀒�뒪�듃 #####");
		
		// https://docs.spring.io/spring-security/site/docs/4.2.x/reference/html/test-mockmvc.html
		
		// �뿰寃� �젏寃�
		/*
		mockMvc.perform(get("/login")
						//	.with(csrf())
									 .with(httpBasic(id, pw)))
						//			 .with(user(id).password(pw))) // 二쇱쓽) �뿬湲곗꽌�뒗 �옒 �쟻�슜 �븞�맖 !				
						//.andExpect(authenticated().withRoles("USER","ADMIN"))
						//.andExpect(authenticated().withRoles(role))
						.andExpect(status().isOk())
						.andExpect(view().name("login"))
						.andExpect(forwardedUrl("/WEB-INF/views/login.jsp"));
		*/
		
		

		// �쑀�쓽�궗�빆) HTTP error 302 臾몄젣 : https://www.thetopsites.net/article/51771390.shtml
		// 李멸퀬) https://www.baeldung.com/spring-security-redirect-login			
		/*
		mockMvc.perform(formLogin("/login").user("username", id).password("password", pw)) // 二쇱쓽) �뿬湲곗꽌�뒗 �옒 �쟻�슜 �븞�맖 !				
						// .andExpect(authenticated().withRoles("USER","ADMIN"))
						// .andExpect(authenticated().withRoles(role))
						// .andExpect(authenticated().withUsername("admin"))
						.andExpect(status().is3xxRedirection())
						.andExpect(view().name("login"));
						//.andExpect(forwardedUrl("/WEB-INF/views/login.jsp"));
		*/
		
		mockMvc
			.perform(formLogin("/login").user("username", id).password("password", pw))
			.andExpect(authenticated().withUsername(id));
		
	}

}
package com.javateam.springSecuritySample1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javateam.springSecuritySample1.service.AuthJdbcService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	@RequestMapping("/")
	public String home() {
		
		log.info("home");
		return "redirect:/login";
	}

} //
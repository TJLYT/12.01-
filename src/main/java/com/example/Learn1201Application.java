package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.OrgService;

@SpringBootApplication
public class Learn1201Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Learn1201Application.class, args);
//		  OrgService os = context.getBean(OrgService.class);
		 // os.remove(1);
//		 os.findOrg(1);
		  //os.findOrg();
	}
}

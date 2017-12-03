package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.service.OrgService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Learn1201Application.class)
public class Learn1201ApplicationTests {

	
	@Autowired
	OrgService orgService;
	@Test
	public void contextLoads() {
		
	}
	@Test
	public void testFindById() {
		Org o = (Org) orgService.findOrg();
	System.out.println(o);
		
	}
}

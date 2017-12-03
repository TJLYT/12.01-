package com.example.service;
import java.util.List;

import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Org;
import com.example.dto.OrgRepository;
@Service
public class OrgService1 {
	 @Autowired
	    private OrgRepository orgRepository ;
	  
	 public List<Org> list(){
			return orgRepository.findAll();
	    	
	    }

	 List<Org> findByLastName(String lastName) {
		return orgRepository.findOne(lastName);
	}
	    
	    
		
}

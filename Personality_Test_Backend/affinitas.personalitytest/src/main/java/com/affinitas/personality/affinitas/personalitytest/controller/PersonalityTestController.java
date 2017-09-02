package com.affinitas.personality.affinitas.personalitytest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.affinitas.personality.affinitas.personalitytest.domain.EmailDataSys;
import com.affinitas.personality.affinitas.personalitytest.service.PersonalityTestService;


@RestController
public class PersonalityTestController {

	
private final PersonalityTestService personalityservice ;

@Autowired
PersonalityTestController(PersonalityTestService personalityservice){
	
	this.personalityservice = personalityservice ;
	
}


@RequestMapping(method = RequestMethod.POST , value ="/submitData")
public void addTestData(@RequestBody EmailDataSys emaildatasys){
	
	try{
	personalityservice.addTestData(emaildatasys);
	}
	catch(Exception e ){
		e.printStackTrace();
	}
}




	
}

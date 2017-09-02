package com.affinitas.personality.affinitas.personalitytest.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.affinitas.personality.affinitas.personalitytest.domain.EmailDataSys;
import com.affinitas.personality.affinitas.personalitytest.repositories.PersonalityTestRepo;


@Service
@Transactional
public class PersonalityTestServiceImpl implements PersonalityTestService{

	@Autowired
	private PersonalityTestRepo personalitytestRepo ;
	
	
	public PersonalityTestServiceImpl(PersonalityTestRepo personalitytestrepo){
		this.personalitytestRepo = personalitytestRepo ;
	}
	
	public void addTestData(EmailDataSys emaildatasys){
		
	String email = emaildatasys.getEmail();
	
	personalitytestRepo.delete(email);
	personalitytestRepo.save(emaildatasys);
	
	}
	
	
	
}

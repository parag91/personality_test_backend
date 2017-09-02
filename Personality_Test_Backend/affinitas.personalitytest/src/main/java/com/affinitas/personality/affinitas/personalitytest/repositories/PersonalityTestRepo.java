package com.affinitas.personality.affinitas.personalitytest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.affinitas.personality.affinitas.personalitytest.domain.EmailDataSys;

public interface PersonalityTestRepo extends CrudRepository<EmailDataSys , String>{

}

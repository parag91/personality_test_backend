package com.affinitas.personality.affinitas.personalitytest.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "EMAIL_DATA_SYS")
public class EmailDataSys implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private String serialId = null ;
	
	private String email = null ;
	
	private String tags = null ;

	
	
	public String getSerialId() {
		return serialId;
	}

	public void setSerialId(String serialId) {
		this.serialId = serialId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
	
	
	

	
	
	
}

/**
 * Basic integration tests for esubscription-service  application.
 * @since 2018/06/18
 * @version 0.0.1-SNAPSHOT
 * @author Jonathan Nmaju
 */

package com.jonathan.model;

/*
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
*/

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.Date;


@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @NotNull
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    
    @NotNull
    @Column(nullable=false)
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    
  
 

    @NotNull
    @Column(nullable=false,unique = true)
    private String email;
    
    @Column
    private String firstName;
    
    @Column
    private char gender;
    
    @NotNull
    @Column(nullable=false)
    private char consent;

    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public char getConsent() {
		return consent;
	}

	public void setConsent(char consent) {
		this.consent = consent;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
    
    
}


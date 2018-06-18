package com.jonathan.model;

/**
 * Basic integration tests for subscription-service  application.
 * @since 2018/06/18
 * @version 0.0.1-SNAPSHOT
 * @author Jonathan Nmaju
 */


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.Date;

@Entity
public class Subscription {
	
	@Id
	@NotNull
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	
	@NotNull
    @Column(nullable=false)
	private int userid;
	
	
	@NotNull
    @Column(nullable=false)
	private String subscriptionHash;
	
	
	@Column(nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date subscriptionDate;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getSubscriptionHash() {
		return subscriptionHash;
	}

	public void setSubscriptionHash(String subscriptionHash) {
		this.subscriptionHash = subscriptionHash;
	}

	public Date getSubscriptionDate() {
		return subscriptionDate;
	}

	public void setSubscriptionDate(Date subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}

	
	
	
	
	
	
	

}

package com.avtran.lil.hplus.data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table(name="CUSTOMERS")
public class Customer {
	/*
	 * 
	 * CREATE TABLE CUSTOMERS (
	    CUSTOMER_ID BIGINT PRIMARY KEY AUTO_INCREMENT,
	    FIRST_NAME VARCHAR(64),
	    LAST_NAME VARCHAR(64),
	    EMAIL VARCHAR(128) UNIQUE,
	    PHONE VARCHAR(32),
	    ADDRESS VARCHAR(256),
	    CITY VARCHAR(64),
	    STATE CHAR(2),
	    ZIPCODE VARCHAR(12)
	);
	 */
	@Id
	@Column(name="CUSTOMER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PHONE")
	private String phoneNumber;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="CITY")
	private String city;
	@Column(name="STATE")
	private String state;
	@Column(name="ZIPCODE")
	private String zipcode;
}

package com.everis.finals.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "personas")
@Getter
@Setter
@Data
public class Persons implements Serializable{
	
	/**
	 * 
	 */


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String document;
	private Boolean fingerprint;
	private Boolean blacklist;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public Boolean getFingerprint() {
		return fingerprint;
	}
	public void setFingerprint(Boolean fingerprint) {
		this.fingerprint = fingerprint;
	}
	public Boolean getBlacklist() {
		return blacklist;
	}
	public void setBlacklist(Boolean blacklist) {
		this.blacklist = blacklist;
	}
	
	
	private static final long serialVersionUID = 2871081917219112267L;
	
	

	
	

}

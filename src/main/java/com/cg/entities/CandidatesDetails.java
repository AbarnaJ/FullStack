package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="CandidateDetails")
@Entity
public class CandidatesDetails {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String CandidateName;
    private String Password;
	private String PartyName;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCandidateName() {
		return CandidateName;
	}
	public void setCandidateName(String candidateName) {
		CandidateName = candidateName;
	}
	public String getPartyName() {
		return PartyName;
	}
	public void setPartyName(String partyName) {
		PartyName = partyName;
	}
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "CandidatesDetails [id=" + id + ", CandidateName=" + CandidateName + ", Password=" + Password
				+ ", PartyName=" + PartyName + "]";
	}
	
	
}



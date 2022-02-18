package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="Election_Result")
@Entity
public class Result {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String PartyName;
	private String CandidateName;
	private int numOfVotes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPartyName() {
		return PartyName;
	}
	public void setPartyName(String partyName) {
		PartyName = partyName;
	}
	public String getCandidateName() {
		return CandidateName;
	}
	public void setCandidateName(String candidateName) {
		CandidateName = candidateName;
	}
	public int getNumOfVotes() {
		return numOfVotes;
	}
	public void setNumOfVotes(int numOfVotes) {
		this.numOfVotes = numOfVotes;
	}
	
	
	
}

package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="VotedCitizens")
@Entity
public class VotedCitizens {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String VoterName;
	private String PartyName;
	private String CandidateName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVoterName() {
		return VoterName;
	}
	public void setVoterName(String voterName) {
		VoterName = voterName;
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
	@Override
	public String toString() {
		return "VotedCitizens [id=" + id + ", VoterName=" + VoterName + ", PartyName=" + PartyName + ", CandidateName="
				+ CandidateName + "]";
	}
	
	
}



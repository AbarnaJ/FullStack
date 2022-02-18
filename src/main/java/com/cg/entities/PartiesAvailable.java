package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="PartiesAvailable")
@Entity
public class PartiesAvailable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String PartyName;
	private String PartyLogoName;
	
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
	public String getPartyLogoName() {
		return PartyLogoName;
	}
	public void setPartyLogoName(String partyLogoName) {
		PartyLogoName = partyLogoName;
	}
	@Override
	public String toString() {
		return "PartiesAvailable [id=" + id + ", PartyName=" + PartyName + ", PartyLogoName=" + PartyLogoName + "]";
	}
	
}

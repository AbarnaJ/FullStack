package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.CitizensDetails;

@Repository
public interface CitizenRepo extends JpaRepository<CitizensDetails,Integer>{
	public CitizensDetails getPassword(String Contact,String Password);
	public CitizensDetails Eligibility(int Age);

}

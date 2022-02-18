package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.CandidatesDetails;

@Repository
public interface CandidatesDetailsRepo extends JpaRepository<CandidatesDetails,Integer>{

	public CandidatesDetails findById( int id);
}

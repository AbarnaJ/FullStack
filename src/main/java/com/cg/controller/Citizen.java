package com.cg.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.CandidatesDetails;
import com.cg.entities.CitizensDetails;
import com.cg.repository.CandidatesDetailsRepo;
import com.cg.repository.CitizenRepo;

@RestController
public class Citizen {

	public final Logger logger=Logger.getLogger(Citizen.class);
	@Autowired
	CitizenRepo citizenRepo;
	
	@Autowired
	CandidatesDetailsRepo candidatesDetailsRepo;
	
	
	
	@RequestMapping("/doAction")
	public String doAction()
	{
		CitizensDetails t=new CitizensDetails();
		citizenRepo.save(t);
		return "Register.html";
	}
	
	@RequestMapping("/CandidatesList")
	public String goToCandidate()
	{
		return "Candidates.html";
	}

	
	@RequestMapping("/Login")
	public String doLogin(@RequestParam String Contact,String Password ,Model model){
		CitizensDetails citizen=citizenRepo.getPassword(Contact, Password);
		if(!citizen.isHasVoted())
		{
			List<CandidatesDetails> candidates = candidatesDetailsRepo.findAll();
			for(CandidatesDetails c: candidates)
			{
				model.addAllAttributes(candidates);
				
			}
		return "Login.html";	
		}
		else {
			return "Thanks.html";
		}
		
	}
	
	@RequestMapping("/Vote")
		public String VoteFor(@RequestParam int id,HttpSession session) {
			CitizensDetails citizen =((CitizensDetails) session.getAttribute("citizen"));
			if(!citizen.isHasVoted()) {
				citizen.setHasVoted(true);
				CandidatesDetails c= candidatesDetailsRepo.findById(id);
				candidatesDetailsRepo.save(c);
				citizenRepo.save(citizen);
				return "Ballot.html";
			}
			return "index.html";
		}
	
	
	
}

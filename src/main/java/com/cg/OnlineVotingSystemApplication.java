package com.cg;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cg.entities.CandidatesDetails;
import com.cg.entities.CitizensDetails;



@SpringBootApplication
@EnableJpaRepositories
public class OnlineVotingSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(OnlineVotingSystemApplication.class, args);
		CitizensDetails citizen=ctx.getBean(CitizensDetails.class);
		CandidatesDetails candidate=ctx.getBean(CandidatesDetails.class);
		
	}

}

package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Result;


@Repository
public interface ResultRepo extends JpaRepository<Result,Integer> {

	public Result findById(int id);
}

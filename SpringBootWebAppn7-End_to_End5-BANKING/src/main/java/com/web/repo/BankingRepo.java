package com.web.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Banking;

@Repository
public interface BankingRepo extends CrudRepository<Banking, Long> {

	

}

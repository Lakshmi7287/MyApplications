package com.web.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Banking;
import com.web.repo.BankingRepo;


@Service
public class BankingServiceImp implements BankingService {
	@Autowired
	private BankingRepo repo;

	@Override
	public Banking saveBanking(Banking banking) {	
			repo.save(banking);
		return banking;
	}

	@Override
	public Banking getBalance(Banking banking) {
		Long ano=banking.getAccountno();
		
		 Banking a=repo.findById(ano).get(); 
		
		return a;
	}

	@Override
	public Banking depositBanking(Banking banking) {
		Long ano=banking.getAccountno();
		double amt=banking.getAmount();
		Banking a=repo.findById(ano).get();
		double amount=a.getAmount();
		double amount1=amount+amt;
		a.setAmount(amount1);
		repo.save(a);
		return banking;
	}
@Override
public Banking withdrawBanking(Banking banking) {
	Long  ano=banking.getAccountno();
	 Double amt=banking.getAmount();
	 Banking a=repo.findById(ano).get();
	  Double amount=a.getAmount();
	  Double amount1=amount-amt;
	  a.setAmount(amount1);
	  repo.save(a);
	  return banking;
}
@Override
public Banking transferBanking(Banking banking) {
	Long ano=banking.getAccountno();
	Long tano=banking.getTargetaccountno();
	double amount=banking.getAmount();
	
	Banking a=repo.findById(ano).get();
	Double amt1=a.getAmount();
	Double amount1=amt1-amount;
	a.setAmount(amount1);
	
	Banking ta=repo.findById(tano).get();
	double amt2=ta.getAmount();
	double amount2=amt2+amount;
	ta.setAmount(amount2);
	repo.save(a);
	repo.save(ta);
	return banking;
   }

@Override
public Banking closeBanking(Banking banking) {
	Long ano=banking.getAccountno();
  Banking a=repo.findById(ano).get();
  String status=a.getStatus();
  status="InActive";
  a.setStatus(status);
  repo.save(a);
	return banking;
}

	@Override
	public List<Banking> getAllBanking() {
		 List<Banking> getAll=(List<Banking>) repo.findAll();
		return getAll;
	}
	@Override
	public void deleteBanking(Long accountno) {
		// TODO Auto-generated method stub

	}


	

}

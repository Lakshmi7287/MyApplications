package com.web.service;

import java.util.List;

import com.web.model.Banking;


public interface BankingService {

	public 	Banking saveBanking(Banking banking);
	 public Banking getBalance(Banking banking);
	public Banking depositBanking(Banking banking);
	public Banking withdrawBanking(Banking banking);
	public Banking transferBanking(Banking banking);
	public Banking closeBanking(Banking banking);
	public void deleteBanking(Long accountno);

	public List<Banking>getAllBanking();
	
	
}

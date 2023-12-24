package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Banking;
import com.web.service.BankingService;


@Controller
public class BankingController {

	@Autowired
	private BankingService service;
	
		@RequestMapping("/")
		public String homepage() {
			
			return "home";
		}

		@RequestMapping("/addCustomer")
		public String studentForm() {
			
			return "register";
		}
		@RequestMapping("/save")
		public String save(Banking banking,ModelMap model) {
			
			if(banking.getPassword().equals(banking.getCpassword())) 
            {  Banking e1=service.saveBanking(banking);
			  return "your ACCOUNT Open Suuceessfully";
            }else {
            	return "password Not Match";
            }  
		}
		@RequestMapping("/balance")
		public String balanceForm() {
			
			return "balance";
		}
		@RequestMapping("/Viewbalance")
		public String getbalanceForm(Banking banking,ModelMap model) {
			 Banking n=service.getBalance(banking);
			 String str="";
			 if("Active".equals(n.getStatus())) 
			 {	
				  if(banking.getName().equals(n.getName()))
				  {
	                   if(banking.getPassword().equals(n.getPassword())) 
	                   {
				         model.put("balance",n);
				         return "viewbalance";
	   				   } else {
	   				   return str="Password is not matching";
	   			       }
				  } else {
				  return str="name is not matching";
			      }
			 }else {
			 str=" Ohhh your Account is INActive";
			 return str;
			        }
		}
		@RequestMapping("/deposit")
		public String depositForm() {
			
			return "deposit";
		}
		
		@RequestMapping("/Viewdeposit")
		public String amtDepositForm(Banking banking,ModelMap model) {
			Banking n=service.depositBanking(banking);
			String str="";
			 if("Active".equals(n.getStatus())) 
			 {	
				  if(banking.getName().equals(n.getName()))
				  {
	                   if(banking.getPassword().equals(n.getPassword())) 
	                   {
				         model.put("deposit",n);
				         return "viewdeposit";
	   				   } else {
	   				   return str="Password is not matching";
	   			       }
				  } else {
				  return str="name is not matching";
			      }
			 }else {
			 str=" Ohhh your Account is INActive";
			 return str;
			        }
		}
		
		@RequestMapping("/withdraw")
		public String withdrawForm() {
			
			return "withdraw";
		}
		
		@RequestMapping("/Viewwithdraw")
		public String amtwithdrawForm(Banking banking,ModelMap model) {
			Banking n=service.withdrawBanking(banking);
			String str="";
			 if("Active".equals(n.getStatus())) 
			 {	
				  if(banking.getName().equals(n.getName()))
				  {
	                   if(banking.getPassword().equals(n.getPassword())) 
	                   {
				         model.put("withdraw",n);
				         return "viewwithdraw";
	   				   } else {
	   				   return str="Password is not matching";
	   			       }
				  } else {
				  return str="name is not matching";
			      }
			 }else {
			 str=" Ohhh your Account is INActive";
			 return str;
			        }
		}
		
		@RequestMapping("/transfer")
		public String transferForm() {
			
			return "transfer";
		}
		
		@RequestMapping("/Viewtransfer")
		public String amtTransferForm(Banking banking,ModelMap model) {
			Banking n=service.transferBanking(banking);
			String str="";
			
				  if(banking.getName().equals(n.getName()))
				  {
	                   if(banking.getPassword().equals(n.getPassword())) 
	                   {
				             model.put("transfer",n);
				             return "viewtransfer";
	                   } else {
		   				   return str="Password is not matching";
		   			       }
					  } else {
					  return str="name is not matching";
				      }
		}
		
		@RequestMapping("/close")
		public String closeAccountForm() {
			
			return "closeaccount";
		}
		
		@RequestMapping("/Viewclose")
		public String closeAccount(Banking banking,ModelMap model) {
			Banking n=service.closeBanking(banking);
			model.put("close", n);
			
			return "viewclose";
		}	
		@RequestMapping("/Viewcustomers")
		public String getAllCustomers(ModelMap model) {
			model.put("customers", service.getAllBanking());
			return "viewcustomers";
			
		}
}


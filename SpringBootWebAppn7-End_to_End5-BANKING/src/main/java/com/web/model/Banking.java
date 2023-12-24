package com.web.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity   
@Table(name="bank_tab2")
public class Banking {
@Id
	private Long accountno;
	private String name;
	private String password;
	@Transient//it means Should not exist in database
	private String cpassword;
	private Double amount;
	private Long mobileno;
	private String address;
	private String status;
@Transient
	private Long targetaccountno;
	
	//PDC+PPC+PSM+PGM+To String();
	
	public Banking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Banking(Long accountno, String name, String password, String cpassword, double amount, Long mobileno,
			String address, String status, Long targetaccountno) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.password = password;
		this.cpassword = cpassword;
		this.amount = amount;
		this.mobileno = mobileno;
		this.address = address;
		this.status = status;
		this.targetaccountno = targetaccountno;
	}

	public Long getAccountno() {
		return accountno;
	}

	public void setAccountno(Long accountno) {
		this.accountno = accountno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Long getMobileno() {
		return mobileno;
	}

	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTargetaccountno() {
		return targetaccountno;
	}

	public void setTargetaccountno(Long targetaccountno) {
		this.targetaccountno = targetaccountno;
	}

	@Override
	public String toString() {
		return "Banking [accountno=" + accountno + ", name=" + name + ", password=" + password + ", cpassword="
				+ cpassword + ", amount=" + amount + ", mobileno=" + mobileno + ", address=" + address + ", status="
				+ status + ", targetaccountno=" + targetaccountno + "]";
	}

	
}

package com.richim.repository.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String company_name;
	private String company_email;
	
	private int numberOfShare;
	
	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
	private List<Share> shareList;
	private int sharePrice;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCompany_email() {
		return company_email;
	}
	public void setCompany_email(String company_email) {
		this.company_email = company_email;
	}
	public int getNumberOfShare() {
		return numberOfShare;
	}
	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}
	public List<Share> getShareList() {
		return shareList;
	}
	public void setShareList(List<Share> shareList) {
		this.shareList = shareList;
	}
	public int getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	public Company(Long id, String company_name, String company_email, int numberOfShare, List<Share> shareList,
			int sharePrice) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.company_email = company_email;
		this.numberOfShare = numberOfShare;
		this.shareList = shareList;
		this.sharePrice = sharePrice;
	}
	
	public Company() {}
}

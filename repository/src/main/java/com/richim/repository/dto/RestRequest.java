package com.richim.repository.dto;

import java.io.Serializable;
import java.util.List;

import com.richim.repository.entity.Share;

public class RestRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	private String company_name;
	private String company_email;
	private int numberOfShare;
	private List<Share> shareList;
	private int sharePrice;
	public RestRequest(String company_name, String company_email, int numberOfShare, List<Share> shareList,
			int sharePrice) {
		super();
		this.company_name = company_name;
		this.company_email = company_email;
		this.numberOfShare = numberOfShare;
		this.shareList = shareList;
		this.sharePrice = sharePrice;
	}
	public RestRequest() {}
}

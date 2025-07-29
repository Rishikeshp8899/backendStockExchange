package com.richim.repository.dto;

import java.io.Serializable;
import java.util.List;

import com.richim.repository.entity.Share;

import jakarta.persistence.OneToMany;

public class RestResponse implements  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int statusCode;
	private String status;
	private String company_name;
	private String company_email;
	private int numberOfShare;
	private List<Share> shareList;
	private int sharePrice;
	private Share share;
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	
	public Share getShare() {
		return share;
	}

	public void setShare(Share share) {
		this.share = share;
	}
	
	public RestResponse() {
	}
	
	public RestResponse(int statusCode, String status, String company_name, String company_email, int numberOfShare,
			List<Share> shareList, int sharePrice, Share share) {
		super();
		this.statusCode = statusCode;
		this.status = status;
		this.company_name = company_name;
		this.company_email = company_email;
		this.numberOfShare = numberOfShare;
		this.shareList = shareList;
		this.sharePrice = sharePrice;
		this.share = share;
	}
	
}

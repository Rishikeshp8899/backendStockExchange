package com.richim.repository.dto;

import java.io.Serializable;
import java.util.List;

import com.richim.repository.constant.TypeOfRequest;
import com.richim.repository.entity.Share;

public class RestRequest implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private long shareholderId;
	private String shareholderName;
	private String company_name;
	private String company_email;
	private int numberOfShare;
	private List<Share> shareList;
	private int sharePrice;
	private long compnayId;
	private TypeOfRequest typeOfRequest;
	private long shareId;

	
	
	public RestRequest() {}
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
	
	public long getCompnayId() {
		return compnayId;
	}
	public void setCompnayId(long compnayId) {
		this.compnayId = compnayId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public TypeOfRequest getTypeOfRequest() {
		return typeOfRequest;
	}
	public void setTypeOfRequest(TypeOfRequest typeOfRequest) {
		this.typeOfRequest = typeOfRequest;
	}
	public String getShareholderName() {
		return shareholderName;
	}
	public void setShareholderName(String shareholderName) {
		this.shareholderName = shareholderName;
	}

	public long getShareholderId() {
		return shareholderId;
	}
	
	public void setShareholderId(long shareholderId) {
		this.shareholderId = shareholderId;
	}
	
	public long getShareId() {
		return shareId;
	}
	
	public void setShareId(long shareId) {
        this.shareId = shareId;}
	
	public RestRequest(long shareholderId, String shareholderName, String company_name, String company_email,
			int numberOfShare, List<Share> shareList, int sharePrice, long compnayId, TypeOfRequest typeOfRequest,
			long shareId) {
		super();
		this.shareholderId = shareholderId;
		this.shareholderName = shareholderName;
		this.company_name = company_name;
		this.company_email = company_email;
		this.numberOfShare = numberOfShare;
		this.shareList = shareList;
		this.sharePrice = sharePrice;
		this.compnayId = compnayId;
		this.typeOfRequest = typeOfRequest;
		this.shareId = shareId;
	}
	
	
	
	
}

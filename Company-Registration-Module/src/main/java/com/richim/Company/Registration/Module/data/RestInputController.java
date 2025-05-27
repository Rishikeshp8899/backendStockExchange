package com.richim.Company.Registration.Module.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class RestInputController {
	private String company_name;
	private String company_email;
	private String password;
	private long contact_no;
	private String location;
	private long turnover1;
	private long turnover2;
	private long turnover3;
	private long turnover4;
	private long turnover5;
	private String apiName;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getContact_no() {
		return contact_no;
	}
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getTurnover1() {
		return turnover1;
	}
	public void setTurnover1(long turnover1) {
		this.turnover1 = turnover1;
	}
	public long getTurnover2() {
		return turnover2;
	}
	public void setTurnover2(long turnover2) {
		this.turnover2 = turnover2;
	}
	public long getTurnover3() {
		return turnover3;
	}
	public void setTurnover3(long turnover3) {
		this.turnover3 = turnover3;
	}
	public long getTurnover4() {
		return turnover4;
	}
	public void setTurnover4(long turnover4) {
		this.turnover4 = turnover4;
	}
	public long getTurnover5() {
		return turnover5;
	}
	public void setTurnover5(long turnover5) {
		this.turnover5 = turnover5;
	}
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public RestInputController(String company_name, String company_email, String password, long contact_no,
			String location, long turnover1, long turnover2, long turnover3, long turnover4, long turnover5,
			String apiName) {
		super();
		this.company_name = company_name;
		this.company_email = company_email;
		this.password = password;
		this.contact_no = contact_no;
		this.location = location;
		this.turnover1 = turnover1;
		this.turnover2 = turnover2;
		this.turnover3 = turnover3;
		this.turnover4 = turnover4;
		this.turnover5 = turnover5;
		this.apiName = apiName;
	}
	
	public RestInputController() {}
	
}

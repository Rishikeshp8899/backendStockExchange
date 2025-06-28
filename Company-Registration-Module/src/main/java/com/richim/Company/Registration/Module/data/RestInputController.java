package com.richim.Company.Registration.Module.data;



public class RestInputController {
	private String company_name;
	private String company_email;
	private String password;
	private long contact_no;
	private String location;
	private long turnover_no_1;
	private long turnover_no_2;
	private long turnover_no_3;
	private long turnover_no_4;
	private long turnover_no_5;
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
	public long getTurnover_no_1() {
		return turnover_no_1;
	}
	public void setTurnover_no_1(long turnover_no_1) {
		this.turnover_no_1 = turnover_no_1;
	}
	public long getTurnover_no_2() {
		return turnover_no_2;
	}
	public void setTurnover_no_2(long turnover_no_2) {
		this.turnover_no_2 = turnover_no_2;
	}
	public long getTurnover_no_3() {
		return turnover_no_3;
	}
	public void setTurnover_no_3(long turnover_no_3) {
		this.turnover_no_3 = turnover_no_3;
	}
	public long getTurnover_no_4() {
		return turnover_no_4;
	}
	public void setTurnover_no_4(long turnover_no_4) {
		this.turnover_no_4 = turnover_no_4;
	}
	public long getTurnover_no_5() {
		return turnover_no_5;
	}
	public void setTurnover_no_5(long turnover_no_5) {
		this.turnover_no_5 = turnover_no_5;
	}
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public RestInputController(String company_name, String company_email, String password, long contact_no,
			String location, long turnover_no_1, long turnover_no_2, long turnover_no_3, long turnover_no_4,
			long turnover_no_5, String apiName) {
		super();
		this.company_name = company_name;
		this.company_email = company_email;
		this.password = password;
		this.contact_no = contact_no;
		this.location = location;
		this.turnover_no_1 = turnover_no_1;
		this.turnover_no_2 = turnover_no_2;
		this.turnover_no_3 = turnover_no_3;
		this.turnover_no_4 = turnover_no_4;
		this.turnover_no_5 = turnover_no_5;
		this.apiName = apiName;
	}

	public RestInputController() {}
	
	
}

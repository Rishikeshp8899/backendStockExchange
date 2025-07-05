package com.richim.security.dto;

public class responseDto {
	 private String company_name;
	   private String  company_email;
	   private String  password;
	   private int contact_no;
	   private String location;
	   private int turnover1;
	   private int turnover2;
	   private int turnover3;
	   private int turnover4;
	   private int turnover5;
 private int statusCode;
 private String status;
public int getStatusCode() {
	return statusCode;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getContact_no() {
	return contact_no;
}
public void setContact_no(int contact_no) {
	this.contact_no = contact_no;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getTurnover1() {
	return turnover1;
}
public void setTurnover1(int turnover1) {
	this.turnover1 = turnover1;
}
public int getTurnover2() {
	return turnover2;
}
public void setTurnover2(int turnover2) {
	this.turnover2 = turnover2;
}
public int getTurnover3() {
	return turnover3;
}
public void setTurnover3(int turnover3) {
	this.turnover3 = turnover3;
}
public int getTurnover4() {
	return turnover4;
}
public void setTurnover4(int turnover4) {
	this.turnover4 = turnover4;
}
public int getTurnover5() {
	return turnover5;
}
public void setTurnover5(int turnover5) {
	this.turnover5 = turnover5;
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
public responseDto(String company_name, String company_email, String password, int contact_no, String location,
		int turnover1, int turnover2, int turnover3, int turnover4, int turnover5, int statusCode, String status) {
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
	this.statusCode = statusCode;
	this.status = status;
}
public responseDto() {}

}

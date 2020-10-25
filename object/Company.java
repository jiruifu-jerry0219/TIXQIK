package com.tixqik.object;
import com.tixqik.manage.CompanyManager;

public class Company {
	public String companyname;
	public String address;
	public String city;
	public String state;
	public String idnumber;
	public String email;
	
	public Company() {
		super();
	}
	public Company(String companyname, String address, String city,
			String state, String idnumber, String email) {
		super();
		this.companyname = companyname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.idnumber = idnumber;
		this.email = email;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Company [companyname=" + companyname + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", idnumber="
				+ idnumber + ", email=" + email + "]";
	}
	
	

}

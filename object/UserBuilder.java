package com.tixqik.object;
import com.tixqik.behavior.Login;

public class UserBuilder {
	protected String username;  
    protected String password;  
    protected String type;
    protected String payment;
    protected String address;
    protected String city;
    protected String zipcode;
    protected String state;
    protected String email;
    protected String firstname;
    protected String lastname;
    protected String companyname = null;
      
    public UserBuilder() {  
        super();  
    }  

	
	public UserBuilder(String username, String password, String type,
			String payment, String address, String city, String zipcode,
			String state, String email, String firstname, String lastname,
			String companyname) {
		super();
		this.username = username;
		this.password = password;
		this.type = type;
		this.payment = payment;
		this.address = address;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.companyname = companyname;
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

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getUsername() {  
        return username;  
    }  
    public void setUsername(String username) {  
        this.username = username;  
    }  
    public String getPassword() {  
        return password;  
    }  
    public void setPassword(String password) {  
        this.password = password;  
    }  
    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override  
	
    public String toString() {  
        StringBuffer sb = new StringBuffer();  
          
        sb.append("username=");  
        sb.append(username);  
        sb.append(";password=");  
        sb.append(password);  
        sb.append(";type=");
        sb.append(type);
        sb.append(";payment=");
        sb.append(payment);
        sb.append(";address=");
        sb.append(address);
        sb.append(";city=");
        sb.append(city);
        sb.append(";zipcode= ");
        sb.append(zipcode);
        sb.append(";state=");
        sb.append(state);
        sb.append(";email= ");
        sb.append(email);
        sb.append(";first= ");
        sb.append(firstname);
        sb.append(";lastname= ");
        sb.append(lastname);
        sb.append(" ;company name= ");
        sb.append(companyname);
        return sb.toString();  
    }  

}

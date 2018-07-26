package utility;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="data")
public class Data {

	private String Firstname;
	private String Lastname;
	private String email;
	private String pass;
	
	//First Name
	@XmlElement(name="Firstname")
	public void setfirstname(String f) {
		this.Firstname=f;
	}
	
	public  String getfirstname() {
		return Firstname;
	}
	
	
	
	//Last Name
	@XmlElement(name="Lastname")
	public void setlastname(String l) {
		this.Lastname=l;
	}
	
	public String getlastname() {
		return Lastname;
	}
	
	
	
	//Email
	@XmlElement(name="email")
	public void setemail(String e) {
		this.email=e;
	}
	
	public String getemail() {
		return email;
	}

	
	

}

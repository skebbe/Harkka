package fi.harkka.model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name = "applications")
public class Application{
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Size(min=1,max=50 ,message="First name can't be empty and maximum of 50 characters")
	@Column(name = "fname")
	private String fname;
	
	@Size(min=1,max=50 ,message="Last name can't be empty and maximum of 50 characters")
	@Column(name = "lname")
	private String lname;
	
	
	@Column(name = "dob")
	private Date dob;
	
	@NotNull(message="Must choose 1 gender")
	@Column(name = "gender")
	private String gender;
	
	@Size(min=1,max=1000,message="Application can't be empty and maximum of 1000 characters")
	@Column(name = "application")
	private String application;
	
	
	public Application() {}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fName) {
		this.fname = fName;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lName) {
		this.lname = lName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	

//	@Override
//	public String toString() {
//		return "application [id=" + id + ", fname=" + fname + ", lname="
//				+ lname + ", gender=" + gender + ", application=" + application
//				+ ", dob=" + dob + "]";
//	}
	
	
	
}

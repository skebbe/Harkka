package fi.harkka.model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TABLEAPPLICATIONS")
public class Application{
	@Id@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "fname")
	private String fname;
	
	@Column(name = "lname")
	private String lname;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "application")
	private String application;
	
	@Column(name = "dob")
	private Date dob;
	
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

//	@Override
//	public String toString() {
//		return "application [id=" + id + ", fname=" + fname + ", lname="
//				+ lname + ", gender=" + gender + ", application=" + application
//				+ ", dob=" + dob + "]";
//	}
	
	
	
}

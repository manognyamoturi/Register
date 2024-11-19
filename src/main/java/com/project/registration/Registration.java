package com.project.registration;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="registration_Details")
public class Registration {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id") 
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="DateOFBirth")
	private Date dob;
	
	@Column(name="number")
	private long phone;

	public Registration(int id, String name, String email, Date dob, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
	}
	public Registration( String name, String email, Date dob, long phone) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}

}

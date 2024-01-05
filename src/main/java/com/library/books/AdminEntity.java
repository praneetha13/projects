package com.library.books;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Admin_entity")
public class AdminEntity {
	
	@Id
	String email;
	String name;
	String phone_no;
	String pswd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public AdminEntity() {}
	public AdminEntity(String name, String email, String phone_no, String pswd) {
		super();
		this.name = name;
		this.email = email;
		this.phone_no = phone_no;
		this.pswd = pswd;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	@Override
	public String toString() {
		return "AdminEntity [email=" + email + ", name=" + name + ", phone_no=" + phone_no + ", pswd=" + pswd + "]";
	}
	

}

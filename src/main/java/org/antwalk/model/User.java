package org.antwalk.model;

import java.util.Arrays;

import javax.validation.constraints.Size;

public class User
{
	@Size(min=5,max=10)        //JSR Validation
	private String name;
	private String Gender;
	private String Country;
	private String[] language;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String[] getLanguage() {
		return language;
	}
	public void setLanguage(String[] language) {
		this.language = language;
	}
	public User(String name, String gender, String country, String[] language) {
		super();
		this.name = name;
		Gender = gender;
		Country = country;
		this.language = language;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", Gender=" + Gender + ", Country=" + Country + ", language="
				+ Arrays.toString(language) + "]";
	}






}

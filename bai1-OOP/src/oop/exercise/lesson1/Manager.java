package oop.exercise.lesson1;

public class Manager {
	private String fullName;
	private int age;
	private String gender;
	private String address;
	public Manager(String fullName, int age, String gender, String address) {
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age > 0 && age <= 100)
			this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

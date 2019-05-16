package com.nnxy.model;

public class Studnet {

	private int id;// 唯一Id
	private String name;// 姓名
	private int age;// 年龄
	private int sex;// 性别
	
	
	public Studnet(int id, String name, int age, int sex) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	
	
}

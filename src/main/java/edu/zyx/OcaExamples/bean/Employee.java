package edu.zyx.OcaExamples.bean;

import java.io.Serializable;

public class Employee implements Cloneable, Serializable {
	
	private static final long serialVersionUID = -5552064895405942044L;
	
	String name;
	Integer salary;
	Integer age;
	Area areaTrabajo;
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public Area getAreaTrabajo() {
		return areaTrabajo;
	}

	public void setAreaTrabajo(Area areaTrabajo) {
		this.areaTrabajo = areaTrabajo;
	}
	
	
}

package com.duang.model;

import java.util.HashSet;
import java.util.Set;


/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Class banji;
     private String name;
     private String gender;
     private Integer age;
     private String tel;
     private String address;
     private Set grades = new HashSet(0);


    // Constructors

    /** default constructor */
    public Student() {
    }

    public Student(int id) {
    	this.id=id;
    }

    /** full constructor */
    public Student(Class banji, String name, String gender, Integer age, String tel, String address, Set grades) {
        this.banji = banji;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.tel = tel;
        this.address = address;
        this.grades = grades;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public Set getGrades() {
        return this.grades;
    }
    
    public void setGrades(Set grades) {
        this.grades = grades;
    }


	public Class getBanji() {
		return banji;
	}


	public void setBanji(Class banji) {
		this.banji = banji;
	}
   








}
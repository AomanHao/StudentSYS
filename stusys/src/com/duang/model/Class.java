package com.duang.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Class entity. @author MyEclipse Persistence Tools
 */

public class Class implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String code;
	private Set students = new HashSet(0);

	// Constructors

	/** default constructor */
	public Class() {
	}

	public Class(String name, String code) {
		this.name = name;
		this.code = code;
	}

	public Class(int id) {
		this.id=id;
	}
	
	/** full constructor */
	public Class(String name, String code, Set students) {
		this.name = name;
		this.code = code;
		this.students = students;
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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

}
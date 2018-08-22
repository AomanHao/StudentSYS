package com.duang.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Exam entity. @author MyEclipse Persistence Tools
 */

public class Exam implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Date begintime;
	private Date endtime;
	private String place;
	private Set grades = new HashSet(0);

	// Constructors

	/** default constructor */
	public Exam() {
	}

	public Exam(int id) {
		this.id=id;
	}

	public Exam(String name, Date begintime, Date endtime, String place) {
		this.name = name;
		this.begintime = begintime;
		this.endtime = endtime;
		this.place = place;
		this.grades = grades;
	}

	/** full constructor */
	public Exam(String name, Date begintime, Date endtime, String place,
			Set grades) {
		this.name = name;
		this.begintime = begintime;
		this.endtime = endtime;
		this.place = place;
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

	public Date getBegintime() {
		return this.begintime;
	}

	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}

	public Date getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Set getGrades() {
		return this.grades;
	}

	public void setGrades(Set grades) {
		this.grades = grades;
	}

}
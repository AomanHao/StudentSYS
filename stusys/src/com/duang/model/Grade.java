package com.duang.model;

/**
 * Grade entity. @author MyEclipse Persistence Tools
 */

public class Grade implements java.io.Serializable {

	// Fields

	private Integer id;
	private Exam exam;
	private Student student;
	private Double score;

	// Constructors

	/** default constructor */
	public Grade() {
	}

	public Grade(int id) {
		this.id=id;
	}


	/** full constructor */
	public Grade(Exam exam, Student student, Double score) {
		this.exam = exam;
		this.student = student;
		this.score = score;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Exam getExam() {
		return this.exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Double getScore() {
		return this.score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

}
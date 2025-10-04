package com.example.CourseRegSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	private String courseId;
	private String courseName;
	private String trainer;
	private int durationInWeeks;
	public String getCourseId() {
		return courseId;
	}
	public Course() {
		
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public int getDurationInWeeks() {
		return durationInWeeks;
	}
	public void setDurationInWeeks(int durationInWeeks) {
		this.durationInWeeks = durationInWeeks;
	}
	public Course(String courseId, String courseName, String trainer, int durationInWeeks) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.trainer = trainer;
		this.durationInWeeks = durationInWeeks;
	}
	

}

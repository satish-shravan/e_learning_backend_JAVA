package com.amdocs.training.model;

public class Course {
	
	Integer courseId;
	String courseName;
	String courseDesc;
	Integer courseFee;
	String courseResource;
	
	public Course() {
		
	}

	public Course(Integer courseId, String courseName, String courseDesc, Integer courseFee, String courseResource) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDesc = courseDesc;
		this.courseFee = courseFee;
		this.courseResource = courseResource;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDesc() {
		return courseDesc;
	}

	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	public Integer getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(Integer courseFee) {
		this.courseFee = courseFee;
	}

	public String getCourseResource() {
		return courseResource;
	}

	public void setCourseResource(String courseResource) {
		this.courseResource = courseResource;
	}
	
	
	
	

}

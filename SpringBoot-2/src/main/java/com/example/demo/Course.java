package com.example.demo;

public class Course {
	private int courseId;
	private String courseTitle;
	
	public Course() {	
		this.courseId = 0;
		this.courseTitle = "";
	}
	
	public Course(int courseId, String courseTitle) {	
		this.courseId = courseId;
		this.courseTitle = courseTitle;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseTitle=" + courseTitle + "]";
	}		
}
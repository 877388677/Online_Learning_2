package com.ysc.apps.online.bean.extend;

import java.util.List;

import com.ysc.apps.online.bean.CourseChapter;

public class CourseVM {
	
	private Long id;
	private String name;
	private String description;
	private String startTime;
	
	private List<CourseChapter> chapter;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public List<CourseChapter> getChapter() {
		return chapter;
	}

	public void setChapter(List<CourseChapter> chapter) {
		this.chapter = chapter;
	}
	
	

}

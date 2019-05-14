package com.ysc.apps.online.bean.extend;

import java.util.List;

import com.ysc.apps.online.bean.CourseChapter;
import com.ysc.apps.online.bean.Discuss;

public class CourseVideoVM {

	private Long id;
	private String name;
	private String file;
	private Long chapterId;
	private CourseChapter courseChapter;
	
	private List<Discuss> discuss;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}

	public Long getChapterId() {
		return chapterId;
	}
	public void setChapterId(Long chapterId) {
		this.chapterId = chapterId;
	}
	public CourseChapter getCourseChapter() {
		return courseChapter;
	}
	public void setCourseChapter(CourseChapter courseChapter) {
		this.courseChapter = courseChapter;
	}
	public List<Discuss> getDiscuss() {
		return discuss;
	}
	public void setDiscuss(List<Discuss> discuss) {
		this.discuss = discuss;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}

package com.ysc.apps.online.bean.extend;

import java.util.List;

import com.ysc.apps.online.bean.CourseVideo;
import com.ysc.apps.online.bean.HomeworkQuestion;

public class CourseChapterVM {
	
	private Long id;
	private String chapter;
	private String name;
	private String description;
	private String document;
	private Long course_id;
	
	private List<CourseVideo> video;
	private List<HomeworkQuestion> question;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getChapter() {
		return chapter;
	}
	public void setChapter(String chapter) {
		this.chapter = chapter;
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
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public List<CourseVideo> getVideo() {
		return video;
	}
	public void setVideo(List<CourseVideo> video) {
		this.video = video;
	}
	public List<HomeworkQuestion> getQuestion() {
		return question;
	}
	public void setQuestion(List<HomeworkQuestion> question) {
		this.question = question;
	}
	public Long getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Long course_id) {
		this.course_id = course_id;
	}

	
	

}

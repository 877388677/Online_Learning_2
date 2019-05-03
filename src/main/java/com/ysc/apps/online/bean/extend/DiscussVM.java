package com.ysc.apps.online.bean.extend;

import com.ysc.apps.online.bean.CourseVideo;
import com.ysc.apps.online.bean.User;

public class DiscussVM {
	
	private Long id;
	private String answer;
	private Long user_id;
	private Long video_id;
	
	private User user;
	private CourseVideo courseVideo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Long getVideo_id() {
		return video_id;
	}
	public void setVideo_id(Long video_id) {
		this.video_id = video_id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public CourseVideo getCourseVideo() {
		return courseVideo;
	}
	public void setCourseVideo(CourseVideo courseVideo) {
		this.courseVideo = courseVideo;
	}
	
	

}

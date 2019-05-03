package com.ysc.apps.online.bean.extend;

import com.ysc.apps.online.bean.HomeworkQuestion;
import com.ysc.apps.online.bean.User;

public class HomeworkAnswerVM {
	
	private Long id;
	private String answer;
	private String state;
	private Long question_id;
	private Long user_id;
	
	private HomeworkQuestion question;
	private User user;
	
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
	public Long getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public HomeworkQuestion getQuestion() {
		return question;
	}
	public void setQuestion(HomeworkQuestion question) {
		this.question = question;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}

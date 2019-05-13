package com.ysc.apps.online.bean.extend;

import com.ysc.apps.online.bean.HomeworkQuestion;
import com.ysc.apps.online.bean.User;

public class HomeworkAnswerVM {
	
	private Long id;
	private String answer;
	private String state;
	private Long questionId;
	private Long userId;
	
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

	
	public Long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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

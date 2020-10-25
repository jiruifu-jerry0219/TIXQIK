package com.tixqik.object;

public class Message {
	private String title;
	private String email;
	private String content;
	
	public Message(String title, String email, String content) {
		super();
		this.title = title;
		this.email = email;
		this.content = content;
	}

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Message [title=" + title + ", email=" + email + ", content="
				+ content + "]";
	}
	

}

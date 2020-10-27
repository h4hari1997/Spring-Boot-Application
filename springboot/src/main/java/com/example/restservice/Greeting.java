package com.example.restservice;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Greeting {

	@JsonIgnore
	private final long id;
	private final String content;

	public Greeting(final long id, final String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}

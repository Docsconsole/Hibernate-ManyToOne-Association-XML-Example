package com.docsconsole.tutorials.hibernate5.entity;

import java.util.Set;

public class Author {

	private long authorId;
	private String authorName;

	public long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


}
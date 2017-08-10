package com.paipianwang.pat.common.enums;

/**
 * 客户评级
 */
public enum UserLevel {
	S("3","S"),
	A("0","A"),
	B("1","B"),
	C("2","C"),
	D("3","D"),
	noLevel("","未分级");
	
	private String id;
	private String text;
	private UserLevel(String id, String text) {
		this.id = id;
		this.text = text;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}

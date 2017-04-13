package com.paipianwang.pat.common.enums;

/**
 * 登陆方式枚举类
 * 
 * @author Jack
 *
 */
public enum LoginType {

	PHONE("phone", 1), // 手机登录
	ACCOUNT("loginName", 2);// 账号登录

	/** 描述 */
	private String desc;
	/** 枚举值 */
	private int value;

	private LoginType(String desc, int value) {
		this.desc = desc;
		this.value = value;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}

package com.paipianwang.pat.common.enums;

/**
 * 审核状态枚举类
 * @author Jack
 * @version 2017-06-07
 *
 */
public enum AuditStatus {

	NOAUDIT(0, "未审核"),
	PASS(1, "审核通过"),
	UNPASS(2, "审核未通过");
	
	private int code;
	
	private String desc;

	private AuditStatus(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}

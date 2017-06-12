package com.paipianwang.pat.common.enums;

/**
 * 发票类型枚举类
 * @author Jack
 * @version 2017-06-07
 *
 */
public enum InvoiceType {

	added_value_specially(1, "增值税专用发票"),
	added_value_normal(2, "增值税普通发票"),
	general_machine(3, "通用机打发票");
	
	private int code;
	
	private String desc;

	private InvoiceType(int code, String desc) {
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

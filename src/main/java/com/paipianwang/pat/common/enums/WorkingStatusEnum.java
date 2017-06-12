package com.paipianwang.pat.common.enums;

/**
 * 员工的在职状态枚举类
 * @author Jack
 *
 */
public enum WorkingStatusEnum {

	test("测试", 2), // 测试状态
	dismission("离职", 1), // 离职状态
	working("在职", 0); // 在职状态
	
	/** 描述 */
	private String desc;
	/** 枚举值 */
	private int value;
	
	private WorkingStatusEnum(String desc, int value) {
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

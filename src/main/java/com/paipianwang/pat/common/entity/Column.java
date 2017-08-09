package com.paipianwang.pat.common.entity;

/**
 * 数据库-列元素属性
 * 
 * @author jacky
 *
 */
public class Column {

	/** 列名 **/
	private String name;

	/** 列的类型 **/
	private int type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}

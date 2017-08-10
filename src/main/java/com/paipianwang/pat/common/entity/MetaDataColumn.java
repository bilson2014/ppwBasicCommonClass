package com.paipianwang.pat.common.entity;

/**
 * 数据库-列元素属性
 * 
 * @author jacky
 *
 */
public class MetaDataColumn {

	/** 元数据列顺序 **/
	private int ordinal;

	/** 列名 **/
	private String name;

	/** 别名 **/
	private String text;

	/** 备注 **/
	private String comment;

	/** 长度 **/
	private int width;

	public int getOrdinal() {
		return ordinal;
	}

	public void setOrdinal(int ordinal) {
		this.ordinal = ordinal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}

package com.paipianwang.pat.common.entity;

import java.io.Serializable;

/**
 * comboTree封装对象
 */
public class ComboTreeModel implements Serializable{

	private static final long serialVersionUID = -3612084142549002832L;

	/** 值 **/
	private String id;
	/** 父值 **/
	private String pid;
	/** 显示值 **/
	private String text;
	/** 子集 **/
//	private List<ComboTreeModel> children;
	
	public ComboTreeModel(){}
	public ComboTreeModel(String id, String pid, String text) {
		super();
		this.id = id;
		this.pid = pid;
		this.text = text;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	
}

package com.paipianwang.pat.common.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 分页组件
 * @author Jack
 * @version 1.0
 */
public class PageBean implements Serializable{

	private static final long serialVersionUID = 5621476104408152807L;

	/** 统计总量 **/
	private long total = 0l;
	
	/** 分页数据集 **/
	private List<Object> list = null;

	public PageBean(long total, List<Object> list) {
		this.total = total;
		this.list = list;
	}
	
	public PageBean() {
		super();
	}



	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	
}

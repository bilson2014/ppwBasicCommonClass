package com.paipianwang.pat.common.entity;

import java.io.Serializable;
import java.util.List;

/**
 * EasyUI DataGrid组件
 * @author Jack
 * @version 1.0
 * @param <T>
 */
public class DataGrid<T> implements Serializable {

	private static final long serialVersionUID = -1357391928324563376L;
	
	/** 数据总量 **/
	private long total = 0l;

	/** 行数据 **/
	private List<T> rows = null;
	
	public DataGrid(long total, List<T> rows) {
		this.total = total;
		this.rows = rows;
	}
	
	public DataGrid() {
		
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

}

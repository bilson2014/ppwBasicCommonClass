package com.paipianwang.pat.common.entity;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

/**
 * 分页组件
 * 
 * @author Jack
 * @version 1.0
 *
 */
public class PageParam implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 开始标志位 **/
	private long begin = 0l;

	/** 偏移量,默认20 **/
	private long limit = 20l;

	/** 排序规则 **/
	private String order = null;

	/** 排序字段 **/
	private String sort = null;

	public long getBegin() {
		return begin;
	}

	public void setBegin(long begin) {
		this.begin = begin;
	}

	public long getLimit() {
		return limit;
	}

	public void setLimit(long limit) {
		this.limit = limit;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		if (StringUtils.isNotEmpty(order)) {
			if (order.equalsIgnoreCase(SortType.ASC.toString())) {
				this.order = SortType.ASC.toString();
			} else if (order.equalsIgnoreCase(SortType.DESC.toString())) {
				this.order = SortType.DESC.toString();
			} else {
				// 默认升序排列
				this.order = SortType.ASC.toString();
			}
		} else {
			// 默认升序排列
			this.order = SortType.ASC.toString();
		}
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

}

package com.paipianwang.pat.common.constant;

import java.io.Serializable;

/**
 * 缓存常量
 * 
 * @author Jack
 * @version 2017-05-16
 *
 */
public class PmsCacheConstant implements Serializable {

	private static final long serialVersionUID = -4667815837258720680L;

	/**
	 * 员工 作品 关系表 key值 前缀
	 */
	public static final String CACHE_EMPLOYEE_PRODUCT_LINK_PRIFIX = "emp:pro:";
	
	/**
	 * 作品 供应商 关系表 key值 前缀
	 */
	public static final String CACHE_PRODUCT_TEAM_LINK_PRIFIX = "pro:team:";
	
	/**
	 * 作品信息 缓存表
	 */
	public static final String CACHE_PRODUCT_INFORMATION = "pro:info:";
	
	/**
	 * 供应商信息 缓存表
	 */
	public static final String CACHE_TEAM_INFORMATION = "team:info:";
	
}

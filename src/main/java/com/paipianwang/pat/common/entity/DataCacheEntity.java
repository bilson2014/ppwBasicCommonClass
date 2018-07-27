package com.paipianwang.pat.common.entity;

import java.io.Serializable;

/**
 * 临时缓存数据对象
 * @author rui
 *
 */
public class DataCacheEntity implements Serializable{

	private static final long serialVersionUID = -1578643234003073566L;
	
	/** 缓存数据类型 */
	private Integer type;
	/** 缓存数据json内容 */
	private String dataContent;
	
	//------- 缓存分类（即表示类型，也对应标记位置） --------
	//报价单
	public static int TYPE_QUOTATION=0;
	//排期表
	public static int TYPE_SCHEDULE=1;
	//分镜头脚本
	public static int TYPE_CONTINUITY=2;
	//制片工具
	public static int TYPE_PRODUCTION=3;
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getDataContent() {
		return dataContent;
	}
	public void setDataContent(String dataContent) {
		this.dataContent = dataContent;
	}
	
	public static void main(String[] args) {
		int i=0;
		
	}
	
}

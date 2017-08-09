package com.paipianwang.pat.common.enums;

/**
 * 项目流程角色类型
 */
public enum ProjectRoleType {

	sale("sale","销售"),//负责人
	customer("customer","客户"),//客户
	teamPlan("teamPlan","策划供应商"),
	teamProduct("teamProduct","制作供应商"),
	
	saleDirector("saleDirector","销售总监"),
	creativityDirector("creativityDirector","创意总监"),
	superviseDirector("superviseDirector","监制总监"),
	teamProvider("teamProvider","供应商管家"),
	teamPurchase("teamPurchase","供应商采购"),
	scheme("scheme","策划"),
	finance("finance","财务"),
	supervise("supervise","监制"),

	teamDirector("teamDirector","供应商总监"),
	financeDirector("financeDirector","财务总监"),
	customerDirector("customerDirector","客服总监"),
	crm("crm","CRM"),
	produce("produce","制作")
	;

	
	
	private String id;
	private String text;
	
	private ProjectRoleType(){}
	private ProjectRoleType(String id, String text) {
		this.id = id;
		this.text = text;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}

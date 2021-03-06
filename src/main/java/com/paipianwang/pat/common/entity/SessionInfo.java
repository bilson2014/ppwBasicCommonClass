package com.paipianwang.pat.common.entity;

import java.util.List;

public class SessionInfo extends BaseEntity {

	private static final long serialVersionUID = -8244829888233273132L;

	private String token = null; // 令牌

	private String sessionType = null; // 用户类型

	private long[] sum;

	private boolean superAdmin = false; // 超级管理员
	
	private Integer userRank=0;//用户身份 0-普通用户 1-联合创始人

	private String description = null; // 描述

	private String loginName = null; // 登录名

	private String realName = null; // 真实姓名

	private Long reqiureId = null; // 唯一ID

	private String email = null; // 邮箱

	private String address = null; // 地址

	private String photo = null; // 头像

	private Integer clientLevel = null; // 客户级别

	private boolean isIdentification = false; // 供应商是否被审核

	private int providerFlag = 3; // 供应商审核状态 0:未审核 1:审核通过 2:审核未通过 3:未提交

	private String activitiUserId = null; // 流程身份唯一ID

	private List<String> activitGroups = null; // 流程权限组

	// add by wanglc 缓存手机号
	private String telephone = null; // 手机号
	
	private Integer cacheTab=0;//工具缓存标记 对应字节位

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getSessionType() {
		return sessionType;
	}

	public void setSessionType(String sessionType) {
		this.sessionType = sessionType;
	}

	public long[] getSum() {
		return sum;
	}

	public void setSum(long[] sum) {
		this.sum = sum;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isSuperAdmin() {
		return superAdmin;
	}

	public void setSuperAdmin(boolean superAdmin) {
		this.superAdmin = superAdmin;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Long getReqiureId() {
		return reqiureId;
	}

	public void setReqiureId(Long reqiureId) {
		this.reqiureId = reqiureId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean hasRight(final BaseRight right) {
		int pos = right.getPos();
		long code = right.getCode();
		long ret = sum[pos] & code;
		return !(ret == 0);
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getClientLevel() {
		return clientLevel;
	}

	public void setClientLevel(Integer clientLevel) {
		this.clientLevel = clientLevel;
	}

	public boolean isIdentification() {
		return isIdentification;
	}

	public void setIsIdentification(boolean isIdentification) {
		this.isIdentification = isIdentification;
	}

	public int getProviderFlag() {
		return providerFlag;
	}

	public void setProviderFlag(int providerFlag) {
		this.providerFlag = providerFlag;
	}

	public List<String> getActivitGroups() {
		return activitGroups;
	}

	public void setActivitGroups(List<String> activitGroups) {
		this.activitGroups = activitGroups;
	}

	public String getActivitiUserId() {
		return activitiUserId;
	}

	public void setActivitiUserId(String activitiUserId) {
		this.activitiUserId = activitiUserId;
	}

	public Integer getCacheTab() {
		return cacheTab;
	}

	public void setCacheTab(Integer cacheTab) {
		this.cacheTab = cacheTab;
	}

	public Integer getUserRank() {
		return userRank;
	}

	public void setUserRank(Integer userRank) {
		this.userRank = userRank;
	}

}

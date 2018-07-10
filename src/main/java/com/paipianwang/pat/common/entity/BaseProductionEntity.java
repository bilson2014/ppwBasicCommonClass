package com.paipianwang.pat.common.entity;

/**
 * 制片资源基础信息
 * @author rui
 *
 */
public class BaseProductionEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	/** 名称 **/
	private String name;
	
	/** 推荐人  内部员工**/
	private String referrer;
	
	/** 价格 **/
	private Double price;
	
	/** 描述 **/
	private String remark;
	
	/** 创建时间 **/
	private String createTime;
	
	/** 修改时间 **/
	private String updateTime;
	
	/** 创建人 角色类型_id (t u e) **/
	private String creator;

	/** 关联供应商 **/
	private Long teamId;
	
	/** 报价单明细 **/
	private Long typeId;
	
	/** 审核状态  1-审核通过 0-审核不通过 2-审核中 **/
	private Integer status;
	
	/** 城市 **/
	private String city;
	
	/** 照片 对于设备是非持久化字段 **/
	private String photo;
	
	//非持久化字段
	/** 关联供应商名称 **/
	private String teamName;
	/** 推荐人名称 **/
	private String referrerName;
	/** 身份 **/
	private String identity;
	/** 报价单明细名称**/
	private String quoTypeName;
	
	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getReferrerName() {
		return referrerName;
	}

	public void setReferrerName(String referrerName) {
		this.referrerName = referrerName;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getQuoTypeName() {
		return quoTypeName;
	}

	public void setQuoTypeName(String quoTypeName) {
		this.quoTypeName = quoTypeName;
	}
	
}

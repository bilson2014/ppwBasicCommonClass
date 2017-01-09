package com.paipianwang.pat.common.entity;

import java.io.Serializable;

public class BaseEntity implements Serializable {

	private static final long serialVersionUID = -6346046812684733942L;
	
	/** 唯一编号 **/
	private Long id = null;
	
	/** 版本号 **/
	private Integer version = 0;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
}

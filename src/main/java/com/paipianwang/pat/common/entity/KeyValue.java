package com.paipianwang.pat.common.entity;

import java.io.Serializable;

/**
 * 键值对
 * 
 * @author jacky
 *
 */
public class KeyValue implements Serializable {

	private static final long serialVersionUID = 4948990184584948411L;

	private String key = null;

	private Object value = null;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}

package com.paipianwang.pat.common.entity;

import java.io.Serializable;

/**
 * 返回结果 实体类
 * @author Jack
 * @version 2017-05-23
 *
 */
public class PmsResult implements Serializable {

	private static final long serialVersionUID = 7651314074343522849L;

	/** 状态码 **/
	private String code = null;
	
	/** 结果 **/
	private boolean result = true;
	
	/** 错误信息 **/
	private String err = null;
	/** 结果信息 **/
	private String msg=null;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getErr() {
		return err;
	}

	public void setErr(String err) {
		this.err = err;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}

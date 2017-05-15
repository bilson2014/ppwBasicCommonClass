package com.paipianwang.pat.common.enums;

/**
 * 新媒体渠道枚举类
 * @author Jack
 *
 */
public enum SourceChannelsEnum {

	WEIXIN("ppwgzh","拍片网公众号"), // 拍片网公众号
	WEIBO("weibo","微博"), // 微博渠道
	TOUTIAO("toutiao","头条"); // 头条渠道
	
	/**
	 * 唯一标识
	 */
	private String code;
	
	/**
	 * 描述
	 */
	private String desc;

	private SourceChannelsEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public static SourceChannelsEnum getEnum(String code) {
		SourceChannelsEnum resultEnum = null;
		SourceChannelsEnum[] enumAry = SourceChannelsEnum.values();
		for (int i = 0; i < enumAry.length; i++) {
			if ((enumAry[i].getCode()).equals(code)) {
				resultEnum = enumAry[i];
				break;
			}
		}
		return resultEnum;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}

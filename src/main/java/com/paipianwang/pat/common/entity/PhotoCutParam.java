package com.paipianwang.pat.common.entity;

import com.paipianwang.pat.common.entity.BaseEntity;

public class PhotoCutParam extends BaseEntity {

	private static final long serialVersionUID = 1155350380579334858L;

	private Long userId = 0l; // 用户ID
	
	private String imgUrl = null; // 用户头像地址
	
	private String imgFileName = null; // 用户头像文件名
	
	private double x = 0;
	
	private double y = 0;
	
	private double x2 = 0;
	
	private double y2 = 0;
	
	private double width = 0;
	
	private double height = 0;
	
	private double originalWidth = 0;
	
	private double originalHeight = 0;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public double getY2() {
		return y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getOriginalWidth() {
		return originalWidth;
	}

	public void setOriginalWidth(double originalWidth) {
		this.originalWidth = originalWidth;
	}

	public double getOriginalHeight() {
		return originalHeight;
	}

	public void setOriginalHeight(double originalHeight) {
		this.originalHeight = originalHeight;
	}

	public String getImgFileName() {
		return imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}
	
}

package com.paipianwang.pat.common.util;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.paipianwang.pat.common.entity.BaseRight;
import com.paipianwang.pat.common.entity.SessionInfo;


public class ValidateUtil {
	
	public static boolean isValid(final String str){
		
		if(StringUtils.isNotBlank(str)){
			
			return true;
		}
		return false;
	}
	
	public static boolean isValid(final String[] str){
		
		if(str != null && str.length > 0){
			
			return true;
		}
		return false;
	}
	
	@SuppressWarnings("rawtypes")
	public static boolean isValid(final Collection col){
		
		if(col == null || col.isEmpty()){
			return false;
		}
		
		return true;
	}
	/**
	 * 判断是否有权限
	 */
	public static boolean hasRight(final String uri, final HttpServletRequest req, final ServletContext sc,
			final BaseRight right, final HttpServletResponse resp, final SessionInfo info) {

		if (isValid(uri)) {
			// 从redis中获取right

			if (right != null) {
				// 判断权限是否是公用的
				if (right.getIsCommon()) {
					// 公共资源放行
					return true;
				} else {
					if (info != null) {
						// 判断用户是否是超级管理员
						if (info.isSuperAdmin()) {
							// 超级管理员放行
							return true;
						} else {
							// 非超级管理员 -- 判断是否具有该权限
							return info.hasRight(right);
						}
					} else {
						// 未登录
						return false;
					}
				}
			}
		}

		return false;
	}
	public static boolean isValid(final long[] ids) {
		 
		if(ids != null && ids.length > 0){
			return true;
		}
		return false;
	}

	@SuppressWarnings("rawtypes")
	public static boolean isValid(final Map map) {
		
		if(map != null && !map.isEmpty()){
			return true;
		}
		return false;
	}
	
	@SuppressWarnings("rawtypes")
	public static boolean isValid(final List list){
		
		if(list != null && !list.isEmpty()){
			return true;
		}
		return false;
	}
	
	public static boolean isValid(final Long id){
		
		if(id != null){
			return true;
		}
		return false;
	}
	
	/**
	 * 过滤掉Emoji表情
	 * @param source
	 * @return
	 */
	public static String filterEmoji(String source) {
		if (ValidateUtil.isValid(source)) {
			return source.replaceAll("[\\ud800\\udc00-\\udbff\\udfff\\ud800-\\udfff]", "");
		} else {
			return null;
		}
	}
	
}

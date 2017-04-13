package com.paipianwang.pat.common.util;

import com.paipianwang.pat.common.constant.PmsConstant;

public class SolrUtil {

	// 分析标签优先级顺序，按顺序权重依次降低
	public static String ReweightingByTags(String condition) {

		// 按照'，'、','、空格 分词
		condition = condition.replaceAll("(\\s*)(,|，)(\\s*)", " ");
		String[] tagArr = condition.split("\\s+");
		StringBuffer sb = new StringBuffer();

		if (tagArr != null) {
			for (int i = 0; i < tagArr.length; i++) {
				sb.append("tags:" + "\"" + tagArr[i] + "\"");
				if (i < 3) {
					// 如果标签数量小于三个，那么不做处理
					sb.append("^");
					sb.append(PmsConstant.WEIGHT_ARR[i]);
				}
				if (i < tagArr.length - 1)
					sb.append(" OR ");
			}
		}
		return sb.toString();
	}
}

package com.paipianwang.pat.common.util;

/**
 * 金额工具类
 */
public class MoneyUtil {

	private static final String UNIT = "万千佰拾亿千佰拾万千佰拾元角分";
	private static final String DIGIT = "零壹贰叁肆伍陆柒捌玖";
	private static final double MAX_VALUE = 9999999999999.99D;

	/**
	 * 金额转大写 
	 * 
	 * @param v
	 * @return
	 */
	public static String changeToChinese(double v) {
		if (v < 0 || v > MAX_VALUE) {
			return null;
		}
		long l = Math.round(v * 100);
		if (l == 0) {
			return "零元整";
		}
		String strValue = l + "";
		// 大写数位置
		int i = 0;
		// 单位位置
		int j = UNIT.length() - strValue.length();
		StringBuffer rs = new StringBuffer();
		boolean isZero = false;
		for (; i < strValue.length(); i++, j++) {
			char ch = strValue.charAt(i);
			if (ch == '0') {
				isZero = true;
				if (UNIT.charAt(j) == '亿' || UNIT.charAt(j) == '万' || UNIT.charAt(j) == '元') {
					rs.append(UNIT.charAt(j));
					isZero = false;
				}
			} else {
				if (isZero) {
					rs.append("零");
					isZero = false;
				}
				rs.append(DIGIT.charAt(ch - '0')).append(UNIT.charAt(j));
			}
		}
		
		if (rs.toString().endsWith("元")) {
			rs.append("整");
		}
		return rs.toString().replaceAll("亿万", "亿");
	}


}

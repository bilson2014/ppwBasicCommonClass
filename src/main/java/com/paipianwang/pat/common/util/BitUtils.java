package com.paipianwang.pat.common.util;

public class BitUtils {

	//将 整数 num 的第 i 位的值 置为 1
	public static int setBit(int num, int i)
    {
        return (num | (1 << i));
    }
    
    //将 整数 num 的第 i 位的值 置为 1
	public static int cleanBit(int num, int i)
    {
       int mask = ~(1 << i);//000100
       return (num & (mask));//111011
    }
    
	//获取 整数 num 的第 i 位的值
	public static boolean getBit(int num, int i)
    {
        return ((num & (1 << i)) != 0);//true 表示第i位为1,否则为0
    }
	
}

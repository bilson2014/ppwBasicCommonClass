package com.paipianwang.pat.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class DataGZIUtils {
	
	public static boolean needCompress(String str) {
		return true;
	}
	/**
	 * 字符串的压缩
	 * 
	 * @param str
	 *            待压缩的字符串
	 * @return 返回压缩后的字符串
	 * @throws IOException
	 */
	public static String compress(String str) throws IOException {
		if (null == str || str.length() <= 0) {
			return str;
		}
		// 创建一个新的 byte 数组输出流
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		// 使用默认缓冲区大小创建新的输出流
		GZIPOutputStream gzip = new GZIPOutputStream(out);
		// 将 b.length 个字节写入此输出流
		gzip.write(str.getBytes());
		gzip.close();
		// 使用指定的 charsetName，通过解码字节将缓冲区内容转换为字符串
		return out.toString("ISO-8859-1");
	}
	
	/**
	 * 字符串的解压
	 * 
	 * @param str
	 *            对字符串解压
	 * @return 返回解压缩后的字符串
	 * @throws IOException
	 */
	public static String unCompress(String str) throws IOException {
		if (null == str || str.length() <= 0) {
			return str;
		}
		// 创建一个新的 byte 数组输出流
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		// 创建一个 ByteArrayInputStream，使用 buf 作为其缓冲区数组
		ByteArrayInputStream in = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));
		// 使用默认缓冲区大小创建新的输入流
		GZIPInputStream gzip = new GZIPInputStream(in);
		byte[] buffer = new byte[256];
		int n = 0;
		while ((n = gzip.read(buffer)) >= 0) {// 将未压缩数据读入字节数组
			// 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此 byte数组输出流
			out.write(buffer, 0, n);
		}
		// 使用指定的 charsetName，通过解码字节将缓冲区内容转换为字符串
		return out.toString();
	}

	/*public static void main(String[] args) {
		String s="[{\"detailId\":13,\"quantity\":\"1\",\"days\":\"1\",\"fullJob\":0,\"unitPrice\":2000.0,\"sum\":\"2000\",\"typeId\":11,\"typeName\":\"创作团队\",\"itemId\":12,\"itemName\":\"摄影组\",\"detailName\":\"专业摄影师\",\"description\":\"专业摄影师，熟练使用5D2/5D3/5D4、佳能 XC10摄影机及高清摄像机。\"},{\"detailId\":70,\"quantity\":\"2\",\"days\":\"1\",\"fullJob\":0,\"unitPrice\":5000.0,\"sum\":\"10000\",\"typeId\":15,\"typeName\":\"拍摄设备\",\"itemId\":22,\"itemName\":\"摄影设备\",\"detailName\":\"RED EPIC-X 6K 摄影机\",\"description\":\"RED 艾比克 6K 摄影机\"},{\"detailId\":100,\"quantity\":\"1\",\"days\":\"1\",\"fullJob\":0,\"unitPrice\":400.0,\"sum\":\"400\",\"typeId\":15,\"typeName\":\"拍摄设备\",\"itemId\":77,\"itemName\":\"灯光设备\",\"detailName\":\"ARRI 聚光灯 2000W 3200K\",\"description\":\"色温3200K，功率2000W。包括：灯头、灯架、电源10--20米延长线等。\"}]";
		String s1="[{\"detailId\":206,\"quantity\":\"1\",\"days\":\"2\",\"fullJob\":0,\"unitPrice\":2000.0,\"sum\":\"4000\",\"typeId\":11,\"typeName\":\"创作团队\",\"itemId\":204,\"itemName\":\"设计师及美术师组\",\"detailName\":\"专业美术师\",\"description\":\"mg动画专业美术师\"},{\"detailId\":205,\"quantity\":\"1\",\"days\":\"2\",\"fullJob\":0,\"unitPrice\":2000.0,\"sum\":\"4000\",\"typeId\":11,\"typeName\":\"创作团队\",\"itemId\":204,\"itemName\":\"设计师及美术师组\",\"detailName\":\"专业设计师\",\"description\":\"mg动画专业设计师\"},{\"detailId\":219,\"quantity\":\"1\",\"days\":\"2\",\"fullJob\":0,\"unitPrice\":12000.0,\"sum\":\"24000\",\"typeId\":11,\"typeName\":\"创作团队\",\"itemId\":218,\"itemName\":\"三维动画导演及脚本等\",\"detailName\":\"专业动画导演\",\"description\":\"专业动画导演\"},{\"detailId\":215,\"quantity\":\"1\",\"days\":\"3\",\"fullJob\":0,\"unitPrice\":3000.0,\"sum\":\"9000\",\"typeId\":17,\"typeName\":\"后期制作\",\"itemId\":211,\"itemName\":\"MG动画合成师及动画师\",\"detailName\":\"专业合成师\",\"description\":\"\"},{\"detailId\":212,\"quantity\":\"1\",\"days\":\"5\",\"fullJob\":0,\"unitPrice\":2000.0,\"sum\":\"10000\",\"typeId\":17,\"typeName\":\"后期制作\",\"itemId\":211,\"itemName\":\"MG动画合成师及动画师\",\"detailName\":\"专业动画师\",\"description\":\"专业动画师\"},{\"detailId\":61,\"quantity\":\"2\",\"days\":\"1\",\"fullJob\":0,\"unitPrice\":1000.0,\"sum\":\"2000\",\"typeId\":18,\"typeName\":\"配音配乐\",\"itemId\":33,\"itemName\":\"配音\",\"detailName\":\"普通话配音\",\"description\":\"普通配音\"},{\"detailId\":189,\"quantity\":\"1\",\"days\":\"1\",\"fullJob\":0,\"unitPrice\":2000.0,\"sum\":\"2000\",\"typeId\":18,\"typeName\":\"配音配乐\",\"itemId\":35,\"itemName\":\"配乐\",\"detailName\":\"混音\",\"description\":\"专业混音\"}]";
		String item="{\"detailId\":13,\"quantity\":\"1\",\"days\":\"1\",\"fullJob\":0,\"unitPrice\":2000.0,\"sum\":\"2000\",\"typeId\":11,\"typeName\":\"创作团队\",\"itemId\":12,\"itemName\":\"摄影组\",\"detailName\":\"专业摄影师\",\"description\":\"专业摄影师，熟练使用5D2/5D3/5D4、佳能 XC10摄影机及高清摄像机。\"}";
		StringBuffer b=new StringBuffer();
		for(int i=0;i<100;i++) {
			b.append(item);
		}
		System.out.println(b.length());
		System.out.println(new Date());
		try {
			String res=DataGZIUtils.compress(b.toString());
			System.out.println(res.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(new Date());
		
		HashMap<String,String> m=new HashMap<>();
	}*/
}

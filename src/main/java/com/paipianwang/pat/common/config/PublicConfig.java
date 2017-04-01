package com.paipianwang.pat.common.config;

import java.io.Serializable;
import java.util.Map;

import com.paipianwang.pat.common.util.ResourceUtils;

/**
 * 环境配置基础类
 * 
 * @author Jack
 * @version 2017-03-20
 */
public class PublicConfig implements Serializable {

	private static final long serialVersionUID = -4734996608320409693L;

	/**
	 * 系统文件配置 加载
	 */
	public static Map<String, String> DB_CONFIG = ResourceUtils.getResource("db").getMap();

	/**
	 * 系统文件配置 加载
	 */
	public static Map<String, String> PUBLIC_SYSTEM = ResourceUtils.getResource("public_system").getMap();

	/**
	 * 系统文件配置 加载
	 */
	public static Map<String, String> PUBLIC_CONFIG = ResourceUtils.getResource("public_config").getMap();

	/**
	 * HTTP 协议 URL前缀
	 */
	public static String URL_PREFIX = PUBLIC_CONFIG.get("urlPrefix");

	/**
	 * HTTPS 协议 URL前缀
	 */
	public static String URL_HTTPS_PREFIX = PUBLIC_CONFIG.get("url.https.prefix");

	/**
	 * 域名，用于保持 http 产生的 cookie
	 */
	public static String COOKIES_SCOPE = PUBLIC_CONFIG.get("cookies_scope");

	/**
	 * 新订单短信通知手机号码
	 */
	public static String PHONENUMBER_ORDER = PUBLIC_CONFIG.get("service_tel");

	/**
	 * 初始化密码
	 */
	public static String INIT_PASSWORD = PUBLIC_CONFIG.get("initPassw0rd");
	
	/**
	 * 作品缩略图大小最大限制 256KB
	 */
	public static String PRODUCT_IMAGE_MAX_SIZE = PUBLIC_CONFIG.get("productImageMaxSize");
	
	/**
	 * 允许照片上传格式
	 */
	public static String ALLOW_IMAGE_TYPE = PUBLIC_CONFIG.get("allowImageType");
	
	/**
	 * 图片最大不允许超过2M
	 */
	public static String IMAGE_MAX_SIZE = PUBLIC_CONFIG.get("imageMaxSize");
	
	/**
	 * 允许上传的视频格式
	 */
	public static String ALLOW_VIDEO_TYPE = PUBLIC_CONFIG.get("allowVideoType");
	
	/**
	 * 上传视频最大值
	 */
	public static String VIDEO_MAX_SIZE = PUBLIC_CONFIG.get("videoMaxSize");
	
	/**
	 * 访问来源
	 */
	public static String HTTP_REFERER = PUBLIC_CONFIG.get("http_referer");

	/**
	 * ssl truststore的路径
	 */
	public static String KEY_STORE_TRUST_PATH = PUBLIC_CONFIG.get("key.store.trust.path");

	/**
	 * ssl truststore的类型
	 */
	public static String KEY_STORE_TYPE = PUBLIC_CONFIG.get("key.store.type");

	/**
	 * ssl truststore的密码
	 */
	public static String KEY_STORE_TRUST_PASSWORD = PUBLIC_CONFIG.get("key.store.trust.password");

	public static String KEY_STORE_CLIENT_PATH = PUBLIC_CONFIG.get("key.store.client.path");

	public static String KEY_STORE_TYPE_P12 = PUBLIC_CONFIG.get("key.store.type.p12");

	public static String KEY_STORE_PASSWORD = PUBLIC_CONFIG.get("key.store.password");

	/**
	 * Pay Param
	 */
	public static String PAY_SIGN_KEY = PUBLIC_CONFIG.get("pay.sign.key");

	public static String PAY_SERVER = PUBLIC_CONFIG.get("pay.server");

	public static String PAY_RETURN_SERVER = PUBLIC_CONFIG.get("pay.return.server");

	/**
	 * 短信验证码模版ID，此模版ID来自 荣联运通讯
	 */
	public static String SMS_VERIFICATION_CODE = PUBLIC_SYSTEM.get("sms.verification.code");

	/**
	 * 短信验证码时长，每隔多长时间重新发送
	 */
	public static String SMS_CODE_DURATION = PUBLIC_SYSTEM.get("sms.code.duration");

	/**
	 * 文件系统备用下载服务路径
	 */
	public static String FDFS_BACKUP_SERVER_PATH = PUBLIC_CONFIG.get("backup.server.dfs.url");

	/**
	 * 通过审核的供应商及分级的客户 SOLR URL 入口
	 */
	public static String SOLR_URL = PUBLIC_CONFIG.get("solr.url");

	/**
	 * 内部员工SOLR URL 入口
	 */
	public static String SOLR_EMPLOYEE_URL = PUBLIC_CONFIG.get("solr.employee.url");

	/**
	 * 未审核的供应商及未分级的客户的SOLR URL 入口
	 */
	public static String SOLR_PORTAL_URL = PUBLIC_CONFIG.get("solr.portal.url");

	/**
	 * 新闻SOLR NEW 入口
	 */
	public static String SOLR_NEWS_URL = PUBLIC_CONFIG.get("solr.news.url");
	
	/**
	 * 文档转换服务地址
	 */
	public static String FILE_CONVERTION_SERVER = PUBLIC_SYSTEM.get("file.conversion");
	
	/**
	 * 文档上传临时目录
	 */
	public static String DOC_TEMP_PATH = PUBLIC_SYSTEM.get("doc.temp.path");
	
	/**
	 * Activiti 流程服务ID
	 */
	public static String ACTIVITY_PRODUCT_IDS = PUBLIC_SYSTEM.get("activity.product.ids");
	
	/**
	 * 文件地址前缀
	 */
	public static String FILE_PROFIX = PUBLIC_SYSTEM.get("file.prefix");
	
	public static String PRODUCT_DESCRIPTION_IMAGE_URL = PUBLIC_SYSTEM.get("upload.server.product.description.image.url");
	
	public static String PRODUCT_DESCRIPTION_IMAGE_PATH = PUBLIC_SYSTEM.get("upload.server.product.description.image");
}

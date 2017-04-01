package com.paipianwang.pat.common.constant;

/**
 * 系统业务常量
 * 
 * @author Jack
 * @version 2017-03-21
 */
public class PmsConstant {

	/**
	 * SESSION 存储当前用户的key值
	 */
	public static final String SESSION_INFO = "sessionInfo";

	/**
	 * Redis 存储权限集合的key值
	 */
	public static final String CONTEXT_RIGHT_MAP = "context_right_map";

	/**
	 * AES key
	 */
	public static final String UNIQUE_KEY = "0102030405060708";

	/**
	 * 登录角色 -- 内部员工
	 */
	public static final String ROLE_EMPLOYEE = "role_employee";

	/**
	 * 登录角色 -- 客户
	 */
	public static final String ROLE_CUSTOMER = "role_customer";

	/**
	 * 登录角色 -- 供应商
	 */
	public static final String ROLE_PROVIDER = "role_provider";

	/**
	 * 登录角色 -- 供应商管家
	 */
	public static final String ROLE_PROVIDERMANAGER = "role_providermanager";

	/**
	 * 登录角色 -- 系统
	 */
	public static final String ROLE_SYSTEM = "role_system";

	/**
	 * 客户微信登录AppID
	 */
	public static final String CUSTOMER_WEBCHAT_APPID = "wx3d453a7abb5fc026";

	/**
	 * 客户微信登录AppID
	 */
	public static final String CUSTOMER_WEBCHAT_APPSECRET = "6184e93dee1f145ad49977d3c1456391";

	/**
	 * 供应商微信登录AppID
	 */
	public static final String PROVIDER_WEBCHAT_APPID = "wx513aa29222bef371";

	/**
	 * 供应商微信登录AppSecret
	 */
	public static final String PROVIDER_WEBCHAT_APPSECRET = "e7e6e8c7cf5216a933f53bf360dee939";

	/**
	 * 供应商微信登录AppID
	 */
	public static final String MANAGER_WEBCHAT_APPID = "wxbfbda700bd7a3c1c";

	/**
	 * 供应商微信登录AppSecret
	 */
	public static final String MANAGER_WEBCHAT_APPSECRET = "6a1c40422295b85dc8d55e7c38aef968";

	/**
	 * 订单提交token加密 AES key
	 */
	public static final String ORDER_TOKEN_UNIQUE_KEY = "Jackyang1100_abc";

	/**
	 * Redis 存储文件系统存储节点对应关系 key 值
	 */
	public static final String STORAGE_NODE_RELATIONSHIP = "storage_node_relationship";

	/**
	 * Redis 存储分布式文件系统storage节点地址 key 值
	 */
	public static final String FILE_LOCATE_STORAGE_PATH = "file_locate_storage_path";

	/**
	 * 邮件集合 存储 key 值
	 */
	public static final String MAIL_MAP = "mail_map";

	/**
	 * 文档转换路径
	 */
	public static final String CONVERIONHSOT = "http://123.59.75.62:8080/";

	/**
	 * 首页视频集合
	 */
	public static final String CONTEXT_PORTAL_VIDEO_MAP = "context_portal_video_map";

	/**
	 * 项目管理人员（主负责人，协同人）
	 */
	public static final String ROLE_MANAGER = "role_manager";

	/**
	 * 推荐视频标签权重数组
	 * 从第一个开始一次递减
	 */
	public static final int[] weightArr = new int[] { 10, 8, 6 };
	
	/**
	 * 供应商通过审核
	 */
	public final static int INVOICE_STATUS_OK = 1;
	
	/**
	 * 供应商审核不通过
	 */
	public final static int INVOICE_STATUS_NO = 2;
	
	public final static int MSG_FAIL = 1;
	
	public final static int MSG_SUCCESS = 0;
	
	// state Constants
	public final static String FAIL = "FAIL";
	
	public final static String SUCCESS = "SUCCESS";
}

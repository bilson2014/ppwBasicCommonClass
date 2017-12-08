package com.paipianwang.pat.common.constant;

/**
 * 系统业务常量
 * 
 * @author Jack
 * @version 2017-03-21
 */
public class PmsConstant {
	
	/**
	 * 渠道来源标识
	 */
	public static final String SOURCE_CHANNELS = "source_channels";

	/**
	 * SESSION 存储400电话的key值
	 */
	public static final String OFFICAL_PHONE_MARK = "OFFICAL_PHONE";
	
	/**
	 * 官方电话号码
	 */
	public static final String OFFICAL_PHONE = "400-660-9728";
	
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
	 * 登录角色 -- 客服
	 */
	public static final String ROLE_CUSTOMER_SERVICE = "role_customer_service";
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
	 * 推荐视频标签权重数组 从第一个开始一次递减
	 */
	public static final int[] WEIGHT_ARR = new int[] { 10, 8, 6 };

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
	
	/**
	视频类别	专业级团队                            	广告级团队                	电影级团队
	企业宣传	￥ 25,800.00			￥ 39,800.00		￥ 75,800.00
	广告TVC	￥ 39,800.00			￥ 79,800.00		￥ 128,000.00
	微电影	￥ 99,800.00			￥ 238,000.00	￥ 358,000.00
	MG动画	￥ 9,800.00			￥ 39,800.00		￥ 69,800.00
	三维展示	￥ 35,800.00			￥ 73,800.00		￥ 99,800.00
	
	视频名片	￥ 2,800.00			￥ 8,800.00		￥ 15,800.00
	电商视频	￥ 2,500.00			￥ 4,500.00		￥ 8,500.00
	活动及课件	￥ 5,500.00			￥ 8,500.00		￥ 16,900.00
	 */
	public static int[][] TYPE_ADD_TEAM = new int[8][3];//初始化6行3列的 视频+导演价格表
	
	/**
	 * 			专业级拍摄设备 2K		广告级拍摄设备 4K		电影级拍摄设备 4K
	 * （视频类别；企业广告；广告TVC；微电影；MG动画；三维展示）
	 * 			10000				15000			30000
	 * （视频名片；电商视频；活动及课件）
				500					1000			2000
	 */
	public static int[][] TYPE_ADD_EQUIPMENT=new int[2][3];//视频类型(2种)+拍摄设备

	static{
		TYPE_ADD_TEAM[0][0] = 25800;
		TYPE_ADD_TEAM[0][1] = 39800;
		TYPE_ADD_TEAM[0][2] = 75800;
		TYPE_ADD_TEAM[1][0] = 39800;
		TYPE_ADD_TEAM[1][1] = 79800;
		TYPE_ADD_TEAM[1][2] = 128000;
		TYPE_ADD_TEAM[2][0] = 99800;
		TYPE_ADD_TEAM[2][1] = 238000;
		TYPE_ADD_TEAM[2][2] = 358000;
		TYPE_ADD_TEAM[3][0] = 9800;
		TYPE_ADD_TEAM[3][1] = 39800;
		TYPE_ADD_TEAM[3][2] = 69800;
		TYPE_ADD_TEAM[4][0] = 35800;
		TYPE_ADD_TEAM[4][1] = 73800;
		TYPE_ADD_TEAM[4][2] = 99800;
		TYPE_ADD_TEAM[5][0] = 2800;
		TYPE_ADD_TEAM[5][1] = 8800;
		TYPE_ADD_TEAM[5][2] = 15800;
		TYPE_ADD_TEAM[6][0] = 2500;
		TYPE_ADD_TEAM[6][1] = 4500;
		TYPE_ADD_TEAM[6][2] = 8500;
		TYPE_ADD_TEAM[7][0] = 5500;
		TYPE_ADD_TEAM[7][1] = 8500;
		TYPE_ADD_TEAM[7][2] = 16900;	
		
		TYPE_ADD_EQUIPMENT[0][0]=10000;
		TYPE_ADD_EQUIPMENT[0][1]=15000;
		TYPE_ADD_EQUIPMENT[0][2]=30000;
		TYPE_ADD_EQUIPMENT[1][0]=500;
		TYPE_ADD_EQUIPMENT[1][1]=1000;
		TYPE_ADD_EQUIPMENT[1][2]=2000;
	}
	

	public static final String SQL_METADATA = "metaData";
	
	public static final String SQL_CONDITION = "condition";
}

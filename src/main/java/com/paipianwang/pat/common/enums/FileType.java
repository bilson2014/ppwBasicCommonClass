package com.paipianwang.pat.common.enums;

/**
 * 项目流程文件类型
 */
public enum FileType {

	projectBrief("projectBrief","项目资料"),
	projectPlan("projectPlan","项目排期"),
	planning("planning","策划方案"),
	ppm("ppm","PPM"),
	vedioRevise("vedioRevise","客户影片修改表"),
	demoUpdate("demoUpdate","会审影片修改表"),
	customerReply("customerReply","客户验收函回复截图"),
	priceSheet("priceSheet","报价单"),
	watermarkFile("watermarkFile","水印样片"),
	
	planningDemo("planningDemo","策划方案模板","planning.docx",3),
	watermark("watermark","拍片网专用水印","watermark.png",3),
	shootingScript("shootingScript","分镜头脚本","shootingScript.docx",3),
	
	// 自动生成类文件
	autoProjectSheet("autoProjectSheet","项目制作单","项目制作单.xlsx",2),
	autoCpsl("autoCpsl","客户项目服务函","客户项目服务函.docx",2);
	
	private String id;//文件ID	
	private String text;//文件名称
	private String name="";//文件名称全称
	private int type=1;//文件类型：1-上传文件（默认），2-自动生成文件,3-模板文件
	
	
	private FileType(){}
	

	private FileType(String id, String text) {
		this.id = id;
		this.text = text;
	}
	private FileType(String id, String text, String name,int type) {
		this.id = id;
		this.text = text;
		this.name = name;
		this.type=type;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public static FileType getEnum(String id) {
		FileType resultEnum = null;
		FileType[] enumAry = FileType.values();
		for (int i = 0; i < enumAry.length; i++) {
			if ((enumAry[i].getId()).equals(id)) {
				resultEnum = enumAry[i];
				break;
			}
		}
		return resultEnum;
	}
	
}

package com.paipianwang.pat.common.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 表属性
 * @author jacky
 *
 */
public class Table {

	/** 表名 **/
	private String name;

	/** 类别名 **/
	private String catalog;

	/** 模式名 **/
	private String schema;

	/** 列集合 **/
	private final Map<String, Column> columns = new HashMap<String, Column>();

	/** 主键列 **/
	private Column primaryKey;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public Column getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(Column primaryKey) {
		this.primaryKey = primaryKey;
	}

	public Map<String, Column> getColumns() {
		return columns;
	}

}

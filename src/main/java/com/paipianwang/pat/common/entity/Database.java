package com.paipianwang.pat.common.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 数据库 属性
 * @author jacky
 *
 */
public class Database {

	private String catalog;

	private String schema;

	private final Map<String, Table> tables = new HashMap<String, Table>();

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

	public Map<String, Table> getTables() {
		return tables;
	}

}

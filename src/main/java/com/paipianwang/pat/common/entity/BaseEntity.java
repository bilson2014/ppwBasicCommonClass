package com.paipianwang.pat.common.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.paipianwang.pat.common.entity.json.LocalDateDeserializer;
import com.paipianwang.pat.common.entity.json.LocalDateSerializer;
import com.paipianwang.pat.common.entity.json.LocalTimeDeserializer;
import com.paipianwang.pat.common.entity.json.LocalTimeSerializer;

public class BaseEntity implements Serializable {

	private static final long serialVersionUID = -6346046812684733942L;
	
	public static String SAVE_MAP_ID = "save_map_id";
	public static String SAVE_MAP_ROWS = "save_map_rows";
	
	/** 唯一编号 **/
	private Long id = null;
	
	/** 版本号 **/
	private Integer version = 0;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public String toString() {
		final GsonBuilder builder = new GsonBuilder();
		builder.registerTypeAdapter(LocalDate.class, new LocalDateSerializer());
		builder.registerTypeAdapter(LocalTime.class, new LocalTimeSerializer());
		final Gson gson = builder.create();
		return gson.toJson(this);
	}

	public <T> T fromString(final String json, final Class<T> T) {
		final GsonBuilder builder = new GsonBuilder();
		builder.registerTypeAdapter(LocalDate.class, new LocalDateDeserializer());
		builder.registerTypeAdapter(LocalTime.class, new LocalTimeDeserializer());
		final Gson gson = builder.create();
		return gson.fromJson(json, T);
	}
}

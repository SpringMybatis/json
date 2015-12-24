package com.ibs.json.demo.model;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

	private String name;

	private String code;

	private List<Authority> list;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Authority> getList() {
		return list;
	}

	public void setList(List<Authority> list) {
		this.list = list;
	}

}

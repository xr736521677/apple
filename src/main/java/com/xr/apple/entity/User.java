package com.xr.apple.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private Integer id;
	private String name;
	private Date createtime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
}

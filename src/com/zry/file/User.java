package com.zry.file;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String msg;
	private boolean sex;

	public User() {
	}

	public User(int id, String msg, boolean sex) {
		this.id = id;
		this.msg = msg;
		this.sex = sex;
	}

	/*---------------------getter setter----------------------------*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}
}

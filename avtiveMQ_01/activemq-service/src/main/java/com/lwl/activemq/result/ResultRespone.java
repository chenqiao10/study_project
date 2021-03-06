package com.lwl.activemq.result;

import java.io.Serializable;

public class ResultRespone implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean success = true;
	
	public ResultRespone(){}

	public ResultRespone(boolean success,String msg){
		this.success = success;
		this.msg = msg;
	}
	
	private Object data;
	
	private String msg;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}

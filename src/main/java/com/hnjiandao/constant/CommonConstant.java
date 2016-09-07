package com.hnjiandao.constant;

public enum CommonConstant {

	URL("http://www.baidu.com")
	
	;
	
	private String value;
	
	private CommonConstant(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}

package com.hnjiandao.domain;

public class OrderBaseTransfer {
	private String copCode;//"传输企业代码"
	private String copName;//"传输企业名称"
	private String dxpMode;//"报文传输模式"
	private String dxpId;//"报文传输编号"
	
	
	public OrderBaseTransfer(String copCode,String copName,String dxpMode,String dxpId){
		this.copCode=copCode;
		this.copName=copName;
		this.dxpMode=dxpMode;
		this.dxpId= dxpId;
	}
	
	public String getCopCode() {
		return copCode;
	}
	public void setCopCode(String copCode) {
		this.copCode = copCode;
	}
	public String getCopName() {
		return copName;
	}
	public void setCopName(String copName) {
		this.copName = copName;
	}
	public String getDxpMode() {
		return dxpMode;
	}
	public void setDxpMode(String dxpMode) {
		this.dxpMode = dxpMode;
	}
	public String getDxpId() {
		return dxpId;
	}
	public void setDxpId(String dxpId) {
		this.dxpId = dxpId;
	}
}
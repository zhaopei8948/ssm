package com.hnjiandao.domain;

public class OrderDetail {
	private String qty; // 数量
	private String price; // 单价
	private String flag; // 是否赠品（Y-是，N-否）
	private String packcategoryinsp; // 包装类型代码（国检）
	private String gno; // 关联H2010项号（保税模式必填，一般模式非必填）"
	
	
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getPackcategoryinsp() {
		return packcategoryinsp;
	}
	public void setPackcategoryinsp(String packcategoryinsp) {
		this.packcategoryinsp = packcategoryinsp;
	}
	public String getGno() {
		return gno;
	}
	public void setGno(String gno) {
		this.gno = gno;
	}
}
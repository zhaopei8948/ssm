package com.hnjiandao.domain;

public class OverallDataBodyReport {
	private String gnum;//商品序号"
	private String itemNo;//企业商品货号"
	private String itemName;//企业商品名称"
	private String unit;//单位"
	private String qty;//数量"
	private String price;//单价"
	private String totalPrice;//总价"
	private String currency;//币值"
	private String country;//原产国"
	private String specifications;//规格型号"
	private String ciqbarcode;//HS编码"
	private String goodidinsp;//检验检疫商品备案编号"
	private String flag;//是否赠品（Y-是，N-否）"
	private String packcategoryinsp;//包装类型代码（国检）"
	private String coininsp;//币制(检验检疫)"
	private String unitinsp;//计量单位(检验检疫)"
	private String srccountryinsp;//原产国(检验检疫)"
	private String gno;//关联H2010项号（保税模式必填，一般模式非必填）"
	
	public String getGnum() {
		return gnum;
	}
	public void setGnum(String gnum) {
		this.gnum = gnum;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
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
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSpecifications() {
		return specifications;
	}
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	public String getCiqbarcode() {
		return ciqbarcode;
	}
	public void setCiqbarcode(String ciqbarcode) {
		this.ciqbarcode = ciqbarcode;
	}
	public String getGoodidinsp() {
		return goodidinsp;
	}
	public void setGoodidinsp(String goodidinsp) {
		this.goodidinsp = goodidinsp;
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
	public String getCoininsp() {
		return coininsp;
	}
	public void setCoininsp(String coininsp) {
		this.coininsp = coininsp;
	}
	public String getUnitinsp() {
		return unitinsp;
	}
	public void setUnitinsp(String unitinsp) {
		this.unitinsp = unitinsp;
	}
	public String getSrccountryinsp() {
		return srccountryinsp;
	}
	public void setSrccountryinsp(String srccountryinsp) {
		this.srccountryinsp = srccountryinsp;
	}
	public String getGno() {
		return gno;
	}
	public void setGno(String gno) {
		this.gno = gno;
	}
}
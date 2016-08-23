package com.hnjiandao.domain;

public class OrderHead {
	private String orderNo; //订单号
	private String goodsValue; //商品总货值
	private String freight; //运费（无运费填0）
	private String discount; //非现金抵扣金额（无则填0）
	private String taxTotal; //代扣税款（无则填0）
	private String acturalPaid; //实际支付金额
	private String buyerRegNo; //订购人的交易平台注册号
	private String buyerName; //订购人的真实姓名
	private String buyerIdNumber; //订购人的身份证件号码
	private String purchasertelephone; //订购人电话
	private String payCode; //支付企业海关代码（不填写，使用默认配置好的支付企业）
	private String payTrCsactionId; //支付交易号
	private String consignee; //收货人
	private String consigneeTelephone; //收货人电话
	private String consigneeAddress; //收货地址
	private String note; //备注（可不填）
	private String senderusername; //发货人姓名
	private String senderuseraddress; //发货地址
	private String senderusertelephone; //发货人电话
	private String billmode; //模式代码：1.一般模式； 2.保税模式
	private String wasterornot; //废旧物品（国检）
	private String botanyornot; //是否带有植物性包装及铺垫材料(国检）
	private String trepcodeinsp; //物流企业代码（国检）
	private String weight; //毛重（国检）
	private String netweight; //净重（国检）
	private String collusercountryinsp; //发货人所在国(国检)"
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getGoodsValue() {
		return goodsValue;
	}
	public void setGoodsValue(String goodsValue) {
		this.goodsValue = goodsValue;
	}
	public String getFreight() {
		return freight;
	}
	public void setFreight(String freight) {
		this.freight = freight;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getTaxTotal() {
		return taxTotal;
	}
	public void setTaxTotal(String taxTotal) {
		this.taxTotal = taxTotal;
	}
	public String getActuralPaid() {
		return acturalPaid;
	}
	public void setActuralPaid(String acturalPaid) {
		this.acturalPaid = acturalPaid;
	}
	public String getBuyerRegNo() {
		return buyerRegNo;
	}
	public void setBuyerRegNo(String buyerRegNo) {
		this.buyerRegNo = buyerRegNo;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getBuyerIdNumber() {
		return buyerIdNumber;
	}
	public void setBuyerIdNumber(String buyerIdNumber) {
		this.buyerIdNumber = buyerIdNumber;
	}
	public String getPurchasertelephone() {
		return purchasertelephone;
	}
	public void setPurchasertelephone(String purchasertelephone) {
		this.purchasertelephone = purchasertelephone;
	}
	public String getPayCode() {
		return payCode;
	}
	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}
	public String getPayTrCsactionId() {
		return payTrCsactionId;
	}
	public void setPayTrCsactionId(String payTrCsactionId) {
		this.payTrCsactionId = payTrCsactionId;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getConsigneeTelephone() {
		return consigneeTelephone;
	}
	public void setConsigneeTelephone(String consigneeTelephone) {
		this.consigneeTelephone = consigneeTelephone;
	}
	public String getConsigneeAddress() {
		return consigneeAddress;
	}
	public void setConsigneeAddress(String consigneeAddress) {
		this.consigneeAddress = consigneeAddress;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getSenderusername() {
		return senderusername;
	}
	public void setSenderusername(String senderusername) {
		this.senderusername = senderusername;
	}
	public String getSenderuseraddress() {
		return senderuseraddress;
	}
	public void setSenderuseraddress(String senderuseraddress) {
		this.senderuseraddress = senderuseraddress;
	}
	public String getSenderusertelephone() {
		return senderusertelephone;
	}
	public void setSenderusertelephone(String senderusertelephone) {
		this.senderusertelephone = senderusertelephone;
	}
	public String getBillmode() {
		return billmode;
	}
	public void setBillmode(String billmode) {
		this.billmode = billmode;
	}
	public String getWasterornot() {
		return wasterornot;
	}
	public void setWasterornot(String wasterornot) {
		this.wasterornot = wasterornot;
	}
	public String getBotanyornot() {
		return botanyornot;
	}
	public void setBotanyornot(String botanyornot) {
		this.botanyornot = botanyornot;
	}
	public String getTrepcodeinsp() {
		return trepcodeinsp;
	}
	public void setTrepcodeinsp(String trepcodeinsp) {
		this.trepcodeinsp = trepcodeinsp;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getNetweight() {
		return netweight;
	}
	public void setNetweight(String netweight) {
		this.netweight = netweight;
	}
	public String getCollusercountryinsp() {
		return collusercountryinsp;
	}
	public void setCollusercountryinsp(String collusercountryinsp) {
		this.collusercountryinsp = collusercountryinsp;
	}
}

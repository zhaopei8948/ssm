package com.hnjiandao.domain;

public class OrderHeadReport {
	private String orderNo; //订单号"
	private String ebpCode; //电商平台代码"
	private String ebpName; //电商平台名称"
	private String ebcCode; //电商企业代码"
	private String ebcName; //电商企业名称"
	private String goodsValue; //商品总货值"
	private String freight; //运费（无运费填0）"
	private String discount; //非现金抵扣金额（无则填0）"
	private String taxTotal; //代扣税款（无则填0）"
	private String acturalPaid; //实际支付金额"
	private String currency; //币制(限定为142)"
	private String buyerRegNo; //订购人的交易平台注册号"
	private String buyerName; //订购人的真实姓名"
	private String buyerIdType; //订购人证件类型（限定为1）"
	private String buyerIdNumber; //订购人的身份证件号码"
	private String consignee; //收货人"
	private String consigneeTelephone; //收货人电话"
	private String consigneeAddress; //收货地址"
	private String note; //备注（可不填）"
	private String ordersum; //订单总价"
	private String senderusername; //发货人姓名"
	private String senderuseraddress; //发货地址"
	private String senderusertelephone; //发货人电话"
	private String billmode; //模式代码：1.一般模式； 2.保税模式"
	private String wasterornot; //废旧物品（国检）"
	private String botanyornot; //是否带有植物性包装及铺垫材料(国检）"
	private String cbecodeinsp; //电商检验检疫CIQ备案编号"
	private String ecpcodeinsp; //电商平台检验检疫CIQ备案编号"
	private String trepcodeinsp; //物流企业代码（国检）"
	private String submittime; //订单提交时间"
	private String tradecompany; //贸易国别(检验检疫)"
	private String totalfeeunit; //总费用单位(检验检疫)"
	private String countofgoodstype; //商品种类数(检验检疫)"
	private String weight; //毛重（国检）"
	private String weightunit; //毛重单位(检验检疫)"
	private String netweight; //净重（国检）"
	private String netweightunit; //净重单位(检验检疫)"
	private String collusercountryinsp; //发货人所在国(国检)"
	private String sendusercountryinsp; //收货人所在国(检验检疫)"
	private String paynumber; //支付交易号"
	private String purchasername; //订购人名称"
	private String purchasertelephone; //订购人电话"
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getEbpCode() {
		return ebpCode;
	}
	public void setEbpCode(String ebpCode) {
		this.ebpCode = ebpCode;
	}
	public String getEbpName() {
		return ebpName;
	}
	public void setEbpName(String ebpName) {
		this.ebpName = ebpName;
	}
	public String getEbcCode() {
		return ebcCode;
	}
	public void setEbcCode(String ebcCode) {
		this.ebcCode = ebcCode;
	}
	public String getEbcName() {
		return ebcName;
	}
	public void setEbcName(String ebcName) {
		this.ebcName = ebcName;
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
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
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
	public String getBuyerIdType() {
		return buyerIdType;
	}
	public void setBuyerIdType(String buyerIdType) {
		this.buyerIdType = buyerIdType;
	}
	public String getBuyerIdNumber() {
		return buyerIdNumber;
	}
	public void setBuyerIdNumber(String buyerIdNumber) {
		this.buyerIdNumber = buyerIdNumber;
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
	public String getOrdersum() {
		return ordersum;
	}
	public void setOrdersum(String ordersum) {
		this.ordersum = ordersum;
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
	public String getCbecodeinsp() {
		return cbecodeinsp;
	}
	public void setCbecodeinsp(String cbecodeinsp) {
		this.cbecodeinsp = cbecodeinsp;
	}
	public String getEcpcodeinsp() {
		return ecpcodeinsp;
	}
	public void setEcpcodeinsp(String ecpcodeinsp) {
		this.ecpcodeinsp = ecpcodeinsp;
	}
	public String getTrepcodeinsp() {
		return trepcodeinsp;
	}
	public void setTrepcodeinsp(String trepcodeinsp) {
		this.trepcodeinsp = trepcodeinsp;
	}
	public String getSubmittime() {
		return submittime;
	}
	public void setSubmittime(String submittime) {
		this.submittime = submittime;
	}
	public String getTradecompany() {
		return tradecompany;
	}
	public void setTradecompany(String tradecompany) {
		this.tradecompany = tradecompany;
	}
	public String getTotalfeeunit() {
		return totalfeeunit;
	}
	public void setTotalfeeunit(String totalfeeunit) {
		this.totalfeeunit = totalfeeunit;
	}
	public String getCountofgoodstype() {
		return countofgoodstype;
	}
	public void setCountofgoodstype(String countofgoodstype) {
		this.countofgoodstype = countofgoodstype;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getWeightunit() {
		return weightunit;
	}
	public void setWeightunit(String weightunit) {
		this.weightunit = weightunit;
	}
	public String getNetweight() {
		return netweight;
	}
	public void setNetweight(String netweight) {
		this.netweight = netweight;
	}
	public String getNetweightunit() {
		return netweightunit;
	}
	public void setNetweightunit(String netweightunit) {
		this.netweightunit = netweightunit;
	}
	public String getCollusercountryinsp() {
		return collusercountryinsp;
	}
	public void setCollusercountryinsp(String collusercountryinsp) {
		this.collusercountryinsp = collusercountryinsp;
	}
	public String getSendusercountryinsp() {
		return sendusercountryinsp;
	}
	public void setSendusercountryinsp(String sendusercountryinsp) {
		this.sendusercountryinsp = sendusercountryinsp;
	}
	public String getPaynumber() {
		return paynumber;
	}
	public void setPaynumber(String paynumber) {
		this.paynumber = paynumber;
	}
	public String getPurchasername() {
		return purchasername;
	}
	public void setPurchasername(String purchasername) {
		this.purchasername = purchasername;
	}
	
	public String getPurchasertelephone() {
		return purchasertelephone;
	}
	public void setPurchasertelephone(String purchasertelephone) {
		this.purchasertelephone = purchasertelephone;
	}
}
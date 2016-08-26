package com.hnjiandao.domain;

public class OverallDataHead {
    
    private String id;
    private String orderType;
    private String orderNo;
    private String ebpCode;
    private String ebpName;
    private String ebcCode;
    private String ebcName;
    private Double goodsValue;
    private Double freight;
    private Double discount;
    private Double taxTotal;
    private Double acturalPaid;
    private String currency;
    private String buyerRegNo;
    private String buyerName;
    private String buyerIdType;
    private String buyerIdNumber;
    private String payCode;
    private String payName;
    private String payTrCsactionId;
    private String batchNumbers;
    private String consignee;
    private String consigneeTelephone;
    private String consigneeAddress;
    private String consigneeDitrict;
    private String note;
    private String senderusername;
    private String senderuseraddress;
    private String senderusertelephone;
    private String billmode;
    private String wasterornot;
    private String botanyornot;
    private String cbecodeinsp;
    private String ecpcodeinsp;
    private String trepcodeinsp;
    private String submittime;
    private String tradecompany;
    private String totalfeeunit;
    private String countofgoodstype;
    private Double weight;
    private String weightunit;
    private Double netweight;
    private String netweightunit;
    private String platformurl;
    private String collusercountryinsp;
    private String sendusercountryinsp;
    private String lmsno;
    private String manualno;
    private String purchasertelephone;
    private String logisticsCode;
    private String logisticsName;
    private String logisticsNo;
    private String billNo;
    private Double insuredFee;
    private Integer packNo;
    private String goodsInfo;
    private String totaltransfernumber;
    private String collectionusercountry;
    private String senderusercountry;
    private String goodsname;
    private String shipname;
    private String destinationport;
    private String jcbordertime;
    private String jcborderportinsp;
    private String transfertypeinsp;
    private String shipnameinsp;
    private String shipcodeinsp;
    private String applyportinsp;
    private String transferregioninsp;
    private String packcategoryinsp;
    private String coininsp;
    private String paymenttype;
    private String customerflag;
    private String payecode;
    private String copNo;
    private String preNo;
    private String assureCode;
    private String emsNo;
    private String invtNo;
    private String declTime;
    private String customsCode;
    private String portCode;
    private String ieDate;
    private String agentCode;
    private String agentName;
    private String areaCode;
    private String areCame;
    private String tradeMode;
    private String trafMode;
    private String trafNo;
    private String voyageNo;
    private String loctNo;
    private String licenseNo;
    private String country;
    private String wrapType;
    private String detailscode;
    private String contact;
    private String fixedtelephone;
    private String fjname;
    private String fjtype;
    private String sendctiycode;
    private String bashstste;
    private String goodsvaluecode;
    private String applyunitname;
    private String applyunitcode;
    private String payename;
    private String orderStatus;
    private String logisticStatus;
    private String payStatus;
    private String createTime;
    private String updateTime;
    private Double ordersum;
    private String purchasername;
    private String paynumber;
    
    public OverallDataHead(String id,OrderHead orderHead) {
		this.id=id;
		this.orderNo=orderHead.getOrderNo();
		this.goodsValue=Double.valueOf(orderHead.getGoodsValue());
		this.freight=Double.valueOf(orderHead.getFreight());
		this.discount=Double.valueOf(orderHead.getDiscount());
		this.taxTotal=Double.valueOf(orderHead.getTaxTotal());
		this.acturalPaid=Double.valueOf(orderHead.getActuralPaid());
		this.buyerRegNo=orderHead.getBuyerRegNo();
		this.buyerName=orderHead.getBuyerName();
		this.buyerIdNumber=orderHead.getBuyerIdNumber();
		this.purchasertelephone=orderHead.getPurchasertelephone();
		this.payTrCsactionId=orderHead.getPayTrCsactionId();
		this.consignee=orderHead.getConsignee();
		this.consigneeTelephone=orderHead.getConsigneeTelephone();
		this.consigneeAddress=orderHead.getConsigneeAddress();
		this.note=orderHead.getNote();
		this.senderusername=orderHead.getSenderusername();
		this.senderuseraddress=orderHead.getSenderuseraddress();
		this.senderusertelephone=orderHead.getSenderusertelephone();
		this.billmode=orderHead.getBillmode();
		this.wasterornot=orderHead.getWasterornot();
		this.botanyornot=orderHead.getBotanyornot();
		this.trepcodeinsp=orderHead.getTrepcodeinsp();
		this.weight=Double.valueOf(orderHead.getWeight());
		this.netweight=Double.valueOf(orderHead.getNetweight());
		this.collusercountryinsp=orderHead.getCollusercountryinsp();		
	}

	public OverallDataHead() {

	}
    
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.id
     *
     * @param id the value for overall_data_head.id
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.order_type
     *
     * @return the value of overall_data_head.order_type
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.order_type
     *
     * @param orderType the value for overall_data_head.order_type
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.order_no
     *
     * @return the value of overall_data_head.order_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.order_no
     *
     * @param orderNo the value for overall_data_head.order_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.ebp_code
     *
     * @return the value of overall_data_head.ebp_code
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getEbpCode() {
        return ebpCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.ebp_code
     *
     * @param ebpCode the value for overall_data_head.ebp_code
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setEbpCode(String ebpCode) {
        this.ebpCode = ebpCode == null ? null : ebpCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.ebp_name
     *
     * @return the value of overall_data_head.ebp_name
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getEbpName() {
        return ebpName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.ebp_name
     *
     * @param ebpName the value for overall_data_head.ebp_name
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setEbpName(String ebpName) {
        this.ebpName = ebpName == null ? null : ebpName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.ebc_code
     *
     * @return the value of overall_data_head.ebc_code
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getEbcCode() {
        return ebcCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.ebc_code
     *
     * @param ebcCode the value for overall_data_head.ebc_code
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setEbcCode(String ebcCode) {
        this.ebcCode = ebcCode == null ? null : ebcCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.ebc_name
     *
     * @return the value of overall_data_head.ebc_name
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getEbcName() {
        return ebcName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.ebc_name
     *
     * @param ebcName the value for overall_data_head.ebc_name
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setEbcName(String ebcName) {
        this.ebcName = ebcName == null ? null : ebcName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.goods_value
     *
     * @return the value of overall_data_head.goods_value
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public Double getGoodsValue() {
        return goodsValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.goods_value
     *
     * @param goodsValue the value for overall_data_head.goods_value
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setGoodsValue(Double goodsValue) {
        this.goodsValue = goodsValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.freight
     *
     * @return the value of overall_data_head.freight
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public Double getFreight() {
        return freight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.freight
     *
     * @param freight the value for overall_data_head.freight
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setFreight(Double freight) {
        this.freight = freight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.discount
     *
     * @return the value of overall_data_head.discount
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.discount
     *
     * @param discount the value for overall_data_head.discount
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.tax_total
     *
     * @return the value of overall_data_head.tax_total
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public Double getTaxTotal() {
        return taxTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.tax_total
     *
     * @param taxTotal the value for overall_data_head.tax_total
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setTaxTotal(Double taxTotal) {
        this.taxTotal = taxTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.actural_paid
     *
     * @return the value of overall_data_head.actural_paid
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public Double getActuralPaid() {
        return acturalPaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.actural_paid
     *
     * @param acturalPaid the value for overall_data_head.actural_paid
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setActuralPaid(Double acturalPaid) {
        this.acturalPaid = acturalPaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.currency
     *
     * @return the value of overall_data_head.currency
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.currency
     *
     * @param currency the value for overall_data_head.currency
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.buyer_reg_no
     *
     * @return the value of overall_data_head.buyer_reg_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getBuyerRegNo() {
        return buyerRegNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.buyer_reg_no
     *
     * @param buyerRegNo the value for overall_data_head.buyer_reg_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setBuyerRegNo(String buyerRegNo) {
        this.buyerRegNo = buyerRegNo == null ? null : buyerRegNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.buyer_name
     *
     * @return the value of overall_data_head.buyer_name
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.buyer_name
     *
     * @param buyerName the value for overall_data_head.buyer_name
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.buyer_id_type
     *
     * @return the value of overall_data_head.buyer_id_type
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getBuyerIdType() {
        return buyerIdType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.buyer_id_type
     *
     * @param buyerIdType the value for overall_data_head.buyer_id_type
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setBuyerIdType(String buyerIdType) {
        this.buyerIdType = buyerIdType == null ? null : buyerIdType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.buyer_id_number
     *
     * @return the value of overall_data_head.buyer_id_number
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getBuyerIdNumber() {
        return buyerIdNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.buyer_id_number
     *
     * @param buyerIdNumber the value for overall_data_head.buyer_id_number
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setBuyerIdNumber(String buyerIdNumber) {
        this.buyerIdNumber = buyerIdNumber == null ? null : buyerIdNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.pay_code
     *
     * @return the value of overall_data_head.pay_code
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getPayCode() {
        return payCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.pay_code
     *
     * @param payCode the value for overall_data_head.pay_code
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setPayCode(String payCode) {
        this.payCode = payCode == null ? null : payCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.pay_name
     *
     * @return the value of overall_data_head.pay_name
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getPayName() {
        return payName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.pay_name
     *
     * @param payName the value for overall_data_head.pay_name
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.pay_tr_csaction_id
     *
     * @return the value of overall_data_head.pay_tr_csaction_id
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getPayTrCsactionId() {
        return payTrCsactionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.pay_tr_csaction_id
     *
     * @param payTrCsactionId the value for overall_data_head.pay_tr_csaction_id
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setPayTrCsactionId(String payTrCsactionId) {
        this.payTrCsactionId = payTrCsactionId == null ? null : payTrCsactionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.batch_numbers
     *
     * @return the value of overall_data_head.batch_numbers
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getBatchNumbers() {
        return batchNumbers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.batch_numbers
     *
     * @param batchNumbers the value for overall_data_head.batch_numbers
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setBatchNumbers(String batchNumbers) {
        this.batchNumbers = batchNumbers == null ? null : batchNumbers.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.consignee
     *
     * @return the value of overall_data_head.consignee
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.consignee
     *
     * @param consignee the value for overall_data_head.consignee
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.consignee_telephone
     *
     * @return the value of overall_data_head.consignee_telephone
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getConsigneeTelephone() {
        return consigneeTelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.consignee_telephone
     *
     * @param consigneeTelephone the value for overall_data_head.consignee_telephone
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setConsigneeTelephone(String consigneeTelephone) {
        this.consigneeTelephone = consigneeTelephone == null ? null : consigneeTelephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.consignee_address
     *
     * @return the value of overall_data_head.consignee_address
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.consignee_address
     *
     * @param consigneeAddress the value for overall_data_head.consignee_address
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress == null ? null : consigneeAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.consignee_ditrict
     *
     * @return the value of overall_data_head.consignee_ditrict
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getConsigneeDitrict() {
        return consigneeDitrict;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.consignee_ditrict
     *
     * @param consigneeDitrict the value for overall_data_head.consignee_ditrict
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setConsigneeDitrict(String consigneeDitrict) {
        this.consigneeDitrict = consigneeDitrict == null ? null : consigneeDitrict.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.note
     *
     * @return the value of overall_data_head.note
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.note
     *
     * @param note the value for overall_data_head.note
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.senderusername
     *
     * @return the value of overall_data_head.senderusername
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getSenderusername() {
        return senderusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.senderusername
     *
     * @param senderusername the value for overall_data_head.senderusername
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setSenderusername(String senderusername) {
        this.senderusername = senderusername == null ? null : senderusername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.senderuseraddress
     *
     * @return the value of overall_data_head.senderuseraddress
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getSenderuseraddress() {
        return senderuseraddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.senderuseraddress
     *
     * @param senderuseraddress the value for overall_data_head.senderuseraddress
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setSenderuseraddress(String senderuseraddress) {
        this.senderuseraddress = senderuseraddress == null ? null : senderuseraddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.senderusertelephone
     *
     * @return the value of overall_data_head.senderusertelephone
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getSenderusertelephone() {
        return senderusertelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.senderusertelephone
     *
     * @param senderusertelephone the value for overall_data_head.senderusertelephone
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setSenderusertelephone(String senderusertelephone) {
        this.senderusertelephone = senderusertelephone == null ? null : senderusertelephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.billmode
     *
     * @return the value of overall_data_head.billmode
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getBillmode() {
        return billmode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.billmode
     *
     * @param billmode the value for overall_data_head.billmode
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setBillmode(String billmode) {
        this.billmode = billmode == null ? null : billmode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.wasterornot
     *
     * @return the value of overall_data_head.wasterornot
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getWasterornot() {
        return wasterornot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.wasterornot
     *
     * @param wasterornot the value for overall_data_head.wasterornot
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setWasterornot(String wasterornot) {
        this.wasterornot = wasterornot == null ? null : wasterornot.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.botanyornot
     *
     * @return the value of overall_data_head.botanyornot
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getBotanyornot() {
        return botanyornot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.botanyornot
     *
     * @param botanyornot the value for overall_data_head.botanyornot
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setBotanyornot(String botanyornot) {
        this.botanyornot = botanyornot == null ? null : botanyornot.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.cbecodeinsp
     *
     * @return the value of overall_data_head.cbecodeinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getCbecodeinsp() {
        return cbecodeinsp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.cbecodeinsp
     *
     * @param cbecodeinsp the value for overall_data_head.cbecodeinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setCbecodeinsp(String cbecodeinsp) {
        this.cbecodeinsp = cbecodeinsp == null ? null : cbecodeinsp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.ecpcodeinsp
     *
     * @return the value of overall_data_head.ecpcodeinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getEcpcodeinsp() {
        return ecpcodeinsp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.ecpcodeinsp
     *
     * @param ecpcodeinsp the value for overall_data_head.ecpcodeinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setEcpcodeinsp(String ecpcodeinsp) {
        this.ecpcodeinsp = ecpcodeinsp == null ? null : ecpcodeinsp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.trepcodeinsp
     *
     * @return the value of overall_data_head.trepcodeinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getTrepcodeinsp() {
        return trepcodeinsp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.trepcodeinsp
     *
     * @param trepcodeinsp the value for overall_data_head.trepcodeinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setTrepcodeinsp(String trepcodeinsp) {
        this.trepcodeinsp = trepcodeinsp == null ? null : trepcodeinsp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.submittime
     *
     * @return the value of overall_data_head.submittime
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getSubmittime() {
        return submittime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.submittime
     *
     * @param submittime the value for overall_data_head.submittime
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setSubmittime(String submittime) {
        this.submittime = submittime == null ? null : submittime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.tradecompany
     *
     * @return the value of overall_data_head.tradecompany
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getTradecompany() {
        return tradecompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.tradecompany
     *
     * @param tradecompany the value for overall_data_head.tradecompany
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setTradecompany(String tradecompany) {
        this.tradecompany = tradecompany == null ? null : tradecompany.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.totalfeeunit
     *
     * @return the value of overall_data_head.totalfeeunit
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getTotalfeeunit() {
        return totalfeeunit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.totalfeeunit
     *
     * @param totalfeeunit the value for overall_data_head.totalfeeunit
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setTotalfeeunit(String totalfeeunit) {
        this.totalfeeunit = totalfeeunit == null ? null : totalfeeunit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.countofgoodstype
     *
     * @return the value of overall_data_head.countofgoodstype
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getCountofgoodstype() {
        return countofgoodstype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.countofgoodstype
     *
     * @param countofgoodstype the value for overall_data_head.countofgoodstype
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setCountofgoodstype(String countofgoodstype) {
        this.countofgoodstype = countofgoodstype == null ? null : countofgoodstype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.weight
     *
     * @return the value of overall_data_head.weight
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.weight
     *
     * @param weight the value for overall_data_head.weight
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.weightunit
     *
     * @return the value of overall_data_head.weightunit
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getWeightunit() {
        return weightunit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.weightunit
     *
     * @param weightunit the value for overall_data_head.weightunit
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setWeightunit(String weightunit) {
        this.weightunit = weightunit == null ? null : weightunit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.netweight
     *
     * @return the value of overall_data_head.netweight
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public Double getNetweight() {
        return netweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.netweight
     *
     * @param netweight the value for overall_data_head.netweight
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setNetweight(Double netweight) {
        this.netweight = netweight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.netweightunit
     *
     * @return the value of overall_data_head.netweightunit
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getNetweightunit() {
        return netweightunit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.netweightunit
     *
     * @param netweightunit the value for overall_data_head.netweightunit
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setNetweightunit(String netweightunit) {
        this.netweightunit = netweightunit == null ? null : netweightunit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.platformurl
     *
     * @return the value of overall_data_head.platformurl
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getPlatformurl() {
        return platformurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.platformurl
     *
     * @param platformurl the value for overall_data_head.platformurl
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setPlatformurl(String platformurl) {
        this.platformurl = platformurl == null ? null : platformurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.collusercountryinsp
     *
     * @return the value of overall_data_head.collusercountryinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getCollusercountryinsp() {
        return collusercountryinsp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.collusercountryinsp
     *
     * @param collusercountryinsp the value for overall_data_head.collusercountryinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setCollusercountryinsp(String collusercountryinsp) {
        this.collusercountryinsp = collusercountryinsp == null ? null : collusercountryinsp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.sendusercountryinsp
     *
     * @return the value of overall_data_head.sendusercountryinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getSendusercountryinsp() {
        return sendusercountryinsp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.sendusercountryinsp
     *
     * @param sendusercountryinsp the value for overall_data_head.sendusercountryinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setSendusercountryinsp(String sendusercountryinsp) {
        this.sendusercountryinsp = sendusercountryinsp == null ? null : sendusercountryinsp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.lmsno
     *
     * @return the value of overall_data_head.lmsno
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getLmsno() {
        return lmsno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.lmsno
     *
     * @param lmsno the value for overall_data_head.lmsno
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setLmsno(String lmsno) {
        this.lmsno = lmsno == null ? null : lmsno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.manualno
     *
     * @return the value of overall_data_head.manualno
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getManualno() {
        return manualno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.manualno
     *
     * @param manualno the value for overall_data_head.manualno
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setManualno(String manualno) {
        this.manualno = manualno == null ? null : manualno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.purchasertelephone
     *
     * @return the value of overall_data_head.purchasertelephone
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getPurchasertelephone() {
        return purchasertelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.purchasertelephone
     *
     * @param purchasertelephone the value for overall_data_head.purchasertelephone
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setPurchasertelephone(String purchasertelephone) {
        this.purchasertelephone = purchasertelephone == null ? null : purchasertelephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.logistics_code
     *
     * @return the value of overall_data_head.logistics_code
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getLogisticsCode() {
        return logisticsCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.logistics_code
     *
     * @param logisticsCode the value for overall_data_head.logistics_code
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode == null ? null : logisticsCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.logistics_name
     *
     * @return the value of overall_data_head.logistics_name
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getLogisticsName() {
        return logisticsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.logistics_name
     *
     * @param logisticsName the value for overall_data_head.logistics_name
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName == null ? null : logisticsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.logistics_no
     *
     * @return the value of overall_data_head.logistics_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getLogisticsNo() {
        return logisticsNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.logistics_no
     *
     * @param logisticsNo the value for overall_data_head.logistics_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo == null ? null : logisticsNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.bill_no
     *
     * @return the value of overall_data_head.bill_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.bill_no
     *
     * @param billNo the value for overall_data_head.bill_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.insured_fee
     *
     * @return the value of overall_data_head.insured_fee
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public Double getInsuredFee() {
        return insuredFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.insured_fee
     *
     * @param insuredFee the value for overall_data_head.insured_fee
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setInsuredFee(Double insuredFee) {
        this.insuredFee = insuredFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.pack_no
     *
     * @return the value of overall_data_head.pack_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public Integer getPackNo() {
        return packNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.pack_no
     *
     * @param packNo the value for overall_data_head.pack_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setPackNo(Integer packNo) {
        this.packNo = packNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.goods_info
     *
     * @return the value of overall_data_head.goods_info
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getGoodsInfo() {
        return goodsInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.goods_info
     *
     * @param goodsInfo the value for overall_data_head.goods_info
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo == null ? null : goodsInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.totaltransfernumber
     *
     * @return the value of overall_data_head.totaltransfernumber
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getTotaltransfernumber() {
        return totaltransfernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.totaltransfernumber
     *
     * @param totaltransfernumber the value for overall_data_head.totaltransfernumber
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setTotaltransfernumber(String totaltransfernumber) {
        this.totaltransfernumber = totaltransfernumber == null ? null : totaltransfernumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.collectionusercountry
     *
     * @return the value of overall_data_head.collectionusercountry
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getCollectionusercountry() {
        return collectionusercountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.collectionusercountry
     *
     * @param collectionusercountry the value for overall_data_head.collectionusercountry
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setCollectionusercountry(String collectionusercountry) {
        this.collectionusercountry = collectionusercountry == null ? null : collectionusercountry.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.senderusercountry
     *
     * @return the value of overall_data_head.senderusercountry
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getSenderusercountry() {
        return senderusercountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.senderusercountry
     *
     * @param senderusercountry the value for overall_data_head.senderusercountry
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setSenderusercountry(String senderusercountry) {
        this.senderusercountry = senderusercountry == null ? null : senderusercountry.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.goodsname
     *
     * @return the value of overall_data_head.goodsname
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getGoodsname() {
        return goodsname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.goodsname
     *
     * @param goodsname the value for overall_data_head.goodsname
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.shipname
     *
     * @return the value of overall_data_head.shipname
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getShipname() {
        return shipname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.shipname
     *
     * @param shipname the value for overall_data_head.shipname
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setShipname(String shipname) {
        this.shipname = shipname == null ? null : shipname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.destinationport
     *
     * @return the value of overall_data_head.destinationport
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getDestinationport() {
        return destinationport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.destinationport
     *
     * @param destinationport the value for overall_data_head.destinationport
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setDestinationport(String destinationport) {
        this.destinationport = destinationport == null ? null : destinationport.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.jcbordertime
     *
     * @return the value of overall_data_head.jcbordertime
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getJcbordertime() {
        return jcbordertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.jcbordertime
     *
     * @param jcbordertime the value for overall_data_head.jcbordertime
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setJcbordertime(String jcbordertime) {
        this.jcbordertime = jcbordertime == null ? null : jcbordertime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.jcborderportinsp
     *
     * @return the value of overall_data_head.jcborderportinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getJcborderportinsp() {
        return jcborderportinsp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.jcborderportinsp
     *
     * @param jcborderportinsp the value for overall_data_head.jcborderportinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setJcborderportinsp(String jcborderportinsp) {
        this.jcborderportinsp = jcborderportinsp == null ? null : jcborderportinsp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.transfertypeinsp
     *
     * @return the value of overall_data_head.transfertypeinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getTransfertypeinsp() {
        return transfertypeinsp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.transfertypeinsp
     *
     * @param transfertypeinsp the value for overall_data_head.transfertypeinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setTransfertypeinsp(String transfertypeinsp) {
        this.transfertypeinsp = transfertypeinsp == null ? null : transfertypeinsp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.shipnameinsp
     *
     * @return the value of overall_data_head.shipnameinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getShipnameinsp() {
        return shipnameinsp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.shipnameinsp
     *
     * @param shipnameinsp the value for overall_data_head.shipnameinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setShipnameinsp(String shipnameinsp) {
        this.shipnameinsp = shipnameinsp == null ? null : shipnameinsp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.shipcodeinsp
     *
     * @return the value of overall_data_head.shipcodeinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getShipcodeinsp() {
        return shipcodeinsp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.shipcodeinsp
     *
     * @param shipcodeinsp the value for overall_data_head.shipcodeinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setShipcodeinsp(String shipcodeinsp) {
        this.shipcodeinsp = shipcodeinsp == null ? null : shipcodeinsp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.applyportinsp
     *
     * @return the value of overall_data_head.applyportinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getApplyportinsp() {
        return applyportinsp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.applyportinsp
     *
     * @param applyportinsp the value for overall_data_head.applyportinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setApplyportinsp(String applyportinsp) {
        this.applyportinsp = applyportinsp == null ? null : applyportinsp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.transferregioninsp
     *
     * @return the value of overall_data_head.transferregioninsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getTransferregioninsp() {
        return transferregioninsp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.transferregioninsp
     *
     * @param transferregioninsp the value for overall_data_head.transferregioninsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setTransferregioninsp(String transferregioninsp) {
        this.transferregioninsp = transferregioninsp == null ? null : transferregioninsp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.packcategoryinsp
     *
     * @return the value of overall_data_head.packcategoryinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getPackcategoryinsp() {
        return packcategoryinsp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.packcategoryinsp
     *
     * @param packcategoryinsp the value for overall_data_head.packcategoryinsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setPackcategoryinsp(String packcategoryinsp) {
        this.packcategoryinsp = packcategoryinsp == null ? null : packcategoryinsp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.coininsp
     *
     * @return the value of overall_data_head.coininsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getCoininsp() {
        return coininsp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.coininsp
     *
     * @param coininsp the value for overall_data_head.coininsp
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setCoininsp(String coininsp) {
        this.coininsp = coininsp == null ? null : coininsp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.paymenttype
     *
     * @return the value of overall_data_head.paymenttype
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getPaymenttype() {
        return paymenttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.paymenttype
     *
     * @param paymenttype the value for overall_data_head.paymenttype
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype == null ? null : paymenttype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.customerflag
     *
     * @return the value of overall_data_head.customerflag
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getCustomerflag() {
        return customerflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.customerflag
     *
     * @param customerflag the value for overall_data_head.customerflag
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setCustomerflag(String customerflag) {
        this.customerflag = customerflag == null ? null : customerflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.payecode
     *
     * @return the value of overall_data_head.payecode
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getPayecode() {
        return payecode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.payecode
     *
     * @param payecode the value for overall_data_head.payecode
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setPayecode(String payecode) {
        this.payecode = payecode == null ? null : payecode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.cop_no
     *
     * @return the value of overall_data_head.cop_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getCopNo() {
        return copNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.cop_no
     *
     * @param copNo the value for overall_data_head.cop_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setCopNo(String copNo) {
        this.copNo = copNo == null ? null : copNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.pre_no
     *
     * @return the value of overall_data_head.pre_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getPreNo() {
        return preNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.pre_no
     *
     * @param preNo the value for overall_data_head.pre_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setPreNo(String preNo) {
        this.preNo = preNo == null ? null : preNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.assure_code
     *
     * @return the value of overall_data_head.assure_code
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getAssureCode() {
        return assureCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.assure_code
     *
     * @param assureCode the value for overall_data_head.assure_code
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setAssureCode(String assureCode) {
        this.assureCode = assureCode == null ? null : assureCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.ems_no
     *
     * @return the value of overall_data_head.ems_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getEmsNo() {
        return emsNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.ems_no
     *
     * @param emsNo the value for overall_data_head.ems_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setEmsNo(String emsNo) {
        this.emsNo = emsNo == null ? null : emsNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.invt_no
     *
     * @return the value of overall_data_head.invt_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getInvtNo() {
        return invtNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.invt_no
     *
     * @param invtNo the value for overall_data_head.invt_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setInvtNo(String invtNo) {
        this.invtNo = invtNo == null ? null : invtNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.decl_time
     *
     * @return the value of overall_data_head.decl_time
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getDeclTime() {
        return declTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.decl_time
     *
     * @param declTime the value for overall_data_head.decl_time
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setDeclTime(String declTime) {
        this.declTime = declTime == null ? null : declTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.customs_code
     *
     * @return the value of overall_data_head.customs_code
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.customs_code
     *
     * @param customsCode the value for overall_data_head.customs_code
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode == null ? null : customsCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.port_code
     *
     * @return the value of overall_data_head.port_code
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getPortCode() {
        return portCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.port_code
     *
     * @param portCode the value for overall_data_head.port_code
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setPortCode(String portCode) {
        this.portCode = portCode == null ? null : portCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.ie_date
     *
     * @return the value of overall_data_head.ie_date
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getIeDate() {
        return ieDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.ie_date
     *
     * @param ieDate the value for overall_data_head.ie_date
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setIeDate(String ieDate) {
        this.ieDate = ieDate == null ? null : ieDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.agent_code
     *
     * @return the value of overall_data_head.agent_code
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getAgentCode() {
        return agentCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.agent_code
     *
     * @param agentCode the value for overall_data_head.agent_code
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode == null ? null : agentCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.agent_name
     *
     * @return the value of overall_data_head.agent_name
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.agent_name
     *
     * @param agentName the value for overall_data_head.agent_name
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.area_code
     *
     * @return the value of overall_data_head.area_code
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.area_code
     *
     * @param areaCode the value for overall_data_head.area_code
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.are_came
     *
     * @return the value of overall_data_head.are_came
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getAreCame() {
        return areCame;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.are_came
     *
     * @param areCame the value for overall_data_head.are_came
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setAreCame(String areCame) {
        this.areCame = areCame == null ? null : areCame.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.trade_mode
     *
     * @return the value of overall_data_head.trade_mode
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getTradeMode() {
        return tradeMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.trade_mode
     *
     * @param tradeMode the value for overall_data_head.trade_mode
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setTradeMode(String tradeMode) {
        this.tradeMode = tradeMode == null ? null : tradeMode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.traf_mode
     *
     * @return the value of overall_data_head.traf_mode
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getTrafMode() {
        return trafMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.traf_mode
     *
     * @param trafMode the value for overall_data_head.traf_mode
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setTrafMode(String trafMode) {
        this.trafMode = trafMode == null ? null : trafMode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.traf_no
     *
     * @return the value of overall_data_head.traf_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getTrafNo() {
        return trafNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.traf_no
     *
     * @param trafNo the value for overall_data_head.traf_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setTrafNo(String trafNo) {
        this.trafNo = trafNo == null ? null : trafNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.voyage_no
     *
     * @return the value of overall_data_head.voyage_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getVoyageNo() {
        return voyageNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.voyage_no
     *
     * @param voyageNo the value for overall_data_head.voyage_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setVoyageNo(String voyageNo) {
        this.voyageNo = voyageNo == null ? null : voyageNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.loct_no
     *
     * @return the value of overall_data_head.loct_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getLoctNo() {
        return loctNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.loct_no
     *
     * @param loctNo the value for overall_data_head.loct_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setLoctNo(String loctNo) {
        this.loctNo = loctNo == null ? null : loctNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.license_no
     *
     * @return the value of overall_data_head.license_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getLicenseNo() {
        return licenseNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.license_no
     *
     * @param licenseNo the value for overall_data_head.license_no
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo == null ? null : licenseNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.country
     *
     * @return the value of overall_data_head.country
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.country
     *
     * @param country the value for overall_data_head.country
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.wrap_type
     *
     * @return the value of overall_data_head.wrap_type
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getWrapType() {
        return wrapType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.wrap_type
     *
     * @param wrapType the value for overall_data_head.wrap_type
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setWrapType(String wrapType) {
        this.wrapType = wrapType == null ? null : wrapType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.detailscode
     *
     * @return the value of overall_data_head.detailscode
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getDetailscode() {
        return detailscode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.detailscode
     *
     * @param detailscode the value for overall_data_head.detailscode
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setDetailscode(String detailscode) {
        this.detailscode = detailscode == null ? null : detailscode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.contact
     *
     * @return the value of overall_data_head.contact
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getContact() {
        return contact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.contact
     *
     * @param contact the value for overall_data_head.contact
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.fixedtelephone
     *
     * @return the value of overall_data_head.fixedtelephone
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getFixedtelephone() {
        return fixedtelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.fixedtelephone
     *
     * @param fixedtelephone the value for overall_data_head.fixedtelephone
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setFixedtelephone(String fixedtelephone) {
        this.fixedtelephone = fixedtelephone == null ? null : fixedtelephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.fjname
     *
     * @return the value of overall_data_head.fjname
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getFjname() {
        return fjname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.fjname
     *
     * @param fjname the value for overall_data_head.fjname
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setFjname(String fjname) {
        this.fjname = fjname == null ? null : fjname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.fjtype
     *
     * @return the value of overall_data_head.fjtype
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getFjtype() {
        return fjtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.fjtype
     *
     * @param fjtype the value for overall_data_head.fjtype
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setFjtype(String fjtype) {
        this.fjtype = fjtype == null ? null : fjtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.sendctiycode
     *
     * @return the value of overall_data_head.sendctiycode
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getSendctiycode() {
        return sendctiycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.sendctiycode
     *
     * @param sendctiycode the value for overall_data_head.sendctiycode
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setSendctiycode(String sendctiycode) {
        this.sendctiycode = sendctiycode == null ? null : sendctiycode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.bashstste
     *
     * @return the value of overall_data_head.bashstste
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getBashstste() {
        return bashstste;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.bashstste
     *
     * @param bashstste the value for overall_data_head.bashstste
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setBashstste(String bashstste) {
        this.bashstste = bashstste == null ? null : bashstste.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.goodsvaluecode
     *
     * @return the value of overall_data_head.goodsvaluecode
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getGoodsvaluecode() {
        return goodsvaluecode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.goodsvaluecode
     *
     * @param goodsvaluecode the value for overall_data_head.goodsvaluecode
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setGoodsvaluecode(String goodsvaluecode) {
        this.goodsvaluecode = goodsvaluecode == null ? null : goodsvaluecode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.applyunitname
     *
     * @return the value of overall_data_head.applyunitname
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getApplyunitname() {
        return applyunitname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.applyunitname
     *
     * @param applyunitname the value for overall_data_head.applyunitname
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setApplyunitname(String applyunitname) {
        this.applyunitname = applyunitname == null ? null : applyunitname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.applyunitcode
     *
     * @return the value of overall_data_head.applyunitcode
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getApplyunitcode() {
        return applyunitcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.applyunitcode
     *
     * @param applyunitcode the value for overall_data_head.applyunitcode
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setApplyunitcode(String applyunitcode) {
        this.applyunitcode = applyunitcode == null ? null : applyunitcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.payename
     *
     * @return the value of overall_data_head.payename
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getPayename() {
        return payename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.payename
     *
     * @param payename the value for overall_data_head.payename
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setPayename(String payename) {
        this.payename = payename == null ? null : payename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.order_status
     *
     * @return the value of overall_data_head.order_status
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.order_status
     *
     * @param orderStatus the value for overall_data_head.order_status
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.logistic_status
     *
     * @return the value of overall_data_head.logistic_status
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getLogisticStatus() {
        return logisticStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.logistic_status
     *
     * @param logisticStatus the value for overall_data_head.logistic_status
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setLogisticStatus(String logisticStatus) {
        this.logisticStatus = logisticStatus == null ? null : logisticStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.pay_status
     *
     * @return the value of overall_data_head.pay_status
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.pay_status
     *
     * @param payStatus the value for overall_data_head.pay_status
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.create_time
     *
     * @return the value of overall_data_head.create_time
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.create_time
     *
     * @param createTime the value for overall_data_head.create_time
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.update_time
     *
     * @return the value of overall_data_head.update_time
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.update_time
     *
     * @param updateTime the value for overall_data_head.update_time
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.ordersum
     *
     * @return the value of overall_data_head.ordersum
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public Double getOrdersum() {
        return ordersum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.ordersum
     *
     * @param ordersum the value for overall_data_head.ordersum
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setOrdersum(Double ordersum) {
        this.ordersum = ordersum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.purchasername
     *
     * @return the value of overall_data_head.purchasername
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getPurchasername() {
        return purchasername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.purchasername
     *
     * @param purchasername the value for overall_data_head.purchasername
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setPurchasername(String purchasername) {
        this.purchasername = purchasername == null ? null : purchasername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column overall_data_head.paynumber
     *
     * @return the value of overall_data_head.paynumber
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public String getPaynumber() {
        return paynumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column overall_data_head.paynumber
     *
     * @param paynumber the value for overall_data_head.paynumber
     *
     * @mbggenerated Fri Aug 26 09:34:46 CST 2016
     */
    public void setPaynumber(String paynumber) {
        this.paynumber = paynumber == null ? null : paynumber.trim();
    }
}
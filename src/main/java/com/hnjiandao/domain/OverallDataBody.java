package com.hnjiandao.domain;

public class OverallDataBody {
	private String id;
	private Integer gnum;
	private String itemno;
	private String itemname;
	private String itemdescribe;
	private String barcode;
	private String unit;
	private Integer qty;
	private Double price;
	private Double totalprice;
	private String currency;
	private String country;
	private String note;
	private String goodname;
	private String specifications;
	private String ciqbarcode;
	private String taxid;
	private String flag;
	private String goodidinsp;
	private String orderid;
	private String goodnameenglish;
	private Double weigth;
	private String weightunit;
	private String packcategoryinsp;
	private String wasterornotinsp;
	private String remarksinsp;
	private String coininsp;
	private String unitinsp;
	private String srccountryinsp;
	private String gno;
	private String itemrecordno;
	private String gcode;
	private String gmodel;
	private Integer qty1;
	private Integer qty2;
	private String unit1;
	private String unit2;
	private String headId;
	private String createTime;
	private String updateTime;

	public OverallDataBody(OrderDetail orderDetail) {
		this.qty=Integer.valueOf(orderDetail.getQty());
		this.price=Double.valueOf(orderDetail.getPrice());
		this.flag=orderDetail.getFlag();
		this.packcategoryinsp=orderDetail.getPackcategoryinsp();
		this.gno=orderDetail.getGno();
	}

	public OverallDataBody() {

	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.id
	 *
	 * @return the value of overall_data_body.id
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.id
	 *
	 * @param id
	 *            the value for overall_data_body.id
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.gnum
	 *
	 * @return the value of overall_data_body.gnum
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public Integer getGnum() {
		return gnum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.gnum
	 *
	 * @param gnum
	 *            the value for overall_data_body.gnum
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setGnum(Integer gnum) {
		this.gnum = gnum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.itemNo
	 *
	 * @return the value of overall_data_body.itemNo
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getItemno() {
		return itemno;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.itemNo
	 *
	 * @param itemno
	 *            the value for overall_data_body.itemNo
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setItemno(String itemno) {
		this.itemno = itemno == null ? null : itemno.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.itemName
	 *
	 * @return the value of overall_data_body.itemName
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getItemname() {
		return itemname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.itemName
	 *
	 * @param itemname
	 *            the value for overall_data_body.itemName
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setItemname(String itemname) {
		this.itemname = itemname == null ? null : itemname.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.itemDescribe
	 *
	 * @return the value of overall_data_body.itemDescribe
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getItemdescribe() {
		return itemdescribe;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.itemDescribe
	 *
	 * @param itemdescribe
	 *            the value for overall_data_body.itemDescribe
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setItemdescribe(String itemdescribe) {
		this.itemdescribe = itemdescribe == null ? null : itemdescribe.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.barCode
	 *
	 * @return the value of overall_data_body.barCode
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getBarcode() {
		return barcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.barCode
	 *
	 * @param barcode
	 *            the value for overall_data_body.barCode
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode == null ? null : barcode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.unit
	 *
	 * @return the value of overall_data_body.unit
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.unit
	 *
	 * @param unit
	 *            the value for overall_data_body.unit
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setUnit(String unit) {
		this.unit = unit == null ? null : unit.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.qty
	 *
	 * @return the value of overall_data_body.qty
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public Integer getQty() {
		return qty;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.qty
	 *
	 * @param qty
	 *            the value for overall_data_body.qty
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setQty(Integer qty) {
		this.qty = qty;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.price
	 *
	 * @return the value of overall_data_body.price
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.price
	 *
	 * @param price
	 *            the value for overall_data_body.price
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.totalPrice
	 *
	 * @return the value of overall_data_body.totalPrice
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public Double getTotalprice() {
		return totalprice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.totalPrice
	 *
	 * @param totalprice
	 *            the value for overall_data_body.totalPrice
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.currency
	 *
	 * @return the value of overall_data_body.currency
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.currency
	 *
	 * @param currency
	 *            the value for overall_data_body.currency
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setCurrency(String currency) {
		this.currency = currency == null ? null : currency.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.country
	 *
	 * @return the value of overall_data_body.country
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.country
	 *
	 * @param country
	 *            the value for overall_data_body.country
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setCountry(String country) {
		this.country = country == null ? null : country.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.note
	 *
	 * @return the value of overall_data_body.note
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getNote() {
		return note;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.note
	 *
	 * @param note
	 *            the value for overall_data_body.note
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setNote(String note) {
		this.note = note == null ? null : note.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.goodname
	 *
	 * @return the value of overall_data_body.goodname
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getGoodname() {
		return goodname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.goodname
	 *
	 * @param goodname
	 *            the value for overall_data_body.goodname
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setGoodname(String goodname) {
		this.goodname = goodname == null ? null : goodname.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.specifications
	 *
	 * @return the value of overall_data_body.specifications
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getSpecifications() {
		return specifications;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.specifications
	 *
	 * @param specifications
	 *            the value for overall_data_body.specifications
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setSpecifications(String specifications) {
		this.specifications = specifications == null ? null : specifications.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.ciqbarcode
	 *
	 * @return the value of overall_data_body.ciqbarcode
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getCiqbarcode() {
		return ciqbarcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.ciqbarcode
	 *
	 * @param ciqbarcode
	 *            the value for overall_data_body.ciqbarcode
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setCiqbarcode(String ciqbarcode) {
		this.ciqbarcode = ciqbarcode == null ? null : ciqbarcode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.taxid
	 *
	 * @return the value of overall_data_body.taxid
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getTaxid() {
		return taxid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.taxid
	 *
	 * @param taxid
	 *            the value for overall_data_body.taxid
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setTaxid(String taxid) {
		this.taxid = taxid == null ? null : taxid.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.flag
	 *
	 * @return the value of overall_data_body.flag
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getFlag() {
		return flag;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.flag
	 *
	 * @param flag
	 *            the value for overall_data_body.flag
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setFlag(String flag) {
		this.flag = flag == null ? null : flag.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.goodidinsp
	 *
	 * @return the value of overall_data_body.goodidinsp
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getGoodidinsp() {
		return goodidinsp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.goodidinsp
	 *
	 * @param goodidinsp
	 *            the value for overall_data_body.goodidinsp
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setGoodidinsp(String goodidinsp) {
		this.goodidinsp = goodidinsp == null ? null : goodidinsp.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.orderid
	 *
	 * @return the value of overall_data_body.orderid
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getOrderid() {
		return orderid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.orderid
	 *
	 * @param orderid
	 *            the value for overall_data_body.orderid
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setOrderid(String orderid) {
		this.orderid = orderid == null ? null : orderid.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.goodnameenglish
	 *
	 * @return the value of overall_data_body.goodnameenglish
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getGoodnameenglish() {
		return goodnameenglish;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.goodnameenglish
	 *
	 * @param goodnameenglish
	 *            the value for overall_data_body.goodnameenglish
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setGoodnameenglish(String goodnameenglish) {
		this.goodnameenglish = goodnameenglish == null ? null : goodnameenglish.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.weigth
	 *
	 * @return the value of overall_data_body.weigth
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public Double getWeigth() {
		return weigth;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.weigth
	 *
	 * @param weigth
	 *            the value for overall_data_body.weigth
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setWeigth(Double weigth) {
		this.weigth = weigth;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.weightunit
	 *
	 * @return the value of overall_data_body.weightunit
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getWeightunit() {
		return weightunit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.weightunit
	 *
	 * @param weightunit
	 *            the value for overall_data_body.weightunit
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setWeightunit(String weightunit) {
		this.weightunit = weightunit == null ? null : weightunit.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.packcategoryinsp
	 *
	 * @return the value of overall_data_body.packcategoryinsp
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getPackcategoryinsp() {
		return packcategoryinsp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.packcategoryinsp
	 *
	 * @param packcategoryinsp
	 *            the value for overall_data_body.packcategoryinsp
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setPackcategoryinsp(String packcategoryinsp) {
		this.packcategoryinsp = packcategoryinsp == null ? null : packcategoryinsp.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.wasterornotinsp
	 *
	 * @return the value of overall_data_body.wasterornotinsp
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getWasterornotinsp() {
		return wasterornotinsp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.wasterornotinsp
	 *
	 * @param wasterornotinsp
	 *            the value for overall_data_body.wasterornotinsp
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setWasterornotinsp(String wasterornotinsp) {
		this.wasterornotinsp = wasterornotinsp == null ? null : wasterornotinsp.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.remarksinsp
	 *
	 * @return the value of overall_data_body.remarksinsp
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getRemarksinsp() {
		return remarksinsp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.remarksinsp
	 *
	 * @param remarksinsp
	 *            the value for overall_data_body.remarksinsp
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setRemarksinsp(String remarksinsp) {
		this.remarksinsp = remarksinsp == null ? null : remarksinsp.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.coininsp
	 *
	 * @return the value of overall_data_body.coininsp
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getCoininsp() {
		return coininsp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.coininsp
	 *
	 * @param coininsp
	 *            the value for overall_data_body.coininsp
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setCoininsp(String coininsp) {
		this.coininsp = coininsp == null ? null : coininsp.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.unitinsp
	 *
	 * @return the value of overall_data_body.unitinsp
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getUnitinsp() {
		return unitinsp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.unitinsp
	 *
	 * @param unitinsp
	 *            the value for overall_data_body.unitinsp
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setUnitinsp(String unitinsp) {
		this.unitinsp = unitinsp == null ? null : unitinsp.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.srccountryinsp
	 *
	 * @return the value of overall_data_body.srccountryinsp
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getSrccountryinsp() {
		return srccountryinsp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.srccountryinsp
	 *
	 * @param srccountryinsp
	 *            the value for overall_data_body.srccountryinsp
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setSrccountryinsp(String srccountryinsp) {
		this.srccountryinsp = srccountryinsp == null ? null : srccountryinsp.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.gno
	 *
	 * @return the value of overall_data_body.gno
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getGno() {
		return gno;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.gno
	 *
	 * @param gno
	 *            the value for overall_data_body.gno
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setGno(String gno) {
		this.gno = gno == null ? null : gno.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.itemRecordNo
	 *
	 * @return the value of overall_data_body.itemRecordNo
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getItemrecordno() {
		return itemrecordno;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.itemRecordNo
	 *
	 * @param itemrecordno
	 *            the value for overall_data_body.itemRecordNo
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setItemrecordno(String itemrecordno) {
		this.itemrecordno = itemrecordno == null ? null : itemrecordno.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.gcode
	 *
	 * @return the value of overall_data_body.gcode
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getGcode() {
		return gcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.gcode
	 *
	 * @param gcode
	 *            the value for overall_data_body.gcode
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setGcode(String gcode) {
		this.gcode = gcode == null ? null : gcode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.gmodel
	 *
	 * @return the value of overall_data_body.gmodel
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getGmodel() {
		return gmodel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.gmodel
	 *
	 * @param gmodel
	 *            the value for overall_data_body.gmodel
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setGmodel(String gmodel) {
		this.gmodel = gmodel == null ? null : gmodel.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.qty1
	 *
	 * @return the value of overall_data_body.qty1
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public Integer getQty1() {
		return qty1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.qty1
	 *
	 * @param qty1
	 *            the value for overall_data_body.qty1
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setQty1(Integer qty1) {
		this.qty1 = qty1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.qty2
	 *
	 * @return the value of overall_data_body.qty2
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public Integer getQty2() {
		return qty2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.qty2
	 *
	 * @param qty2
	 *            the value for overall_data_body.qty2
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setQty2(Integer qty2) {
		this.qty2 = qty2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.unit1
	 *
	 * @return the value of overall_data_body.unit1
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getUnit1() {
		return unit1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.unit1
	 *
	 * @param unit1
	 *            the value for overall_data_body.unit1
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setUnit1(String unit1) {
		this.unit1 = unit1 == null ? null : unit1.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.unit2
	 *
	 * @return the value of overall_data_body.unit2
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getUnit2() {
		return unit2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.unit2
	 *
	 * @param unit2
	 *            the value for overall_data_body.unit2
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setUnit2(String unit2) {
		this.unit2 = unit2 == null ? null : unit2.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.head_id
	 *
	 * @return the value of overall_data_body.head_id
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getHeadId() {
		return headId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.head_id
	 *
	 * @param headId
	 *            the value for overall_data_body.head_id
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setHeadId(String headId) {
		this.headId = headId == null ? null : headId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.create_time
	 *
	 * @return the value of overall_data_body.create_time
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.create_time
	 *
	 * @param createTime
	 *            the value for overall_data_body.create_time
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime == null ? null : createTime.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column overall_data_body.update_time
	 *
	 * @return the value of overall_data_body.update_time
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public String getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column overall_data_body.update_time
	 *
	 * @param updateTime
	 *            the value for overall_data_body.update_time
	 *
	 * @mbggenerated Tue Aug 23 11:33:36 CST 2016
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime == null ? null : updateTime.trim();
	}
}
package com.hnjiandao.domain;

public class User {
	
	@Override
	public String toString(){
		return "User{"+
	            "id='" + id +
	            "',username='" + username +
	            "',password='" + password +
	            "',codeCus='" + codeCus + 
	            "',nameCus='" + nameCus +
	            "',codeCiq='" + codeCiq +
	            "',nameCiq='" + nameCiq +
	            "',companiesType='" + companiesType +
	            "',status='" + status +
	            "',telephone='" + telephone +
	            "',address='" + telephone
	            ;
	}
	
	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.code_cus
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    private String codeCus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name_cus
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    private String nameCus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.code_ciq
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    private String codeCiq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name_ciq
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    private String nameCiq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.companies_type
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    private Boolean companiesType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.status
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.telephone
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.address
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.authentication_number
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    private String authenticationNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_user
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_time
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    private String createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.update_time
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    private String updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.code_cus
     *
     * @return the value of user.code_cus
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public String getCodeCus() {
        return codeCus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.code_cus
     *
     * @param codeCus the value for user.code_cus
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public void setCodeCus(String codeCus) {
        this.codeCus = codeCus == null ? null : codeCus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name_cus
     *
     * @return the value of user.name_cus
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public String getNameCus() {
        return nameCus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name_cus
     *
     * @param nameCus the value for user.name_cus
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public void setNameCus(String nameCus) {
        this.nameCus = nameCus == null ? null : nameCus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.code_ciq
     *
     * @return the value of user.code_ciq
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public String getCodeCiq() {
        return codeCiq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.code_ciq
     *
     * @param codeCiq the value for user.code_ciq
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public void setCodeCiq(String codeCiq) {
        this.codeCiq = codeCiq == null ? null : codeCiq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name_ciq
     *
     * @return the value of user.name_ciq
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public String getNameCiq() {
        return nameCiq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name_ciq
     *
     * @param nameCiq the value for user.name_ciq
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public void setNameCiq(String nameCiq) {
        this.nameCiq = nameCiq == null ? null : nameCiq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.companies_type
     *
     * @return the value of user.companies_type
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public Boolean getCompaniesType() {
        return companiesType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.companies_type
     *
     * @param companiesType the value for user.companies_type
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public void setCompaniesType(Boolean companiesType) {
        this.companiesType = companiesType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.status
     *
     * @return the value of user.status
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.status
     *
     * @param status the value for user.status
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.telephone
     *
     * @return the value of user.telephone
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.telephone
     *
     * @param telephone the value for user.telephone
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.address
     *
     * @return the value of user.address
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.address
     *
     * @param address the value for user.address
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.authentication_number
     *
     * @return the value of user.authentication_number
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public String getAuthenticationNumber() {
        return authenticationNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.authentication_number
     *
     * @param authenticationNumber the value for user.authentication_number
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public void setAuthenticationNumber(String authenticationNumber) {
        this.authenticationNumber = authenticationNumber == null ? null : authenticationNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_user
     *
     * @return the value of user.create_user
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_user
     *
     * @param createUser the value for user.create_user
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_time
     *
     * @return the value of user.create_time
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_time
     *
     * @param createTime the value for user.create_time
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.update_time
     *
     * @return the value of user.update_time
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.update_time
     *
     * @param updateTime the value for user.update_time
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}
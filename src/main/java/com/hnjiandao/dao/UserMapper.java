package com.hnjiandao.dao;

import org.apache.ibatis.annotations.Param;

import com.hnjiandao.domain.User;

public interface UserMapper {
	/**
	 * 根据用户名判断是否已注册
	 * @param username
	 * @return
	 */
	User selectByName(String username);
    /**
     *  注册添加用户一
     * 
     */
	int insertByService(User record);
	/**
	 *  判断登录（根据用户名和密码）
	 *  
	 */
	User selectByLogin(@Param("username") String username,@Param("password") String password);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    User selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Wed Aug 24 11:40:49 CST 2016
     */
    int updateByPrimaryKey(User record);
}
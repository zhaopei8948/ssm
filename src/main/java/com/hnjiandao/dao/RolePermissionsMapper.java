package com.hnjiandao.dao;

import com.hnjiandao.domain.RolePermissions;
import com.hnjiandao.domain.RolePermissionsKey;

public interface RolePermissionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permissions
     *
     * @mbggenerated Fri Sep 02 15:20:24 CST 2016
     */
    int deleteByPrimaryKey(RolePermissionsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permissions
     *
     * @mbggenerated Fri Sep 02 15:20:24 CST 2016
     */
    int insert(RolePermissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permissions
     *
     * @mbggenerated Fri Sep 02 15:20:24 CST 2016
     */
    int insertSelective(RolePermissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permissions
     *
     * @mbggenerated Fri Sep 02 15:20:24 CST 2016
     */
    RolePermissions selectByPrimaryKey(RolePermissionsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permissions
     *
     * @mbggenerated Fri Sep 02 15:20:24 CST 2016
     */
    int updateByPrimaryKeySelective(RolePermissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permissions
     *
     * @mbggenerated Fri Sep 02 15:20:24 CST 2016
     */
    int updateByPrimaryKey(RolePermissions record);
}
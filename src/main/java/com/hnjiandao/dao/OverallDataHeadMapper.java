package com.hnjiandao.dao;

import com.hnjiandao.domain.OverallDataHead;

public interface OverallDataHeadMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table overall_data_head
     *
     * @mbggenerated Tue Aug 23 11:30:30 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table overall_data_head
     *
     * @mbggenerated Tue Aug 23 11:30:30 CST 2016
     */
    int insert(OverallDataHead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table overall_data_head
     *
     * @mbggenerated Tue Aug 23 11:30:30 CST 2016
     */
    int insertSelective(OverallDataHead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table overall_data_head
     *
     * @mbggenerated Tue Aug 23 11:30:30 CST 2016
     */
    OverallDataHead selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table overall_data_head
     *
     * @mbggenerated Tue Aug 23 11:30:30 CST 2016
     */
    int updateByPrimaryKeySelective(OverallDataHead record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table overall_data_head
     *
     * @mbggenerated Tue Aug 23 11:30:30 CST 2016
     */
    int updateByPrimaryKey(OverallDataHead record);
}
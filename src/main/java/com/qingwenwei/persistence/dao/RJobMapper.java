package com.qingwenwei.persistence.dao;

import com.qingwenwei.persistence.model.RJob;
import com.qingwenwei.persistence.model.RJobExample;
import java.util.List;

public interface RJobMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_job
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_job
     *
     * @mbggenerated
     */
    int insert(RJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_job
     *
     * @mbggenerated
     */
    int insertSelective(RJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_job
     *
     * @mbggenerated
     */
    List<RJob> selectByExample(RJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_job
     *
     * @mbggenerated
     */
    RJob selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_job
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_job
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RJob record);
}
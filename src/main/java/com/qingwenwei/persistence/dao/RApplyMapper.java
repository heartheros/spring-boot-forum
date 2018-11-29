package com.qingwenwei.persistence.dao;

import com.qingwenwei.persistence.model.RApply;
import com.qingwenwei.persistence.model.RApplyExample;
import com.qingwenwei.persistence.model.RApplyKey;
import java.util.List;

public interface RApplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_apply
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(RApplyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_apply
     *
     * @mbggenerated
     */
    int insert(RApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_apply
     *
     * @mbggenerated
     */
    int insertSelective(RApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_apply
     *
     * @mbggenerated
     */
    List<RApply> selectByExample(RApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_apply
     *
     * @mbggenerated
     */
    RApply selectByPrimaryKey(RApplyKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_apply
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_apply
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RApply record);
}
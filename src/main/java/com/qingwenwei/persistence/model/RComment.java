package com.qingwenwei.persistence.model;

import java.util.Date;

public class RComment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_comment.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_comment.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_comment.postid
     *
     * @mbggenerated
     */
    private Integer postid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_comment.userid
     *
     * @mbggenerated
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_comment.commentsn
     *
     * @mbggenerated
     */
    private Integer commentsn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_comment.createdate
     *
     * @mbggenerated
     */
    private Date createdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_comment.createtime
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_comment.id
     *
     * @return the value of r_comment.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_comment.id
     *
     * @param id the value for r_comment.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_comment.content
     *
     * @return the value of r_comment.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_comment.content
     *
     * @param content the value for r_comment.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_comment.postid
     *
     * @return the value of r_comment.postid
     *
     * @mbggenerated
     */
    public Integer getPostid() {
        return postid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_comment.postid
     *
     * @param postid the value for r_comment.postid
     *
     * @mbggenerated
     */
    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_comment.userid
     *
     * @return the value of r_comment.userid
     *
     * @mbggenerated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_comment.userid
     *
     * @param userid the value for r_comment.userid
     *
     * @mbggenerated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_comment.commentsn
     *
     * @return the value of r_comment.commentsn
     *
     * @mbggenerated
     */
    public Integer getCommentsn() {
        return commentsn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_comment.commentsn
     *
     * @param commentsn the value for r_comment.commentsn
     *
     * @mbggenerated
     */
    public void setCommentsn(Integer commentsn) {
        this.commentsn = commentsn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_comment.createdate
     *
     * @return the value of r_comment.createdate
     *
     * @mbggenerated
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_comment.createdate
     *
     * @param createdate the value for r_comment.createdate
     *
     * @mbggenerated
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_comment.createtime
     *
     * @return the value of r_comment.createtime
     *
     * @mbggenerated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_comment.createtime
     *
     * @param createtime the value for r_comment.createtime
     *
     * @mbggenerated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
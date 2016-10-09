package com.pbc.po;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.Name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.Pass
     *
     * @mbggenerated
     */
    private String pass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.Phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.Mailbox
     *
     * @mbggenerated
     */
    private String mailbox;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.CreatedOn
     *
     * @mbggenerated
     */
    private Date createdon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.ModifiedOn
     *
     * @mbggenerated
     */
    private Date modifiedon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table userinfo
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.id
     *
     * @return the value of userinfo.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.id
     *
     * @param id the value for userinfo.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.Name
     *
     * @return the value of userinfo.Name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.Name
     *
     * @param name the value for userinfo.Name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.Pass
     *
     * @return the value of userinfo.Pass
     *
     * @mbggenerated
     */
    public String getPass() {
        return pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.Pass
     *
     * @param pass the value for userinfo.Pass
     *
     * @mbggenerated
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.Phone
     *
     * @return the value of userinfo.Phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.Phone
     *
     * @param phone the value for userinfo.Phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.Mailbox
     *
     * @return the value of userinfo.Mailbox
     *
     * @mbggenerated
     */
    public String getMailbox() {
        return mailbox;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.Mailbox
     *
     * @param mailbox the value for userinfo.Mailbox
     *
     * @mbggenerated
     */
    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.CreatedOn
     *
     * @return the value of userinfo.CreatedOn
     *
     * @mbggenerated
     */
    public Date getCreatedon() {
        return createdon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.CreatedOn
     *
     * @param createdon the value for userinfo.CreatedOn
     *
     * @mbggenerated
     */
    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.ModifiedOn
     *
     * @return the value of userinfo.ModifiedOn
     *
     * @mbggenerated
     */
    public Date getModifiedon() {
        return modifiedon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.ModifiedOn
     *
     * @param modifiedon the value for userinfo.ModifiedOn
     *
     * @mbggenerated
     */
    public void setModifiedon(Date modifiedon) {
        this.modifiedon = modifiedon;
    }
}
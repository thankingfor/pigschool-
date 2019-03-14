package com.pigschool.xyzshow.model;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@ToString
public class XyzUser implements Serializable{
    private Long id;

    private String username;

    private String password;

    private String phone;

    private String email;

    private Date created;

    private Date updated;

    private Date birthday;

    private String nickname;

    private String icon;

    private Integer sex;

    private String reName;

    private String reSchool;

    private String reIdcard;

    private Integer state;

    private Date lastLoginDate;

    private Date lastLoginIp;

    private Integer isDel;

    private Integer isEmailConfirmed;

    private Integer isPhoneConfirmed;

    private String mac;

    private Integer source;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getReName() {
        return reName;
    }

    public void setReName(String reName) {
        this.reName = reName == null ? null : reName.trim();
    }

    public String getReSchool() {
        return reSchool;
    }

    public void setReSchool(String reSchool) {
        this.reSchool = reSchool == null ? null : reSchool.trim();
    }

    public String getReIdcard() {
        return reIdcard;
    }

    public void setReIdcard(String reIdcard) {
        this.reIdcard = reIdcard == null ? null : reIdcard.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(Date lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsEmailConfirmed() {
        return isEmailConfirmed;
    }

    public void setIsEmailConfirmed(Integer isEmailConfirmed) {
        this.isEmailConfirmed = isEmailConfirmed;
    }

    public Integer getIsPhoneConfirmed() {
        return isPhoneConfirmed;
    }

    public void setIsPhoneConfirmed(Integer isPhoneConfirmed) {
        this.isPhoneConfirmed = isPhoneConfirmed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }
}
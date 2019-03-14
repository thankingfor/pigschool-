package com.pigschool.xyzshow.model;

import lombok.ToString;

@ToString
public class XyzNeed {
    private Long id;

    private String title;

    private String xyzDesc;

    private String phone;

    private String nick;

    private String price;

    private Integer xyzType;

    private Integer jzType;

    private Integer jzNum;

    private Integer jzZhusu;

    private Integer jzPriceType;

    private Integer status;

    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getXyzDesc() {
        return xyzDesc;
    }

    public void setXyzDesc(String xyzDesc) {
        this.xyzDesc = xyzDesc == null ? null : xyzDesc.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Integer getXyzType() {
        return xyzType;
    }

    public void setXyzType(Integer xyzType) {
        this.xyzType = xyzType;
    }

    public Integer getJzType() {
        return jzType;
    }

    public void setJzType(Integer jzType) {
        this.jzType = jzType;
    }

    public Integer getJzNum() {
        return jzNum;
    }

    public void setJzNum(Integer jzNum) {
        this.jzNum = jzNum;
    }

    public Integer getJzZhusu() {
        return jzZhusu;
    }

    public void setJzZhusu(Integer jzZhusu) {
        this.jzZhusu = jzZhusu;
    }

    public Integer getJzPriceType() {
        return jzPriceType;
    }

    public void setJzPriceType(Integer jzPriceType) {
        this.jzPriceType = jzPriceType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
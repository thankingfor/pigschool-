package com.pigschool.xyzshow.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class XyzExchange {
    private XyzItem item;

    private XyzUser user;

    private Long id;

    private Long itemId;

    private Long userId;

    private String name;

    private Integer contactWay;

    private String contactInfo;

    private Date create;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getContactWay() {
        return contactWay;
    }

    public void setContactWay(Integer contactWay) {
        this.contactWay = contactWay;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo == null ? null : contactInfo.trim();
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }
}
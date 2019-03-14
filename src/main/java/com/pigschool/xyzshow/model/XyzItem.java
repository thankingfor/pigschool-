package com.pigschool.xyzshow.model;

import lombok.ToString;

import java.text.DecimalFormat;
import java.util.Date;

@ToString
public class XyzItem {
    private Long id;

    private String title;

    private Long oldprice;

    private Long price;

    private String sellPoint;

    private String photo;

    private Integer num;

    private String image;

    private Long cid;

    private Integer state;

    private Date created;

    private Date updated;

    private Integer isBargain;

    private Integer assay;

    private String location;

    private Integer contactWay;

    private String contactInfo;

    private Integer dealway;

    private Long uid;

    private String nick;

    public String getBaiFenBi(){
        Double l = Double.valueOf(price) / Double.valueOf(oldprice)*100;
        DecimalFormat df = new DecimalFormat("#.0");
        String s = df.format(l);
        return s;
    }

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

    public Long getOldprice() {
        return oldprice;
    }

    public void setOldprice(Long oldprice) {
        this.oldprice = oldprice;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint == null ? null : sellPoint.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public Integer getIsBargain() {
        return isBargain;
    }

    public void setIsBargain(Integer isBargain) {
        this.isBargain = isBargain;
    }

    public Integer getAssay() {
        return assay;
    }

    public void setAssay(Integer assay) {
        this.assay = assay;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
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

    public Integer getDealway() {
        return dealway;
    }

    public void setDealway(Integer dealway) {
        this.dealway = dealway;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }
}
package com.pigschool.xyzshow.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class XyzFavorite {
    private XyzItem item;

    private XyzUser user;

    private Long id;

    private Long userId;

    private Long itemId;

    private Long favorite;

    private Date created;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getFavorite() {
        return favorite;
    }

    public void setFavorite(Long favorite) {
        this.favorite = favorite;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
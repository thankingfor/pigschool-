package com.pigschool.xyzshow.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class XyzNeedFav {
    private XyzNeed need;

    private XyzUser user;

    private Long id;

    private Long userId;

    private Long needId;

    private Integer needType;

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

    public Long getNeedId() {
        return needId;
    }

    public void setNeedId(Long needId) {
        this.needId = needId;
    }

    public Integer getNeedType() {
        return needType;
    }

    public void setNeedType(Integer needType) {
        this.needType = needType;
    }
}
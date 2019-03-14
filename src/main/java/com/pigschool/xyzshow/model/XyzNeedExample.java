package com.pigschool.xyzshow.model;

import java.util.ArrayList;
import java.util.List;

public class XyzNeedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XyzNeedExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andXyzDescIsNull() {
            addCriterion("xyz_desc is null");
            return (Criteria) this;
        }

        public Criteria andXyzDescIsNotNull() {
            addCriterion("xyz_desc is not null");
            return (Criteria) this;
        }

        public Criteria andXyzDescEqualTo(String value) {
            addCriterion("xyz_desc =", value, "xyzDesc");
            return (Criteria) this;
        }

        public Criteria andXyzDescNotEqualTo(String value) {
            addCriterion("xyz_desc <>", value, "xyzDesc");
            return (Criteria) this;
        }

        public Criteria andXyzDescGreaterThan(String value) {
            addCriterion("xyz_desc >", value, "xyzDesc");
            return (Criteria) this;
        }

        public Criteria andXyzDescGreaterThanOrEqualTo(String value) {
            addCriterion("xyz_desc >=", value, "xyzDesc");
            return (Criteria) this;
        }

        public Criteria andXyzDescLessThan(String value) {
            addCriterion("xyz_desc <", value, "xyzDesc");
            return (Criteria) this;
        }

        public Criteria andXyzDescLessThanOrEqualTo(String value) {
            addCriterion("xyz_desc <=", value, "xyzDesc");
            return (Criteria) this;
        }

        public Criteria andXyzDescLike(String value) {
            addCriterion("xyz_desc like", value, "xyzDesc");
            return (Criteria) this;
        }

        public Criteria andXyzDescNotLike(String value) {
            addCriterion("xyz_desc not like", value, "xyzDesc");
            return (Criteria) this;
        }

        public Criteria andXyzDescIn(List<String> values) {
            addCriterion("xyz_desc in", values, "xyzDesc");
            return (Criteria) this;
        }

        public Criteria andXyzDescNotIn(List<String> values) {
            addCriterion("xyz_desc not in", values, "xyzDesc");
            return (Criteria) this;
        }

        public Criteria andXyzDescBetween(String value1, String value2) {
            addCriterion("xyz_desc between", value1, value2, "xyzDesc");
            return (Criteria) this;
        }

        public Criteria andXyzDescNotBetween(String value1, String value2) {
            addCriterion("xyz_desc not between", value1, value2, "xyzDesc");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andNickIsNull() {
            addCriterion("nick is null");
            return (Criteria) this;
        }

        public Criteria andNickIsNotNull() {
            addCriterion("nick is not null");
            return (Criteria) this;
        }

        public Criteria andNickEqualTo(String value) {
            addCriterion("nick =", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotEqualTo(String value) {
            addCriterion("nick <>", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickGreaterThan(String value) {
            addCriterion("nick >", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickGreaterThanOrEqualTo(String value) {
            addCriterion("nick >=", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLessThan(String value) {
            addCriterion("nick <", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLessThanOrEqualTo(String value) {
            addCriterion("nick <=", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLike(String value) {
            addCriterion("nick like", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotLike(String value) {
            addCriterion("nick not like", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickIn(List<String> values) {
            addCriterion("nick in", values, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotIn(List<String> values) {
            addCriterion("nick not in", values, "nick");
            return (Criteria) this;
        }

        public Criteria andNickBetween(String value1, String value2) {
            addCriterion("nick between", value1, value2, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotBetween(String value1, String value2) {
            addCriterion("nick not between", value1, value2, "nick");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andXyzTypeIsNull() {
            addCriterion("xyz_type is null");
            return (Criteria) this;
        }

        public Criteria andXyzTypeIsNotNull() {
            addCriterion("xyz_type is not null");
            return (Criteria) this;
        }

        public Criteria andXyzTypeEqualTo(Integer value) {
            addCriterion("xyz_type =", value, "xyzType");
            return (Criteria) this;
        }

        public Criteria andXyzTypeNotEqualTo(Integer value) {
            addCriterion("xyz_type <>", value, "xyzType");
            return (Criteria) this;
        }

        public Criteria andXyzTypeGreaterThan(Integer value) {
            addCriterion("xyz_type >", value, "xyzType");
            return (Criteria) this;
        }

        public Criteria andXyzTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("xyz_type >=", value, "xyzType");
            return (Criteria) this;
        }

        public Criteria andXyzTypeLessThan(Integer value) {
            addCriterion("xyz_type <", value, "xyzType");
            return (Criteria) this;
        }

        public Criteria andXyzTypeLessThanOrEqualTo(Integer value) {
            addCriterion("xyz_type <=", value, "xyzType");
            return (Criteria) this;
        }

        public Criteria andXyzTypeIn(List<Integer> values) {
            addCriterion("xyz_type in", values, "xyzType");
            return (Criteria) this;
        }

        public Criteria andXyzTypeNotIn(List<Integer> values) {
            addCriterion("xyz_type not in", values, "xyzType");
            return (Criteria) this;
        }

        public Criteria andXyzTypeBetween(Integer value1, Integer value2) {
            addCriterion("xyz_type between", value1, value2, "xyzType");
            return (Criteria) this;
        }

        public Criteria andXyzTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("xyz_type not between", value1, value2, "xyzType");
            return (Criteria) this;
        }

        public Criteria andJzTypeIsNull() {
            addCriterion("jz_type is null");
            return (Criteria) this;
        }

        public Criteria andJzTypeIsNotNull() {
            addCriterion("jz_type is not null");
            return (Criteria) this;
        }

        public Criteria andJzTypeEqualTo(Integer value) {
            addCriterion("jz_type =", value, "jzType");
            return (Criteria) this;
        }

        public Criteria andJzTypeNotEqualTo(Integer value) {
            addCriterion("jz_type <>", value, "jzType");
            return (Criteria) this;
        }

        public Criteria andJzTypeGreaterThan(Integer value) {
            addCriterion("jz_type >", value, "jzType");
            return (Criteria) this;
        }

        public Criteria andJzTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("jz_type >=", value, "jzType");
            return (Criteria) this;
        }

        public Criteria andJzTypeLessThan(Integer value) {
            addCriterion("jz_type <", value, "jzType");
            return (Criteria) this;
        }

        public Criteria andJzTypeLessThanOrEqualTo(Integer value) {
            addCriterion("jz_type <=", value, "jzType");
            return (Criteria) this;
        }

        public Criteria andJzTypeIn(List<Integer> values) {
            addCriterion("jz_type in", values, "jzType");
            return (Criteria) this;
        }

        public Criteria andJzTypeNotIn(List<Integer> values) {
            addCriterion("jz_type not in", values, "jzType");
            return (Criteria) this;
        }

        public Criteria andJzTypeBetween(Integer value1, Integer value2) {
            addCriterion("jz_type between", value1, value2, "jzType");
            return (Criteria) this;
        }

        public Criteria andJzTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("jz_type not between", value1, value2, "jzType");
            return (Criteria) this;
        }

        public Criteria andJzNumIsNull() {
            addCriterion("jz_num is null");
            return (Criteria) this;
        }

        public Criteria andJzNumIsNotNull() {
            addCriterion("jz_num is not null");
            return (Criteria) this;
        }

        public Criteria andJzNumEqualTo(Integer value) {
            addCriterion("jz_num =", value, "jzNum");
            return (Criteria) this;
        }

        public Criteria andJzNumNotEqualTo(Integer value) {
            addCriterion("jz_num <>", value, "jzNum");
            return (Criteria) this;
        }

        public Criteria andJzNumGreaterThan(Integer value) {
            addCriterion("jz_num >", value, "jzNum");
            return (Criteria) this;
        }

        public Criteria andJzNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("jz_num >=", value, "jzNum");
            return (Criteria) this;
        }

        public Criteria andJzNumLessThan(Integer value) {
            addCriterion("jz_num <", value, "jzNum");
            return (Criteria) this;
        }

        public Criteria andJzNumLessThanOrEqualTo(Integer value) {
            addCriterion("jz_num <=", value, "jzNum");
            return (Criteria) this;
        }

        public Criteria andJzNumIn(List<Integer> values) {
            addCriterion("jz_num in", values, "jzNum");
            return (Criteria) this;
        }

        public Criteria andJzNumNotIn(List<Integer> values) {
            addCriterion("jz_num not in", values, "jzNum");
            return (Criteria) this;
        }

        public Criteria andJzNumBetween(Integer value1, Integer value2) {
            addCriterion("jz_num between", value1, value2, "jzNum");
            return (Criteria) this;
        }

        public Criteria andJzNumNotBetween(Integer value1, Integer value2) {
            addCriterion("jz_num not between", value1, value2, "jzNum");
            return (Criteria) this;
        }

        public Criteria andJzZhusuIsNull() {
            addCriterion("jz_zhusu is null");
            return (Criteria) this;
        }

        public Criteria andJzZhusuIsNotNull() {
            addCriterion("jz_zhusu is not null");
            return (Criteria) this;
        }

        public Criteria andJzZhusuEqualTo(Integer value) {
            addCriterion("jz_zhusu =", value, "jzZhusu");
            return (Criteria) this;
        }

        public Criteria andJzZhusuNotEqualTo(Integer value) {
            addCriterion("jz_zhusu <>", value, "jzZhusu");
            return (Criteria) this;
        }

        public Criteria andJzZhusuGreaterThan(Integer value) {
            addCriterion("jz_zhusu >", value, "jzZhusu");
            return (Criteria) this;
        }

        public Criteria andJzZhusuGreaterThanOrEqualTo(Integer value) {
            addCriterion("jz_zhusu >=", value, "jzZhusu");
            return (Criteria) this;
        }

        public Criteria andJzZhusuLessThan(Integer value) {
            addCriterion("jz_zhusu <", value, "jzZhusu");
            return (Criteria) this;
        }

        public Criteria andJzZhusuLessThanOrEqualTo(Integer value) {
            addCriterion("jz_zhusu <=", value, "jzZhusu");
            return (Criteria) this;
        }

        public Criteria andJzZhusuIn(List<Integer> values) {
            addCriterion("jz_zhusu in", values, "jzZhusu");
            return (Criteria) this;
        }

        public Criteria andJzZhusuNotIn(List<Integer> values) {
            addCriterion("jz_zhusu not in", values, "jzZhusu");
            return (Criteria) this;
        }

        public Criteria andJzZhusuBetween(Integer value1, Integer value2) {
            addCriterion("jz_zhusu between", value1, value2, "jzZhusu");
            return (Criteria) this;
        }

        public Criteria andJzZhusuNotBetween(Integer value1, Integer value2) {
            addCriterion("jz_zhusu not between", value1, value2, "jzZhusu");
            return (Criteria) this;
        }

        public Criteria andJzPriceTypeIsNull() {
            addCriterion("jz_price_type is null");
            return (Criteria) this;
        }

        public Criteria andJzPriceTypeIsNotNull() {
            addCriterion("jz_price_type is not null");
            return (Criteria) this;
        }

        public Criteria andJzPriceTypeEqualTo(Integer value) {
            addCriterion("jz_price_type =", value, "jzPriceType");
            return (Criteria) this;
        }

        public Criteria andJzPriceTypeNotEqualTo(Integer value) {
            addCriterion("jz_price_type <>", value, "jzPriceType");
            return (Criteria) this;
        }

        public Criteria andJzPriceTypeGreaterThan(Integer value) {
            addCriterion("jz_price_type >", value, "jzPriceType");
            return (Criteria) this;
        }

        public Criteria andJzPriceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("jz_price_type >=", value, "jzPriceType");
            return (Criteria) this;
        }

        public Criteria andJzPriceTypeLessThan(Integer value) {
            addCriterion("jz_price_type <", value, "jzPriceType");
            return (Criteria) this;
        }

        public Criteria andJzPriceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("jz_price_type <=", value, "jzPriceType");
            return (Criteria) this;
        }

        public Criteria andJzPriceTypeIn(List<Integer> values) {
            addCriterion("jz_price_type in", values, "jzPriceType");
            return (Criteria) this;
        }

        public Criteria andJzPriceTypeNotIn(List<Integer> values) {
            addCriterion("jz_price_type not in", values, "jzPriceType");
            return (Criteria) this;
        }

        public Criteria andJzPriceTypeBetween(Integer value1, Integer value2) {
            addCriterion("jz_price_type between", value1, value2, "jzPriceType");
            return (Criteria) this;
        }

        public Criteria andJzPriceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("jz_price_type not between", value1, value2, "jzPriceType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
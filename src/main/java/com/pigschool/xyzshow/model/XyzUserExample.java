package com.pigschool.xyzshow.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XyzUserExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XyzUserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andReNameIsNull() {
            addCriterion("re_name is null");
            return (Criteria) this;
        }

        public Criteria andReNameIsNotNull() {
            addCriterion("re_name is not null");
            return (Criteria) this;
        }

        public Criteria andReNameEqualTo(String value) {
            addCriterion("re_name =", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameNotEqualTo(String value) {
            addCriterion("re_name <>", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameGreaterThan(String value) {
            addCriterion("re_name >", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameGreaterThanOrEqualTo(String value) {
            addCriterion("re_name >=", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameLessThan(String value) {
            addCriterion("re_name <", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameLessThanOrEqualTo(String value) {
            addCriterion("re_name <=", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameLike(String value) {
            addCriterion("re_name like", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameNotLike(String value) {
            addCriterion("re_name not like", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameIn(List<String> values) {
            addCriterion("re_name in", values, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameNotIn(List<String> values) {
            addCriterion("re_name not in", values, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameBetween(String value1, String value2) {
            addCriterion("re_name between", value1, value2, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameNotBetween(String value1, String value2) {
            addCriterion("re_name not between", value1, value2, "reName");
            return (Criteria) this;
        }

        public Criteria andReSchoolIsNull() {
            addCriterion("re_school is null");
            return (Criteria) this;
        }

        public Criteria andReSchoolIsNotNull() {
            addCriterion("re_school is not null");
            return (Criteria) this;
        }

        public Criteria andReSchoolEqualTo(String value) {
            addCriterion("re_school =", value, "reSchool");
            return (Criteria) this;
        }

        public Criteria andReSchoolNotEqualTo(String value) {
            addCriterion("re_school <>", value, "reSchool");
            return (Criteria) this;
        }

        public Criteria andReSchoolGreaterThan(String value) {
            addCriterion("re_school >", value, "reSchool");
            return (Criteria) this;
        }

        public Criteria andReSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("re_school >=", value, "reSchool");
            return (Criteria) this;
        }

        public Criteria andReSchoolLessThan(String value) {
            addCriterion("re_school <", value, "reSchool");
            return (Criteria) this;
        }

        public Criteria andReSchoolLessThanOrEqualTo(String value) {
            addCriterion("re_school <=", value, "reSchool");
            return (Criteria) this;
        }

        public Criteria andReSchoolLike(String value) {
            addCriterion("re_school like", value, "reSchool");
            return (Criteria) this;
        }

        public Criteria andReSchoolNotLike(String value) {
            addCriterion("re_school not like", value, "reSchool");
            return (Criteria) this;
        }

        public Criteria andReSchoolIn(List<String> values) {
            addCriterion("re_school in", values, "reSchool");
            return (Criteria) this;
        }

        public Criteria andReSchoolNotIn(List<String> values) {
            addCriterion("re_school not in", values, "reSchool");
            return (Criteria) this;
        }

        public Criteria andReSchoolBetween(String value1, String value2) {
            addCriterion("re_school between", value1, value2, "reSchool");
            return (Criteria) this;
        }

        public Criteria andReSchoolNotBetween(String value1, String value2) {
            addCriterion("re_school not between", value1, value2, "reSchool");
            return (Criteria) this;
        }

        public Criteria andReIdcardIsNull() {
            addCriterion("re_idcard is null");
            return (Criteria) this;
        }

        public Criteria andReIdcardIsNotNull() {
            addCriterion("re_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andReIdcardEqualTo(String value) {
            addCriterion("re_idcard =", value, "reIdcard");
            return (Criteria) this;
        }

        public Criteria andReIdcardNotEqualTo(String value) {
            addCriterion("re_idcard <>", value, "reIdcard");
            return (Criteria) this;
        }

        public Criteria andReIdcardGreaterThan(String value) {
            addCriterion("re_idcard >", value, "reIdcard");
            return (Criteria) this;
        }

        public Criteria andReIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("re_idcard >=", value, "reIdcard");
            return (Criteria) this;
        }

        public Criteria andReIdcardLessThan(String value) {
            addCriterion("re_idcard <", value, "reIdcard");
            return (Criteria) this;
        }

        public Criteria andReIdcardLessThanOrEqualTo(String value) {
            addCriterion("re_idcard <=", value, "reIdcard");
            return (Criteria) this;
        }

        public Criteria andReIdcardLike(String value) {
            addCriterion("re_idcard like", value, "reIdcard");
            return (Criteria) this;
        }

        public Criteria andReIdcardNotLike(String value) {
            addCriterion("re_idcard not like", value, "reIdcard");
            return (Criteria) this;
        }

        public Criteria andReIdcardIn(List<String> values) {
            addCriterion("re_idcard in", values, "reIdcard");
            return (Criteria) this;
        }

        public Criteria andReIdcardNotIn(List<String> values) {
            addCriterion("re_idcard not in", values, "reIdcard");
            return (Criteria) this;
        }

        public Criteria andReIdcardBetween(String value1, String value2) {
            addCriterion("re_idcard between", value1, value2, "reIdcard");
            return (Criteria) this;
        }

        public Criteria andReIdcardNotBetween(String value1, String value2) {
            addCriterion("re_idcard not between", value1, value2, "reIdcard");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNull() {
            addCriterion("last_login_date is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIsNotNull() {
            addCriterion("last_login_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateEqualTo(Date value) {
            addCriterion("last_login_date =", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotEqualTo(Date value) {
            addCriterion("last_login_date <>", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThan(Date value) {
            addCriterion("last_login_date >", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_date >=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThan(Date value) {
            addCriterion("last_login_date <", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateLessThanOrEqualTo(Date value) {
            addCriterion("last_login_date <=", value, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateIn(List<Date> values) {
            addCriterion("last_login_date in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotIn(List<Date> values) {
            addCriterion("last_login_date not in", values, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateBetween(Date value1, Date value2) {
            addCriterion("last_login_date between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginDateNotBetween(Date value1, Date value2) {
            addCriterion("last_login_date not between", value1, value2, "lastLoginDate");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNull() {
            addCriterion("last_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNotNull() {
            addCriterion("last_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpEqualTo(Date value) {
            addCriterion("last_login_ip =", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotEqualTo(Date value) {
            addCriterion("last_login_ip <>", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThan(Date value) {
            addCriterion("last_login_ip >", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_ip >=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThan(Date value) {
            addCriterion("last_login_ip <", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThanOrEqualTo(Date value) {
            addCriterion("last_login_ip <=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIn(List<Date> values) {
            addCriterion("last_login_ip in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotIn(List<Date> values) {
            addCriterion("last_login_ip not in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpBetween(Date value1, Date value2) {
            addCriterion("last_login_ip between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotBetween(Date value1, Date value2) {
            addCriterion("last_login_ip not between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsEmailConfirmedIsNull() {
            addCriterion("is_email_confirmed is null");
            return (Criteria) this;
        }

        public Criteria andIsEmailConfirmedIsNotNull() {
            addCriterion("is_email_confirmed is not null");
            return (Criteria) this;
        }

        public Criteria andIsEmailConfirmedEqualTo(Integer value) {
            addCriterion("is_email_confirmed =", value, "isEmailConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsEmailConfirmedNotEqualTo(Integer value) {
            addCriterion("is_email_confirmed <>", value, "isEmailConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsEmailConfirmedGreaterThan(Integer value) {
            addCriterion("is_email_confirmed >", value, "isEmailConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsEmailConfirmedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_email_confirmed >=", value, "isEmailConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsEmailConfirmedLessThan(Integer value) {
            addCriterion("is_email_confirmed <", value, "isEmailConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsEmailConfirmedLessThanOrEqualTo(Integer value) {
            addCriterion("is_email_confirmed <=", value, "isEmailConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsEmailConfirmedIn(List<Integer> values) {
            addCriterion("is_email_confirmed in", values, "isEmailConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsEmailConfirmedNotIn(List<Integer> values) {
            addCriterion("is_email_confirmed not in", values, "isEmailConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsEmailConfirmedBetween(Integer value1, Integer value2) {
            addCriterion("is_email_confirmed between", value1, value2, "isEmailConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsEmailConfirmedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_email_confirmed not between", value1, value2, "isEmailConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsPhoneConfirmedIsNull() {
            addCriterion("is_phone_confirmed is null");
            return (Criteria) this;
        }

        public Criteria andIsPhoneConfirmedIsNotNull() {
            addCriterion("is_phone_confirmed is not null");
            return (Criteria) this;
        }

        public Criteria andIsPhoneConfirmedEqualTo(Integer value) {
            addCriterion("is_phone_confirmed =", value, "isPhoneConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsPhoneConfirmedNotEqualTo(Integer value) {
            addCriterion("is_phone_confirmed <>", value, "isPhoneConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsPhoneConfirmedGreaterThan(Integer value) {
            addCriterion("is_phone_confirmed >", value, "isPhoneConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsPhoneConfirmedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_phone_confirmed >=", value, "isPhoneConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsPhoneConfirmedLessThan(Integer value) {
            addCriterion("is_phone_confirmed <", value, "isPhoneConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsPhoneConfirmedLessThanOrEqualTo(Integer value) {
            addCriterion("is_phone_confirmed <=", value, "isPhoneConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsPhoneConfirmedIn(List<Integer> values) {
            addCriterion("is_phone_confirmed in", values, "isPhoneConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsPhoneConfirmedNotIn(List<Integer> values) {
            addCriterion("is_phone_confirmed not in", values, "isPhoneConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsPhoneConfirmedBetween(Integer value1, Integer value2) {
            addCriterion("is_phone_confirmed between", value1, value2, "isPhoneConfirmed");
            return (Criteria) this;
        }

        public Criteria andIsPhoneConfirmedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_phone_confirmed not between", value1, value2, "isPhoneConfirmed");
            return (Criteria) this;
        }

        public Criteria andMacIsNull() {
            addCriterion("mac is null");
            return (Criteria) this;
        }

        public Criteria andMacIsNotNull() {
            addCriterion("mac is not null");
            return (Criteria) this;
        }

        public Criteria andMacEqualTo(String value) {
            addCriterion("mac =", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotEqualTo(String value) {
            addCriterion("mac <>", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThan(String value) {
            addCriterion("mac >", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacGreaterThanOrEqualTo(String value) {
            addCriterion("mac >=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThan(String value) {
            addCriterion("mac <", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLessThanOrEqualTo(String value) {
            addCriterion("mac <=", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacLike(String value) {
            addCriterion("mac like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotLike(String value) {
            addCriterion("mac not like", value, "mac");
            return (Criteria) this;
        }

        public Criteria andMacIn(List<String> values) {
            addCriterion("mac in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotIn(List<String> values) {
            addCriterion("mac not in", values, "mac");
            return (Criteria) this;
        }

        public Criteria andMacBetween(String value1, String value2) {
            addCriterion("mac between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andMacNotBetween(String value1, String value2) {
            addCriterion("mac not between", value1, value2, "mac");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
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
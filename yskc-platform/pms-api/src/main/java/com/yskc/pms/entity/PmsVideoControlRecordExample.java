package com.yskc.pms.entity;

import com.yskc.pms.utile.PageResultUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsVideoControlRecordExample extends PageResultUtils {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;


    public PmsVideoControlRecordExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andVideoIllegalIsNull() {
            addCriterion("video_illegal is null");
            return (Criteria) this;
        }

        public Criteria andVideoIllegalIsNotNull() {
            addCriterion("video_illegal is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIllegalEqualTo(Integer value) {
            addCriterion("video_illegal =", value, "videoIllegal");
            return (Criteria) this;
        }

        public Criteria andVideoIllegalNotEqualTo(Integer value) {
            addCriterion("video_illegal <>", value, "videoIllegal");
            return (Criteria) this;
        }

        public Criteria andVideoIllegalGreaterThan(Integer value) {
            addCriterion("video_illegal >", value, "videoIllegal");
            return (Criteria) this;
        }

        public Criteria andVideoIllegalGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_illegal >=", value, "videoIllegal");
            return (Criteria) this;
        }

        public Criteria andVideoIllegalLessThan(Integer value) {
            addCriterion("video_illegal <", value, "videoIllegal");
            return (Criteria) this;
        }

        public Criteria andVideoIllegalLessThanOrEqualTo(Integer value) {
            addCriterion("video_illegal <=", value, "videoIllegal");
            return (Criteria) this;
        }

        public Criteria andVideoIllegalIn(List<Integer> values) {
            addCriterion("video_illegal in", values, "videoIllegal");
            return (Criteria) this;
        }

        public Criteria andVideoIllegalNotIn(List<Integer> values) {
            addCriterion("video_illegal not in", values, "videoIllegal");
            return (Criteria) this;
        }

        public Criteria andVideoIllegalBetween(Integer value1, Integer value2) {
            addCriterion("video_illegal between", value1, value2, "videoIllegal");
            return (Criteria) this;
        }

        public Criteria andVideoIllegalNotBetween(Integer value1, Integer value2) {
            addCriterion("video_illegal not between", value1, value2, "videoIllegal");
            return (Criteria) this;
        }

        public Criteria andVideoViolationsIsNull() {
            addCriterion("video_violations is null");
            return (Criteria) this;
        }

        public Criteria andVideoViolationsIsNotNull() {
            addCriterion("video_violations is not null");
            return (Criteria) this;
        }

        public Criteria andVideoViolationsEqualTo(Integer value) {
            addCriterion("video_violations =", value, "videoViolations");
            return (Criteria) this;
        }

        public Criteria andVideoViolationsNotEqualTo(Integer value) {
            addCriterion("video_violations <>", value, "videoViolations");
            return (Criteria) this;
        }

        public Criteria andVideoViolationsGreaterThan(Integer value) {
            addCriterion("video_violations >", value, "videoViolations");
            return (Criteria) this;
        }

        public Criteria andVideoViolationsGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_violations >=", value, "videoViolations");
            return (Criteria) this;
        }

        public Criteria andVideoViolationsLessThan(Integer value) {
            addCriterion("video_violations <", value, "videoViolations");
            return (Criteria) this;
        }

        public Criteria andVideoViolationsLessThanOrEqualTo(Integer value) {
            addCriterion("video_violations <=", value, "videoViolations");
            return (Criteria) this;
        }

        public Criteria andVideoViolationsIn(List<Integer> values) {
            addCriterion("video_violations in", values, "videoViolations");
            return (Criteria) this;
        }

        public Criteria andVideoViolationsNotIn(List<Integer> values) {
            addCriterion("video_violations not in", values, "videoViolations");
            return (Criteria) this;
        }

        public Criteria andVideoViolationsBetween(Integer value1, Integer value2) {
            addCriterion("video_violations between", value1, value2, "videoViolations");
            return (Criteria) this;
        }

        public Criteria andVideoViolationsNotBetween(Integer value1, Integer value2) {
            addCriterion("video_violations not between", value1, value2, "videoViolations");
            return (Criteria) this;
        }

        public Criteria andAccountAoolyTimeIsNull() {
            addCriterion("account_aooly_time is null");
            return (Criteria) this;
        }

        public Criteria andAccountAoolyTimeIsNotNull() {
            addCriterion("account_aooly_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccountAoolyTimeEqualTo(Date value) {
            addCriterion("account_aooly_time =", value, "accountAoolyTime");
            return (Criteria) this;
        }

        public Criteria andAccountAoolyTimeNotEqualTo(Date value) {
            addCriterion("account_aooly_time <>", value, "accountAoolyTime");
            return (Criteria) this;
        }

        public Criteria andAccountAoolyTimeGreaterThan(Date value) {
            addCriterion("account_aooly_time >", value, "accountAoolyTime");
            return (Criteria) this;
        }

        public Criteria andAccountAoolyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("account_aooly_time >=", value, "accountAoolyTime");
            return (Criteria) this;
        }

        public Criteria andAccountAoolyTimeLessThan(Date value) {
            addCriterion("account_aooly_time <", value, "accountAoolyTime");
            return (Criteria) this;
        }

        public Criteria andAccountAoolyTimeLessThanOrEqualTo(Date value) {
            addCriterion("account_aooly_time <=", value, "accountAoolyTime");
            return (Criteria) this;
        }

        public Criteria andAccountAoolyTimeIn(List<Date> values) {
            addCriterion("account_aooly_time in", values, "accountAoolyTime");
            return (Criteria) this;
        }

        public Criteria andAccountAoolyTimeNotIn(List<Date> values) {
            addCriterion("account_aooly_time not in", values, "accountAoolyTime");
            return (Criteria) this;
        }

        public Criteria andAccountAoolyTimeBetween(Date value1, Date value2) {
            addCriterion("account_aooly_time between", value1, value2, "accountAoolyTime");
            return (Criteria) this;
        }

        public Criteria andAccountAoolyTimeNotBetween(Date value1, Date value2) {
            addCriterion("account_aooly_time not between", value1, value2, "accountAoolyTime");
            return (Criteria) this;
        }

        public Criteria andVideoStateIsNull() {
            addCriterion("video_state is null");
            return (Criteria) this;
        }

        public Criteria andVideoStateIsNotNull() {
            addCriterion("video_state is not null");
            return (Criteria) this;
        }

        public Criteria andVideoStateEqualTo(Integer value) {
            addCriterion("video_state =", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateNotEqualTo(Integer value) {
            addCriterion("video_state <>", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateGreaterThan(Integer value) {
            addCriterion("video_state >", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_state >=", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateLessThan(Integer value) {
            addCriterion("video_state <", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateLessThanOrEqualTo(Integer value) {
            addCriterion("video_state <=", value, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateIn(List<Integer> values) {
            addCriterion("video_state in", values, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateNotIn(List<Integer> values) {
            addCriterion("video_state not in", values, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateBetween(Integer value1, Integer value2) {
            addCriterion("video_state between", value1, value2, "videoState");
            return (Criteria) this;
        }

        public Criteria andVideoStateNotBetween(Integer value1, Integer value2) {
            addCriterion("video_state not between", value1, value2, "videoState");
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
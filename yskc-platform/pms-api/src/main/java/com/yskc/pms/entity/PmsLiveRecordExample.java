package com.yskc.pms.entity;

import com.yskc.pms.utile.PageResultUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsLiveRecordExample extends PageResultUtils {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsLiveRecordExample() {
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

        public Criteria andRecentPlayTimeIsNull() {
            addCriterion("recent_play_time is null");
            return (Criteria) this;
        }

        public Criteria andRecentPlayTimeIsNotNull() {
            addCriterion("recent_play_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecentPlayTimeEqualTo(Date value) {
            addCriterion("recent_play_time =", value, "recentPlayTime");
            return (Criteria) this;
        }

        public Criteria andRecentPlayTimeNotEqualTo(Date value) {
            addCriterion("recent_play_time <>", value, "recentPlayTime");
            return (Criteria) this;
        }

        public Criteria andRecentPlayTimeGreaterThan(Date value) {
            addCriterion("recent_play_time >", value, "recentPlayTime");
            return (Criteria) this;
        }

        public Criteria andRecentPlayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recent_play_time >=", value, "recentPlayTime");
            return (Criteria) this;
        }

        public Criteria andRecentPlayTimeLessThan(Date value) {
            addCriterion("recent_play_time <", value, "recentPlayTime");
            return (Criteria) this;
        }

        public Criteria andRecentPlayTimeLessThanOrEqualTo(Date value) {
            addCriterion("recent_play_time <=", value, "recentPlayTime");
            return (Criteria) this;
        }

        public Criteria andRecentPlayTimeIn(List<Date> values) {
            addCriterion("recent_play_time in", values, "recentPlayTime");
            return (Criteria) this;
        }

        public Criteria andRecentPlayTimeNotIn(List<Date> values) {
            addCriterion("recent_play_time not in", values, "recentPlayTime");
            return (Criteria) this;
        }

        public Criteria andRecentPlayTimeBetween(Date value1, Date value2) {
            addCriterion("recent_play_time between", value1, value2, "recentPlayTime");
            return (Criteria) this;
        }

        public Criteria andRecentPlayTimeNotBetween(Date value1, Date value2) {
            addCriterion("recent_play_time not between", value1, value2, "recentPlayTime");
            return (Criteria) this;
        }

        public Criteria andLiveSizeIsNull() {
            addCriterion("\" live_size\" is null");
            return (Criteria) this;
        }

        public Criteria andLiveSizeIsNotNull() {
            addCriterion("\" live_size\" is not null");
            return (Criteria) this;
        }

        public Criteria andLiveSizeEqualTo(Integer value) {
            addCriterion("\" live_size\" =", value, "liveSize");
            return (Criteria) this;
        }

        public Criteria andLiveSizeNotEqualTo(Integer value) {
            addCriterion("\" live_size\" <>", value, "liveSize");
            return (Criteria) this;
        }

        public Criteria andLiveSizeGreaterThan(Integer value) {
            addCriterion("\" live_size\" >", value, "liveSize");
            return (Criteria) this;
        }

        public Criteria andLiveSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("\" live_size\" >=", value, "liveSize");
            return (Criteria) this;
        }

        public Criteria andLiveSizeLessThan(Integer value) {
            addCriterion("\" live_size\" <", value, "liveSize");
            return (Criteria) this;
        }

        public Criteria andLiveSizeLessThanOrEqualTo(Integer value) {
            addCriterion("\" live_size\" <=", value, "liveSize");
            return (Criteria) this;
        }

        public Criteria andLiveSizeIn(List<Integer> values) {
            addCriterion("\" live_size\" in", values, "liveSize");
            return (Criteria) this;
        }

        public Criteria andLiveSizeNotIn(List<Integer> values) {
            addCriterion("\" live_size\" not in", values, "liveSize");
            return (Criteria) this;
        }

        public Criteria andLiveSizeBetween(Integer value1, Integer value2) {
            addCriterion("\" live_size\" between", value1, value2, "liveSize");
            return (Criteria) this;
        }

        public Criteria andLiveSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("\" live_size\" not between", value1, value2, "liveSize");
            return (Criteria) this;
        }

        public Criteria andOpenLiveTimeIsNull() {
            addCriterion("open_live_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenLiveTimeIsNotNull() {
            addCriterion("open_live_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenLiveTimeEqualTo(Date value) {
            addCriterion("open_live_time =", value, "openLiveTime");
            return (Criteria) this;
        }

        public Criteria andOpenLiveTimeNotEqualTo(Date value) {
            addCriterion("open_live_time <>", value, "openLiveTime");
            return (Criteria) this;
        }

        public Criteria andOpenLiveTimeGreaterThan(Date value) {
            addCriterion("open_live_time >", value, "openLiveTime");
            return (Criteria) this;
        }

        public Criteria andOpenLiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("open_live_time >=", value, "openLiveTime");
            return (Criteria) this;
        }

        public Criteria andOpenLiveTimeLessThan(Date value) {
            addCriterion("open_live_time <", value, "openLiveTime");
            return (Criteria) this;
        }

        public Criteria andOpenLiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("open_live_time <=", value, "openLiveTime");
            return (Criteria) this;
        }

        public Criteria andOpenLiveTimeIn(List<Date> values) {
            addCriterion("open_live_time in", values, "openLiveTime");
            return (Criteria) this;
        }

        public Criteria andOpenLiveTimeNotIn(List<Date> values) {
            addCriterion("open_live_time not in", values, "openLiveTime");
            return (Criteria) this;
        }

        public Criteria andOpenLiveTimeBetween(Date value1, Date value2) {
            addCriterion("open_live_time between", value1, value2, "openLiveTime");
            return (Criteria) this;
        }

        public Criteria andOpenLiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("open_live_time not between", value1, value2, "openLiveTime");
            return (Criteria) this;
        }

        public Criteria andOperationStatusIsNull() {
            addCriterion("operation_status is null");
            return (Criteria) this;
        }

        public Criteria andOperationStatusIsNotNull() {
            addCriterion("operation_status is not null");
            return (Criteria) this;
        }

        public Criteria andOperationStatusEqualTo(Integer value) {
            addCriterion("operation_status =", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusNotEqualTo(Integer value) {
            addCriterion("operation_status <>", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusGreaterThan(Integer value) {
            addCriterion("operation_status >", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_status >=", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusLessThan(Integer value) {
            addCriterion("operation_status <", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusLessThanOrEqualTo(Integer value) {
            addCriterion("operation_status <=", value, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusIn(List<Integer> values) {
            addCriterion("operation_status in", values, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusNotIn(List<Integer> values) {
            addCriterion("operation_status not in", values, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusBetween(Integer value1, Integer value2) {
            addCriterion("operation_status between", value1, value2, "operationStatus");
            return (Criteria) this;
        }

        public Criteria andOperationStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_status not between", value1, value2, "operationStatus");
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
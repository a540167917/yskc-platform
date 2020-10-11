package com.yskc.pms.entity;

import com.yskc.pms.utile.PageResultUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsRecordedRecordExample extends PageResultUtils {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsRecordedRecordExample() {
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

        public Criteria andRecentTimeIsNull() {
            addCriterion("recent_time is null");
            return (Criteria) this;
        }

        public Criteria andRecentTimeIsNotNull() {
            addCriterion("recent_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecentTimeEqualTo(Date value) {
            addCriterion("recent_time =", value, "recentTime");
            return (Criteria) this;
        }

        public Criteria andRecentTimeNotEqualTo(Date value) {
            addCriterion("recent_time <>", value, "recentTime");
            return (Criteria) this;
        }

        public Criteria andRecentTimeGreaterThan(Date value) {
            addCriterion("recent_time >", value, "recentTime");
            return (Criteria) this;
        }

        public Criteria andRecentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recent_time >=", value, "recentTime");
            return (Criteria) this;
        }

        public Criteria andRecentTimeLessThan(Date value) {
            addCriterion("recent_time <", value, "recentTime");
            return (Criteria) this;
        }

        public Criteria andRecentTimeLessThanOrEqualTo(Date value) {
            addCriterion("recent_time <=", value, "recentTime");
            return (Criteria) this;
        }

        public Criteria andRecentTimeIn(List<Date> values) {
            addCriterion("recent_time in", values, "recentTime");
            return (Criteria) this;
        }

        public Criteria andRecentTimeNotIn(List<Date> values) {
            addCriterion("recent_time not in", values, "recentTime");
            return (Criteria) this;
        }

        public Criteria andRecentTimeBetween(Date value1, Date value2) {
            addCriterion("recent_time between", value1, value2, "recentTime");
            return (Criteria) this;
        }

        public Criteria andRecentTimeNotBetween(Date value1, Date value2) {
            addCriterion("recent_time not between", value1, value2, "recentTime");
            return (Criteria) this;
        }

        public Criteria andRecordedSizeIsNull() {
            addCriterion("recorded_size is null");
            return (Criteria) this;
        }

        public Criteria andRecordedSizeIsNotNull() {
            addCriterion("recorded_size is not null");
            return (Criteria) this;
        }

        public Criteria andRecordedSizeEqualTo(Integer value) {
            addCriterion("recorded_size =", value, "recordedSize");
            return (Criteria) this;
        }

        public Criteria andRecordedSizeNotEqualTo(Integer value) {
            addCriterion("recorded_size <>", value, "recordedSize");
            return (Criteria) this;
        }

        public Criteria andRecordedSizeGreaterThan(Integer value) {
            addCriterion("recorded_size >", value, "recordedSize");
            return (Criteria) this;
        }

        public Criteria andRecordedSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("recorded_size >=", value, "recordedSize");
            return (Criteria) this;
        }

        public Criteria andRecordedSizeLessThan(Integer value) {
            addCriterion("recorded_size <", value, "recordedSize");
            return (Criteria) this;
        }

        public Criteria andRecordedSizeLessThanOrEqualTo(Integer value) {
            addCriterion("recorded_size <=", value, "recordedSize");
            return (Criteria) this;
        }

        public Criteria andRecordedSizeIn(List<Integer> values) {
            addCriterion("recorded_size in", values, "recordedSize");
            return (Criteria) this;
        }

        public Criteria andRecordedSizeNotIn(List<Integer> values) {
            addCriterion("recorded_size not in", values, "recordedSize");
            return (Criteria) this;
        }

        public Criteria andRecordedSizeBetween(Integer value1, Integer value2) {
            addCriterion("recorded_size between", value1, value2, "recordedSize");
            return (Criteria) this;
        }

        public Criteria andRecordedSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("recorded_size not between", value1, value2, "recordedSize");
            return (Criteria) this;
        }

        public Criteria andOpenRecordedTimeIsNull() {
            addCriterion("open_recorded_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenRecordedTimeIsNotNull() {
            addCriterion("open_recorded_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenRecordedTimeEqualTo(Date value) {
            addCriterion("open_recorded_time =", value, "openRecordedTime");
            return (Criteria) this;
        }

        public Criteria andOpenRecordedTimeNotEqualTo(Date value) {
            addCriterion("open_recorded_time <>", value, "openRecordedTime");
            return (Criteria) this;
        }

        public Criteria andOpenRecordedTimeGreaterThan(Date value) {
            addCriterion("open_recorded_time >", value, "openRecordedTime");
            return (Criteria) this;
        }

        public Criteria andOpenRecordedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("open_recorded_time >=", value, "openRecordedTime");
            return (Criteria) this;
        }

        public Criteria andOpenRecordedTimeLessThan(Date value) {
            addCriterion("open_recorded_time <", value, "openRecordedTime");
            return (Criteria) this;
        }

        public Criteria andOpenRecordedTimeLessThanOrEqualTo(Date value) {
            addCriterion("open_recorded_time <=", value, "openRecordedTime");
            return (Criteria) this;
        }

        public Criteria andOpenRecordedTimeIn(List<Date> values) {
            addCriterion("open_recorded_time in", values, "openRecordedTime");
            return (Criteria) this;
        }

        public Criteria andOpenRecordedTimeNotIn(List<Date> values) {
            addCriterion("open_recorded_time not in", values, "openRecordedTime");
            return (Criteria) this;
        }

        public Criteria andOpenRecordedTimeBetween(Date value1, Date value2) {
            addCriterion("open_recorded_time between", value1, value2, "openRecordedTime");
            return (Criteria) this;
        }

        public Criteria andOpenRecordedTimeNotBetween(Date value1, Date value2) {
            addCriterion("open_recorded_time not between", value1, value2, "openRecordedTime");
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
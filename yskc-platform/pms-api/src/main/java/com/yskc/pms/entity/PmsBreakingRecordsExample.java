package com.yskc.pms.entity;

import com.yskc.pms.utile.PageResultUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsBreakingRecordsExample extends PageResultUtils {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsBreakingRecordsExample() {
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

        public Criteria andWaitingTypeIsNull() {
            addCriterion("waiting_type is null");
            return (Criteria) this;
        }

        public Criteria andWaitingTypeIsNotNull() {
            addCriterion("waiting_type is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingTypeEqualTo(String value) {
            addCriterion("waiting_type =", value, "waitingType");
            return (Criteria) this;
        }

        public Criteria andWaitingTypeNotEqualTo(String value) {
            addCriterion("waiting_type <>", value, "waitingType");
            return (Criteria) this;
        }

        public Criteria andWaitingTypeGreaterThan(String value) {
            addCriterion("waiting_type >", value, "waitingType");
            return (Criteria) this;
        }

        public Criteria andWaitingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("waiting_type >=", value, "waitingType");
            return (Criteria) this;
        }

        public Criteria andWaitingTypeLessThan(String value) {
            addCriterion("waiting_type <", value, "waitingType");
            return (Criteria) this;
        }

        public Criteria andWaitingTypeLessThanOrEqualTo(String value) {
            addCriterion("waiting_type <=", value, "waitingType");
            return (Criteria) this;
        }

        public Criteria andWaitingTypeLike(String value) {
            addCriterion("waiting_type like", value, "waitingType");
            return (Criteria) this;
        }

        public Criteria andWaitingTypeNotLike(String value) {
            addCriterion("waiting_type not like", value, "waitingType");
            return (Criteria) this;
        }

        public Criteria andWaitingTypeIn(List<String> values) {
            addCriterion("waiting_type in", values, "waitingType");
            return (Criteria) this;
        }

        public Criteria andWaitingTypeNotIn(List<String> values) {
            addCriterion("waiting_type not in", values, "waitingType");
            return (Criteria) this;
        }

        public Criteria andWaitingTypeBetween(String value1, String value2) {
            addCriterion("waiting_type between", value1, value2, "waitingType");
            return (Criteria) this;
        }

        public Criteria andWaitingTypeNotBetween(String value1, String value2) {
            addCriterion("waiting_type not between", value1, value2, "waitingType");
            return (Criteria) this;
        }

        public Criteria andWaitingSizeIsNull() {
            addCriterion("waiting_size is null");
            return (Criteria) this;
        }

        public Criteria andWaitingSizeIsNotNull() {
            addCriterion("waiting_size is not null");
            return (Criteria) this;
        }

        public Criteria andWaitingSizeEqualTo(Integer value) {
            addCriterion("waiting_size =", value, "waitingSize");
            return (Criteria) this;
        }

        public Criteria andWaitingSizeNotEqualTo(Integer value) {
            addCriterion("waiting_size <>", value, "waitingSize");
            return (Criteria) this;
        }

        public Criteria andWaitingSizeGreaterThan(Integer value) {
            addCriterion("waiting_size >", value, "waitingSize");
            return (Criteria) this;
        }

        public Criteria andWaitingSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("waiting_size >=", value, "waitingSize");
            return (Criteria) this;
        }

        public Criteria andWaitingSizeLessThan(Integer value) {
            addCriterion("waiting_size <", value, "waitingSize");
            return (Criteria) this;
        }

        public Criteria andWaitingSizeLessThanOrEqualTo(Integer value) {
            addCriterion("waiting_size <=", value, "waitingSize");
            return (Criteria) this;
        }

        public Criteria andWaitingSizeIn(List<Integer> values) {
            addCriterion("waiting_size in", values, "waitingSize");
            return (Criteria) this;
        }

        public Criteria andWaitingSizeNotIn(List<Integer> values) {
            addCriterion("waiting_size not in", values, "waitingSize");
            return (Criteria) this;
        }

        public Criteria andWaitingSizeBetween(Integer value1, Integer value2) {
            addCriterion("waiting_size between", value1, value2, "waitingSize");
            return (Criteria) this;
        }

        public Criteria andWaitingSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("waiting_size not between", value1, value2, "waitingSize");
            return (Criteria) this;
        }

        public Criteria andOpenWaitingTimeIsNull() {
            addCriterion("open_waiting_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenWaitingTimeIsNotNull() {
            addCriterion("open_waiting_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenWaitingTimeEqualTo(Date value) {
            addCriterion("open_waiting_time =", value, "openWaitingTime");
            return (Criteria) this;
        }

        public Criteria andOpenWaitingTimeNotEqualTo(Date value) {
            addCriterion("open_waiting_time <>", value, "openWaitingTime");
            return (Criteria) this;
        }

        public Criteria andOpenWaitingTimeGreaterThan(Date value) {
            addCriterion("open_waiting_time >", value, "openWaitingTime");
            return (Criteria) this;
        }

        public Criteria andOpenWaitingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("open_waiting_time >=", value, "openWaitingTime");
            return (Criteria) this;
        }

        public Criteria andOpenWaitingTimeLessThan(Date value) {
            addCriterion("open_waiting_time <", value, "openWaitingTime");
            return (Criteria) this;
        }

        public Criteria andOpenWaitingTimeLessThanOrEqualTo(Date value) {
            addCriterion("open_waiting_time <=", value, "openWaitingTime");
            return (Criteria) this;
        }

        public Criteria andOpenWaitingTimeIn(List<Date> values) {
            addCriterion("open_waiting_time in", values, "openWaitingTime");
            return (Criteria) this;
        }

        public Criteria andOpenWaitingTimeNotIn(List<Date> values) {
            addCriterion("open_waiting_time not in", values, "openWaitingTime");
            return (Criteria) this;
        }

        public Criteria andOpenWaitingTimeBetween(Date value1, Date value2) {
            addCriterion("open_waiting_time between", value1, value2, "openWaitingTime");
            return (Criteria) this;
        }

        public Criteria andOpenWaitingTimeNotBetween(Date value1, Date value2) {
            addCriterion("open_waiting_time not between", value1, value2, "openWaitingTime");
            return (Criteria) this;
        }

        public Criteria andOperationStutesIsNull() {
            addCriterion("operation_stutes is null");
            return (Criteria) this;
        }

        public Criteria andOperationStutesIsNotNull() {
            addCriterion("operation_stutes is not null");
            return (Criteria) this;
        }

        public Criteria andOperationStutesEqualTo(Integer value) {
            addCriterion("operation_stutes =", value, "operationStutes");
            return (Criteria) this;
        }

        public Criteria andOperationStutesNotEqualTo(Integer value) {
            addCriterion("operation_stutes <>", value, "operationStutes");
            return (Criteria) this;
        }

        public Criteria andOperationStutesGreaterThan(Integer value) {
            addCriterion("operation_stutes >", value, "operationStutes");
            return (Criteria) this;
        }

        public Criteria andOperationStutesGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_stutes >=", value, "operationStutes");
            return (Criteria) this;
        }

        public Criteria andOperationStutesLessThan(Integer value) {
            addCriterion("operation_stutes <", value, "operationStutes");
            return (Criteria) this;
        }

        public Criteria andOperationStutesLessThanOrEqualTo(Integer value) {
            addCriterion("operation_stutes <=", value, "operationStutes");
            return (Criteria) this;
        }

        public Criteria andOperationStutesIn(List<Integer> values) {
            addCriterion("operation_stutes in", values, "operationStutes");
            return (Criteria) this;
        }

        public Criteria andOperationStutesNotIn(List<Integer> values) {
            addCriterion("operation_stutes not in", values, "operationStutes");
            return (Criteria) this;
        }

        public Criteria andOperationStutesBetween(Integer value1, Integer value2) {
            addCriterion("operation_stutes between", value1, value2, "operationStutes");
            return (Criteria) this;
        }

        public Criteria andOperationStutesNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_stutes not between", value1, value2, "operationStutes");
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
package com.yskc.pms.entity;

import com.yskc.pms.utile.PageResultUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsChatControlRecordExample extends PageResultUtils {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsChatControlRecordExample() {
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

        public Criteria andChatIllegalIsNull() {
            addCriterion("chat_illegal is null");
            return (Criteria) this;
        }

        public Criteria andChatIllegalIsNotNull() {
            addCriterion("chat_illegal is not null");
            return (Criteria) this;
        }

        public Criteria andChatIllegalEqualTo(Integer value) {
            addCriterion("chat_illegal =", value, "chatIllegal");
            return (Criteria) this;
        }

        public Criteria andChatIllegalNotEqualTo(Integer value) {
            addCriterion("chat_illegal <>", value, "chatIllegal");
            return (Criteria) this;
        }

        public Criteria andChatIllegalGreaterThan(Integer value) {
            addCriterion("chat_illegal >", value, "chatIllegal");
            return (Criteria) this;
        }

        public Criteria andChatIllegalGreaterThanOrEqualTo(Integer value) {
            addCriterion("chat_illegal >=", value, "chatIllegal");
            return (Criteria) this;
        }

        public Criteria andChatIllegalLessThan(Integer value) {
            addCriterion("chat_illegal <", value, "chatIllegal");
            return (Criteria) this;
        }

        public Criteria andChatIllegalLessThanOrEqualTo(Integer value) {
            addCriterion("chat_illegal <=", value, "chatIllegal");
            return (Criteria) this;
        }

        public Criteria andChatIllegalIn(List<Integer> values) {
            addCriterion("chat_illegal in", values, "chatIllegal");
            return (Criteria) this;
        }

        public Criteria andChatIllegalNotIn(List<Integer> values) {
            addCriterion("chat_illegal not in", values, "chatIllegal");
            return (Criteria) this;
        }

        public Criteria andChatIllegalBetween(Integer value1, Integer value2) {
            addCriterion("chat_illegal between", value1, value2, "chatIllegal");
            return (Criteria) this;
        }

        public Criteria andChatIllegalNotBetween(Integer value1, Integer value2) {
            addCriterion("chat_illegal not between", value1, value2, "chatIllegal");
            return (Criteria) this;
        }

        public Criteria andChatViolationsIsNull() {
            addCriterion("chat_violations is null");
            return (Criteria) this;
        }

        public Criteria andChatViolationsIsNotNull() {
            addCriterion("chat_violations is not null");
            return (Criteria) this;
        }

        public Criteria andChatViolationsEqualTo(Integer value) {
            addCriterion("chat_violations =", value, "chatViolations");
            return (Criteria) this;
        }

        public Criteria andChatViolationsNotEqualTo(Integer value) {
            addCriterion("chat_violations <>", value, "chatViolations");
            return (Criteria) this;
        }

        public Criteria andChatViolationsGreaterThan(Integer value) {
            addCriterion("chat_violations >", value, "chatViolations");
            return (Criteria) this;
        }

        public Criteria andChatViolationsGreaterThanOrEqualTo(Integer value) {
            addCriterion("chat_violations >=", value, "chatViolations");
            return (Criteria) this;
        }

        public Criteria andChatViolationsLessThan(Integer value) {
            addCriterion("chat_violations <", value, "chatViolations");
            return (Criteria) this;
        }

        public Criteria andChatViolationsLessThanOrEqualTo(Integer value) {
            addCriterion("chat_violations <=", value, "chatViolations");
            return (Criteria) this;
        }

        public Criteria andChatViolationsIn(List<Integer> values) {
            addCriterion("chat_violations in", values, "chatViolations");
            return (Criteria) this;
        }

        public Criteria andChatViolationsNotIn(List<Integer> values) {
            addCriterion("chat_violations not in", values, "chatViolations");
            return (Criteria) this;
        }

        public Criteria andChatViolationsBetween(Integer value1, Integer value2) {
            addCriterion("chat_violations between", value1, value2, "chatViolations");
            return (Criteria) this;
        }

        public Criteria andChatViolationsNotBetween(Integer value1, Integer value2) {
            addCriterion("chat_violations not between", value1, value2, "chatViolations");
            return (Criteria) this;
        }

        public Criteria andAccountApplyTimeIsNull() {
            addCriterion("account_apply_time is null");
            return (Criteria) this;
        }

        public Criteria andAccountApplyTimeIsNotNull() {
            addCriterion("account_apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccountApplyTimeEqualTo(Date value) {
            addCriterion("account_apply_time =", value, "accountApplyTime");
            return (Criteria) this;
        }

        public Criteria andAccountApplyTimeNotEqualTo(Date value) {
            addCriterion("account_apply_time <>", value, "accountApplyTime");
            return (Criteria) this;
        }

        public Criteria andAccountApplyTimeGreaterThan(Date value) {
            addCriterion("account_apply_time >", value, "accountApplyTime");
            return (Criteria) this;
        }

        public Criteria andAccountApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("account_apply_time >=", value, "accountApplyTime");
            return (Criteria) this;
        }

        public Criteria andAccountApplyTimeLessThan(Date value) {
            addCriterion("account_apply_time <", value, "accountApplyTime");
            return (Criteria) this;
        }

        public Criteria andAccountApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("account_apply_time <=", value, "accountApplyTime");
            return (Criteria) this;
        }

        public Criteria andAccountApplyTimeIn(List<Date> values) {
            addCriterion("account_apply_time in", values, "accountApplyTime");
            return (Criteria) this;
        }

        public Criteria andAccountApplyTimeNotIn(List<Date> values) {
            addCriterion("account_apply_time not in", values, "accountApplyTime");
            return (Criteria) this;
        }

        public Criteria andAccountApplyTimeBetween(Date value1, Date value2) {
            addCriterion("account_apply_time between", value1, value2, "accountApplyTime");
            return (Criteria) this;
        }

        public Criteria andAccountApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("account_apply_time not between", value1, value2, "accountApplyTime");
            return (Criteria) this;
        }

        public Criteria andChatStateIsNull() {
            addCriterion("chat_state is null");
            return (Criteria) this;
        }

        public Criteria andChatStateIsNotNull() {
            addCriterion("chat_state is not null");
            return (Criteria) this;
        }

        public Criteria andChatStateEqualTo(Integer value) {
            addCriterion("chat_state =", value, "chatState");
            return (Criteria) this;
        }

        public Criteria andChatStateNotEqualTo(Integer value) {
            addCriterion("chat_state <>", value, "chatState");
            return (Criteria) this;
        }

        public Criteria andChatStateGreaterThan(Integer value) {
            addCriterion("chat_state >", value, "chatState");
            return (Criteria) this;
        }

        public Criteria andChatStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("chat_state >=", value, "chatState");
            return (Criteria) this;
        }

        public Criteria andChatStateLessThan(Integer value) {
            addCriterion("chat_state <", value, "chatState");
            return (Criteria) this;
        }

        public Criteria andChatStateLessThanOrEqualTo(Integer value) {
            addCriterion("chat_state <=", value, "chatState");
            return (Criteria) this;
        }

        public Criteria andChatStateIn(List<Integer> values) {
            addCriterion("chat_state in", values, "chatState");
            return (Criteria) this;
        }

        public Criteria andChatStateNotIn(List<Integer> values) {
            addCriterion("chat_state not in", values, "chatState");
            return (Criteria) this;
        }

        public Criteria andChatStateBetween(Integer value1, Integer value2) {
            addCriterion("chat_state between", value1, value2, "chatState");
            return (Criteria) this;
        }

        public Criteria andChatStateNotBetween(Integer value1, Integer value2) {
            addCriterion("chat_state not between", value1, value2, "chatState");
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
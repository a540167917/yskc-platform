package com.yskc.pms.entity;

import com.yskc.pms.utile.PageResultUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsChatRecordExample extends PageResultUtils {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsChatRecordExample() {
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

        public Criteria andChatAccountIsNull() {
            addCriterion("chat_account is null");
            return (Criteria) this;
        }

        public Criteria andChatAccountIsNotNull() {
            addCriterion("chat_account is not null");
            return (Criteria) this;
        }

        public Criteria andChatAccountEqualTo(String value) {
            addCriterion("chat_account =", value, "chatAccount");
            return (Criteria) this;
        }

        public Criteria andChatAccountNotEqualTo(String value) {
            addCriterion("chat_account <>", value, "chatAccount");
            return (Criteria) this;
        }

        public Criteria andChatAccountGreaterThan(String value) {
            addCriterion("chat_account >", value, "chatAccount");
            return (Criteria) this;
        }

        public Criteria andChatAccountGreaterThanOrEqualTo(String value) {
            addCriterion("chat_account >=", value, "chatAccount");
            return (Criteria) this;
        }

        public Criteria andChatAccountLessThan(String value) {
            addCriterion("chat_account <", value, "chatAccount");
            return (Criteria) this;
        }

        public Criteria andChatAccountLessThanOrEqualTo(String value) {
            addCriterion("chat_account <=", value, "chatAccount");
            return (Criteria) this;
        }

        public Criteria andChatAccountLike(String value) {
            addCriterion("chat_account like", value, "chatAccount");
            return (Criteria) this;
        }

        public Criteria andChatAccountNotLike(String value) {
            addCriterion("chat_account not like", value, "chatAccount");
            return (Criteria) this;
        }

        public Criteria andChatAccountIn(List<String> values) {
            addCriterion("chat_account in", values, "chatAccount");
            return (Criteria) this;
        }

        public Criteria andChatAccountNotIn(List<String> values) {
            addCriterion("chat_account not in", values, "chatAccount");
            return (Criteria) this;
        }

        public Criteria andChatAccountBetween(String value1, String value2) {
            addCriterion("chat_account between", value1, value2, "chatAccount");
            return (Criteria) this;
        }

        public Criteria andChatAccountNotBetween(String value1, String value2) {
            addCriterion("chat_account not between", value1, value2, "chatAccount");
            return (Criteria) this;
        }

        public Criteria andChatFilePathIsNull() {
            addCriterion("chat_file_path is null");
            return (Criteria) this;
        }

        public Criteria andChatFilePathIsNotNull() {
            addCriterion("chat_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andChatFilePathEqualTo(String value) {
            addCriterion("chat_file_path =", value, "chatFilePath");
            return (Criteria) this;
        }

        public Criteria andChatFilePathNotEqualTo(String value) {
            addCriterion("chat_file_path <>", value, "chatFilePath");
            return (Criteria) this;
        }

        public Criteria andChatFilePathGreaterThan(String value) {
            addCriterion("chat_file_path >", value, "chatFilePath");
            return (Criteria) this;
        }

        public Criteria andChatFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("chat_file_path >=", value, "chatFilePath");
            return (Criteria) this;
        }

        public Criteria andChatFilePathLessThan(String value) {
            addCriterion("chat_file_path <", value, "chatFilePath");
            return (Criteria) this;
        }

        public Criteria andChatFilePathLessThanOrEqualTo(String value) {
            addCriterion("chat_file_path <=", value, "chatFilePath");
            return (Criteria) this;
        }

        public Criteria andChatFilePathLike(String value) {
            addCriterion("chat_file_path like", value, "chatFilePath");
            return (Criteria) this;
        }

        public Criteria andChatFilePathNotLike(String value) {
            addCriterion("chat_file_path not like", value, "chatFilePath");
            return (Criteria) this;
        }

        public Criteria andChatFilePathIn(List<String> values) {
            addCriterion("chat_file_path in", values, "chatFilePath");
            return (Criteria) this;
        }

        public Criteria andChatFilePathNotIn(List<String> values) {
            addCriterion("chat_file_path not in", values, "chatFilePath");
            return (Criteria) this;
        }

        public Criteria andChatFilePathBetween(String value1, String value2) {
            addCriterion("chat_file_path between", value1, value2, "chatFilePath");
            return (Criteria) this;
        }

        public Criteria andChatFilePathNotBetween(String value1, String value2) {
            addCriterion("chat_file_path not between", value1, value2, "chatFilePath");
            return (Criteria) this;
        }

        public Criteria andChatPicturePathIsNull() {
            addCriterion("chat_picture_path is null");
            return (Criteria) this;
        }

        public Criteria andChatPicturePathIsNotNull() {
            addCriterion("chat_picture_path is not null");
            return (Criteria) this;
        }

        public Criteria andChatPicturePathEqualTo(String value) {
            addCriterion("chat_picture_path =", value, "chatPicturePath");
            return (Criteria) this;
        }

        public Criteria andChatPicturePathNotEqualTo(String value) {
            addCriterion("chat_picture_path <>", value, "chatPicturePath");
            return (Criteria) this;
        }

        public Criteria andChatPicturePathGreaterThan(String value) {
            addCriterion("chat_picture_path >", value, "chatPicturePath");
            return (Criteria) this;
        }

        public Criteria andChatPicturePathGreaterThanOrEqualTo(String value) {
            addCriterion("chat_picture_path >=", value, "chatPicturePath");
            return (Criteria) this;
        }

        public Criteria andChatPicturePathLessThan(String value) {
            addCriterion("chat_picture_path <", value, "chatPicturePath");
            return (Criteria) this;
        }

        public Criteria andChatPicturePathLessThanOrEqualTo(String value) {
            addCriterion("chat_picture_path <=", value, "chatPicturePath");
            return (Criteria) this;
        }

        public Criteria andChatPicturePathLike(String value) {
            addCriterion("chat_picture_path like", value, "chatPicturePath");
            return (Criteria) this;
        }

        public Criteria andChatPicturePathNotLike(String value) {
            addCriterion("chat_picture_path not like", value, "chatPicturePath");
            return (Criteria) this;
        }

        public Criteria andChatPicturePathIn(List<String> values) {
            addCriterion("chat_picture_path in", values, "chatPicturePath");
            return (Criteria) this;
        }

        public Criteria andChatPicturePathNotIn(List<String> values) {
            addCriterion("chat_picture_path not in", values, "chatPicturePath");
            return (Criteria) this;
        }

        public Criteria andChatPicturePathBetween(String value1, String value2) {
            addCriterion("chat_picture_path between", value1, value2, "chatPicturePath");
            return (Criteria) this;
        }

        public Criteria andChatPicturePathNotBetween(String value1, String value2) {
            addCriterion("chat_picture_path not between", value1, value2, "chatPicturePath");
            return (Criteria) this;
        }

        public Criteria andConnectionLocationIsNull() {
            addCriterion("connection_location is null");
            return (Criteria) this;
        }

        public Criteria andConnectionLocationIsNotNull() {
            addCriterion("connection_location is not null");
            return (Criteria) this;
        }

        public Criteria andConnectionLocationEqualTo(String value) {
            addCriterion("connection_location =", value, "connectionLocation");
            return (Criteria) this;
        }

        public Criteria andConnectionLocationNotEqualTo(String value) {
            addCriterion("connection_location <>", value, "connectionLocation");
            return (Criteria) this;
        }

        public Criteria andConnectionLocationGreaterThan(String value) {
            addCriterion("connection_location >", value, "connectionLocation");
            return (Criteria) this;
        }

        public Criteria andConnectionLocationGreaterThanOrEqualTo(String value) {
            addCriterion("connection_location >=", value, "connectionLocation");
            return (Criteria) this;
        }

        public Criteria andConnectionLocationLessThan(String value) {
            addCriterion("connection_location <", value, "connectionLocation");
            return (Criteria) this;
        }

        public Criteria andConnectionLocationLessThanOrEqualTo(String value) {
            addCriterion("connection_location <=", value, "connectionLocation");
            return (Criteria) this;
        }

        public Criteria andConnectionLocationLike(String value) {
            addCriterion("connection_location like", value, "connectionLocation");
            return (Criteria) this;
        }

        public Criteria andConnectionLocationNotLike(String value) {
            addCriterion("connection_location not like", value, "connectionLocation");
            return (Criteria) this;
        }

        public Criteria andConnectionLocationIn(List<String> values) {
            addCriterion("connection_location in", values, "connectionLocation");
            return (Criteria) this;
        }

        public Criteria andConnectionLocationNotIn(List<String> values) {
            addCriterion("connection_location not in", values, "connectionLocation");
            return (Criteria) this;
        }

        public Criteria andConnectionLocationBetween(String value1, String value2) {
            addCriterion("connection_location between", value1, value2, "connectionLocation");
            return (Criteria) this;
        }

        public Criteria andConnectionLocationNotBetween(String value1, String value2) {
            addCriterion("connection_location not between", value1, value2, "connectionLocation");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNull() {
            addCriterion("record_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNotNull() {
            addCriterion("record_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeEqualTo(Date value) {
            addCriterion("record_time =", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotEqualTo(Date value) {
            addCriterion("record_time <>", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThan(Date value) {
            addCriterion("record_time >", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("record_time >=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThan(Date value) {
            addCriterion("record_time <", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("record_time <=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIn(List<Date> values) {
            addCriterion("record_time in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotIn(List<Date> values) {
            addCriterion("record_time not in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeBetween(Date value1, Date value2) {
            addCriterion("record_time between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("record_time not between", value1, value2, "recordTime");
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
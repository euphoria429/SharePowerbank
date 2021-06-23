package com.hcx.bean;

import java.util.ArrayList;
import java.util.List;

public class PowerbankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PowerbankExample() {
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

        public Criteria andPobkIdIsNull() {
            addCriterion("pobk_id is null");
            return (Criteria) this;
        }

        public Criteria andPobkIdIsNotNull() {
            addCriterion("pobk_id is not null");
            return (Criteria) this;
        }

        public Criteria andPobkIdEqualTo(Integer value) {
            addCriterion("pobk_id =", value, "pobkId");
            return (Criteria) this;
        }

        public Criteria andPobkIdNotEqualTo(Integer value) {
            addCriterion("pobk_id <>", value, "pobkId");
            return (Criteria) this;
        }

        public Criteria andPobkIdGreaterThan(Integer value) {
            addCriterion("pobk_id >", value, "pobkId");
            return (Criteria) this;
        }

        public Criteria andPobkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pobk_id >=", value, "pobkId");
            return (Criteria) this;
        }

        public Criteria andPobkIdLessThan(Integer value) {
            addCriterion("pobk_id <", value, "pobkId");
            return (Criteria) this;
        }

        public Criteria andPobkIdLessThanOrEqualTo(Integer value) {
            addCriterion("pobk_id <=", value, "pobkId");
            return (Criteria) this;
        }

        public Criteria andPobkIdIn(List<Integer> values) {
            addCriterion("pobk_id in", values, "pobkId");
            return (Criteria) this;
        }

        public Criteria andPobkIdNotIn(List<Integer> values) {
            addCriterion("pobk_id not in", values, "pobkId");
            return (Criteria) this;
        }

        public Criteria andPobkIdBetween(Integer value1, Integer value2) {
            addCriterion("pobk_id between", value1, value2, "pobkId");
            return (Criteria) this;
        }

        public Criteria andPobkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pobk_id not between", value1, value2, "pobkId");
            return (Criteria) this;
        }

        public Criteria andPobkCupboardIdIsNull() {
            addCriterion("pobk_cupboard_id is null");
            return (Criteria) this;
        }

        public Criteria andPobkCupboardIdIsNotNull() {
            addCriterion("pobk_cupboard_id is not null");
            return (Criteria) this;
        }

        public Criteria andPobkCupboardIdEqualTo(Integer value) {
            addCriterion("pobk_cupboard_id =", value, "pobkCupboardId");
            return (Criteria) this;
        }

        public Criteria andPobkCupboardIdNotEqualTo(Integer value) {
            addCriterion("pobk_cupboard_id <>", value, "pobkCupboardId");
            return (Criteria) this;
        }

        public Criteria andPobkCupboardIdGreaterThan(Integer value) {
            addCriterion("pobk_cupboard_id >", value, "pobkCupboardId");
            return (Criteria) this;
        }

        public Criteria andPobkCupboardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pobk_cupboard_id >=", value, "pobkCupboardId");
            return (Criteria) this;
        }

        public Criteria andPobkCupboardIdLessThan(Integer value) {
            addCriterion("pobk_cupboard_id <", value, "pobkCupboardId");
            return (Criteria) this;
        }

        public Criteria andPobkCupboardIdLessThanOrEqualTo(Integer value) {
            addCriterion("pobk_cupboard_id <=", value, "pobkCupboardId");
            return (Criteria) this;
        }

        public Criteria andPobkCupboardIdIn(List<Integer> values) {
            addCriterion("pobk_cupboard_id in", values, "pobkCupboardId");
            return (Criteria) this;
        }

        public Criteria andPobkCupboardIdNotIn(List<Integer> values) {
            addCriterion("pobk_cupboard_id not in", values, "pobkCupboardId");
            return (Criteria) this;
        }

        public Criteria andPobkCupboardIdBetween(Integer value1, Integer value2) {
            addCriterion("pobk_cupboard_id between", value1, value2, "pobkCupboardId");
            return (Criteria) this;
        }

        public Criteria andPobkCupboardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pobk_cupboard_id not between", value1, value2, "pobkCupboardId");
            return (Criteria) this;
        }

        public Criteria andPobkStatusIsNull() {
            addCriterion("pobk_status is null");
            return (Criteria) this;
        }

        public Criteria andPobkStatusIsNotNull() {
            addCriterion("pobk_status is not null");
            return (Criteria) this;
        }

        public Criteria andPobkStatusEqualTo(String value) {
            addCriterion("pobk_status =", value, "pobkStatus");
            return (Criteria) this;
        }

        public Criteria andPobkStatusNotEqualTo(String value) {
            addCriterion("pobk_status <>", value, "pobkStatus");
            return (Criteria) this;
        }

        public Criteria andPobkStatusGreaterThan(String value) {
            addCriterion("pobk_status >", value, "pobkStatus");
            return (Criteria) this;
        }

        public Criteria andPobkStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pobk_status >=", value, "pobkStatus");
            return (Criteria) this;
        }

        public Criteria andPobkStatusLessThan(String value) {
            addCriterion("pobk_status <", value, "pobkStatus");
            return (Criteria) this;
        }

        public Criteria andPobkStatusLessThanOrEqualTo(String value) {
            addCriterion("pobk_status <=", value, "pobkStatus");
            return (Criteria) this;
        }

        public Criteria andPobkStatusLike(String value) {
            addCriterion("pobk_status like", value, "pobkStatus");
            return (Criteria) this;
        }

        public Criteria andPobkStatusNotLike(String value) {
            addCriterion("pobk_status not like", value, "pobkStatus");
            return (Criteria) this;
        }

        public Criteria andPobkStatusIn(List<String> values) {
            addCriterion("pobk_status in", values, "pobkStatus");
            return (Criteria) this;
        }

        public Criteria andPobkStatusNotIn(List<String> values) {
            addCriterion("pobk_status not in", values, "pobkStatus");
            return (Criteria) this;
        }

        public Criteria andPobkStatusBetween(String value1, String value2) {
            addCriterion("pobk_status between", value1, value2, "pobkStatus");
            return (Criteria) this;
        }

        public Criteria andPobkStatusNotBetween(String value1, String value2) {
            addCriterion("pobk_status not between", value1, value2, "pobkStatus");
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
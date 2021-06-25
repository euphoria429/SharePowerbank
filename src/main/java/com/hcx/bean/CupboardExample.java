package com.hcx.bean;

import java.util.ArrayList;
import java.util.List;

public class CupboardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CupboardExample() {
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

        public Criteria andCupboardIdIsNull() {
            addCriterion("cupboard_id is null");
            return (Criteria) this;
        }

        public Criteria andCupboardIdIsNotNull() {
            addCriterion("cupboard_id is not null");
            return (Criteria) this;
        }

        public Criteria andCupboardIdEqualTo(Integer value) {
            addCriterion("cupboard_id =", value, "cupboardId");
            return (Criteria) this;
        }

        public Criteria andCupboardIdNotEqualTo(Integer value) {
            addCriterion("cupboard_id <>", value, "cupboardId");
            return (Criteria) this;
        }

        public Criteria andCupboardIdGreaterThan(Integer value) {
            addCriterion("cupboard_id >", value, "cupboardId");
            return (Criteria) this;
        }

        public Criteria andCupboardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cupboard_id >=", value, "cupboardId");
            return (Criteria) this;
        }

        public Criteria andCupboardIdLessThan(Integer value) {
            addCriterion("cupboard_id <", value, "cupboardId");
            return (Criteria) this;
        }

        public Criteria andCupboardIdLessThanOrEqualTo(Integer value) {
            addCriterion("cupboard_id <=", value, "cupboardId");
            return (Criteria) this;
        }

        public Criteria andCupboardIdIn(List<Integer> values) {
            addCriterion("cupboard_id in", values, "cupboardId");
            return (Criteria) this;
        }

        public Criteria andCupboardIdNotIn(List<Integer> values) {
            addCriterion("cupboard_id not in", values, "cupboardId");
            return (Criteria) this;
        }

        public Criteria andCupboardIdBetween(Integer value1, Integer value2) {
            addCriterion("cupboard_id between", value1, value2, "cupboardId");
            return (Criteria) this;
        }

        public Criteria andCupboardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cupboard_id not between", value1, value2, "cupboardId");
            return (Criteria) this;
        }

        public Criteria andLocationIdIsNull() {
            addCriterion("location_id is null");
            return (Criteria) this;
        }

        public Criteria andLocationIdIsNotNull() {
            addCriterion("location_id is not null");
            return (Criteria) this;
        }

        public Criteria andLocationIdEqualTo(Integer value) {
            addCriterion("location_id =", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotEqualTo(Integer value) {
            addCriterion("location_id <>", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThan(Integer value) {
            addCriterion("location_id >", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("location_id >=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThan(Integer value) {
            addCriterion("location_id <", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("location_id <=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdIn(List<Integer> values) {
            addCriterion("location_id in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotIn(List<Integer> values) {
            addCriterion("location_id not in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdBetween(Integer value1, Integer value2) {
            addCriterion("location_id between", value1, value2, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("location_id not between", value1, value2, "locationId");
            return (Criteria) this;
        }

        public Criteria andPobkNumIsNull() {
            addCriterion("pobk_num is null");
            return (Criteria) this;
        }

        public Criteria andPobkNumIsNotNull() {
            addCriterion("pobk_num is not null");
            return (Criteria) this;
        }

        public Criteria andPobkNumEqualTo(Integer value) {
            addCriterion("pobk_num =", value, "pobkNum");
            return (Criteria) this;
        }

        public Criteria andPobkNumNotEqualTo(Integer value) {
            addCriterion("pobk_num <>", value, "pobkNum");
            return (Criteria) this;
        }

        public Criteria andPobkNumGreaterThan(Integer value) {
            addCriterion("pobk_num >", value, "pobkNum");
            return (Criteria) this;
        }

        public Criteria andPobkNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pobk_num >=", value, "pobkNum");
            return (Criteria) this;
        }

        public Criteria andPobkNumLessThan(Integer value) {
            addCriterion("pobk_num <", value, "pobkNum");
            return (Criteria) this;
        }

        public Criteria andPobkNumLessThanOrEqualTo(Integer value) {
            addCriterion("pobk_num <=", value, "pobkNum");
            return (Criteria) this;
        }

        public Criteria andPobkNumIn(List<Integer> values) {
            addCriterion("pobk_num in", values, "pobkNum");
            return (Criteria) this;
        }

        public Criteria andPobkNumNotIn(List<Integer> values) {
            addCriterion("pobk_num not in", values, "pobkNum");
            return (Criteria) this;
        }

        public Criteria andPobkNumBetween(Integer value1, Integer value2) {
            addCriterion("pobk_num between", value1, value2, "pobkNum");
            return (Criteria) this;
        }

        public Criteria andPobkNumNotBetween(Integer value1, Integer value2) {
            addCriterion("pobk_num not between", value1, value2, "pobkNum");
            return (Criteria) this;
        }

        public Criteria andPobkAvailableNumIsNull() {
            addCriterion("pobk_available_num is null");
            return (Criteria) this;
        }

        public Criteria andPobkAvailableNumIsNotNull() {
            addCriterion("pobk_available_num is not null");
            return (Criteria) this;
        }

        public Criteria andPobkAvailableNumEqualTo(Integer value) {
            addCriterion("pobk_available_num =", value, "pobkAvailableNum");
            return (Criteria) this;
        }

        public Criteria andPobkAvailableNumNotEqualTo(Integer value) {
            addCriterion("pobk_available_num <>", value, "pobkAvailableNum");
            return (Criteria) this;
        }

        public Criteria andPobkAvailableNumGreaterThan(Integer value) {
            addCriterion("pobk_available_num >", value, "pobkAvailableNum");
            return (Criteria) this;
        }

        public Criteria andPobkAvailableNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pobk_available_num >=", value, "pobkAvailableNum");
            return (Criteria) this;
        }

        public Criteria andPobkAvailableNumLessThan(Integer value) {
            addCriterion("pobk_available_num <", value, "pobkAvailableNum");
            return (Criteria) this;
        }

        public Criteria andPobkAvailableNumLessThanOrEqualTo(Integer value) {
            addCriterion("pobk_available_num <=", value, "pobkAvailableNum");
            return (Criteria) this;
        }

        public Criteria andPobkAvailableNumIn(List<Integer> values) {
            addCriterion("pobk_available_num in", values, "pobkAvailableNum");
            return (Criteria) this;
        }

        public Criteria andPobkAvailableNumNotIn(List<Integer> values) {
            addCriterion("pobk_available_num not in", values, "pobkAvailableNum");
            return (Criteria) this;
        }

        public Criteria andPobkAvailableNumBetween(Integer value1, Integer value2) {
            addCriterion("pobk_available_num between", value1, value2, "pobkAvailableNum");
            return (Criteria) this;
        }

        public Criteria andPobkAvailableNumNotBetween(Integer value1, Integer value2) {
            addCriterion("pobk_available_num not between", value1, value2, "pobkAvailableNum");
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
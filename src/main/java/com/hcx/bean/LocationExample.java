package com.hcx.bean;

import java.util.ArrayList;
import java.util.List;

public class LocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LocationExample() {
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

        public Criteria andLocationCityIsNull() {
            addCriterion("location_city is null");
            return (Criteria) this;
        }

        public Criteria andLocationCityIsNotNull() {
            addCriterion("location_city is not null");
            return (Criteria) this;
        }

        public Criteria andLocationCityEqualTo(String value) {
            addCriterion("location_city =", value, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityNotEqualTo(String value) {
            addCriterion("location_city <>", value, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityGreaterThan(String value) {
            addCriterion("location_city >", value, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityGreaterThanOrEqualTo(String value) {
            addCriterion("location_city >=", value, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityLessThan(String value) {
            addCriterion("location_city <", value, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityLessThanOrEqualTo(String value) {
            addCriterion("location_city <=", value, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityLike(String value) {
            addCriterion("location_city like", value, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityNotLike(String value) {
            addCriterion("location_city not like", value, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityIn(List<String> values) {
            addCriterion("location_city in", values, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityNotIn(List<String> values) {
            addCriterion("location_city not in", values, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityBetween(String value1, String value2) {
            addCriterion("location_city between", value1, value2, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationCityNotBetween(String value1, String value2) {
            addCriterion("location_city not between", value1, value2, "locationCity");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictIsNull() {
            addCriterion("location_district is null");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictIsNotNull() {
            addCriterion("location_district is not null");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictEqualTo(String value) {
            addCriterion("location_district =", value, "locationDistrict");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictNotEqualTo(String value) {
            addCriterion("location_district <>", value, "locationDistrict");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictGreaterThan(String value) {
            addCriterion("location_district >", value, "locationDistrict");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("location_district >=", value, "locationDistrict");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictLessThan(String value) {
            addCriterion("location_district <", value, "locationDistrict");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictLessThanOrEqualTo(String value) {
            addCriterion("location_district <=", value, "locationDistrict");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictLike(String value) {
            addCriterion("location_district like", value, "locationDistrict");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictNotLike(String value) {
            addCriterion("location_district not like", value, "locationDistrict");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictIn(List<String> values) {
            addCriterion("location_district in", values, "locationDistrict");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictNotIn(List<String> values) {
            addCriterion("location_district not in", values, "locationDistrict");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictBetween(String value1, String value2) {
            addCriterion("location_district between", value1, value2, "locationDistrict");
            return (Criteria) this;
        }

        public Criteria andLocationDistrictNotBetween(String value1, String value2) {
            addCriterion("location_district not between", value1, value2, "locationDistrict");
            return (Criteria) this;
        }

        public Criteria andLocationAddressIsNull() {
            addCriterion("location_address is null");
            return (Criteria) this;
        }

        public Criteria andLocationAddressIsNotNull() {
            addCriterion("location_address is not null");
            return (Criteria) this;
        }

        public Criteria andLocationAddressEqualTo(String value) {
            addCriterion("location_address =", value, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressNotEqualTo(String value) {
            addCriterion("location_address <>", value, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressGreaterThan(String value) {
            addCriterion("location_address >", value, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressGreaterThanOrEqualTo(String value) {
            addCriterion("location_address >=", value, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressLessThan(String value) {
            addCriterion("location_address <", value, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressLessThanOrEqualTo(String value) {
            addCriterion("location_address <=", value, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressLike(String value) {
            addCriterion("location_address like", value, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressNotLike(String value) {
            addCriterion("location_address not like", value, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressIn(List<String> values) {
            addCriterion("location_address in", values, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressNotIn(List<String> values) {
            addCriterion("location_address not in", values, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressBetween(String value1, String value2) {
            addCriterion("location_address between", value1, value2, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAddressNotBetween(String value1, String value2) {
            addCriterion("location_address not between", value1, value2, "locationAddress");
            return (Criteria) this;
        }

        public Criteria andLocationAliasIsNull() {
            addCriterion("location_alias is null");
            return (Criteria) this;
        }

        public Criteria andLocationAliasIsNotNull() {
            addCriterion("location_alias is not null");
            return (Criteria) this;
        }

        public Criteria andLocationAliasEqualTo(String value) {
            addCriterion("location_alias =", value, "locationAlias");
            return (Criteria) this;
        }

        public Criteria andLocationAliasNotEqualTo(String value) {
            addCriterion("location_alias <>", value, "locationAlias");
            return (Criteria) this;
        }

        public Criteria andLocationAliasGreaterThan(String value) {
            addCriterion("location_alias >", value, "locationAlias");
            return (Criteria) this;
        }

        public Criteria andLocationAliasGreaterThanOrEqualTo(String value) {
            addCriterion("location_alias >=", value, "locationAlias");
            return (Criteria) this;
        }

        public Criteria andLocationAliasLessThan(String value) {
            addCriterion("location_alias <", value, "locationAlias");
            return (Criteria) this;
        }

        public Criteria andLocationAliasLessThanOrEqualTo(String value) {
            addCriterion("location_alias <=", value, "locationAlias");
            return (Criteria) this;
        }

        public Criteria andLocationAliasLike(String value) {
            addCriterion("location_alias like", value, "locationAlias");
            return (Criteria) this;
        }

        public Criteria andLocationAliasNotLike(String value) {
            addCriterion("location_alias not like", value, "locationAlias");
            return (Criteria) this;
        }

        public Criteria andLocationAliasIn(List<String> values) {
            addCriterion("location_alias in", values, "locationAlias");
            return (Criteria) this;
        }

        public Criteria andLocationAliasNotIn(List<String> values) {
            addCriterion("location_alias not in", values, "locationAlias");
            return (Criteria) this;
        }

        public Criteria andLocationAliasBetween(String value1, String value2) {
            addCriterion("location_alias between", value1, value2, "locationAlias");
            return (Criteria) this;
        }

        public Criteria andLocationAliasNotBetween(String value1, String value2) {
            addCriterion("location_alias not between", value1, value2, "locationAlias");
            return (Criteria) this;
        }

        public Criteria andLocationAmountIsNull() {
            addCriterion("location_amount is null");
            return (Criteria) this;
        }

        public Criteria andLocationAmountIsNotNull() {
            addCriterion("location_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLocationAmountEqualTo(Integer value) {
            addCriterion("location_amount =", value, "locationAmount");
            return (Criteria) this;
        }

        public Criteria andLocationAmountNotEqualTo(Integer value) {
            addCriterion("location_amount <>", value, "locationAmount");
            return (Criteria) this;
        }

        public Criteria andLocationAmountGreaterThan(Integer value) {
            addCriterion("location_amount >", value, "locationAmount");
            return (Criteria) this;
        }

        public Criteria andLocationAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("location_amount >=", value, "locationAmount");
            return (Criteria) this;
        }

        public Criteria andLocationAmountLessThan(Integer value) {
            addCriterion("location_amount <", value, "locationAmount");
            return (Criteria) this;
        }

        public Criteria andLocationAmountLessThanOrEqualTo(Integer value) {
            addCriterion("location_amount <=", value, "locationAmount");
            return (Criteria) this;
        }

        public Criteria andLocationAmountIn(List<Integer> values) {
            addCriterion("location_amount in", values, "locationAmount");
            return (Criteria) this;
        }

        public Criteria andLocationAmountNotIn(List<Integer> values) {
            addCriterion("location_amount not in", values, "locationAmount");
            return (Criteria) this;
        }

        public Criteria andLocationAmountBetween(Integer value1, Integer value2) {
            addCriterion("location_amount between", value1, value2, "locationAmount");
            return (Criteria) this;
        }

        public Criteria andLocationAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("location_amount not between", value1, value2, "locationAmount");
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
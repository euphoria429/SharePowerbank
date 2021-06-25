package com.hcx.bean;

import java.util.ArrayList;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderUseridIsNull() {
            addCriterion("order_userid is null");
            return (Criteria) this;
        }

        public Criteria andOrderUseridIsNotNull() {
            addCriterion("order_userid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUseridEqualTo(Integer value) {
            addCriterion("order_userid =", value, "orderUserid");
            return (Criteria) this;
        }

        public Criteria andOrderUseridNotEqualTo(Integer value) {
            addCriterion("order_userid <>", value, "orderUserid");
            return (Criteria) this;
        }

        public Criteria andOrderUseridGreaterThan(Integer value) {
            addCriterion("order_userid >", value, "orderUserid");
            return (Criteria) this;
        }

        public Criteria andOrderUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_userid >=", value, "orderUserid");
            return (Criteria) this;
        }

        public Criteria andOrderUseridLessThan(Integer value) {
            addCriterion("order_userid <", value, "orderUserid");
            return (Criteria) this;
        }

        public Criteria andOrderUseridLessThanOrEqualTo(Integer value) {
            addCriterion("order_userid <=", value, "orderUserid");
            return (Criteria) this;
        }

        public Criteria andOrderUseridIn(List<Integer> values) {
            addCriterion("order_userid in", values, "orderUserid");
            return (Criteria) this;
        }

        public Criteria andOrderUseridNotIn(List<Integer> values) {
            addCriterion("order_userid not in", values, "orderUserid");
            return (Criteria) this;
        }

        public Criteria andOrderUseridBetween(Integer value1, Integer value2) {
            addCriterion("order_userid between", value1, value2, "orderUserid");
            return (Criteria) this;
        }

        public Criteria andOrderUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("order_userid not between", value1, value2, "orderUserid");
            return (Criteria) this;
        }

        public Criteria andOrderPobkidIsNull() {
            addCriterion("order_pobkid is null");
            return (Criteria) this;
        }

        public Criteria andOrderPobkidIsNotNull() {
            addCriterion("order_pobkid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPobkidEqualTo(Integer value) {
            addCriterion("order_pobkid =", value, "orderPobkid");
            return (Criteria) this;
        }

        public Criteria andOrderPobkidNotEqualTo(Integer value) {
            addCriterion("order_pobkid <>", value, "orderPobkid");
            return (Criteria) this;
        }

        public Criteria andOrderPobkidGreaterThan(Integer value) {
            addCriterion("order_pobkid >", value, "orderPobkid");
            return (Criteria) this;
        }

        public Criteria andOrderPobkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_pobkid >=", value, "orderPobkid");
            return (Criteria) this;
        }

        public Criteria andOrderPobkidLessThan(Integer value) {
            addCriterion("order_pobkid <", value, "orderPobkid");
            return (Criteria) this;
        }

        public Criteria andOrderPobkidLessThanOrEqualTo(Integer value) {
            addCriterion("order_pobkid <=", value, "orderPobkid");
            return (Criteria) this;
        }

        public Criteria andOrderPobkidIn(List<Integer> values) {
            addCriterion("order_pobkid in", values, "orderPobkid");
            return (Criteria) this;
        }

        public Criteria andOrderPobkidNotIn(List<Integer> values) {
            addCriterion("order_pobkid not in", values, "orderPobkid");
            return (Criteria) this;
        }

        public Criteria andOrderPobkidBetween(Integer value1, Integer value2) {
            addCriterion("order_pobkid between", value1, value2, "orderPobkid");
            return (Criteria) this;
        }

        public Criteria andOrderPobkidNotBetween(Integer value1, Integer value2) {
            addCriterion("order_pobkid not between", value1, value2, "orderPobkid");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeIsNull() {
            addCriterion("order_createtime is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeIsNotNull() {
            addCriterion("order_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeEqualTo(String value) {
            addCriterion("order_createtime =", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeNotEqualTo(String value) {
            addCriterion("order_createtime <>", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeGreaterThan(String value) {
            addCriterion("order_createtime >", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("order_createtime >=", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeLessThan(String value) {
            addCriterion("order_createtime <", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("order_createtime <=", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeLike(String value) {
            addCriterion("order_createtime like", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeNotLike(String value) {
            addCriterion("order_createtime not like", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeIn(List<String> values) {
            addCriterion("order_createtime in", values, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeNotIn(List<String> values) {
            addCriterion("order_createtime not in", values, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeBetween(String value1, String value2) {
            addCriterion("order_createtime between", value1, value2, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeNotBetween(String value1, String value2) {
            addCriterion("order_createtime not between", value1, value2, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishtimeIsNull() {
            addCriterion("order_finishtime is null");
            return (Criteria) this;
        }

        public Criteria andOrderFinishtimeIsNotNull() {
            addCriterion("order_finishtime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFinishtimeEqualTo(String value) {
            addCriterion("order_finishtime =", value, "orderFinishtime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishtimeNotEqualTo(String value) {
            addCriterion("order_finishtime <>", value, "orderFinishtime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishtimeGreaterThan(String value) {
            addCriterion("order_finishtime >", value, "orderFinishtime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishtimeGreaterThanOrEqualTo(String value) {
            addCriterion("order_finishtime >=", value, "orderFinishtime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishtimeLessThan(String value) {
            addCriterion("order_finishtime <", value, "orderFinishtime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishtimeLessThanOrEqualTo(String value) {
            addCriterion("order_finishtime <=", value, "orderFinishtime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishtimeLike(String value) {
            addCriterion("order_finishtime like", value, "orderFinishtime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishtimeNotLike(String value) {
            addCriterion("order_finishtime not like", value, "orderFinishtime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishtimeIn(List<String> values) {
            addCriterion("order_finishtime in", values, "orderFinishtime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishtimeNotIn(List<String> values) {
            addCriterion("order_finishtime not in", values, "orderFinishtime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishtimeBetween(String value1, String value2) {
            addCriterion("order_finishtime between", value1, value2, "orderFinishtime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishtimeNotBetween(String value1, String value2) {
            addCriterion("order_finishtime not between", value1, value2, "orderFinishtime");
            return (Criteria) this;
        }

        public Criteria andOrderCostIsNull() {
            addCriterion("order_cost is null");
            return (Criteria) this;
        }

        public Criteria andOrderCostIsNotNull() {
            addCriterion("order_cost is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCostEqualTo(Integer value) {
            addCriterion("order_cost =", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostNotEqualTo(Integer value) {
            addCriterion("order_cost <>", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostGreaterThan(Integer value) {
            addCriterion("order_cost >", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_cost >=", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostLessThan(Integer value) {
            addCriterion("order_cost <", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostLessThanOrEqualTo(Integer value) {
            addCriterion("order_cost <=", value, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostIn(List<Integer> values) {
            addCriterion("order_cost in", values, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostNotIn(List<Integer> values) {
            addCriterion("order_cost not in", values, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostBetween(Integer value1, Integer value2) {
            addCriterion("order_cost between", value1, value2, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderCostNotBetween(Integer value1, Integer value2) {
            addCriterion("order_cost not between", value1, value2, "orderCost");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
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
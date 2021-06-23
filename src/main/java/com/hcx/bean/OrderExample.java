package com.hcx.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderUserIdIsNull() {
            addCriterion("order_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIsNotNull() {
            addCriterion("order_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdEqualTo(Integer value) {
            addCriterion("order_user_id =", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotEqualTo(Integer value) {
            addCriterion("order_user_id <>", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdGreaterThan(Integer value) {
            addCriterion("order_user_id >", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_user_id >=", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdLessThan(Integer value) {
            addCriterion("order_user_id <", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_user_id <=", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIn(List<Integer> values) {
            addCriterion("order_user_id in", values, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotIn(List<Integer> values) {
            addCriterion("order_user_id not in", values, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdBetween(Integer value1, Integer value2) {
            addCriterion("order_user_id between", value1, value2, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_user_id not between", value1, value2, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderLentCupboardIdIsNull() {
            addCriterion("order_lent_cupboard_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderLentCupboardIdIsNotNull() {
            addCriterion("order_lent_cupboard_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLentCupboardIdEqualTo(Integer value) {
            addCriterion("order_lent_cupboard_id =", value, "orderLentCupboardId");
            return (Criteria) this;
        }

        public Criteria andOrderLentCupboardIdNotEqualTo(Integer value) {
            addCriterion("order_lent_cupboard_id <>", value, "orderLentCupboardId");
            return (Criteria) this;
        }

        public Criteria andOrderLentCupboardIdGreaterThan(Integer value) {
            addCriterion("order_lent_cupboard_id >", value, "orderLentCupboardId");
            return (Criteria) this;
        }

        public Criteria andOrderLentCupboardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_lent_cupboard_id >=", value, "orderLentCupboardId");
            return (Criteria) this;
        }

        public Criteria andOrderLentCupboardIdLessThan(Integer value) {
            addCriterion("order_lent_cupboard_id <", value, "orderLentCupboardId");
            return (Criteria) this;
        }

        public Criteria andOrderLentCupboardIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_lent_cupboard_id <=", value, "orderLentCupboardId");
            return (Criteria) this;
        }

        public Criteria andOrderLentCupboardIdIn(List<Integer> values) {
            addCriterion("order_lent_cupboard_id in", values, "orderLentCupboardId");
            return (Criteria) this;
        }

        public Criteria andOrderLentCupboardIdNotIn(List<Integer> values) {
            addCriterion("order_lent_cupboard_id not in", values, "orderLentCupboardId");
            return (Criteria) this;
        }

        public Criteria andOrderLentCupboardIdBetween(Integer value1, Integer value2) {
            addCriterion("order_lent_cupboard_id between", value1, value2, "orderLentCupboardId");
            return (Criteria) this;
        }

        public Criteria andOrderLentCupboardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_lent_cupboard_id not between", value1, value2, "orderLentCupboardId");
            return (Criteria) this;
        }

        public Criteria andOrderPobkIdIsNull() {
            addCriterion("order_pobk_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderPobkIdIsNotNull() {
            addCriterion("order_pobk_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPobkIdEqualTo(Integer value) {
            addCriterion("order_pobk_id =", value, "orderPobkId");
            return (Criteria) this;
        }

        public Criteria andOrderPobkIdNotEqualTo(Integer value) {
            addCriterion("order_pobk_id <>", value, "orderPobkId");
            return (Criteria) this;
        }

        public Criteria andOrderPobkIdGreaterThan(Integer value) {
            addCriterion("order_pobk_id >", value, "orderPobkId");
            return (Criteria) this;
        }

        public Criteria andOrderPobkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_pobk_id >=", value, "orderPobkId");
            return (Criteria) this;
        }

        public Criteria andOrderPobkIdLessThan(Integer value) {
            addCriterion("order_pobk_id <", value, "orderPobkId");
            return (Criteria) this;
        }

        public Criteria andOrderPobkIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_pobk_id <=", value, "orderPobkId");
            return (Criteria) this;
        }

        public Criteria andOrderPobkIdIn(List<Integer> values) {
            addCriterion("order_pobk_id in", values, "orderPobkId");
            return (Criteria) this;
        }

        public Criteria andOrderPobkIdNotIn(List<Integer> values) {
            addCriterion("order_pobk_id not in", values, "orderPobkId");
            return (Criteria) this;
        }

        public Criteria andOrderPobkIdBetween(Integer value1, Integer value2) {
            addCriterion("order_pobk_id between", value1, value2, "orderPobkId");
            return (Criteria) this;
        }

        public Criteria andOrderPobkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_pobk_id not between", value1, value2, "orderPobkId");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNull() {
            addCriterion("order_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNotNull() {
            addCriterion("order_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeEqualTo(Date value) {
            addCriterion("order_create_time =", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotEqualTo(Date value) {
            addCriterion("order_create_time <>", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThan(Date value) {
            addCriterion("order_create_time >", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_create_time >=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThan(Date value) {
            addCriterion("order_create_time <", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_create_time <=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIn(List<Date> values) {
            addCriterion("order_create_time in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotIn(List<Date> values) {
            addCriterion("order_create_time not in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeBetween(Date value1, Date value2) {
            addCriterion("order_create_time between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_create_time not between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderRevertLocationIdIsNull() {
            addCriterion("order_revert_location_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderRevertLocationIdIsNotNull() {
            addCriterion("order_revert_location_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRevertLocationIdEqualTo(Integer value) {
            addCriterion("order_revert_location_id =", value, "orderRevertLocationId");
            return (Criteria) this;
        }

        public Criteria andOrderRevertLocationIdNotEqualTo(Integer value) {
            addCriterion("order_revert_location_id <>", value, "orderRevertLocationId");
            return (Criteria) this;
        }

        public Criteria andOrderRevertLocationIdGreaterThan(Integer value) {
            addCriterion("order_revert_location_id >", value, "orderRevertLocationId");
            return (Criteria) this;
        }

        public Criteria andOrderRevertLocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_revert_location_id >=", value, "orderRevertLocationId");
            return (Criteria) this;
        }

        public Criteria andOrderRevertLocationIdLessThan(Integer value) {
            addCriterion("order_revert_location_id <", value, "orderRevertLocationId");
            return (Criteria) this;
        }

        public Criteria andOrderRevertLocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_revert_location_id <=", value, "orderRevertLocationId");
            return (Criteria) this;
        }

        public Criteria andOrderRevertLocationIdIn(List<Integer> values) {
            addCriterion("order_revert_location_id in", values, "orderRevertLocationId");
            return (Criteria) this;
        }

        public Criteria andOrderRevertLocationIdNotIn(List<Integer> values) {
            addCriterion("order_revert_location_id not in", values, "orderRevertLocationId");
            return (Criteria) this;
        }

        public Criteria andOrderRevertLocationIdBetween(Integer value1, Integer value2) {
            addCriterion("order_revert_location_id between", value1, value2, "orderRevertLocationId");
            return (Criteria) this;
        }

        public Criteria andOrderRevertLocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_revert_location_id not between", value1, value2, "orderRevertLocationId");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeIsNull() {
            addCriterion("order_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeIsNotNull() {
            addCriterion("order_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeEqualTo(Date value) {
            addCriterion("order_finish_time =", value, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeNotEqualTo(Date value) {
            addCriterion("order_finish_time <>", value, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeGreaterThan(Date value) {
            addCriterion("order_finish_time >", value, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_finish_time >=", value, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeLessThan(Date value) {
            addCriterion("order_finish_time <", value, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_finish_time <=", value, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeIn(List<Date> values) {
            addCriterion("order_finish_time in", values, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeNotIn(List<Date> values) {
            addCriterion("order_finish_time not in", values, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeBetween(Date value1, Date value2) {
            addCriterion("order_finish_time between", value1, value2, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_finish_time not between", value1, value2, "orderFinishTime");
            return (Criteria) this;
        }

        public Criteria andOrderCostIdIsNull() {
            addCriterion("order_cost_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderCostIdIsNotNull() {
            addCriterion("order_cost_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCostIdEqualTo(Integer value) {
            addCriterion("order_cost_id =", value, "orderCostId");
            return (Criteria) this;
        }

        public Criteria andOrderCostIdNotEqualTo(Integer value) {
            addCriterion("order_cost_id <>", value, "orderCostId");
            return (Criteria) this;
        }

        public Criteria andOrderCostIdGreaterThan(Integer value) {
            addCriterion("order_cost_id >", value, "orderCostId");
            return (Criteria) this;
        }

        public Criteria andOrderCostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_cost_id >=", value, "orderCostId");
            return (Criteria) this;
        }

        public Criteria andOrderCostIdLessThan(Integer value) {
            addCriterion("order_cost_id <", value, "orderCostId");
            return (Criteria) this;
        }

        public Criteria andOrderCostIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_cost_id <=", value, "orderCostId");
            return (Criteria) this;
        }

        public Criteria andOrderCostIdIn(List<Integer> values) {
            addCriterion("order_cost_id in", values, "orderCostId");
            return (Criteria) this;
        }

        public Criteria andOrderCostIdNotIn(List<Integer> values) {
            addCriterion("order_cost_id not in", values, "orderCostId");
            return (Criteria) this;
        }

        public Criteria andOrderCostIdBetween(Integer value1, Integer value2) {
            addCriterion("order_cost_id between", value1, value2, "orderCostId");
            return (Criteria) this;
        }

        public Criteria andOrderCostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_cost_id not between", value1, value2, "orderCostId");
            return (Criteria) this;
        }

        public Criteria andOrderHasFinishedIsNull() {
            addCriterion("order_has_finished is null");
            return (Criteria) this;
        }

        public Criteria andOrderHasFinishedIsNotNull() {
            addCriterion("order_has_finished is not null");
            return (Criteria) this;
        }

        public Criteria andOrderHasFinishedEqualTo(Integer value) {
            addCriterion("order_has_finished =", value, "orderHasFinished");
            return (Criteria) this;
        }

        public Criteria andOrderHasFinishedNotEqualTo(Integer value) {
            addCriterion("order_has_finished <>", value, "orderHasFinished");
            return (Criteria) this;
        }

        public Criteria andOrderHasFinishedGreaterThan(Integer value) {
            addCriterion("order_has_finished >", value, "orderHasFinished");
            return (Criteria) this;
        }

        public Criteria andOrderHasFinishedGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_has_finished >=", value, "orderHasFinished");
            return (Criteria) this;
        }

        public Criteria andOrderHasFinishedLessThan(Integer value) {
            addCriterion("order_has_finished <", value, "orderHasFinished");
            return (Criteria) this;
        }

        public Criteria andOrderHasFinishedLessThanOrEqualTo(Integer value) {
            addCriterion("order_has_finished <=", value, "orderHasFinished");
            return (Criteria) this;
        }

        public Criteria andOrderHasFinishedIn(List<Integer> values) {
            addCriterion("order_has_finished in", values, "orderHasFinished");
            return (Criteria) this;
        }

        public Criteria andOrderHasFinishedNotIn(List<Integer> values) {
            addCriterion("order_has_finished not in", values, "orderHasFinished");
            return (Criteria) this;
        }

        public Criteria andOrderHasFinishedBetween(Integer value1, Integer value2) {
            addCriterion("order_has_finished between", value1, value2, "orderHasFinished");
            return (Criteria) this;
        }

        public Criteria andOrderHasFinishedNotBetween(Integer value1, Integer value2) {
            addCriterion("order_has_finished not between", value1, value2, "orderHasFinished");
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
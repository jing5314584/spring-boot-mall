package boot.mall.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailExample() {
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

        public Criteria andIdxIsNull() {
            addCriterion("idx is null");
            return (Criteria) this;
        }

        public Criteria andIdxIsNotNull() {
            addCriterion("idx is not null");
            return (Criteria) this;
        }

        public Criteria andIdxEqualTo(Integer value) {
            addCriterion("idx =", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotEqualTo(Integer value) {
            addCriterion("idx <>", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThan(Integer value) {
            addCriterion("idx >", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("idx >=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThan(Integer value) {
            addCriterion("idx <", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThanOrEqualTo(Integer value) {
            addCriterion("idx <=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxIn(List<Integer> values) {
            addCriterion("idx in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotIn(List<Integer> values) {
            addCriterion("idx not in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxBetween(Integer value1, Integer value2) {
            addCriterion("idx between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("idx not between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andOrderIdxIsNull() {
            addCriterion("order_idx is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdxIsNotNull() {
            addCriterion("order_idx is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdxEqualTo(Integer value) {
            addCriterion("order_idx =", value, "orderIdx");
            return (Criteria) this;
        }

        public Criteria andOrderIdxNotEqualTo(Integer value) {
            addCriterion("order_idx <>", value, "orderIdx");
            return (Criteria) this;
        }

        public Criteria andOrderIdxGreaterThan(Integer value) {
            addCriterion("order_idx >", value, "orderIdx");
            return (Criteria) this;
        }

        public Criteria andOrderIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_idx >=", value, "orderIdx");
            return (Criteria) this;
        }

        public Criteria andOrderIdxLessThan(Integer value) {
            addCriterion("order_idx <", value, "orderIdx");
            return (Criteria) this;
        }

        public Criteria andOrderIdxLessThanOrEqualTo(Integer value) {
            addCriterion("order_idx <=", value, "orderIdx");
            return (Criteria) this;
        }

        public Criteria andOrderIdxIn(List<Integer> values) {
            addCriterion("order_idx in", values, "orderIdx");
            return (Criteria) this;
        }

        public Criteria andOrderIdxNotIn(List<Integer> values) {
            addCriterion("order_idx not in", values, "orderIdx");
            return (Criteria) this;
        }

        public Criteria andOrderIdxBetween(Integer value1, Integer value2) {
            addCriterion("order_idx between", value1, value2, "orderIdx");
            return (Criteria) this;
        }

        public Criteria andOrderIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("order_idx not between", value1, value2, "orderIdx");
            return (Criteria) this;
        }

        public Criteria andProductIdxIsNull() {
            addCriterion("product_idx is null");
            return (Criteria) this;
        }

        public Criteria andProductIdxIsNotNull() {
            addCriterion("product_idx is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdxEqualTo(Integer value) {
            addCriterion("product_idx =", value, "productIdx");
            return (Criteria) this;
        }

        public Criteria andProductIdxNotEqualTo(Integer value) {
            addCriterion("product_idx <>", value, "productIdx");
            return (Criteria) this;
        }

        public Criteria andProductIdxGreaterThan(Integer value) {
            addCriterion("product_idx >", value, "productIdx");
            return (Criteria) this;
        }

        public Criteria andProductIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_idx >=", value, "productIdx");
            return (Criteria) this;
        }

        public Criteria andProductIdxLessThan(Integer value) {
            addCriterion("product_idx <", value, "productIdx");
            return (Criteria) this;
        }

        public Criteria andProductIdxLessThanOrEqualTo(Integer value) {
            addCriterion("product_idx <=", value, "productIdx");
            return (Criteria) this;
        }

        public Criteria andProductIdxIn(List<Integer> values) {
            addCriterion("product_idx in", values, "productIdx");
            return (Criteria) this;
        }

        public Criteria andProductIdxNotIn(List<Integer> values) {
            addCriterion("product_idx not in", values, "productIdx");
            return (Criteria) this;
        }

        public Criteria andProductIdxBetween(Integer value1, Integer value2) {
            addCriterion("product_idx between", value1, value2, "productIdx");
            return (Criteria) this;
        }

        public Criteria andProductIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("product_idx not between", value1, value2, "productIdx");
            return (Criteria) this;
        }

        public Criteria andPriceIdxIsNull() {
            addCriterion("price_idx is null");
            return (Criteria) this;
        }

        public Criteria andPriceIdxIsNotNull() {
            addCriterion("price_idx is not null");
            return (Criteria) this;
        }

        public Criteria andPriceIdxEqualTo(Integer value) {
            addCriterion("price_idx =", value, "priceIdx");
            return (Criteria) this;
        }

        public Criteria andPriceIdxNotEqualTo(Integer value) {
            addCriterion("price_idx <>", value, "priceIdx");
            return (Criteria) this;
        }

        public Criteria andPriceIdxGreaterThan(Integer value) {
            addCriterion("price_idx >", value, "priceIdx");
            return (Criteria) this;
        }

        public Criteria andPriceIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_idx >=", value, "priceIdx");
            return (Criteria) this;
        }

        public Criteria andPriceIdxLessThan(Integer value) {
            addCriterion("price_idx <", value, "priceIdx");
            return (Criteria) this;
        }

        public Criteria andPriceIdxLessThanOrEqualTo(Integer value) {
            addCriterion("price_idx <=", value, "priceIdx");
            return (Criteria) this;
        }

        public Criteria andPriceIdxIn(List<Integer> values) {
            addCriterion("price_idx in", values, "priceIdx");
            return (Criteria) this;
        }

        public Criteria andPriceIdxNotIn(List<Integer> values) {
            addCriterion("price_idx not in", values, "priceIdx");
            return (Criteria) this;
        }

        public Criteria andPriceIdxBetween(Integer value1, Integer value2) {
            addCriterion("price_idx between", value1, value2, "priceIdx");
            return (Criteria) this;
        }

        public Criteria andPriceIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("price_idx not between", value1, value2, "priceIdx");
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
package boot.mall.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class ConfProductSubjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfProductSubjectExample() {
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

        public Criteria andProductSubjectNameIsNull() {
            addCriterion("product_subject_name is null");
            return (Criteria) this;
        }

        public Criteria andProductSubjectNameIsNotNull() {
            addCriterion("product_subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductSubjectNameEqualTo(String value) {
            addCriterion("product_subject_name =", value, "productSubjectName");
            return (Criteria) this;
        }

        public Criteria andProductSubjectNameNotEqualTo(String value) {
            addCriterion("product_subject_name <>", value, "productSubjectName");
            return (Criteria) this;
        }

        public Criteria andProductSubjectNameGreaterThan(String value) {
            addCriterion("product_subject_name >", value, "productSubjectName");
            return (Criteria) this;
        }

        public Criteria andProductSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_subject_name >=", value, "productSubjectName");
            return (Criteria) this;
        }

        public Criteria andProductSubjectNameLessThan(String value) {
            addCriterion("product_subject_name <", value, "productSubjectName");
            return (Criteria) this;
        }

        public Criteria andProductSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("product_subject_name <=", value, "productSubjectName");
            return (Criteria) this;
        }

        public Criteria andProductSubjectNameLike(String value) {
            addCriterion("product_subject_name like", value, "productSubjectName");
            return (Criteria) this;
        }

        public Criteria andProductSubjectNameNotLike(String value) {
            addCriterion("product_subject_name not like", value, "productSubjectName");
            return (Criteria) this;
        }

        public Criteria andProductSubjectNameIn(List<String> values) {
            addCriterion("product_subject_name in", values, "productSubjectName");
            return (Criteria) this;
        }

        public Criteria andProductSubjectNameNotIn(List<String> values) {
            addCriterion("product_subject_name not in", values, "productSubjectName");
            return (Criteria) this;
        }

        public Criteria andProductSubjectNameBetween(String value1, String value2) {
            addCriterion("product_subject_name between", value1, value2, "productSubjectName");
            return (Criteria) this;
        }

        public Criteria andProductSubjectNameNotBetween(String value1, String value2) {
            addCriterion("product_subject_name not between", value1, value2, "productSubjectName");
            return (Criteria) this;
        }

        public Criteria andProductSubjectIconIsNull() {
            addCriterion("product_subject_icon is null");
            return (Criteria) this;
        }

        public Criteria andProductSubjectIconIsNotNull() {
            addCriterion("product_subject_icon is not null");
            return (Criteria) this;
        }

        public Criteria andProductSubjectIconEqualTo(String value) {
            addCriterion("product_subject_icon =", value, "productSubjectIcon");
            return (Criteria) this;
        }

        public Criteria andProductSubjectIconNotEqualTo(String value) {
            addCriterion("product_subject_icon <>", value, "productSubjectIcon");
            return (Criteria) this;
        }

        public Criteria andProductSubjectIconGreaterThan(String value) {
            addCriterion("product_subject_icon >", value, "productSubjectIcon");
            return (Criteria) this;
        }

        public Criteria andProductSubjectIconGreaterThanOrEqualTo(String value) {
            addCriterion("product_subject_icon >=", value, "productSubjectIcon");
            return (Criteria) this;
        }

        public Criteria andProductSubjectIconLessThan(String value) {
            addCriterion("product_subject_icon <", value, "productSubjectIcon");
            return (Criteria) this;
        }

        public Criteria andProductSubjectIconLessThanOrEqualTo(String value) {
            addCriterion("product_subject_icon <=", value, "productSubjectIcon");
            return (Criteria) this;
        }

        public Criteria andProductSubjectIconLike(String value) {
            addCriterion("product_subject_icon like", value, "productSubjectIcon");
            return (Criteria) this;
        }

        public Criteria andProductSubjectIconNotLike(String value) {
            addCriterion("product_subject_icon not like", value, "productSubjectIcon");
            return (Criteria) this;
        }

        public Criteria andProductSubjectIconIn(List<String> values) {
            addCriterion("product_subject_icon in", values, "productSubjectIcon");
            return (Criteria) this;
        }

        public Criteria andProductSubjectIconNotIn(List<String> values) {
            addCriterion("product_subject_icon not in", values, "productSubjectIcon");
            return (Criteria) this;
        }

        public Criteria andProductSubjectIconBetween(String value1, String value2) {
            addCriterion("product_subject_icon between", value1, value2, "productSubjectIcon");
            return (Criteria) this;
        }

        public Criteria andProductSubjectIconNotBetween(String value1, String value2) {
            addCriterion("product_subject_icon not between", value1, value2, "productSubjectIcon");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdxIsNull() {
            addCriterion("parent_subject_idx is null");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdxIsNotNull() {
            addCriterion("parent_subject_idx is not null");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdxEqualTo(Integer value) {
            addCriterion("parent_subject_idx =", value, "parentSubjectIdx");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdxNotEqualTo(Integer value) {
            addCriterion("parent_subject_idx <>", value, "parentSubjectIdx");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdxGreaterThan(Integer value) {
            addCriterion("parent_subject_idx >", value, "parentSubjectIdx");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_subject_idx >=", value, "parentSubjectIdx");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdxLessThan(Integer value) {
            addCriterion("parent_subject_idx <", value, "parentSubjectIdx");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdxLessThanOrEqualTo(Integer value) {
            addCriterion("parent_subject_idx <=", value, "parentSubjectIdx");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdxIn(List<Integer> values) {
            addCriterion("parent_subject_idx in", values, "parentSubjectIdx");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdxNotIn(List<Integer> values) {
            addCriterion("parent_subject_idx not in", values, "parentSubjectIdx");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdxBetween(Integer value1, Integer value2) {
            addCriterion("parent_subject_idx between", value1, value2, "parentSubjectIdx");
            return (Criteria) this;
        }

        public Criteria andParentSubjectIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_subject_idx not between", value1, value2, "parentSubjectIdx");
            return (Criteria) this;
        }

        public Criteria andViewOrderIsNull() {
            addCriterion("view_order is null");
            return (Criteria) this;
        }

        public Criteria andViewOrderIsNotNull() {
            addCriterion("view_order is not null");
            return (Criteria) this;
        }

        public Criteria andViewOrderEqualTo(Integer value) {
            addCriterion("view_order =", value, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andViewOrderNotEqualTo(Integer value) {
            addCriterion("view_order <>", value, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andViewOrderGreaterThan(Integer value) {
            addCriterion("view_order >", value, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andViewOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("view_order >=", value, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andViewOrderLessThan(Integer value) {
            addCriterion("view_order <", value, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andViewOrderLessThanOrEqualTo(Integer value) {
            addCriterion("view_order <=", value, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andViewOrderIn(List<Integer> values) {
            addCriterion("view_order in", values, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andViewOrderNotIn(List<Integer> values) {
            addCriterion("view_order not in", values, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andViewOrderBetween(Integer value1, Integer value2) {
            addCriterion("view_order between", value1, value2, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andViewOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("view_order not between", value1, value2, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andExtendTypeIsNull() {
            addCriterion("extend_type is null");
            return (Criteria) this;
        }

        public Criteria andExtendTypeIsNotNull() {
            addCriterion("extend_type is not null");
            return (Criteria) this;
        }

        public Criteria andExtendTypeEqualTo(Integer value) {
            addCriterion("extend_type =", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeNotEqualTo(Integer value) {
            addCriterion("extend_type <>", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeGreaterThan(Integer value) {
            addCriterion("extend_type >", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("extend_type >=", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeLessThan(Integer value) {
            addCriterion("extend_type <", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeLessThanOrEqualTo(Integer value) {
            addCriterion("extend_type <=", value, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeIn(List<Integer> values) {
            addCriterion("extend_type in", values, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeNotIn(List<Integer> values) {
            addCriterion("extend_type not in", values, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeBetween(Integer value1, Integer value2) {
            addCriterion("extend_type between", value1, value2, "extendType");
            return (Criteria) this;
        }

        public Criteria andExtendTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("extend_type not between", value1, value2, "extendType");
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
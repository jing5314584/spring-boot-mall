package boot.mall.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class V_ProductSubjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V_ProductSubjectExample() {
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

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("icon like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("icon not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andShopIdxIsNull() {
            addCriterion("shop_idx is null");
            return (Criteria) this;
        }

        public Criteria andShopIdxIsNotNull() {
            addCriterion("shop_idx is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdxEqualTo(Integer value) {
            addCriterion("shop_idx =", value, "shopIdx");
            return (Criteria) this;
        }

        public Criteria andShopIdxNotEqualTo(Integer value) {
            addCriterion("shop_idx <>", value, "shopIdx");
            return (Criteria) this;
        }

        public Criteria andShopIdxGreaterThan(Integer value) {
            addCriterion("shop_idx >", value, "shopIdx");
            return (Criteria) this;
        }

        public Criteria andShopIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_idx >=", value, "shopIdx");
            return (Criteria) this;
        }

        public Criteria andShopIdxLessThan(Integer value) {
            addCriterion("shop_idx <", value, "shopIdx");
            return (Criteria) this;
        }

        public Criteria andShopIdxLessThanOrEqualTo(Integer value) {
            addCriterion("shop_idx <=", value, "shopIdx");
            return (Criteria) this;
        }

        public Criteria andShopIdxIn(List<Integer> values) {
            addCriterion("shop_idx in", values, "shopIdx");
            return (Criteria) this;
        }

        public Criteria andShopIdxNotIn(List<Integer> values) {
            addCriterion("shop_idx not in", values, "shopIdx");
            return (Criteria) this;
        }

        public Criteria andShopIdxBetween(Integer value1, Integer value2) {
            addCriterion("shop_idx between", value1, value2, "shopIdx");
            return (Criteria) this;
        }

        public Criteria andShopIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_idx not between", value1, value2, "shopIdx");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(BigDecimal value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(BigDecimal value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<BigDecimal> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNull() {
            addCriterion("discount_price is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNotNull() {
            addCriterion("discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceEqualTo(BigDecimal value) {
            addCriterion("discount_price =", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotEqualTo(BigDecimal value) {
            addCriterion("discount_price <>", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThan(BigDecimal value) {
            addCriterion("discount_price >", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_price >=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThan(BigDecimal value) {
            addCriterion("discount_price <", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_price <=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIn(List<BigDecimal> values) {
            addCriterion("discount_price in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotIn(List<BigDecimal> values) {
            addCriterion("discount_price not in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_price between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_price not between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNull() {
            addCriterion("inventory is null");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNotNull() {
            addCriterion("inventory is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryEqualTo(Integer value) {
            addCriterion("inventory =", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotEqualTo(Integer value) {
            addCriterion("inventory <>", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThan(Integer value) {
            addCriterion("inventory >", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory >=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThan(Integer value) {
            addCriterion("inventory <", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("inventory <=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryIn(List<Integer> values) {
            addCriterion("inventory in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotIn(List<Integer> values) {
            addCriterion("inventory not in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryBetween(Integer value1, Integer value2) {
            addCriterion("inventory between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory not between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("last_update_date is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("last_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("last_update_date =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("last_update_date <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("last_update_date >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_date >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("last_update_date <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("last_update_date <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("last_update_date in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("last_update_date not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("last_update_date between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("last_update_date not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Integer value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Integer value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Integer value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Integer value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Integer value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Integer> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Integer> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Integer value1, Integer value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Integer value1, Integer value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(Integer value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(Integer value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(Integer value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(Integer value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(Integer value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<Integer> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<Integer> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(Integer value1, Integer value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andShowIconIsNull() {
            addCriterion("show_icon is null");
            return (Criteria) this;
        }

        public Criteria andShowIconIsNotNull() {
            addCriterion("show_icon is not null");
            return (Criteria) this;
        }

        public Criteria andShowIconEqualTo(String value) {
            addCriterion("show_icon =", value, "showIcon");
            return (Criteria) this;
        }

        public Criteria andShowIconNotEqualTo(String value) {
            addCriterion("show_icon <>", value, "showIcon");
            return (Criteria) this;
        }

        public Criteria andShowIconGreaterThan(String value) {
            addCriterion("show_icon >", value, "showIcon");
            return (Criteria) this;
        }

        public Criteria andShowIconGreaterThanOrEqualTo(String value) {
            addCriterion("show_icon >=", value, "showIcon");
            return (Criteria) this;
        }

        public Criteria andShowIconLessThan(String value) {
            addCriterion("show_icon <", value, "showIcon");
            return (Criteria) this;
        }

        public Criteria andShowIconLessThanOrEqualTo(String value) {
            addCriterion("show_icon <=", value, "showIcon");
            return (Criteria) this;
        }

        public Criteria andShowIconLike(String value) {
            addCriterion("show_icon like", value, "showIcon");
            return (Criteria) this;
        }

        public Criteria andShowIconNotLike(String value) {
            addCriterion("show_icon not like", value, "showIcon");
            return (Criteria) this;
        }

        public Criteria andShowIconIn(List<String> values) {
            addCriterion("show_icon in", values, "showIcon");
            return (Criteria) this;
        }

        public Criteria andShowIconNotIn(List<String> values) {
            addCriterion("show_icon not in", values, "showIcon");
            return (Criteria) this;
        }

        public Criteria andShowIconBetween(String value1, String value2) {
            addCriterion("show_icon between", value1, value2, "showIcon");
            return (Criteria) this;
        }

        public Criteria andShowIconNotBetween(String value1, String value2) {
            addCriterion("show_icon not between", value1, value2, "showIcon");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
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
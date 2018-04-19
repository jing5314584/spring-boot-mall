package boot.mall.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReceiveAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceiveAddressExample() {
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUserIdxIsNull() {
            addCriterion("user_idx is null");
            return (Criteria) this;
        }

        public Criteria andUserIdxIsNotNull() {
            addCriterion("user_idx is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdxEqualTo(Integer value) {
            addCriterion("user_idx =", value, "userIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdxNotEqualTo(Integer value) {
            addCriterion("user_idx <>", value, "userIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdxGreaterThan(Integer value) {
            addCriterion("user_idx >", value, "userIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_idx >=", value, "userIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdxLessThan(Integer value) {
            addCriterion("user_idx <", value, "userIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdxLessThanOrEqualTo(Integer value) {
            addCriterion("user_idx <=", value, "userIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdxIn(List<Integer> values) {
            addCriterion("user_idx in", values, "userIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdxNotIn(List<Integer> values) {
            addCriterion("user_idx not in", values, "userIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdxBetween(Integer value1, Integer value2) {
            addCriterion("user_idx between", value1, value2, "userIdx");
            return (Criteria) this;
        }

        public Criteria andUserIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("user_idx not between", value1, value2, "userIdx");
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressProvinceIsNull() {
            addCriterion("receive_address_province is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressProvinceIsNotNull() {
            addCriterion("receive_address_province is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressProvinceEqualTo(String value) {
            addCriterion("receive_address_province =", value, "receiveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressProvinceNotEqualTo(String value) {
            addCriterion("receive_address_province <>", value, "receiveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressProvinceGreaterThan(String value) {
            addCriterion("receive_address_province >", value, "receiveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("receive_address_province >=", value, "receiveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressProvinceLessThan(String value) {
            addCriterion("receive_address_province <", value, "receiveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressProvinceLessThanOrEqualTo(String value) {
            addCriterion("receive_address_province <=", value, "receiveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressProvinceLike(String value) {
            addCriterion("receive_address_province like", value, "receiveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressProvinceNotLike(String value) {
            addCriterion("receive_address_province not like", value, "receiveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressProvinceIn(List<String> values) {
            addCriterion("receive_address_province in", values, "receiveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressProvinceNotIn(List<String> values) {
            addCriterion("receive_address_province not in", values, "receiveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressProvinceBetween(String value1, String value2) {
            addCriterion("receive_address_province between", value1, value2, "receiveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressProvinceNotBetween(String value1, String value2) {
            addCriterion("receive_address_province not between", value1, value2, "receiveAddressProvince");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressCityIsNull() {
            addCriterion("receive_address_city is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressCityIsNotNull() {
            addCriterion("receive_address_city is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressCityEqualTo(String value) {
            addCriterion("receive_address_city =", value, "receiveAddressCity");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressCityNotEqualTo(String value) {
            addCriterion("receive_address_city <>", value, "receiveAddressCity");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressCityGreaterThan(String value) {
            addCriterion("receive_address_city >", value, "receiveAddressCity");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("receive_address_city >=", value, "receiveAddressCity");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressCityLessThan(String value) {
            addCriterion("receive_address_city <", value, "receiveAddressCity");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressCityLessThanOrEqualTo(String value) {
            addCriterion("receive_address_city <=", value, "receiveAddressCity");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressCityLike(String value) {
            addCriterion("receive_address_city like", value, "receiveAddressCity");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressCityNotLike(String value) {
            addCriterion("receive_address_city not like", value, "receiveAddressCity");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressCityIn(List<String> values) {
            addCriterion("receive_address_city in", values, "receiveAddressCity");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressCityNotIn(List<String> values) {
            addCriterion("receive_address_city not in", values, "receiveAddressCity");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressCityBetween(String value1, String value2) {
            addCriterion("receive_address_city between", value1, value2, "receiveAddressCity");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressCityNotBetween(String value1, String value2) {
            addCriterion("receive_address_city not between", value1, value2, "receiveAddressCity");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressAreaIsNull() {
            addCriterion("receive_address_area is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressAreaIsNotNull() {
            addCriterion("receive_address_area is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressAreaEqualTo(String value) {
            addCriterion("receive_address_area =", value, "receiveAddressArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressAreaNotEqualTo(String value) {
            addCriterion("receive_address_area <>", value, "receiveAddressArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressAreaGreaterThan(String value) {
            addCriterion("receive_address_area >", value, "receiveAddressArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressAreaGreaterThanOrEqualTo(String value) {
            addCriterion("receive_address_area >=", value, "receiveAddressArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressAreaLessThan(String value) {
            addCriterion("receive_address_area <", value, "receiveAddressArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressAreaLessThanOrEqualTo(String value) {
            addCriterion("receive_address_area <=", value, "receiveAddressArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressAreaLike(String value) {
            addCriterion("receive_address_area like", value, "receiveAddressArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressAreaNotLike(String value) {
            addCriterion("receive_address_area not like", value, "receiveAddressArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressAreaIn(List<String> values) {
            addCriterion("receive_address_area in", values, "receiveAddressArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressAreaNotIn(List<String> values) {
            addCriterion("receive_address_area not in", values, "receiveAddressArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressAreaBetween(String value1, String value2) {
            addCriterion("receive_address_area between", value1, value2, "receiveAddressArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressAreaNotBetween(String value1, String value2) {
            addCriterion("receive_address_area not between", value1, value2, "receiveAddressArea");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressDetailIsNull() {
            addCriterion("receive_address_detail is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressDetailIsNotNull() {
            addCriterion("receive_address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressDetailEqualTo(String value) {
            addCriterion("receive_address_detail =", value, "receiveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressDetailNotEqualTo(String value) {
            addCriterion("receive_address_detail <>", value, "receiveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressDetailGreaterThan(String value) {
            addCriterion("receive_address_detail >", value, "receiveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("receive_address_detail >=", value, "receiveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressDetailLessThan(String value) {
            addCriterion("receive_address_detail <", value, "receiveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("receive_address_detail <=", value, "receiveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressDetailLike(String value) {
            addCriterion("receive_address_detail like", value, "receiveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressDetailNotLike(String value) {
            addCriterion("receive_address_detail not like", value, "receiveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressDetailIn(List<String> values) {
            addCriterion("receive_address_detail in", values, "receiveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressDetailNotIn(List<String> values) {
            addCriterion("receive_address_detail not in", values, "receiveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressDetailBetween(String value1, String value2) {
            addCriterion("receive_address_detail between", value1, value2, "receiveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressDetailNotBetween(String value1, String value2) {
            addCriterion("receive_address_detail not between", value1, value2, "receiveAddressDetail");
            return (Criteria) this;
        }

        public Criteria andReceiveIsNull() {
            addCriterion("receive is null");
            return (Criteria) this;
        }

        public Criteria andReceiveIsNotNull() {
            addCriterion("receive is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveEqualTo(String value) {
            addCriterion("receive =", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveNotEqualTo(String value) {
            addCriterion("receive <>", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveGreaterThan(String value) {
            addCriterion("receive >", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveGreaterThanOrEqualTo(String value) {
            addCriterion("receive >=", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveLessThan(String value) {
            addCriterion("receive <", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveLessThanOrEqualTo(String value) {
            addCriterion("receive <=", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveLike(String value) {
            addCriterion("receive like", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveNotLike(String value) {
            addCriterion("receive not like", value, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveIn(List<String> values) {
            addCriterion("receive in", values, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveNotIn(List<String> values) {
            addCriterion("receive not in", values, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveBetween(String value1, String value2) {
            addCriterion("receive between", value1, value2, "receive");
            return (Criteria) this;
        }

        public Criteria andReceiveNotBetween(String value1, String value2) {
            addCriterion("receive not between", value1, value2, "receive");
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
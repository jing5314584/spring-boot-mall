package boot.mall.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RsdCircleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RsdCircleExample() {
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

        public Criteria andCircleNameIsNull() {
            addCriterion("circle_name is null");
            return (Criteria) this;
        }

        public Criteria andCircleNameIsNotNull() {
            addCriterion("circle_name is not null");
            return (Criteria) this;
        }

        public Criteria andCircleNameEqualTo(String value) {
            addCriterion("circle_name =", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameNotEqualTo(String value) {
            addCriterion("circle_name <>", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameGreaterThan(String value) {
            addCriterion("circle_name >", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameGreaterThanOrEqualTo(String value) {
            addCriterion("circle_name >=", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameLessThan(String value) {
            addCriterion("circle_name <", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameLessThanOrEqualTo(String value) {
            addCriterion("circle_name <=", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameLike(String value) {
            addCriterion("circle_name like", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameNotLike(String value) {
            addCriterion("circle_name not like", value, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameIn(List<String> values) {
            addCriterion("circle_name in", values, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameNotIn(List<String> values) {
            addCriterion("circle_name not in", values, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameBetween(String value1, String value2) {
            addCriterion("circle_name between", value1, value2, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleNameNotBetween(String value1, String value2) {
            addCriterion("circle_name not between", value1, value2, "circleName");
            return (Criteria) this;
        }

        public Criteria andCircleIconIsNull() {
            addCriterion("circle_icon is null");
            return (Criteria) this;
        }

        public Criteria andCircleIconIsNotNull() {
            addCriterion("circle_icon is not null");
            return (Criteria) this;
        }

        public Criteria andCircleIconEqualTo(String value) {
            addCriterion("circle_icon =", value, "circleIcon");
            return (Criteria) this;
        }

        public Criteria andCircleIconNotEqualTo(String value) {
            addCriterion("circle_icon <>", value, "circleIcon");
            return (Criteria) this;
        }

        public Criteria andCircleIconGreaterThan(String value) {
            addCriterion("circle_icon >", value, "circleIcon");
            return (Criteria) this;
        }

        public Criteria andCircleIconGreaterThanOrEqualTo(String value) {
            addCriterion("circle_icon >=", value, "circleIcon");
            return (Criteria) this;
        }

        public Criteria andCircleIconLessThan(String value) {
            addCriterion("circle_icon <", value, "circleIcon");
            return (Criteria) this;
        }

        public Criteria andCircleIconLessThanOrEqualTo(String value) {
            addCriterion("circle_icon <=", value, "circleIcon");
            return (Criteria) this;
        }

        public Criteria andCircleIconLike(String value) {
            addCriterion("circle_icon like", value, "circleIcon");
            return (Criteria) this;
        }

        public Criteria andCircleIconNotLike(String value) {
            addCriterion("circle_icon not like", value, "circleIcon");
            return (Criteria) this;
        }

        public Criteria andCircleIconIn(List<String> values) {
            addCriterion("circle_icon in", values, "circleIcon");
            return (Criteria) this;
        }

        public Criteria andCircleIconNotIn(List<String> values) {
            addCriterion("circle_icon not in", values, "circleIcon");
            return (Criteria) this;
        }

        public Criteria andCircleIconBetween(String value1, String value2) {
            addCriterion("circle_icon between", value1, value2, "circleIcon");
            return (Criteria) this;
        }

        public Criteria andCircleIconNotBetween(String value1, String value2) {
            addCriterion("circle_icon not between", value1, value2, "circleIcon");
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

        public Criteria andViewOrderEqualTo(Byte value) {
            addCriterion("view_order =", value, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andViewOrderNotEqualTo(Byte value) {
            addCriterion("view_order <>", value, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andViewOrderGreaterThan(Byte value) {
            addCriterion("view_order >", value, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andViewOrderGreaterThanOrEqualTo(Byte value) {
            addCriterion("view_order >=", value, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andViewOrderLessThan(Byte value) {
            addCriterion("view_order <", value, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andViewOrderLessThanOrEqualTo(Byte value) {
            addCriterion("view_order <=", value, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andViewOrderIn(List<Byte> values) {
            addCriterion("view_order in", values, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andViewOrderNotIn(List<Byte> values) {
            addCriterion("view_order not in", values, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andViewOrderBetween(Byte value1, Byte value2) {
            addCriterion("view_order between", value1, value2, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andViewOrderNotBetween(Byte value1, Byte value2) {
            addCriterion("view_order not between", value1, value2, "viewOrder");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNull() {
            addCriterion("is_new is null");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNotNull() {
            addCriterion("is_new is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewEqualTo(Boolean value) {
            addCriterion("is_new =", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotEqualTo(Boolean value) {
            addCriterion("is_new <>", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThan(Boolean value) {
            addCriterion("is_new >", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_new >=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThan(Boolean value) {
            addCriterion("is_new <", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThanOrEqualTo(Boolean value) {
            addCriterion("is_new <=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewIn(List<Boolean> values) {
            addCriterion("is_new in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotIn(List<Boolean> values) {
            addCriterion("is_new not in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewBetween(Boolean value1, Boolean value2) {
            addCriterion("is_new between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_new not between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andAttentionCountIsNull() {
            addCriterion("attention_count is null");
            return (Criteria) this;
        }

        public Criteria andAttentionCountIsNotNull() {
            addCriterion("attention_count is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionCountEqualTo(Integer value) {
            addCriterion("attention_count =", value, "attentionCount");
            return (Criteria) this;
        }

        public Criteria andAttentionCountNotEqualTo(Integer value) {
            addCriterion("attention_count <>", value, "attentionCount");
            return (Criteria) this;
        }

        public Criteria andAttentionCountGreaterThan(Integer value) {
            addCriterion("attention_count >", value, "attentionCount");
            return (Criteria) this;
        }

        public Criteria andAttentionCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("attention_count >=", value, "attentionCount");
            return (Criteria) this;
        }

        public Criteria andAttentionCountLessThan(Integer value) {
            addCriterion("attention_count <", value, "attentionCount");
            return (Criteria) this;
        }

        public Criteria andAttentionCountLessThanOrEqualTo(Integer value) {
            addCriterion("attention_count <=", value, "attentionCount");
            return (Criteria) this;
        }

        public Criteria andAttentionCountIn(List<Integer> values) {
            addCriterion("attention_count in", values, "attentionCount");
            return (Criteria) this;
        }

        public Criteria andAttentionCountNotIn(List<Integer> values) {
            addCriterion("attention_count not in", values, "attentionCount");
            return (Criteria) this;
        }

        public Criteria andAttentionCountBetween(Integer value1, Integer value2) {
            addCriterion("attention_count between", value1, value2, "attentionCount");
            return (Criteria) this;
        }

        public Criteria andAttentionCountNotBetween(Integer value1, Integer value2) {
            addCriterion("attention_count not between", value1, value2, "attentionCount");
            return (Criteria) this;
        }

        public Criteria andTodayTalkCountIsNull() {
            addCriterion("today_talk_count is null");
            return (Criteria) this;
        }

        public Criteria andTodayTalkCountIsNotNull() {
            addCriterion("today_talk_count is not null");
            return (Criteria) this;
        }

        public Criteria andTodayTalkCountEqualTo(Integer value) {
            addCriterion("today_talk_count =", value, "todayTalkCount");
            return (Criteria) this;
        }

        public Criteria andTodayTalkCountNotEqualTo(Integer value) {
            addCriterion("today_talk_count <>", value, "todayTalkCount");
            return (Criteria) this;
        }

        public Criteria andTodayTalkCountGreaterThan(Integer value) {
            addCriterion("today_talk_count >", value, "todayTalkCount");
            return (Criteria) this;
        }

        public Criteria andTodayTalkCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("today_talk_count >=", value, "todayTalkCount");
            return (Criteria) this;
        }

        public Criteria andTodayTalkCountLessThan(Integer value) {
            addCriterion("today_talk_count <", value, "todayTalkCount");
            return (Criteria) this;
        }

        public Criteria andTodayTalkCountLessThanOrEqualTo(Integer value) {
            addCriterion("today_talk_count <=", value, "todayTalkCount");
            return (Criteria) this;
        }

        public Criteria andTodayTalkCountIn(List<Integer> values) {
            addCriterion("today_talk_count in", values, "todayTalkCount");
            return (Criteria) this;
        }

        public Criteria andTodayTalkCountNotIn(List<Integer> values) {
            addCriterion("today_talk_count not in", values, "todayTalkCount");
            return (Criteria) this;
        }

        public Criteria andTodayTalkCountBetween(Integer value1, Integer value2) {
            addCriterion("today_talk_count between", value1, value2, "todayTalkCount");
            return (Criteria) this;
        }

        public Criteria andTodayTalkCountNotBetween(Integer value1, Integer value2) {
            addCriterion("today_talk_count not between", value1, value2, "todayTalkCount");
            return (Criteria) this;
        }

        public Criteria andTalkCountUpdateDateIsNull() {
            addCriterion("talk_count_update_date is null");
            return (Criteria) this;
        }

        public Criteria andTalkCountUpdateDateIsNotNull() {
            addCriterion("talk_count_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andTalkCountUpdateDateEqualTo(Date value) {
            addCriterion("talk_count_update_date =", value, "talkCountUpdateDate");
            return (Criteria) this;
        }

        public Criteria andTalkCountUpdateDateNotEqualTo(Date value) {
            addCriterion("talk_count_update_date <>", value, "talkCountUpdateDate");
            return (Criteria) this;
        }

        public Criteria andTalkCountUpdateDateGreaterThan(Date value) {
            addCriterion("talk_count_update_date >", value, "talkCountUpdateDate");
            return (Criteria) this;
        }

        public Criteria andTalkCountUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("talk_count_update_date >=", value, "talkCountUpdateDate");
            return (Criteria) this;
        }

        public Criteria andTalkCountUpdateDateLessThan(Date value) {
            addCriterion("talk_count_update_date <", value, "talkCountUpdateDate");
            return (Criteria) this;
        }

        public Criteria andTalkCountUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("talk_count_update_date <=", value, "talkCountUpdateDate");
            return (Criteria) this;
        }

        public Criteria andTalkCountUpdateDateIn(List<Date> values) {
            addCriterion("talk_count_update_date in", values, "talkCountUpdateDate");
            return (Criteria) this;
        }

        public Criteria andTalkCountUpdateDateNotIn(List<Date> values) {
            addCriterion("talk_count_update_date not in", values, "talkCountUpdateDate");
            return (Criteria) this;
        }

        public Criteria andTalkCountUpdateDateBetween(Date value1, Date value2) {
            addCriterion("talk_count_update_date between", value1, value2, "talkCountUpdateDate");
            return (Criteria) this;
        }

        public Criteria andTalkCountUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("talk_count_update_date not between", value1, value2, "talkCountUpdateDate");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsAttentionIsNull() {
            addCriterion("is_attention is null");
            return (Criteria) this;
        }

        public Criteria andIsAttentionIsNotNull() {
            addCriterion("is_attention is not null");
            return (Criteria) this;
        }

        public Criteria andIsAttentionEqualTo(Byte value) {
            addCriterion("is_attention =", value, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionNotEqualTo(Byte value) {
            addCriterion("is_attention <>", value, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionGreaterThan(Byte value) {
            addCriterion("is_attention >", value, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_attention >=", value, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionLessThan(Byte value) {
            addCriterion("is_attention <", value, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionLessThanOrEqualTo(Byte value) {
            addCriterion("is_attention <=", value, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionIn(List<Byte> values) {
            addCriterion("is_attention in", values, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionNotIn(List<Byte> values) {
            addCriterion("is_attention not in", values, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionBetween(Byte value1, Byte value2) {
            addCriterion("is_attention between", value1, value2, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionNotBetween(Byte value1, Byte value2) {
            addCriterion("is_attention not between", value1, value2, "isAttention");
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
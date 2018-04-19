package boot.mall.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class DoctorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoctorExample() {
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

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andPortraitPathIsNull() {
            addCriterion("portrait_path is null");
            return (Criteria) this;
        }

        public Criteria andPortraitPathIsNotNull() {
            addCriterion("portrait_path is not null");
            return (Criteria) this;
        }

        public Criteria andPortraitPathEqualTo(String value) {
            addCriterion("portrait_path =", value, "portraitPath");
            return (Criteria) this;
        }

        public Criteria andPortraitPathNotEqualTo(String value) {
            addCriterion("portrait_path <>", value, "portraitPath");
            return (Criteria) this;
        }

        public Criteria andPortraitPathGreaterThan(String value) {
            addCriterion("portrait_path >", value, "portraitPath");
            return (Criteria) this;
        }

        public Criteria andPortraitPathGreaterThanOrEqualTo(String value) {
            addCriterion("portrait_path >=", value, "portraitPath");
            return (Criteria) this;
        }

        public Criteria andPortraitPathLessThan(String value) {
            addCriterion("portrait_path <", value, "portraitPath");
            return (Criteria) this;
        }

        public Criteria andPortraitPathLessThanOrEqualTo(String value) {
            addCriterion("portrait_path <=", value, "portraitPath");
            return (Criteria) this;
        }

        public Criteria andPortraitPathLike(String value) {
            addCriterion("portrait_path like", value, "portraitPath");
            return (Criteria) this;
        }

        public Criteria andPortraitPathNotLike(String value) {
            addCriterion("portrait_path not like", value, "portraitPath");
            return (Criteria) this;
        }

        public Criteria andPortraitPathIn(List<String> values) {
            addCriterion("portrait_path in", values, "portraitPath");
            return (Criteria) this;
        }

        public Criteria andPortraitPathNotIn(List<String> values) {
            addCriterion("portrait_path not in", values, "portraitPath");
            return (Criteria) this;
        }

        public Criteria andPortraitPathBetween(String value1, String value2) {
            addCriterion("portrait_path between", value1, value2, "portraitPath");
            return (Criteria) this;
        }

        public Criteria andPortraitPathNotBetween(String value1, String value2) {
            addCriterion("portrait_path not between", value1, value2, "portraitPath");
            return (Criteria) this;
        }

        public Criteria andAreaIdxIsNull() {
            addCriterion("area_idx is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdxIsNotNull() {
            addCriterion("area_idx is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdxEqualTo(Integer value) {
            addCriterion("area_idx =", value, "areaIdx");
            return (Criteria) this;
        }

        public Criteria andAreaIdxNotEqualTo(Integer value) {
            addCriterion("area_idx <>", value, "areaIdx");
            return (Criteria) this;
        }

        public Criteria andAreaIdxGreaterThan(Integer value) {
            addCriterion("area_idx >", value, "areaIdx");
            return (Criteria) this;
        }

        public Criteria andAreaIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_idx >=", value, "areaIdx");
            return (Criteria) this;
        }

        public Criteria andAreaIdxLessThan(Integer value) {
            addCriterion("area_idx <", value, "areaIdx");
            return (Criteria) this;
        }

        public Criteria andAreaIdxLessThanOrEqualTo(Integer value) {
            addCriterion("area_idx <=", value, "areaIdx");
            return (Criteria) this;
        }

        public Criteria andAreaIdxIn(List<Integer> values) {
            addCriterion("area_idx in", values, "areaIdx");
            return (Criteria) this;
        }

        public Criteria andAreaIdxNotIn(List<Integer> values) {
            addCriterion("area_idx not in", values, "areaIdx");
            return (Criteria) this;
        }

        public Criteria andAreaIdxBetween(Integer value1, Integer value2) {
            addCriterion("area_idx between", value1, value2, "areaIdx");
            return (Criteria) this;
        }

        public Criteria andAreaIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("area_idx not between", value1, value2, "areaIdx");
            return (Criteria) this;
        }

        public Criteria andAreaDistinctIsNull() {
            addCriterion("area_distinct is null");
            return (Criteria) this;
        }

        public Criteria andAreaDistinctIsNotNull() {
            addCriterion("area_distinct is not null");
            return (Criteria) this;
        }

        public Criteria andAreaDistinctEqualTo(String value) {
            addCriterion("area_distinct =", value, "areaDistinct");
            return (Criteria) this;
        }

        public Criteria andAreaDistinctNotEqualTo(String value) {
            addCriterion("area_distinct <>", value, "areaDistinct");
            return (Criteria) this;
        }

        public Criteria andAreaDistinctGreaterThan(String value) {
            addCriterion("area_distinct >", value, "areaDistinct");
            return (Criteria) this;
        }

        public Criteria andAreaDistinctGreaterThanOrEqualTo(String value) {
            addCriterion("area_distinct >=", value, "areaDistinct");
            return (Criteria) this;
        }

        public Criteria andAreaDistinctLessThan(String value) {
            addCriterion("area_distinct <", value, "areaDistinct");
            return (Criteria) this;
        }

        public Criteria andAreaDistinctLessThanOrEqualTo(String value) {
            addCriterion("area_distinct <=", value, "areaDistinct");
            return (Criteria) this;
        }

        public Criteria andAreaDistinctLike(String value) {
            addCriterion("area_distinct like", value, "areaDistinct");
            return (Criteria) this;
        }

        public Criteria andAreaDistinctNotLike(String value) {
            addCriterion("area_distinct not like", value, "areaDistinct");
            return (Criteria) this;
        }

        public Criteria andAreaDistinctIn(List<String> values) {
            addCriterion("area_distinct in", values, "areaDistinct");
            return (Criteria) this;
        }

        public Criteria andAreaDistinctNotIn(List<String> values) {
            addCriterion("area_distinct not in", values, "areaDistinct");
            return (Criteria) this;
        }

        public Criteria andAreaDistinctBetween(String value1, String value2) {
            addCriterion("area_distinct between", value1, value2, "areaDistinct");
            return (Criteria) this;
        }

        public Criteria andAreaDistinctNotBetween(String value1, String value2) {
            addCriterion("area_distinct not between", value1, value2, "areaDistinct");
            return (Criteria) this;
        }

        public Criteria andHospitalIsNull() {
            addCriterion("hospital is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIsNotNull() {
            addCriterion("hospital is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalEqualTo(String value) {
            addCriterion("hospital =", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotEqualTo(String value) {
            addCriterion("hospital <>", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalGreaterThan(String value) {
            addCriterion("hospital >", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalGreaterThanOrEqualTo(String value) {
            addCriterion("hospital >=", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLessThan(String value) {
            addCriterion("hospital <", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLessThanOrEqualTo(String value) {
            addCriterion("hospital <=", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLike(String value) {
            addCriterion("hospital like", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotLike(String value) {
            addCriterion("hospital not like", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalIn(List<String> values) {
            addCriterion("hospital in", values, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotIn(List<String> values) {
            addCriterion("hospital not in", values, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalBetween(String value1, String value2) {
            addCriterion("hospital between", value1, value2, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotBetween(String value1, String value2) {
            addCriterion("hospital not between", value1, value2, "hospital");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdxIsNull() {
            addCriterion("department_idx is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdxIsNotNull() {
            addCriterion("department_idx is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdxEqualTo(Integer value) {
            addCriterion("department_idx =", value, "departmentIdx");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdxNotEqualTo(Integer value) {
            addCriterion("department_idx <>", value, "departmentIdx");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdxGreaterThan(Integer value) {
            addCriterion("department_idx >", value, "departmentIdx");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_idx >=", value, "departmentIdx");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdxLessThan(Integer value) {
            addCriterion("department_idx <", value, "departmentIdx");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdxLessThanOrEqualTo(Integer value) {
            addCriterion("department_idx <=", value, "departmentIdx");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdxIn(List<Integer> values) {
            addCriterion("department_idx in", values, "departmentIdx");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdxNotIn(List<Integer> values) {
            addCriterion("department_idx not in", values, "departmentIdx");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdxBetween(Integer value1, Integer value2) {
            addCriterion("department_idx between", value1, value2, "departmentIdx");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("department_idx not between", value1, value2, "departmentIdx");
            return (Criteria) this;
        }

        public Criteria andGoodAtIsNull() {
            addCriterion("good_at is null");
            return (Criteria) this;
        }

        public Criteria andGoodAtIsNotNull() {
            addCriterion("good_at is not null");
            return (Criteria) this;
        }

        public Criteria andGoodAtEqualTo(String value) {
            addCriterion("good_at =", value, "goodAt");
            return (Criteria) this;
        }

        public Criteria andGoodAtNotEqualTo(String value) {
            addCriterion("good_at <>", value, "goodAt");
            return (Criteria) this;
        }

        public Criteria andGoodAtGreaterThan(String value) {
            addCriterion("good_at >", value, "goodAt");
            return (Criteria) this;
        }

        public Criteria andGoodAtGreaterThanOrEqualTo(String value) {
            addCriterion("good_at >=", value, "goodAt");
            return (Criteria) this;
        }

        public Criteria andGoodAtLessThan(String value) {
            addCriterion("good_at <", value, "goodAt");
            return (Criteria) this;
        }

        public Criteria andGoodAtLessThanOrEqualTo(String value) {
            addCriterion("good_at <=", value, "goodAt");
            return (Criteria) this;
        }

        public Criteria andGoodAtLike(String value) {
            addCriterion("good_at like", value, "goodAt");
            return (Criteria) this;
        }

        public Criteria andGoodAtNotLike(String value) {
            addCriterion("good_at not like", value, "goodAt");
            return (Criteria) this;
        }

        public Criteria andGoodAtIn(List<String> values) {
            addCriterion("good_at in", values, "goodAt");
            return (Criteria) this;
        }

        public Criteria andGoodAtNotIn(List<String> values) {
            addCriterion("good_at not in", values, "goodAt");
            return (Criteria) this;
        }

        public Criteria andGoodAtBetween(String value1, String value2) {
            addCriterion("good_at between", value1, value2, "goodAt");
            return (Criteria) this;
        }

        public Criteria andGoodAtNotBetween(String value1, String value2) {
            addCriterion("good_at not between", value1, value2, "goodAt");
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

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIsNull() {
            addCriterion("online_status is null");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIsNotNull() {
            addCriterion("online_status is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusEqualTo(Byte value) {
            addCriterion("online_status =", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotEqualTo(Byte value) {
            addCriterion("online_status <>", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusGreaterThan(Byte value) {
            addCriterion("online_status >", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("online_status >=", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusLessThan(Byte value) {
            addCriterion("online_status <", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusLessThanOrEqualTo(Byte value) {
            addCriterion("online_status <=", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIn(List<Byte> values) {
            addCriterion("online_status in", values, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotIn(List<Byte> values) {
            addCriterion("online_status not in", values, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusBetween(Byte value1, Byte value2) {
            addCriterion("online_status between", value1, value2, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("online_status not between", value1, value2, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleIsNull() {
            addCriterion("doctor_title is null");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleIsNotNull() {
            addCriterion("doctor_title is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleEqualTo(String value) {
            addCriterion("doctor_title =", value, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleNotEqualTo(String value) {
            addCriterion("doctor_title <>", value, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleGreaterThan(String value) {
            addCriterion("doctor_title >", value, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_title >=", value, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleLessThan(String value) {
            addCriterion("doctor_title <", value, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleLessThanOrEqualTo(String value) {
            addCriterion("doctor_title <=", value, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleLike(String value) {
            addCriterion("doctor_title like", value, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleNotLike(String value) {
            addCriterion("doctor_title not like", value, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleIn(List<String> values) {
            addCriterion("doctor_title in", values, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleNotIn(List<String> values) {
            addCriterion("doctor_title not in", values, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleBetween(String value1, String value2) {
            addCriterion("doctor_title between", value1, value2, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andDoctorTitleNotBetween(String value1, String value2) {
            addCriterion("doctor_title not between", value1, value2, "doctorTitle");
            return (Criteria) this;
        }

        public Criteria andIsAssistantIsNull() {
            addCriterion("is_assistant is null");
            return (Criteria) this;
        }

        public Criteria andIsAssistantIsNotNull() {
            addCriterion("is_assistant is not null");
            return (Criteria) this;
        }

        public Criteria andIsAssistantEqualTo(Boolean value) {
            addCriterion("is_assistant =", value, "isAssistant");
            return (Criteria) this;
        }

        public Criteria andIsAssistantNotEqualTo(Boolean value) {
            addCriterion("is_assistant <>", value, "isAssistant");
            return (Criteria) this;
        }

        public Criteria andIsAssistantGreaterThan(Boolean value) {
            addCriterion("is_assistant >", value, "isAssistant");
            return (Criteria) this;
        }

        public Criteria andIsAssistantGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_assistant >=", value, "isAssistant");
            return (Criteria) this;
        }

        public Criteria andIsAssistantLessThan(Boolean value) {
            addCriterion("is_assistant <", value, "isAssistant");
            return (Criteria) this;
        }

        public Criteria andIsAssistantLessThanOrEqualTo(Boolean value) {
            addCriterion("is_assistant <=", value, "isAssistant");
            return (Criteria) this;
        }

        public Criteria andIsAssistantIn(List<Boolean> values) {
            addCriterion("is_assistant in", values, "isAssistant");
            return (Criteria) this;
        }

        public Criteria andIsAssistantNotIn(List<Boolean> values) {
            addCriterion("is_assistant not in", values, "isAssistant");
            return (Criteria) this;
        }

        public Criteria andIsAssistantBetween(Boolean value1, Boolean value2) {
            addCriterion("is_assistant between", value1, value2, "isAssistant");
            return (Criteria) this;
        }

        public Criteria andIsAssistantNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_assistant not between", value1, value2, "isAssistant");
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

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Boolean value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Boolean value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Boolean value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Boolean value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Boolean value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Boolean> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Boolean> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Boolean value1, Boolean value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andHospitalIdxIsNull() {
            addCriterion("hospital_idx is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdxIsNotNull() {
            addCriterion("hospital_idx is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdxEqualTo(Integer value) {
            addCriterion("hospital_idx =", value, "hospitalIdx");
            return (Criteria) this;
        }

        public Criteria andHospitalIdxNotEqualTo(Integer value) {
            addCriterion("hospital_idx <>", value, "hospitalIdx");
            return (Criteria) this;
        }

        public Criteria andHospitalIdxGreaterThan(Integer value) {
            addCriterion("hospital_idx >", value, "hospitalIdx");
            return (Criteria) this;
        }

        public Criteria andHospitalIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospital_idx >=", value, "hospitalIdx");
            return (Criteria) this;
        }

        public Criteria andHospitalIdxLessThan(Integer value) {
            addCriterion("hospital_idx <", value, "hospitalIdx");
            return (Criteria) this;
        }

        public Criteria andHospitalIdxLessThanOrEqualTo(Integer value) {
            addCriterion("hospital_idx <=", value, "hospitalIdx");
            return (Criteria) this;
        }

        public Criteria andHospitalIdxIn(List<Integer> values) {
            addCriterion("hospital_idx in", values, "hospitalIdx");
            return (Criteria) this;
        }

        public Criteria andHospitalIdxNotIn(List<Integer> values) {
            addCriterion("hospital_idx not in", values, "hospitalIdx");
            return (Criteria) this;
        }

        public Criteria andHospitalIdxBetween(Integer value1, Integer value2) {
            addCriterion("hospital_idx between", value1, value2, "hospitalIdx");
            return (Criteria) this;
        }

        public Criteria andHospitalIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("hospital_idx not between", value1, value2, "hospitalIdx");
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
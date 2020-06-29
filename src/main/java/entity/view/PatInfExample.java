package entity.view;

import java.util.ArrayList;
import java.util.List;

public class PatInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatInfExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("pID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("pID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("pID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("pID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("pID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("pID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("pID like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("pID not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("pID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("pID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("pID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("pID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andCoupleidIsNull() {
            addCriterion("coupleID is null");
            return (Criteria) this;
        }

        public Criteria andCoupleidIsNotNull() {
            addCriterion("coupleID is not null");
            return (Criteria) this;
        }

        public Criteria andCoupleidEqualTo(String value) {
            addCriterion("coupleID =", value, "coupleid");
            return (Criteria) this;
        }

        public Criteria andCoupleidNotEqualTo(String value) {
            addCriterion("coupleID <>", value, "coupleid");
            return (Criteria) this;
        }

        public Criteria andCoupleidGreaterThan(String value) {
            addCriterion("coupleID >", value, "coupleid");
            return (Criteria) this;
        }

        public Criteria andCoupleidGreaterThanOrEqualTo(String value) {
            addCriterion("coupleID >=", value, "coupleid");
            return (Criteria) this;
        }

        public Criteria andCoupleidLessThan(String value) {
            addCriterion("coupleID <", value, "coupleid");
            return (Criteria) this;
        }

        public Criteria andCoupleidLessThanOrEqualTo(String value) {
            addCriterion("coupleID <=", value, "coupleid");
            return (Criteria) this;
        }

        public Criteria andCoupleidLike(String value) {
            addCriterion("coupleID like", value, "coupleid");
            return (Criteria) this;
        }

        public Criteria andCoupleidNotLike(String value) {
            addCriterion("coupleID not like", value, "coupleid");
            return (Criteria) this;
        }

        public Criteria andCoupleidIn(List<String> values) {
            addCriterion("coupleID in", values, "coupleid");
            return (Criteria) this;
        }

        public Criteria andCoupleidNotIn(List<String> values) {
            addCriterion("coupleID not in", values, "coupleid");
            return (Criteria) this;
        }

        public Criteria andCoupleidBetween(String value1, String value2) {
            addCriterion("coupleID between", value1, value2, "coupleid");
            return (Criteria) this;
        }

        public Criteria andCoupleidNotBetween(String value1, String value2) {
            addCriterion("coupleID not between", value1, value2, "coupleid");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNull() {
            addCriterion("createName is null");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNotNull() {
            addCriterion("createName is not null");
            return (Criteria) this;
        }

        public Criteria andCreatenameEqualTo(String value) {
            addCriterion("createName =", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotEqualTo(String value) {
            addCriterion("createName <>", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThan(String value) {
            addCriterion("createName >", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("createName >=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThan(String value) {
            addCriterion("createName <", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThanOrEqualTo(String value) {
            addCriterion("createName <=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLike(String value) {
            addCriterion("createName like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotLike(String value) {
            addCriterion("createName not like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameIn(List<String> values) {
            addCriterion("createName in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotIn(List<String> values) {
            addCriterion("createName not in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameBetween(String value1, String value2) {
            addCriterion("createName between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotBetween(String value1, String value2) {
            addCriterion("createName not between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("createTime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("createTime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(String value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(String value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(String value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(String value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(String value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLike(String value) {
            addCriterion("updateTime like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotLike(String value) {
            addCriterion("updateTime not like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<String> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<String> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(String value1, String value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(String value1, String value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatenameIsNull() {
            addCriterion("updateName is null");
            return (Criteria) this;
        }

        public Criteria andUpdatenameIsNotNull() {
            addCriterion("updateName is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatenameEqualTo(String value) {
            addCriterion("updateName =", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameNotEqualTo(String value) {
            addCriterion("updateName <>", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameGreaterThan(String value) {
            addCriterion("updateName >", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameGreaterThanOrEqualTo(String value) {
            addCriterion("updateName >=", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameLessThan(String value) {
            addCriterion("updateName <", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameLessThanOrEqualTo(String value) {
            addCriterion("updateName <=", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameLike(String value) {
            addCriterion("updateName like", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameNotLike(String value) {
            addCriterion("updateName not like", value, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameIn(List<String> values) {
            addCriterion("updateName in", values, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameNotIn(List<String> values) {
            addCriterion("updateName not in", values, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameBetween(String value1, String value2) {
            addCriterion("updateName between", value1, value2, "updatename");
            return (Criteria) this;
        }

        public Criteria andUpdatenameNotBetween(String value1, String value2) {
            addCriterion("updateName not between", value1, value2, "updatename");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andHospitalcardIsNull() {
            addCriterion("hospitalCard is null");
            return (Criteria) this;
        }

        public Criteria andHospitalcardIsNotNull() {
            addCriterion("hospitalCard is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalcardEqualTo(String value) {
            addCriterion("hospitalCard =", value, "hospitalcard");
            return (Criteria) this;
        }

        public Criteria andHospitalcardNotEqualTo(String value) {
            addCriterion("hospitalCard <>", value, "hospitalcard");
            return (Criteria) this;
        }

        public Criteria andHospitalcardGreaterThan(String value) {
            addCriterion("hospitalCard >", value, "hospitalcard");
            return (Criteria) this;
        }

        public Criteria andHospitalcardGreaterThanOrEqualTo(String value) {
            addCriterion("hospitalCard >=", value, "hospitalcard");
            return (Criteria) this;
        }

        public Criteria andHospitalcardLessThan(String value) {
            addCriterion("hospitalCard <", value, "hospitalcard");
            return (Criteria) this;
        }

        public Criteria andHospitalcardLessThanOrEqualTo(String value) {
            addCriterion("hospitalCard <=", value, "hospitalcard");
            return (Criteria) this;
        }

        public Criteria andHospitalcardLike(String value) {
            addCriterion("hospitalCard like", value, "hospitalcard");
            return (Criteria) this;
        }

        public Criteria andHospitalcardNotLike(String value) {
            addCriterion("hospitalCard not like", value, "hospitalcard");
            return (Criteria) this;
        }

        public Criteria andHospitalcardIn(List<String> values) {
            addCriterion("hospitalCard in", values, "hospitalcard");
            return (Criteria) this;
        }

        public Criteria andHospitalcardNotIn(List<String> values) {
            addCriterion("hospitalCard not in", values, "hospitalcard");
            return (Criteria) this;
        }

        public Criteria andHospitalcardBetween(String value1, String value2) {
            addCriterion("hospitalCard between", value1, value2, "hospitalcard");
            return (Criteria) this;
        }

        public Criteria andHospitalcardNotBetween(String value1, String value2) {
            addCriterion("hospitalCard not between", value1, value2, "hospitalcard");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andUsednameIsNull() {
            addCriterion("usedName is null");
            return (Criteria) this;
        }

        public Criteria andUsednameIsNotNull() {
            addCriterion("usedName is not null");
            return (Criteria) this;
        }

        public Criteria andUsednameEqualTo(String value) {
            addCriterion("usedName =", value, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameNotEqualTo(String value) {
            addCriterion("usedName <>", value, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameGreaterThan(String value) {
            addCriterion("usedName >", value, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameGreaterThanOrEqualTo(String value) {
            addCriterion("usedName >=", value, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameLessThan(String value) {
            addCriterion("usedName <", value, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameLessThanOrEqualTo(String value) {
            addCriterion("usedName <=", value, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameLike(String value) {
            addCriterion("usedName like", value, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameNotLike(String value) {
            addCriterion("usedName not like", value, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameIn(List<String> values) {
            addCriterion("usedName in", values, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameNotIn(List<String> values) {
            addCriterion("usedName not in", values, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameBetween(String value1, String value2) {
            addCriterion("usedName between", value1, value2, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameNotBetween(String value1, String value2) {
            addCriterion("usedName not between", value1, value2, "usedname");
            return (Criteria) this;
        }

        public Criteria andNameabbreviationIsNull() {
            addCriterion("nameAbbreviation is null");
            return (Criteria) this;
        }

        public Criteria andNameabbreviationIsNotNull() {
            addCriterion("nameAbbreviation is not null");
            return (Criteria) this;
        }

        public Criteria andNameabbreviationEqualTo(String value) {
            addCriterion("nameAbbreviation =", value, "nameabbreviation");
            return (Criteria) this;
        }

        public Criteria andNameabbreviationNotEqualTo(String value) {
            addCriterion("nameAbbreviation <>", value, "nameabbreviation");
            return (Criteria) this;
        }

        public Criteria andNameabbreviationGreaterThan(String value) {
            addCriterion("nameAbbreviation >", value, "nameabbreviation");
            return (Criteria) this;
        }

        public Criteria andNameabbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("nameAbbreviation >=", value, "nameabbreviation");
            return (Criteria) this;
        }

        public Criteria andNameabbreviationLessThan(String value) {
            addCriterion("nameAbbreviation <", value, "nameabbreviation");
            return (Criteria) this;
        }

        public Criteria andNameabbreviationLessThanOrEqualTo(String value) {
            addCriterion("nameAbbreviation <=", value, "nameabbreviation");
            return (Criteria) this;
        }

        public Criteria andNameabbreviationLike(String value) {
            addCriterion("nameAbbreviation like", value, "nameabbreviation");
            return (Criteria) this;
        }

        public Criteria andNameabbreviationNotLike(String value) {
            addCriterion("nameAbbreviation not like", value, "nameabbreviation");
            return (Criteria) this;
        }

        public Criteria andNameabbreviationIn(List<String> values) {
            addCriterion("nameAbbreviation in", values, "nameabbreviation");
            return (Criteria) this;
        }

        public Criteria andNameabbreviationNotIn(List<String> values) {
            addCriterion("nameAbbreviation not in", values, "nameabbreviation");
            return (Criteria) this;
        }

        public Criteria andNameabbreviationBetween(String value1, String value2) {
            addCriterion("nameAbbreviation between", value1, value2, "nameabbreviation");
            return (Criteria) this;
        }

        public Criteria andNameabbreviationNotBetween(String value1, String value2) {
            addCriterion("nameAbbreviation not between", value1, value2, "nameabbreviation");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNull() {
            addCriterion("IDNumber is null");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNotNull() {
            addCriterion("IDNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumberEqualTo(String value) {
            addCriterion("IDNumber =", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotEqualTo(String value) {
            addCriterion("IDNumber <>", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThan(String value) {
            addCriterion("IDNumber >", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("IDNumber >=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThan(String value) {
            addCriterion("IDNumber <", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThanOrEqualTo(String value) {
            addCriterion("IDNumber <=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLike(String value) {
            addCriterion("IDNumber like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotLike(String value) {
            addCriterion("IDNumber not like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberIn(List<String> values) {
            addCriterion("IDNumber in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotIn(List<String> values) {
            addCriterion("IDNumber not in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberBetween(String value1, String value2) {
            addCriterion("IDNumber between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotBetween(String value1, String value2) {
            addCriterion("IDNumber not between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andOfficernumberIsNull() {
            addCriterion("officerNumber is null");
            return (Criteria) this;
        }

        public Criteria andOfficernumberIsNotNull() {
            addCriterion("officerNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOfficernumberEqualTo(String value) {
            addCriterion("officerNumber =", value, "officernumber");
            return (Criteria) this;
        }

        public Criteria andOfficernumberNotEqualTo(String value) {
            addCriterion("officerNumber <>", value, "officernumber");
            return (Criteria) this;
        }

        public Criteria andOfficernumberGreaterThan(String value) {
            addCriterion("officerNumber >", value, "officernumber");
            return (Criteria) this;
        }

        public Criteria andOfficernumberGreaterThanOrEqualTo(String value) {
            addCriterion("officerNumber >=", value, "officernumber");
            return (Criteria) this;
        }

        public Criteria andOfficernumberLessThan(String value) {
            addCriterion("officerNumber <", value, "officernumber");
            return (Criteria) this;
        }

        public Criteria andOfficernumberLessThanOrEqualTo(String value) {
            addCriterion("officerNumber <=", value, "officernumber");
            return (Criteria) this;
        }

        public Criteria andOfficernumberLike(String value) {
            addCriterion("officerNumber like", value, "officernumber");
            return (Criteria) this;
        }

        public Criteria andOfficernumberNotLike(String value) {
            addCriterion("officerNumber not like", value, "officernumber");
            return (Criteria) this;
        }

        public Criteria andOfficernumberIn(List<String> values) {
            addCriterion("officerNumber in", values, "officernumber");
            return (Criteria) this;
        }

        public Criteria andOfficernumberNotIn(List<String> values) {
            addCriterion("officerNumber not in", values, "officernumber");
            return (Criteria) this;
        }

        public Criteria andOfficernumberBetween(String value1, String value2) {
            addCriterion("officerNumber between", value1, value2, "officernumber");
            return (Criteria) this;
        }

        public Criteria andOfficernumberNotBetween(String value1, String value2) {
            addCriterion("officerNumber not between", value1, value2, "officernumber");
            return (Criteria) this;
        }

        public Criteria andPassportnumberIsNull() {
            addCriterion("passportNumber is null");
            return (Criteria) this;
        }

        public Criteria andPassportnumberIsNotNull() {
            addCriterion("passportNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPassportnumberEqualTo(String value) {
            addCriterion("passportNumber =", value, "passportnumber");
            return (Criteria) this;
        }

        public Criteria andPassportnumberNotEqualTo(String value) {
            addCriterion("passportNumber <>", value, "passportnumber");
            return (Criteria) this;
        }

        public Criteria andPassportnumberGreaterThan(String value) {
            addCriterion("passportNumber >", value, "passportnumber");
            return (Criteria) this;
        }

        public Criteria andPassportnumberGreaterThanOrEqualTo(String value) {
            addCriterion("passportNumber >=", value, "passportnumber");
            return (Criteria) this;
        }

        public Criteria andPassportnumberLessThan(String value) {
            addCriterion("passportNumber <", value, "passportnumber");
            return (Criteria) this;
        }

        public Criteria andPassportnumberLessThanOrEqualTo(String value) {
            addCriterion("passportNumber <=", value, "passportnumber");
            return (Criteria) this;
        }

        public Criteria andPassportnumberLike(String value) {
            addCriterion("passportNumber like", value, "passportnumber");
            return (Criteria) this;
        }

        public Criteria andPassportnumberNotLike(String value) {
            addCriterion("passportNumber not like", value, "passportnumber");
            return (Criteria) this;
        }

        public Criteria andPassportnumberIn(List<String> values) {
            addCriterion("passportNumber in", values, "passportnumber");
            return (Criteria) this;
        }

        public Criteria andPassportnumberNotIn(List<String> values) {
            addCriterion("passportNumber not in", values, "passportnumber");
            return (Criteria) this;
        }

        public Criteria andPassportnumberBetween(String value1, String value2) {
            addCriterion("passportNumber between", value1, value2, "passportnumber");
            return (Criteria) this;
        }

        public Criteria andPassportnumberNotBetween(String value1, String value2) {
            addCriterion("passportNumber not between", value1, value2, "passportnumber");
            return (Criteria) this;
        }

        public Criteria andHongkongandmacaupassportnumberIsNull() {
            addCriterion("HongKongAndMacauPassportNumber is null");
            return (Criteria) this;
        }

        public Criteria andHongkongandmacaupassportnumberIsNotNull() {
            addCriterion("HongKongAndMacauPassportNumber is not null");
            return (Criteria) this;
        }

        public Criteria andHongkongandmacaupassportnumberEqualTo(String value) {
            addCriterion("HongKongAndMacauPassportNumber =", value, "hongkongandmacaupassportnumber");
            return (Criteria) this;
        }

        public Criteria andHongkongandmacaupassportnumberNotEqualTo(String value) {
            addCriterion("HongKongAndMacauPassportNumber <>", value, "hongkongandmacaupassportnumber");
            return (Criteria) this;
        }

        public Criteria andHongkongandmacaupassportnumberGreaterThan(String value) {
            addCriterion("HongKongAndMacauPassportNumber >", value, "hongkongandmacaupassportnumber");
            return (Criteria) this;
        }

        public Criteria andHongkongandmacaupassportnumberGreaterThanOrEqualTo(String value) {
            addCriterion("HongKongAndMacauPassportNumber >=", value, "hongkongandmacaupassportnumber");
            return (Criteria) this;
        }

        public Criteria andHongkongandmacaupassportnumberLessThan(String value) {
            addCriterion("HongKongAndMacauPassportNumber <", value, "hongkongandmacaupassportnumber");
            return (Criteria) this;
        }

        public Criteria andHongkongandmacaupassportnumberLessThanOrEqualTo(String value) {
            addCriterion("HongKongAndMacauPassportNumber <=", value, "hongkongandmacaupassportnumber");
            return (Criteria) this;
        }

        public Criteria andHongkongandmacaupassportnumberLike(String value) {
            addCriterion("HongKongAndMacauPassportNumber like", value, "hongkongandmacaupassportnumber");
            return (Criteria) this;
        }

        public Criteria andHongkongandmacaupassportnumberNotLike(String value) {
            addCriterion("HongKongAndMacauPassportNumber not like", value, "hongkongandmacaupassportnumber");
            return (Criteria) this;
        }

        public Criteria andHongkongandmacaupassportnumberIn(List<String> values) {
            addCriterion("HongKongAndMacauPassportNumber in", values, "hongkongandmacaupassportnumber");
            return (Criteria) this;
        }

        public Criteria andHongkongandmacaupassportnumberNotIn(List<String> values) {
            addCriterion("HongKongAndMacauPassportNumber not in", values, "hongkongandmacaupassportnumber");
            return (Criteria) this;
        }

        public Criteria andHongkongandmacaupassportnumberBetween(String value1, String value2) {
            addCriterion("HongKongAndMacauPassportNumber between", value1, value2, "hongkongandmacaupassportnumber");
            return (Criteria) this;
        }

        public Criteria andHongkongandmacaupassportnumberNotBetween(String value1, String value2) {
            addCriterion("HongKongAndMacauPassportNumber not between", value1, value2, "hongkongandmacaupassportnumber");
            return (Criteria) this;
        }

        public Criteria andNativeplace1IsNull() {
            addCriterion("nativeplace1 is null");
            return (Criteria) this;
        }

        public Criteria andNativeplace1IsNotNull() {
            addCriterion("nativeplace1 is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplace1EqualTo(String value) {
            addCriterion("nativeplace1 =", value, "nativeplace1");
            return (Criteria) this;
        }

        public Criteria andNativeplace1NotEqualTo(String value) {
            addCriterion("nativeplace1 <>", value, "nativeplace1");
            return (Criteria) this;
        }

        public Criteria andNativeplace1GreaterThan(String value) {
            addCriterion("nativeplace1 >", value, "nativeplace1");
            return (Criteria) this;
        }

        public Criteria andNativeplace1GreaterThanOrEqualTo(String value) {
            addCriterion("nativeplace1 >=", value, "nativeplace1");
            return (Criteria) this;
        }

        public Criteria andNativeplace1LessThan(String value) {
            addCriterion("nativeplace1 <", value, "nativeplace1");
            return (Criteria) this;
        }

        public Criteria andNativeplace1LessThanOrEqualTo(String value) {
            addCriterion("nativeplace1 <=", value, "nativeplace1");
            return (Criteria) this;
        }

        public Criteria andNativeplace1Like(String value) {
            addCriterion("nativeplace1 like", value, "nativeplace1");
            return (Criteria) this;
        }

        public Criteria andNativeplace1NotLike(String value) {
            addCriterion("nativeplace1 not like", value, "nativeplace1");
            return (Criteria) this;
        }

        public Criteria andNativeplace1In(List<String> values) {
            addCriterion("nativeplace1 in", values, "nativeplace1");
            return (Criteria) this;
        }

        public Criteria andNativeplace1NotIn(List<String> values) {
            addCriterion("nativeplace1 not in", values, "nativeplace1");
            return (Criteria) this;
        }

        public Criteria andNativeplace1Between(String value1, String value2) {
            addCriterion("nativeplace1 between", value1, value2, "nativeplace1");
            return (Criteria) this;
        }

        public Criteria andNativeplace1NotBetween(String value1, String value2) {
            addCriterion("nativeplace1 not between", value1, value2, "nativeplace1");
            return (Criteria) this;
        }

        public Criteria andNativeplace2IsNull() {
            addCriterion("nativeplace2 is null");
            return (Criteria) this;
        }

        public Criteria andNativeplace2IsNotNull() {
            addCriterion("nativeplace2 is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplace2EqualTo(String value) {
            addCriterion("nativeplace2 =", value, "nativeplace2");
            return (Criteria) this;
        }

        public Criteria andNativeplace2NotEqualTo(String value) {
            addCriterion("nativeplace2 <>", value, "nativeplace2");
            return (Criteria) this;
        }

        public Criteria andNativeplace2GreaterThan(String value) {
            addCriterion("nativeplace2 >", value, "nativeplace2");
            return (Criteria) this;
        }

        public Criteria andNativeplace2GreaterThanOrEqualTo(String value) {
            addCriterion("nativeplace2 >=", value, "nativeplace2");
            return (Criteria) this;
        }

        public Criteria andNativeplace2LessThan(String value) {
            addCriterion("nativeplace2 <", value, "nativeplace2");
            return (Criteria) this;
        }

        public Criteria andNativeplace2LessThanOrEqualTo(String value) {
            addCriterion("nativeplace2 <=", value, "nativeplace2");
            return (Criteria) this;
        }

        public Criteria andNativeplace2Like(String value) {
            addCriterion("nativeplace2 like", value, "nativeplace2");
            return (Criteria) this;
        }

        public Criteria andNativeplace2NotLike(String value) {
            addCriterion("nativeplace2 not like", value, "nativeplace2");
            return (Criteria) this;
        }

        public Criteria andNativeplace2In(List<String> values) {
            addCriterion("nativeplace2 in", values, "nativeplace2");
            return (Criteria) this;
        }

        public Criteria andNativeplace2NotIn(List<String> values) {
            addCriterion("nativeplace2 not in", values, "nativeplace2");
            return (Criteria) this;
        }

        public Criteria andNativeplace2Between(String value1, String value2) {
            addCriterion("nativeplace2 between", value1, value2, "nativeplace2");
            return (Criteria) this;
        }

        public Criteria andNativeplace2NotBetween(String value1, String value2) {
            addCriterion("nativeplace2 not between", value1, value2, "nativeplace2");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("birthDate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("birthDate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(String value) {
            addCriterion("birthDate =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(String value) {
            addCriterion("birthDate <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(String value) {
            addCriterion("birthDate >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(String value) {
            addCriterion("birthDate >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(String value) {
            addCriterion("birthDate <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(String value) {
            addCriterion("birthDate <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLike(String value) {
            addCriterion("birthDate like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotLike(String value) {
            addCriterion("birthDate not like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<String> values) {
            addCriterion("birthDate in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<String> values) {
            addCriterion("birthDate not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(String value1, String value2) {
            addCriterion("birthDate between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(String value1, String value2) {
            addCriterion("birthDate not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNull() {
            addCriterion("occupation is null");
            return (Criteria) this;
        }

        public Criteria andOccupationIsNotNull() {
            addCriterion("occupation is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationEqualTo(String value) {
            addCriterion("occupation =", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotEqualTo(String value) {
            addCriterion("occupation <>", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThan(String value) {
            addCriterion("occupation >", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationGreaterThanOrEqualTo(String value) {
            addCriterion("occupation >=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThan(String value) {
            addCriterion("occupation <", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLessThanOrEqualTo(String value) {
            addCriterion("occupation <=", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationLike(String value) {
            addCriterion("occupation like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotLike(String value) {
            addCriterion("occupation not like", value, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationIn(List<String> values) {
            addCriterion("occupation in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotIn(List<String> values) {
            addCriterion("occupation not in", values, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationBetween(String value1, String value2) {
            addCriterion("occupation between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andOccupationNotBetween(String value1, String value2) {
            addCriterion("occupation not between", value1, value2, "occupation");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("QQ =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("QQ <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("QQ >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("QQ <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("QQ like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("QQ in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("QQ not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
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

        public Criteria andSpousephoneIsNull() {
            addCriterion("spousePhone is null");
            return (Criteria) this;
        }

        public Criteria andSpousephoneIsNotNull() {
            addCriterion("spousePhone is not null");
            return (Criteria) this;
        }

        public Criteria andSpousephoneEqualTo(String value) {
            addCriterion("spousePhone =", value, "spousephone");
            return (Criteria) this;
        }

        public Criteria andSpousephoneNotEqualTo(String value) {
            addCriterion("spousePhone <>", value, "spousephone");
            return (Criteria) this;
        }

        public Criteria andSpousephoneGreaterThan(String value) {
            addCriterion("spousePhone >", value, "spousephone");
            return (Criteria) this;
        }

        public Criteria andSpousephoneGreaterThanOrEqualTo(String value) {
            addCriterion("spousePhone >=", value, "spousephone");
            return (Criteria) this;
        }

        public Criteria andSpousephoneLessThan(String value) {
            addCriterion("spousePhone <", value, "spousephone");
            return (Criteria) this;
        }

        public Criteria andSpousephoneLessThanOrEqualTo(String value) {
            addCriterion("spousePhone <=", value, "spousephone");
            return (Criteria) this;
        }

        public Criteria andSpousephoneLike(String value) {
            addCriterion("spousePhone like", value, "spousephone");
            return (Criteria) this;
        }

        public Criteria andSpousephoneNotLike(String value) {
            addCriterion("spousePhone not like", value, "spousephone");
            return (Criteria) this;
        }

        public Criteria andSpousephoneIn(List<String> values) {
            addCriterion("spousePhone in", values, "spousephone");
            return (Criteria) this;
        }

        public Criteria andSpousephoneNotIn(List<String> values) {
            addCriterion("spousePhone not in", values, "spousephone");
            return (Criteria) this;
        }

        public Criteria andSpousephoneBetween(String value1, String value2) {
            addCriterion("spousePhone between", value1, value2, "spousephone");
            return (Criteria) this;
        }

        public Criteria andSpousephoneNotBetween(String value1, String value2) {
            addCriterion("spousePhone not between", value1, value2, "spousephone");
            return (Criteria) this;
        }

        public Criteria andKin1IsNull() {
            addCriterion("kin1 is null");
            return (Criteria) this;
        }

        public Criteria andKin1IsNotNull() {
            addCriterion("kin1 is not null");
            return (Criteria) this;
        }

        public Criteria andKin1EqualTo(String value) {
            addCriterion("kin1 =", value, "kin1");
            return (Criteria) this;
        }

        public Criteria andKin1NotEqualTo(String value) {
            addCriterion("kin1 <>", value, "kin1");
            return (Criteria) this;
        }

        public Criteria andKin1GreaterThan(String value) {
            addCriterion("kin1 >", value, "kin1");
            return (Criteria) this;
        }

        public Criteria andKin1GreaterThanOrEqualTo(String value) {
            addCriterion("kin1 >=", value, "kin1");
            return (Criteria) this;
        }

        public Criteria andKin1LessThan(String value) {
            addCriterion("kin1 <", value, "kin1");
            return (Criteria) this;
        }

        public Criteria andKin1LessThanOrEqualTo(String value) {
            addCriterion("kin1 <=", value, "kin1");
            return (Criteria) this;
        }

        public Criteria andKin1Like(String value) {
            addCriterion("kin1 like", value, "kin1");
            return (Criteria) this;
        }

        public Criteria andKin1NotLike(String value) {
            addCriterion("kin1 not like", value, "kin1");
            return (Criteria) this;
        }

        public Criteria andKin1In(List<String> values) {
            addCriterion("kin1 in", values, "kin1");
            return (Criteria) this;
        }

        public Criteria andKin1NotIn(List<String> values) {
            addCriterion("kin1 not in", values, "kin1");
            return (Criteria) this;
        }

        public Criteria andKin1Between(String value1, String value2) {
            addCriterion("kin1 between", value1, value2, "kin1");
            return (Criteria) this;
        }

        public Criteria andKin1NotBetween(String value1, String value2) {
            addCriterion("kin1 not between", value1, value2, "kin1");
            return (Criteria) this;
        }

        public Criteria andTelnum1IsNull() {
            addCriterion("telNum1 is null");
            return (Criteria) this;
        }

        public Criteria andTelnum1IsNotNull() {
            addCriterion("telNum1 is not null");
            return (Criteria) this;
        }

        public Criteria andTelnum1EqualTo(String value) {
            addCriterion("telNum1 =", value, "telnum1");
            return (Criteria) this;
        }

        public Criteria andTelnum1NotEqualTo(String value) {
            addCriterion("telNum1 <>", value, "telnum1");
            return (Criteria) this;
        }

        public Criteria andTelnum1GreaterThan(String value) {
            addCriterion("telNum1 >", value, "telnum1");
            return (Criteria) this;
        }

        public Criteria andTelnum1GreaterThanOrEqualTo(String value) {
            addCriterion("telNum1 >=", value, "telnum1");
            return (Criteria) this;
        }

        public Criteria andTelnum1LessThan(String value) {
            addCriterion("telNum1 <", value, "telnum1");
            return (Criteria) this;
        }

        public Criteria andTelnum1LessThanOrEqualTo(String value) {
            addCriterion("telNum1 <=", value, "telnum1");
            return (Criteria) this;
        }

        public Criteria andTelnum1Like(String value) {
            addCriterion("telNum1 like", value, "telnum1");
            return (Criteria) this;
        }

        public Criteria andTelnum1NotLike(String value) {
            addCriterion("telNum1 not like", value, "telnum1");
            return (Criteria) this;
        }

        public Criteria andTelnum1In(List<String> values) {
            addCriterion("telNum1 in", values, "telnum1");
            return (Criteria) this;
        }

        public Criteria andTelnum1NotIn(List<String> values) {
            addCriterion("telNum1 not in", values, "telnum1");
            return (Criteria) this;
        }

        public Criteria andTelnum1Between(String value1, String value2) {
            addCriterion("telNum1 between", value1, value2, "telnum1");
            return (Criteria) this;
        }

        public Criteria andTelnum1NotBetween(String value1, String value2) {
            addCriterion("telNum1 not between", value1, value2, "telnum1");
            return (Criteria) this;
        }

        public Criteria andKin2IsNull() {
            addCriterion("kin2 is null");
            return (Criteria) this;
        }

        public Criteria andKin2IsNotNull() {
            addCriterion("kin2 is not null");
            return (Criteria) this;
        }

        public Criteria andKin2EqualTo(String value) {
            addCriterion("kin2 =", value, "kin2");
            return (Criteria) this;
        }

        public Criteria andKin2NotEqualTo(String value) {
            addCriterion("kin2 <>", value, "kin2");
            return (Criteria) this;
        }

        public Criteria andKin2GreaterThan(String value) {
            addCriterion("kin2 >", value, "kin2");
            return (Criteria) this;
        }

        public Criteria andKin2GreaterThanOrEqualTo(String value) {
            addCriterion("kin2 >=", value, "kin2");
            return (Criteria) this;
        }

        public Criteria andKin2LessThan(String value) {
            addCriterion("kin2 <", value, "kin2");
            return (Criteria) this;
        }

        public Criteria andKin2LessThanOrEqualTo(String value) {
            addCriterion("kin2 <=", value, "kin2");
            return (Criteria) this;
        }

        public Criteria andKin2Like(String value) {
            addCriterion("kin2 like", value, "kin2");
            return (Criteria) this;
        }

        public Criteria andKin2NotLike(String value) {
            addCriterion("kin2 not like", value, "kin2");
            return (Criteria) this;
        }

        public Criteria andKin2In(List<String> values) {
            addCriterion("kin2 in", values, "kin2");
            return (Criteria) this;
        }

        public Criteria andKin2NotIn(List<String> values) {
            addCriterion("kin2 not in", values, "kin2");
            return (Criteria) this;
        }

        public Criteria andKin2Between(String value1, String value2) {
            addCriterion("kin2 between", value1, value2, "kin2");
            return (Criteria) this;
        }

        public Criteria andKin2NotBetween(String value1, String value2) {
            addCriterion("kin2 not between", value1, value2, "kin2");
            return (Criteria) this;
        }

        public Criteria andTelnum2IsNull() {
            addCriterion("telNum2 is null");
            return (Criteria) this;
        }

        public Criteria andTelnum2IsNotNull() {
            addCriterion("telNum2 is not null");
            return (Criteria) this;
        }

        public Criteria andTelnum2EqualTo(String value) {
            addCriterion("telNum2 =", value, "telnum2");
            return (Criteria) this;
        }

        public Criteria andTelnum2NotEqualTo(String value) {
            addCriterion("telNum2 <>", value, "telnum2");
            return (Criteria) this;
        }

        public Criteria andTelnum2GreaterThan(String value) {
            addCriterion("telNum2 >", value, "telnum2");
            return (Criteria) this;
        }

        public Criteria andTelnum2GreaterThanOrEqualTo(String value) {
            addCriterion("telNum2 >=", value, "telnum2");
            return (Criteria) this;
        }

        public Criteria andTelnum2LessThan(String value) {
            addCriterion("telNum2 <", value, "telnum2");
            return (Criteria) this;
        }

        public Criteria andTelnum2LessThanOrEqualTo(String value) {
            addCriterion("telNum2 <=", value, "telnum2");
            return (Criteria) this;
        }

        public Criteria andTelnum2Like(String value) {
            addCriterion("telNum2 like", value, "telnum2");
            return (Criteria) this;
        }

        public Criteria andTelnum2NotLike(String value) {
            addCriterion("telNum2 not like", value, "telnum2");
            return (Criteria) this;
        }

        public Criteria andTelnum2In(List<String> values) {
            addCriterion("telNum2 in", values, "telnum2");
            return (Criteria) this;
        }

        public Criteria andTelnum2NotIn(List<String> values) {
            addCriterion("telNum2 not in", values, "telnum2");
            return (Criteria) this;
        }

        public Criteria andTelnum2Between(String value1, String value2) {
            addCriterion("telNum2 between", value1, value2, "telnum2");
            return (Criteria) this;
        }

        public Criteria andTelnum2NotBetween(String value1, String value2) {
            addCriterion("telNum2 not between", value1, value2, "telnum2");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNull() {
            addCriterion("residence is null");
            return (Criteria) this;
        }

        public Criteria andResidenceIsNotNull() {
            addCriterion("residence is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceEqualTo(String value) {
            addCriterion("residence =", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotEqualTo(String value) {
            addCriterion("residence <>", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThan(String value) {
            addCriterion("residence >", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceGreaterThanOrEqualTo(String value) {
            addCriterion("residence >=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThan(String value) {
            addCriterion("residence <", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLessThanOrEqualTo(String value) {
            addCriterion("residence <=", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceLike(String value) {
            addCriterion("residence like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotLike(String value) {
            addCriterion("residence not like", value, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceIn(List<String> values) {
            addCriterion("residence in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotIn(List<String> values) {
            addCriterion("residence not in", values, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceBetween(String value1, String value2) {
            addCriterion("residence between", value1, value2, "residence");
            return (Criteria) this;
        }

        public Criteria andResidenceNotBetween(String value1, String value2) {
            addCriterion("residence not between", value1, value2, "residence");
            return (Criteria) this;
        }

        public Criteria andDetailedaddressIsNull() {
            addCriterion("detailedAddress is null");
            return (Criteria) this;
        }

        public Criteria andDetailedaddressIsNotNull() {
            addCriterion("detailedAddress is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedaddressEqualTo(String value) {
            addCriterion("detailedAddress =", value, "detailedaddress");
            return (Criteria) this;
        }

        public Criteria andDetailedaddressNotEqualTo(String value) {
            addCriterion("detailedAddress <>", value, "detailedaddress");
            return (Criteria) this;
        }

        public Criteria andDetailedaddressGreaterThan(String value) {
            addCriterion("detailedAddress >", value, "detailedaddress");
            return (Criteria) this;
        }

        public Criteria andDetailedaddressGreaterThanOrEqualTo(String value) {
            addCriterion("detailedAddress >=", value, "detailedaddress");
            return (Criteria) this;
        }

        public Criteria andDetailedaddressLessThan(String value) {
            addCriterion("detailedAddress <", value, "detailedaddress");
            return (Criteria) this;
        }

        public Criteria andDetailedaddressLessThanOrEqualTo(String value) {
            addCriterion("detailedAddress <=", value, "detailedaddress");
            return (Criteria) this;
        }

        public Criteria andDetailedaddressLike(String value) {
            addCriterion("detailedAddress like", value, "detailedaddress");
            return (Criteria) this;
        }

        public Criteria andDetailedaddressNotLike(String value) {
            addCriterion("detailedAddress not like", value, "detailedaddress");
            return (Criteria) this;
        }

        public Criteria andDetailedaddressIn(List<String> values) {
            addCriterion("detailedAddress in", values, "detailedaddress");
            return (Criteria) this;
        }

        public Criteria andDetailedaddressNotIn(List<String> values) {
            addCriterion("detailedAddress not in", values, "detailedaddress");
            return (Criteria) this;
        }

        public Criteria andDetailedaddressBetween(String value1, String value2) {
            addCriterion("detailedAddress between", value1, value2, "detailedaddress");
            return (Criteria) this;
        }

        public Criteria andDetailedaddressNotBetween(String value1, String value2) {
            addCriterion("detailedAddress not between", value1, value2, "detailedaddress");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynumIsNull() {
            addCriterion("socialSecurityNum is null");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynumIsNotNull() {
            addCriterion("socialSecurityNum is not null");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynumEqualTo(String value) {
            addCriterion("socialSecurityNum =", value, "socialsecuritynum");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynumNotEqualTo(String value) {
            addCriterion("socialSecurityNum <>", value, "socialsecuritynum");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynumGreaterThan(String value) {
            addCriterion("socialSecurityNum >", value, "socialsecuritynum");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynumGreaterThanOrEqualTo(String value) {
            addCriterion("socialSecurityNum >=", value, "socialsecuritynum");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynumLessThan(String value) {
            addCriterion("socialSecurityNum <", value, "socialsecuritynum");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynumLessThanOrEqualTo(String value) {
            addCriterion("socialSecurityNum <=", value, "socialsecuritynum");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynumLike(String value) {
            addCriterion("socialSecurityNum like", value, "socialsecuritynum");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynumNotLike(String value) {
            addCriterion("socialSecurityNum not like", value, "socialsecuritynum");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynumIn(List<String> values) {
            addCriterion("socialSecurityNum in", values, "socialsecuritynum");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynumNotIn(List<String> values) {
            addCriterion("socialSecurityNum not in", values, "socialsecuritynum");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynumBetween(String value1, String value2) {
            addCriterion("socialSecurityNum between", value1, value2, "socialsecuritynum");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritynumNotBetween(String value1, String value2) {
            addCriterion("socialSecurityNum not between", value1, value2, "socialsecuritynum");
            return (Criteria) this;
        }

        public Criteria andFamilyrelationIsNull() {
            addCriterion("familyRelation is null");
            return (Criteria) this;
        }

        public Criteria andFamilyrelationIsNotNull() {
            addCriterion("familyRelation is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyrelationEqualTo(String value) {
            addCriterion("familyRelation =", value, "familyrelation");
            return (Criteria) this;
        }

        public Criteria andFamilyrelationNotEqualTo(String value) {
            addCriterion("familyRelation <>", value, "familyrelation");
            return (Criteria) this;
        }

        public Criteria andFamilyrelationGreaterThan(String value) {
            addCriterion("familyRelation >", value, "familyrelation");
            return (Criteria) this;
        }

        public Criteria andFamilyrelationGreaterThanOrEqualTo(String value) {
            addCriterion("familyRelation >=", value, "familyrelation");
            return (Criteria) this;
        }

        public Criteria andFamilyrelationLessThan(String value) {
            addCriterion("familyRelation <", value, "familyrelation");
            return (Criteria) this;
        }

        public Criteria andFamilyrelationLessThanOrEqualTo(String value) {
            addCriterion("familyRelation <=", value, "familyrelation");
            return (Criteria) this;
        }

        public Criteria andFamilyrelationLike(String value) {
            addCriterion("familyRelation like", value, "familyrelation");
            return (Criteria) this;
        }

        public Criteria andFamilyrelationNotLike(String value) {
            addCriterion("familyRelation not like", value, "familyrelation");
            return (Criteria) this;
        }

        public Criteria andFamilyrelationIn(List<String> values) {
            addCriterion("familyRelation in", values, "familyrelation");
            return (Criteria) this;
        }

        public Criteria andFamilyrelationNotIn(List<String> values) {
            addCriterion("familyRelation not in", values, "familyrelation");
            return (Criteria) this;
        }

        public Criteria andFamilyrelationBetween(String value1, String value2) {
            addCriterion("familyRelation between", value1, value2, "familyrelation");
            return (Criteria) this;
        }

        public Criteria andFamilyrelationNotBetween(String value1, String value2) {
            addCriterion("familyRelation not between", value1, value2, "familyrelation");
            return (Criteria) this;
        }

        public Criteria andAnnualhouseincomeIsNull() {
            addCriterion("annualHouseIncome is null");
            return (Criteria) this;
        }

        public Criteria andAnnualhouseincomeIsNotNull() {
            addCriterion("annualHouseIncome is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualhouseincomeEqualTo(String value) {
            addCriterion("annualHouseIncome =", value, "annualhouseincome");
            return (Criteria) this;
        }

        public Criteria andAnnualhouseincomeNotEqualTo(String value) {
            addCriterion("annualHouseIncome <>", value, "annualhouseincome");
            return (Criteria) this;
        }

        public Criteria andAnnualhouseincomeGreaterThan(String value) {
            addCriterion("annualHouseIncome >", value, "annualhouseincome");
            return (Criteria) this;
        }

        public Criteria andAnnualhouseincomeGreaterThanOrEqualTo(String value) {
            addCriterion("annualHouseIncome >=", value, "annualhouseincome");
            return (Criteria) this;
        }

        public Criteria andAnnualhouseincomeLessThan(String value) {
            addCriterion("annualHouseIncome <", value, "annualhouseincome");
            return (Criteria) this;
        }

        public Criteria andAnnualhouseincomeLessThanOrEqualTo(String value) {
            addCriterion("annualHouseIncome <=", value, "annualhouseincome");
            return (Criteria) this;
        }

        public Criteria andAnnualhouseincomeLike(String value) {
            addCriterion("annualHouseIncome like", value, "annualhouseincome");
            return (Criteria) this;
        }

        public Criteria andAnnualhouseincomeNotLike(String value) {
            addCriterion("annualHouseIncome not like", value, "annualhouseincome");
            return (Criteria) this;
        }

        public Criteria andAnnualhouseincomeIn(List<String> values) {
            addCriterion("annualHouseIncome in", values, "annualhouseincome");
            return (Criteria) this;
        }

        public Criteria andAnnualhouseincomeNotIn(List<String> values) {
            addCriterion("annualHouseIncome not in", values, "annualhouseincome");
            return (Criteria) this;
        }

        public Criteria andAnnualhouseincomeBetween(String value1, String value2) {
            addCriterion("annualHouseIncome between", value1, value2, "annualhouseincome");
            return (Criteria) this;
        }

        public Criteria andAnnualhouseincomeNotBetween(String value1, String value2) {
            addCriterion("annualHouseIncome not between", value1, value2, "annualhouseincome");
            return (Criteria) this;
        }

        public Criteria andReligiontoggleIsNull() {
            addCriterion("religionToggle is null");
            return (Criteria) this;
        }

        public Criteria andReligiontoggleIsNotNull() {
            addCriterion("religionToggle is not null");
            return (Criteria) this;
        }

        public Criteria andReligiontoggleEqualTo(String value) {
            addCriterion("religionToggle =", value, "religiontoggle");
            return (Criteria) this;
        }

        public Criteria andReligiontoggleNotEqualTo(String value) {
            addCriterion("religionToggle <>", value, "religiontoggle");
            return (Criteria) this;
        }

        public Criteria andReligiontoggleGreaterThan(String value) {
            addCriterion("religionToggle >", value, "religiontoggle");
            return (Criteria) this;
        }

        public Criteria andReligiontoggleGreaterThanOrEqualTo(String value) {
            addCriterion("religionToggle >=", value, "religiontoggle");
            return (Criteria) this;
        }

        public Criteria andReligiontoggleLessThan(String value) {
            addCriterion("religionToggle <", value, "religiontoggle");
            return (Criteria) this;
        }

        public Criteria andReligiontoggleLessThanOrEqualTo(String value) {
            addCriterion("religionToggle <=", value, "religiontoggle");
            return (Criteria) this;
        }

        public Criteria andReligiontoggleLike(String value) {
            addCriterion("religionToggle like", value, "religiontoggle");
            return (Criteria) this;
        }

        public Criteria andReligiontoggleNotLike(String value) {
            addCriterion("religionToggle not like", value, "religiontoggle");
            return (Criteria) this;
        }

        public Criteria andReligiontoggleIn(List<String> values) {
            addCriterion("religionToggle in", values, "religiontoggle");
            return (Criteria) this;
        }

        public Criteria andReligiontoggleNotIn(List<String> values) {
            addCriterion("religionToggle not in", values, "religiontoggle");
            return (Criteria) this;
        }

        public Criteria andReligiontoggleBetween(String value1, String value2) {
            addCriterion("religionToggle between", value1, value2, "religiontoggle");
            return (Criteria) this;
        }

        public Criteria andReligiontoggleNotBetween(String value1, String value2) {
            addCriterion("religionToggle not between", value1, value2, "religiontoggle");
            return (Criteria) this;
        }

        public Criteria andReligionIsNull() {
            addCriterion("religion is null");
            return (Criteria) this;
        }

        public Criteria andReligionIsNotNull() {
            addCriterion("religion is not null");
            return (Criteria) this;
        }

        public Criteria andReligionEqualTo(String value) {
            addCriterion("religion =", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotEqualTo(String value) {
            addCriterion("religion <>", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionGreaterThan(String value) {
            addCriterion("religion >", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionGreaterThanOrEqualTo(String value) {
            addCriterion("religion >=", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionLessThan(String value) {
            addCriterion("religion <", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionLessThanOrEqualTo(String value) {
            addCriterion("religion <=", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionLike(String value) {
            addCriterion("religion like", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotLike(String value) {
            addCriterion("religion not like", value, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionIn(List<String> values) {
            addCriterion("religion in", values, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotIn(List<String> values) {
            addCriterion("religion not in", values, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionBetween(String value1, String value2) {
            addCriterion("religion between", value1, value2, "religion");
            return (Criteria) this;
        }

        public Criteria andReligionNotBetween(String value1, String value2) {
            addCriterion("religion not between", value1, value2, "religion");
            return (Criteria) this;
        }

        public Criteria andExplainIsNull() {
            addCriterion("explain is null");
            return (Criteria) this;
        }

        public Criteria andExplainIsNotNull() {
            addCriterion("explain is not null");
            return (Criteria) this;
        }

        public Criteria andExplainEqualTo(String value) {
            addCriterion("explain =", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotEqualTo(String value) {
            addCriterion("explain <>", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainGreaterThan(String value) {
            addCriterion("explain >", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainGreaterThanOrEqualTo(String value) {
            addCriterion("explain >=", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLessThan(String value) {
            addCriterion("explain <", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLessThanOrEqualTo(String value) {
            addCriterion("explain <=", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainLike(String value) {
            addCriterion("explain like", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotLike(String value) {
            addCriterion("explain not like", value, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainIn(List<String> values) {
            addCriterion("explain in", values, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotIn(List<String> values) {
            addCriterion("explain not in", values, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainBetween(String value1, String value2) {
            addCriterion("explain between", value1, value2, "explain");
            return (Criteria) this;
        }

        public Criteria andExplainNotBetween(String value1, String value2) {
            addCriterion("explain not between", value1, value2, "explain");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andDelflgIsNull() {
            addCriterion("delflg is null");
            return (Criteria) this;
        }

        public Criteria andDelflgIsNotNull() {
            addCriterion("delflg is not null");
            return (Criteria) this;
        }

        public Criteria andDelflgEqualTo(Integer value) {
            addCriterion("delflg =", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgNotEqualTo(Integer value) {
            addCriterion("delflg <>", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgGreaterThan(Integer value) {
            addCriterion("delflg >", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgGreaterThanOrEqualTo(Integer value) {
            addCriterion("delflg >=", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgLessThan(Integer value) {
            addCriterion("delflg <", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgLessThanOrEqualTo(Integer value) {
            addCriterion("delflg <=", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgIn(List<Integer> values) {
            addCriterion("delflg in", values, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgNotIn(List<Integer> values) {
            addCriterion("delflg not in", values, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgBetween(Integer value1, Integer value2) {
            addCriterion("delflg between", value1, value2, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgNotBetween(Integer value1, Integer value2) {
            addCriterion("delflg not between", value1, value2, "delflg");
            return (Criteria) this;
        }

        public Criteria andWorkunitIsNull() {
            addCriterion("workUnit is null");
            return (Criteria) this;
        }

        public Criteria andWorkunitIsNotNull() {
            addCriterion("workUnit is not null");
            return (Criteria) this;
        }

        public Criteria andWorkunitEqualTo(String value) {
            addCriterion("workUnit =", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotEqualTo(String value) {
            addCriterion("workUnit <>", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitGreaterThan(String value) {
            addCriterion("workUnit >", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitGreaterThanOrEqualTo(String value) {
            addCriterion("workUnit >=", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitLessThan(String value) {
            addCriterion("workUnit <", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitLessThanOrEqualTo(String value) {
            addCriterion("workUnit <=", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitLike(String value) {
            addCriterion("workUnit like", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotLike(String value) {
            addCriterion("workUnit not like", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitIn(List<String> values) {
            addCriterion("workUnit in", values, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotIn(List<String> values) {
            addCriterion("workUnit not in", values, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitBetween(String value1, String value2) {
            addCriterion("workUnit between", value1, value2, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotBetween(String value1, String value2) {
            addCriterion("workUnit not between", value1, value2, "workunit");
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
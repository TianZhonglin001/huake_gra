package bean;

import java.util.ArrayList;
import java.util.List;

public class situationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public situationExample() {
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

        public Criteria andSnoIsNull() {
            addCriterion("sno is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("sno is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(String value) {
            addCriterion("sno =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(String value) {
            addCriterion("sno <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(String value) {
            addCriterion("sno >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(String value) {
            addCriterion("sno >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(String value) {
            addCriterion("sno <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(String value) {
            addCriterion("sno <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLike(String value) {
            addCriterion("sno like", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotLike(String value) {
            addCriterion("sno not like", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<String> values) {
            addCriterion("sno in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<String> values) {
            addCriterion("sno not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(String value1, String value2) {
            addCriterion("sno between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(String value1, String value2) {
            addCriterion("sno not between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSmajorIsNull() {
            addCriterion("smajor is null");
            return (Criteria) this;
        }

        public Criteria andSmajorIsNotNull() {
            addCriterion("smajor is not null");
            return (Criteria) this;
        }

        public Criteria andSmajorEqualTo(String value) {
            addCriterion("smajor =", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotEqualTo(String value) {
            addCriterion("smajor <>", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorGreaterThan(String value) {
            addCriterion("smajor >", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorGreaterThanOrEqualTo(String value) {
            addCriterion("smajor >=", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorLessThan(String value) {
            addCriterion("smajor <", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorLessThanOrEqualTo(String value) {
            addCriterion("smajor <=", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorLike(String value) {
            addCriterion("smajor like", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotLike(String value) {
            addCriterion("smajor not like", value, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorIn(List<String> values) {
            addCriterion("smajor in", values, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotIn(List<String> values) {
            addCriterion("smajor not in", values, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorBetween(String value1, String value2) {
            addCriterion("smajor between", value1, value2, "smajor");
            return (Criteria) this;
        }

        public Criteria andSmajorNotBetween(String value1, String value2) {
            addCriterion("smajor not between", value1, value2, "smajor");
            return (Criteria) this;
        }

        public Criteria andSchooseIsNull() {
            addCriterion("schoose is null");
            return (Criteria) this;
        }

        public Criteria andSchooseIsNotNull() {
            addCriterion("schoose is not null");
            return (Criteria) this;
        }

        public Criteria andSchooseEqualTo(Integer value) {
            addCriterion("schoose =", value, "schoose");
            return (Criteria) this;
        }

        public Criteria andSchooseNotEqualTo(Integer value) {
            addCriterion("schoose <>", value, "schoose");
            return (Criteria) this;
        }

        public Criteria andSchooseGreaterThan(Integer value) {
            addCriterion("schoose >", value, "schoose");
            return (Criteria) this;
        }

        public Criteria andSchooseGreaterThanOrEqualTo(Integer value) {
            addCriterion("schoose >=", value, "schoose");
            return (Criteria) this;
        }

        public Criteria andSchooseLessThan(Integer value) {
            addCriterion("schoose <", value, "schoose");
            return (Criteria) this;
        }

        public Criteria andSchooseLessThanOrEqualTo(Integer value) {
            addCriterion("schoose <=", value, "schoose");
            return (Criteria) this;
        }

        public Criteria andSchooseIn(List<Integer> values) {
            addCriterion("schoose in", values, "schoose");
            return (Criteria) this;
        }

        public Criteria andSchooseNotIn(List<Integer> values) {
            addCriterion("schoose not in", values, "schoose");
            return (Criteria) this;
        }

        public Criteria andSchooseBetween(Integer value1, Integer value2) {
            addCriterion("schoose between", value1, value2, "schoose");
            return (Criteria) this;
        }

        public Criteria andSchooseNotBetween(Integer value1, Integer value2) {
            addCriterion("schoose not between", value1, value2, "schoose");
            return (Criteria) this;
        }

        public Criteria andScompanyIsNull() {
            addCriterion("scompany is null");
            return (Criteria) this;
        }

        public Criteria andScompanyIsNotNull() {
            addCriterion("scompany is not null");
            return (Criteria) this;
        }

        public Criteria andScompanyEqualTo(String value) {
            addCriterion("scompany =", value, "scompany");
            return (Criteria) this;
        }

        public Criteria andScompanyNotEqualTo(String value) {
            addCriterion("scompany <>", value, "scompany");
            return (Criteria) this;
        }

        public Criteria andScompanyGreaterThan(String value) {
            addCriterion("scompany >", value, "scompany");
            return (Criteria) this;
        }

        public Criteria andScompanyGreaterThanOrEqualTo(String value) {
            addCriterion("scompany >=", value, "scompany");
            return (Criteria) this;
        }

        public Criteria andScompanyLessThan(String value) {
            addCriterion("scompany <", value, "scompany");
            return (Criteria) this;
        }

        public Criteria andScompanyLessThanOrEqualTo(String value) {
            addCriterion("scompany <=", value, "scompany");
            return (Criteria) this;
        }

        public Criteria andScompanyLike(String value) {
            addCriterion("scompany like", value, "scompany");
            return (Criteria) this;
        }

        public Criteria andScompanyNotLike(String value) {
            addCriterion("scompany not like", value, "scompany");
            return (Criteria) this;
        }

        public Criteria andScompanyIn(List<String> values) {
            addCriterion("scompany in", values, "scompany");
            return (Criteria) this;
        }

        public Criteria andScompanyNotIn(List<String> values) {
            addCriterion("scompany not in", values, "scompany");
            return (Criteria) this;
        }

        public Criteria andScompanyBetween(String value1, String value2) {
            addCriterion("scompany between", value1, value2, "scompany");
            return (Criteria) this;
        }

        public Criteria andScompanyNotBetween(String value1, String value2) {
            addCriterion("scompany not between", value1, value2, "scompany");
            return (Criteria) this;
        }

        public Criteria andScompanyOwnerIsNull() {
            addCriterion("scompany_owner is null");
            return (Criteria) this;
        }

        public Criteria andScompanyOwnerIsNotNull() {
            addCriterion("scompany_owner is not null");
            return (Criteria) this;
        }

        public Criteria andScompanyOwnerEqualTo(String value) {
            addCriterion("scompany_owner =", value, "scompanyOwner");
            return (Criteria) this;
        }

        public Criteria andScompanyOwnerNotEqualTo(String value) {
            addCriterion("scompany_owner <>", value, "scompanyOwner");
            return (Criteria) this;
        }

        public Criteria andScompanyOwnerGreaterThan(String value) {
            addCriterion("scompany_owner >", value, "scompanyOwner");
            return (Criteria) this;
        }

        public Criteria andScompanyOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("scompany_owner >=", value, "scompanyOwner");
            return (Criteria) this;
        }

        public Criteria andScompanyOwnerLessThan(String value) {
            addCriterion("scompany_owner <", value, "scompanyOwner");
            return (Criteria) this;
        }

        public Criteria andScompanyOwnerLessThanOrEqualTo(String value) {
            addCriterion("scompany_owner <=", value, "scompanyOwner");
            return (Criteria) this;
        }

        public Criteria andScompanyOwnerLike(String value) {
            addCriterion("scompany_owner like", value, "scompanyOwner");
            return (Criteria) this;
        }

        public Criteria andScompanyOwnerNotLike(String value) {
            addCriterion("scompany_owner not like", value, "scompanyOwner");
            return (Criteria) this;
        }

        public Criteria andScompanyOwnerIn(List<String> values) {
            addCriterion("scompany_owner in", values, "scompanyOwner");
            return (Criteria) this;
        }

        public Criteria andScompanyOwnerNotIn(List<String> values) {
            addCriterion("scompany_owner not in", values, "scompanyOwner");
            return (Criteria) this;
        }

        public Criteria andScompanyOwnerBetween(String value1, String value2) {
            addCriterion("scompany_owner between", value1, value2, "scompanyOwner");
            return (Criteria) this;
        }

        public Criteria andScompanyOwnerNotBetween(String value1, String value2) {
            addCriterion("scompany_owner not between", value1, value2, "scompanyOwner");
            return (Criteria) this;
        }

        public Criteria andSlinkIsNull() {
            addCriterion("slink is null");
            return (Criteria) this;
        }

        public Criteria andSlinkIsNotNull() {
            addCriterion("slink is not null");
            return (Criteria) this;
        }

        public Criteria andSlinkEqualTo(String value) {
            addCriterion("slink =", value, "slink");
            return (Criteria) this;
        }

        public Criteria andSlinkNotEqualTo(String value) {
            addCriterion("slink <>", value, "slink");
            return (Criteria) this;
        }

        public Criteria andSlinkGreaterThan(String value) {
            addCriterion("slink >", value, "slink");
            return (Criteria) this;
        }

        public Criteria andSlinkGreaterThanOrEqualTo(String value) {
            addCriterion("slink >=", value, "slink");
            return (Criteria) this;
        }

        public Criteria andSlinkLessThan(String value) {
            addCriterion("slink <", value, "slink");
            return (Criteria) this;
        }

        public Criteria andSlinkLessThanOrEqualTo(String value) {
            addCriterion("slink <=", value, "slink");
            return (Criteria) this;
        }

        public Criteria andSlinkLike(String value) {
            addCriterion("slink like", value, "slink");
            return (Criteria) this;
        }

        public Criteria andSlinkNotLike(String value) {
            addCriterion("slink not like", value, "slink");
            return (Criteria) this;
        }

        public Criteria andSlinkIn(List<String> values) {
            addCriterion("slink in", values, "slink");
            return (Criteria) this;
        }

        public Criteria andSlinkNotIn(List<String> values) {
            addCriterion("slink not in", values, "slink");
            return (Criteria) this;
        }

        public Criteria andSlinkBetween(String value1, String value2) {
            addCriterion("slink between", value1, value2, "slink");
            return (Criteria) this;
        }

        public Criteria andSlinkNotBetween(String value1, String value2) {
            addCriterion("slink not between", value1, value2, "slink");
            return (Criteria) this;
        }

        public Criteria andSjobIsNull() {
            addCriterion("sjob is null");
            return (Criteria) this;
        }

        public Criteria andSjobIsNotNull() {
            addCriterion("sjob is not null");
            return (Criteria) this;
        }

        public Criteria andSjobEqualTo(String value) {
            addCriterion("sjob =", value, "sjob");
            return (Criteria) this;
        }

        public Criteria andSjobNotEqualTo(String value) {
            addCriterion("sjob <>", value, "sjob");
            return (Criteria) this;
        }

        public Criteria andSjobGreaterThan(String value) {
            addCriterion("sjob >", value, "sjob");
            return (Criteria) this;
        }

        public Criteria andSjobGreaterThanOrEqualTo(String value) {
            addCriterion("sjob >=", value, "sjob");
            return (Criteria) this;
        }

        public Criteria andSjobLessThan(String value) {
            addCriterion("sjob <", value, "sjob");
            return (Criteria) this;
        }

        public Criteria andSjobLessThanOrEqualTo(String value) {
            addCriterion("sjob <=", value, "sjob");
            return (Criteria) this;
        }

        public Criteria andSjobLike(String value) {
            addCriterion("sjob like", value, "sjob");
            return (Criteria) this;
        }

        public Criteria andSjobNotLike(String value) {
            addCriterion("sjob not like", value, "sjob");
            return (Criteria) this;
        }

        public Criteria andSjobIn(List<String> values) {
            addCriterion("sjob in", values, "sjob");
            return (Criteria) this;
        }

        public Criteria andSjobNotIn(List<String> values) {
            addCriterion("sjob not in", values, "sjob");
            return (Criteria) this;
        }

        public Criteria andSjobBetween(String value1, String value2) {
            addCriterion("sjob between", value1, value2, "sjob");
            return (Criteria) this;
        }

        public Criteria andSjobNotBetween(String value1, String value2) {
            addCriterion("sjob not between", value1, value2, "sjob");
            return (Criteria) this;
        }

        public Criteria andSrightIsNull() {
            addCriterion("sright is null");
            return (Criteria) this;
        }

        public Criteria andSrightIsNotNull() {
            addCriterion("sright is not null");
            return (Criteria) this;
        }

        public Criteria andSrightEqualTo(Integer value) {
            addCriterion("sright =", value, "sright");
            return (Criteria) this;
        }

        public Criteria andSrightNotEqualTo(Integer value) {
            addCriterion("sright <>", value, "sright");
            return (Criteria) this;
        }

        public Criteria andSrightGreaterThan(Integer value) {
            addCriterion("sright >", value, "sright");
            return (Criteria) this;
        }

        public Criteria andSrightGreaterThanOrEqualTo(Integer value) {
            addCriterion("sright >=", value, "sright");
            return (Criteria) this;
        }

        public Criteria andSrightLessThan(Integer value) {
            addCriterion("sright <", value, "sright");
            return (Criteria) this;
        }

        public Criteria andSrightLessThanOrEqualTo(Integer value) {
            addCriterion("sright <=", value, "sright");
            return (Criteria) this;
        }

        public Criteria andSrightIn(List<Integer> values) {
            addCriterion("sright in", values, "sright");
            return (Criteria) this;
        }

        public Criteria andSrightNotIn(List<Integer> values) {
            addCriterion("sright not in", values, "sright");
            return (Criteria) this;
        }

        public Criteria andSrightBetween(Integer value1, Integer value2) {
            addCriterion("sright between", value1, value2, "sright");
            return (Criteria) this;
        }

        public Criteria andSrightNotBetween(Integer value1, Integer value2) {
            addCriterion("sright not between", value1, value2, "sright");
            return (Criteria) this;
        }

        public Criteria andStagIsNull() {
            addCriterion("stag is null");
            return (Criteria) this;
        }

        public Criteria andStagIsNotNull() {
            addCriterion("stag is not null");
            return (Criteria) this;
        }

        public Criteria andStagEqualTo(Integer value) {
            addCriterion("stag =", value, "stag");
            return (Criteria) this;
        }

        public Criteria andStagNotEqualTo(Integer value) {
            addCriterion("stag <>", value, "stag");
            return (Criteria) this;
        }

        public Criteria andStagGreaterThan(Integer value) {
            addCriterion("stag >", value, "stag");
            return (Criteria) this;
        }

        public Criteria andStagGreaterThanOrEqualTo(Integer value) {
            addCriterion("stag >=", value, "stag");
            return (Criteria) this;
        }

        public Criteria andStagLessThan(Integer value) {
            addCriterion("stag <", value, "stag");
            return (Criteria) this;
        }

        public Criteria andStagLessThanOrEqualTo(Integer value) {
            addCriterion("stag <=", value, "stag");
            return (Criteria) this;
        }

        public Criteria andStagIn(List<Integer> values) {
            addCriterion("stag in", values, "stag");
            return (Criteria) this;
        }

        public Criteria andStagNotIn(List<Integer> values) {
            addCriterion("stag not in", values, "stag");
            return (Criteria) this;
        }

        public Criteria andStagBetween(Integer value1, Integer value2) {
            addCriterion("stag between", value1, value2, "stag");
            return (Criteria) this;
        }

        public Criteria andStagNotBetween(Integer value1, Integer value2) {
            addCriterion("stag not between", value1, value2, "stag");
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
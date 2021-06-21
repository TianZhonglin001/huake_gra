package bean;

import java.util.ArrayList;
import java.util.List;

public class jobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public jobExample() {
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

        public Criteria andJidIsNull() {
            addCriterion("jid is null");
            return (Criteria) this;
        }

        public Criteria andJidIsNotNull() {
            addCriterion("jid is not null");
            return (Criteria) this;
        }

        public Criteria andJidEqualTo(Integer value) {
            addCriterion("jid =", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotEqualTo(Integer value) {
            addCriterion("jid <>", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThan(Integer value) {
            addCriterion("jid >", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jid >=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThan(Integer value) {
            addCriterion("jid <", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThanOrEqualTo(Integer value) {
            addCriterion("jid <=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidIn(List<Integer> values) {
            addCriterion("jid in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotIn(List<Integer> values) {
            addCriterion("jid not in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidBetween(Integer value1, Integer value2) {
            addCriterion("jid between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotBetween(Integer value1, Integer value2) {
            addCriterion("jid not between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andJsnoIsNull() {
            addCriterion("jsno is null");
            return (Criteria) this;
        }

        public Criteria andJsnoIsNotNull() {
            addCriterion("jsno is not null");
            return (Criteria) this;
        }

        public Criteria andJsnoEqualTo(String value) {
            addCriterion("jsno =", value, "jsno");
            return (Criteria) this;
        }

        public Criteria andJsnoNotEqualTo(String value) {
            addCriterion("jsno <>", value, "jsno");
            return (Criteria) this;
        }

        public Criteria andJsnoGreaterThan(String value) {
            addCriterion("jsno >", value, "jsno");
            return (Criteria) this;
        }

        public Criteria andJsnoGreaterThanOrEqualTo(String value) {
            addCriterion("jsno >=", value, "jsno");
            return (Criteria) this;
        }

        public Criteria andJsnoLessThan(String value) {
            addCriterion("jsno <", value, "jsno");
            return (Criteria) this;
        }

        public Criteria andJsnoLessThanOrEqualTo(String value) {
            addCriterion("jsno <=", value, "jsno");
            return (Criteria) this;
        }

        public Criteria andJsnoLike(String value) {
            addCriterion("jsno like", value, "jsno");
            return (Criteria) this;
        }

        public Criteria andJsnoNotLike(String value) {
            addCriterion("jsno not like", value, "jsno");
            return (Criteria) this;
        }

        public Criteria andJsnoIn(List<String> values) {
            addCriterion("jsno in", values, "jsno");
            return (Criteria) this;
        }

        public Criteria andJsnoNotIn(List<String> values) {
            addCriterion("jsno not in", values, "jsno");
            return (Criteria) this;
        }

        public Criteria andJsnoBetween(String value1, String value2) {
            addCriterion("jsno between", value1, value2, "jsno");
            return (Criteria) this;
        }

        public Criteria andJsnoNotBetween(String value1, String value2) {
            addCriterion("jsno not between", value1, value2, "jsno");
            return (Criteria) this;
        }

        public Criteria andJenoIsNull() {
            addCriterion("jeno is null");
            return (Criteria) this;
        }

        public Criteria andJenoIsNotNull() {
            addCriterion("jeno is not null");
            return (Criteria) this;
        }

        public Criteria andJenoEqualTo(Integer value) {
            addCriterion("jeno =", value, "jeno");
            return (Criteria) this;
        }

        public Criteria andJenoNotEqualTo(Integer value) {
            addCriterion("jeno <>", value, "jeno");
            return (Criteria) this;
        }

        public Criteria andJenoGreaterThan(Integer value) {
            addCriterion("jeno >", value, "jeno");
            return (Criteria) this;
        }

        public Criteria andJenoGreaterThanOrEqualTo(Integer value) {
            addCriterion("jeno >=", value, "jeno");
            return (Criteria) this;
        }

        public Criteria andJenoLessThan(Integer value) {
            addCriterion("jeno <", value, "jeno");
            return (Criteria) this;
        }

        public Criteria andJenoLessThanOrEqualTo(Integer value) {
            addCriterion("jeno <=", value, "jeno");
            return (Criteria) this;
        }

        public Criteria andJenoIn(List<Integer> values) {
            addCriterion("jeno in", values, "jeno");
            return (Criteria) this;
        }

        public Criteria andJenoNotIn(List<Integer> values) {
            addCriterion("jeno not in", values, "jeno");
            return (Criteria) this;
        }

        public Criteria andJenoBetween(Integer value1, Integer value2) {
            addCriterion("jeno between", value1, value2, "jeno");
            return (Criteria) this;
        }

        public Criteria andJenoNotBetween(Integer value1, Integer value2) {
            addCriterion("jeno not between", value1, value2, "jeno");
            return (Criteria) this;
        }

        public Criteria andJresumeIsNull() {
            addCriterion("jresume is null");
            return (Criteria) this;
        }

        public Criteria andJresumeIsNotNull() {
            addCriterion("jresume is not null");
            return (Criteria) this;
        }

        public Criteria andJresumeEqualTo(String value) {
            addCriterion("jresume =", value, "jresume");
            return (Criteria) this;
        }

        public Criteria andJresumeNotEqualTo(String value) {
            addCriterion("jresume <>", value, "jresume");
            return (Criteria) this;
        }

        public Criteria andJresumeGreaterThan(String value) {
            addCriterion("jresume >", value, "jresume");
            return (Criteria) this;
        }

        public Criteria andJresumeGreaterThanOrEqualTo(String value) {
            addCriterion("jresume >=", value, "jresume");
            return (Criteria) this;
        }

        public Criteria andJresumeLessThan(String value) {
            addCriterion("jresume <", value, "jresume");
            return (Criteria) this;
        }

        public Criteria andJresumeLessThanOrEqualTo(String value) {
            addCriterion("jresume <=", value, "jresume");
            return (Criteria) this;
        }

        public Criteria andJresumeLike(String value) {
            addCriterion("jresume like", value, "jresume");
            return (Criteria) this;
        }

        public Criteria andJresumeNotLike(String value) {
            addCriterion("jresume not like", value, "jresume");
            return (Criteria) this;
        }

        public Criteria andJresumeIn(List<String> values) {
            addCriterion("jresume in", values, "jresume");
            return (Criteria) this;
        }

        public Criteria andJresumeNotIn(List<String> values) {
            addCriterion("jresume not in", values, "jresume");
            return (Criteria) this;
        }

        public Criteria andJresumeBetween(String value1, String value2) {
            addCriterion("jresume between", value1, value2, "jresume");
            return (Criteria) this;
        }

        public Criteria andJresumeNotBetween(String value1, String value2) {
            addCriterion("jresume not between", value1, value2, "jresume");
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
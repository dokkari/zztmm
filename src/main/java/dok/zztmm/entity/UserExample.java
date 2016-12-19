package dok.zztmm.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.user
     *
     * @mbg.generated Mon Dec 19 21:55:30 JST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.user
     *
     * @mbg.generated Mon Dec 19 21:55:30 JST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.user
     *
     * @mbg.generated Mon Dec 19 21:55:30 JST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbg.generated Mon Dec 19 21:55:30 JST 2016
     */
    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbg.generated Mon Dec 19 21:55:30 JST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbg.generated Mon Dec 19 21:55:30 JST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbg.generated Mon Dec 19 21:55:30 JST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbg.generated Mon Dec 19 21:55:30 JST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbg.generated Mon Dec 19 21:55:30 JST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbg.generated Mon Dec 19 21:55:30 JST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbg.generated Mon Dec 19 21:55:30 JST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbg.generated Mon Dec 19 21:55:30 JST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbg.generated Mon Dec 19 21:55:30 JST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.user
     *
     * @mbg.generated Mon Dec 19 21:55:30 JST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.user
     *
     * @mbg.generated Mon Dec 19 21:55:30 JST 2016
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNull() {
            addCriterion("phonenumber is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIsNotNull() {
            addCriterion("phonenumber is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumberEqualTo(String value) {
            addCriterion("phonenumber =", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotEqualTo(String value) {
            addCriterion("phonenumber <>", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThan(String value) {
            addCriterion("phonenumber >", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("phonenumber >=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThan(String value) {
            addCriterion("phonenumber <", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("phonenumber <=", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberLike(String value) {
            addCriterion("phonenumber like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotLike(String value) {
            addCriterion("phonenumber not like", value, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberIn(List<String> values) {
            addCriterion("phonenumber in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotIn(List<String> values) {
            addCriterion("phonenumber not in", values, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberBetween(String value1, String value2) {
            addCriterion("phonenumber between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andPhonenumberNotBetween(String value1, String value2) {
            addCriterion("phonenumber not between", value1, value2, "phonenumber");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonexpriedIsNull() {
            addCriterion("isAccountNonExpried is null");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonexpriedIsNotNull() {
            addCriterion("isAccountNonExpried is not null");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonexpriedEqualTo(Boolean value) {
            addCriterion("isAccountNonExpried =", value, "isaccountnonexpried");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonexpriedNotEqualTo(Boolean value) {
            addCriterion("isAccountNonExpried <>", value, "isaccountnonexpried");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonexpriedGreaterThan(Boolean value) {
            addCriterion("isAccountNonExpried >", value, "isaccountnonexpried");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonexpriedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isAccountNonExpried >=", value, "isaccountnonexpried");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonexpriedLessThan(Boolean value) {
            addCriterion("isAccountNonExpried <", value, "isaccountnonexpried");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonexpriedLessThanOrEqualTo(Boolean value) {
            addCriterion("isAccountNonExpried <=", value, "isaccountnonexpried");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonexpriedIn(List<Boolean> values) {
            addCriterion("isAccountNonExpried in", values, "isaccountnonexpried");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonexpriedNotIn(List<Boolean> values) {
            addCriterion("isAccountNonExpried not in", values, "isaccountnonexpried");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonexpriedBetween(Boolean value1, Boolean value2) {
            addCriterion("isAccountNonExpried between", value1, value2, "isaccountnonexpried");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonexpriedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isAccountNonExpried not between", value1, value2, "isaccountnonexpried");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonlockedIsNull() {
            addCriterion("isAccountNonLocked is null");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonlockedIsNotNull() {
            addCriterion("isAccountNonLocked is not null");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonlockedEqualTo(Boolean value) {
            addCriterion("isAccountNonLocked =", value, "isaccountnonlocked");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonlockedNotEqualTo(Boolean value) {
            addCriterion("isAccountNonLocked <>", value, "isaccountnonlocked");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonlockedGreaterThan(Boolean value) {
            addCriterion("isAccountNonLocked >", value, "isaccountnonlocked");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonlockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isAccountNonLocked >=", value, "isaccountnonlocked");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonlockedLessThan(Boolean value) {
            addCriterion("isAccountNonLocked <", value, "isaccountnonlocked");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonlockedLessThanOrEqualTo(Boolean value) {
            addCriterion("isAccountNonLocked <=", value, "isaccountnonlocked");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonlockedIn(List<Boolean> values) {
            addCriterion("isAccountNonLocked in", values, "isaccountnonlocked");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonlockedNotIn(List<Boolean> values) {
            addCriterion("isAccountNonLocked not in", values, "isaccountnonlocked");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonlockedBetween(Boolean value1, Boolean value2) {
            addCriterion("isAccountNonLocked between", value1, value2, "isaccountnonlocked");
            return (Criteria) this;
        }

        public Criteria andIsaccountnonlockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isAccountNonLocked not between", value1, value2, "isaccountnonlocked");
            return (Criteria) this;
        }

        public Criteria andIscredentialsnonexpriedIsNull() {
            addCriterion("isCredentialsNonExpried is null");
            return (Criteria) this;
        }

        public Criteria andIscredentialsnonexpriedIsNotNull() {
            addCriterion("isCredentialsNonExpried is not null");
            return (Criteria) this;
        }

        public Criteria andIscredentialsnonexpriedEqualTo(Boolean value) {
            addCriterion("isCredentialsNonExpried =", value, "iscredentialsnonexpried");
            return (Criteria) this;
        }

        public Criteria andIscredentialsnonexpriedNotEqualTo(Boolean value) {
            addCriterion("isCredentialsNonExpried <>", value, "iscredentialsnonexpried");
            return (Criteria) this;
        }

        public Criteria andIscredentialsnonexpriedGreaterThan(Boolean value) {
            addCriterion("isCredentialsNonExpried >", value, "iscredentialsnonexpried");
            return (Criteria) this;
        }

        public Criteria andIscredentialsnonexpriedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isCredentialsNonExpried >=", value, "iscredentialsnonexpried");
            return (Criteria) this;
        }

        public Criteria andIscredentialsnonexpriedLessThan(Boolean value) {
            addCriterion("isCredentialsNonExpried <", value, "iscredentialsnonexpried");
            return (Criteria) this;
        }

        public Criteria andIscredentialsnonexpriedLessThanOrEqualTo(Boolean value) {
            addCriterion("isCredentialsNonExpried <=", value, "iscredentialsnonexpried");
            return (Criteria) this;
        }

        public Criteria andIscredentialsnonexpriedIn(List<Boolean> values) {
            addCriterion("isCredentialsNonExpried in", values, "iscredentialsnonexpried");
            return (Criteria) this;
        }

        public Criteria andIscredentialsnonexpriedNotIn(List<Boolean> values) {
            addCriterion("isCredentialsNonExpried not in", values, "iscredentialsnonexpried");
            return (Criteria) this;
        }

        public Criteria andIscredentialsnonexpriedBetween(Boolean value1, Boolean value2) {
            addCriterion("isCredentialsNonExpried between", value1, value2, "iscredentialsnonexpried");
            return (Criteria) this;
        }

        public Criteria andIscredentialsnonexpriedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isCredentialsNonExpried not between", value1, value2, "iscredentialsnonexpried");
            return (Criteria) this;
        }

        public Criteria andIsenabledIsNull() {
            addCriterion("isEnabled is null");
            return (Criteria) this;
        }

        public Criteria andIsenabledIsNotNull() {
            addCriterion("isEnabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsenabledEqualTo(Boolean value) {
            addCriterion("isEnabled =", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotEqualTo(Boolean value) {
            addCriterion("isEnabled <>", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThan(Boolean value) {
            addCriterion("isEnabled >", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isEnabled >=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThan(Boolean value) {
            addCriterion("isEnabled <", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThanOrEqualTo(Boolean value) {
            addCriterion("isEnabled <=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledIn(List<Boolean> values) {
            addCriterion("isEnabled in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotIn(List<Boolean> values) {
            addCriterion("isEnabled not in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledBetween(Boolean value1, Boolean value2) {
            addCriterion("isEnabled between", value1, value2, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isEnabled not between", value1, value2, "isenabled");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.user
     *
     * @mbg.generated do_not_delete_during_merge Mon Dec 19 21:55:30 JST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.user
     *
     * @mbg.generated Mon Dec 19 21:55:30 JST 2016
     */
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
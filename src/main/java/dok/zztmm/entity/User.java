package dok.zztmm.entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class User implements UserDetails {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.user.email
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.user.password
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.user.username
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.user.realname
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	private String realname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.user.phonenumber
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	private String phonenumber;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.user.is_account_non_expired
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	private Boolean isAccountNonExpired;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.user.is_account_non_locked
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	private Boolean isAccountNonLocked;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.user.is_credentials_non_expired
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	private Boolean isCredentialsNonExpired;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.user.is_enabled
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	private Boolean isEnabled;

	private Collection<? extends GrantedAuthority> authorities;
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.user.email
	 * @return  the value of public.user.email
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.user.email
	 * @param email  the value for public.user.email
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.user.password
	 * @return  the value of public.user.password
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.user.password
	 * @param password  the value for public.user.password
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.user.username
	 * @return  the value of public.user.username
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.user.username
	 * @param username  the value for public.user.username
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.user.realname
	 * @return  the value of public.user.realname
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	public String getRealname() {
		return realname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.user.realname
	 * @param realname  the value for public.user.realname
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	public void setRealname(String realname) {
		this.realname = realname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.user.phonenumber
	 * @return  the value of public.user.phonenumber
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.user.phonenumber
	 * @param phonenumber  the value for public.user.phonenumber
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.user.is_account_non_expired
	 * @return  the value of public.user.is_account_non_expired
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	@Override
	public boolean isAccountNonExpired() {
		return isAccountNonExpired;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.user.is_account_non_expired
	 * @param isAccountNonExpired  the value for public.user.is_account_non_expired
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	public void setIsAccountNonExpired(Boolean isAccountNonExpired) {
		this.isAccountNonExpired = isAccountNonExpired;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.user.is_account_non_locked
	 * @return  the value of public.user.is_account_non_locked
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	@Override
	public boolean isAccountNonLocked() {
		return isAccountNonLocked;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.user.is_account_non_locked
	 * @param isAccountNonLocked  the value for public.user.is_account_non_locked
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	public void setIsAccountNonLocked(Boolean isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.user.is_credentials_non_expired
	 * @return  the value of public.user.is_credentials_non_expired
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		return isCredentialsNonExpired;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.user.is_credentials_non_expired
	 * @param isCredentialsNonExpired  the value for public.user.is_credentials_non_expired
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	public void setIsCredentialsNonExpired(Boolean isCredentialsNonExpired) {
		this.isCredentialsNonExpired = isCredentialsNonExpired;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.user.is_enabled
	 * @return  the value of public.user.is_enabled
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	@Override
	public boolean isEnabled() {
		return isEnabled;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.user.is_enabled
	 * @param isEnabled  the value for public.user.is_enabled
	 * @mbg.generated  Tue Dec 20 21:44:26 KST 2016
	 */
	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}
	
	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}
}
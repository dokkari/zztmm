package dok.zztmm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import dok.zztmm.service.UserService;

/**
 * 기본적인 웹 인증에 대한 부분을 구현해놓은 클래스
 * @author kjuhee
 *
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	UserService userService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()					//csrf는 별도로 처리하기 위해 여기서는 disable
			.authorizeRequests()				//요청에 대하여 권한 처리
				.anyRequest().authenticated()	//어떤 요청에라도 인증을 요구한다.
				.and()							//그리고
			.formLogin();						//Form을 이용한 로그인을 사용하겠다.
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userService)
			.passwordEncoder(new BCryptPasswordEncoder());
//			.passwordEncoder(userService.passwordEncoder());
	}
}

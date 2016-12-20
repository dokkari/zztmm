package dok.zztmm.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import dok.zztmm.entity.Authority;
import dok.zztmm.entity.AuthorityExample;
import dok.zztmm.entity.User;
import dok.zztmm.mapper.AuthorityMapper;
import dok.zztmm.mapper.UserMapper;
import dok.zztmm.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	AuthorityMapper authorityMapper;

	/**
	 * loadUserByUsername
	 * desc:spring security에서 실제로 이 메서드를 통해 유저 정보를 인식하므로 반드시 구현해주어야 한다.
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userMapper.selectByPrimaryKey(username);
		user.setAuthorities(getAuthorities(username));
		return user;
	}
	
	@Override
	public User readUser(String username) {
		User user = userMapper.selectByPrimaryKey(username);
		user.setAuthorities(getAuthorities(username));
		return user;
	}

	/**
	 * getAuthorities
	 * desc:String으로 읽어온 유저 권한을 GrantedAuthority에 맞게 변환하여 반환한다.
	 */
	@Override
	public Collection<GrantedAuthority> getAuthorities(String username) {
		List<String> string_authorities = userMapper.readAuthority(username);
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for(String authority : string_authorities) {
			authorities.add(new SimpleGrantedAuthority(authority));
		}
		return authorities;
	}

	@Override
	public void createUser(User user) {
		String rawPassword = user.getPassword();
		String encodedPassword = new BCryptPasswordEncoder().encode(rawPassword);
		user.setPassword(encodedPassword);
		userMapper.insert(user);
		
		Authority authority = new Authority();
		authority.setAuthorityName("USER");
		authority.setUsername(user.getUsername());
		authorityMapper.insert(authority);
	}

	@Override
	public void deleteUser(String username) {
		userMapper.deleteByPrimaryKey(username);
		AuthorityExample ex = new AuthorityExample();
		ex.createCriteria().andUsernameEqualTo(username);
		authorityMapper.deleteByExample(ex);
		
	}

	//나만의 암호화 로직일 때 사용..
	@Override
	public PasswordEncoder passwordEncoder() {
		return this.passwordEncoder();
	}
	
	

}

package dok.zztmm;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import dok.zztmm.entity.Authority;
import dok.zztmm.entity.User;
import dok.zztmm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class UserServiceTest {
	@Autowired
	private UserService userService;

	private User user1;
	private Authority user1auth;

	@Before
	public void setup() {
		user1 = new User();
		user1auth = new Authority();

		user1.setUsername("admin");
		user1.setPassword("admin000");
		user1.setEmail("admin@admin");
		user1.setPhonenumber("00000000000");

		user1auth.setUsername(user1.getUsername());
		user1auth.setAuthorityName("ADMIN");
	}

	@Test
	public void createUserTest() {
		userService.deleteUser(user1.getUsername());
		userService.createUser(user1);
		User user = userService.readUser(user1.getUsername());

		assertThat(user.getUsername(), is(user1.getUsername()));

		PasswordEncoder passwordEncoder = userService.passwordEncoder();
		assertThat(passwordEncoder.matches("admin000", user.getPassword()), is(true));

		Collection<? extends GrantedAuthority> authorities1 = user1.getAuthorities();
		Iterator<? extends GrantedAuthority> it = authorities1.iterator();
		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) user.getAuthorities();
		while (it.hasNext()) {
			GrantedAuthority authority = it.next();
			assertThat(authorities, hasItem(new SimpleGrantedAuthority(authority.getAuthority())));
		}
	}
}

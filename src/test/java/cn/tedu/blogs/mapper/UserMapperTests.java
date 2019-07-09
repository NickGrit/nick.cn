package cn.tedu.blogs.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.blogs.entity.User;

@RunWith(SpringRunner.class)
	@SpringBootTest
	public class UserMapperTests {
		//自动装配注解
		@Autowired
		UserMapper mapper;
		//注册
		@Test
		public void addnew() {
			User user = new User();
			user.setUsername("admin");
			user.setPassword("1234");
			System.err.println(user);
			Integer rows = mapper.addnew(user);
			System.err.println("rows=" + rows);
			System.err.println(user);
		}
		//通过用户名尽心查找
		@Test
		public void findByUsername() {
			String username = "root";
			User result = mapper.findByUsername(username);
			System.err.println(result);
		}
}

package cn.tedu.blogs.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.blogs.entity.User;
import cn.tedu.blogs.service.ex.ServiceException;

/**
 * 业务实现的方法
 * @author soft01
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {

	@Autowired
	IUserService service; 
	
	//测试登录
	@Test
	public void reg() {
		try {
			User user = new User();
			user.setUsername("Service1");
			user.setPassword("1234");
			service.reg(user); 
			System.err.println("注册成功");
		} catch (ServiceException e) {
			System.err.println(e.getClass().getName());
			System.err.println(e.getMessage());
		}
	}
	
}


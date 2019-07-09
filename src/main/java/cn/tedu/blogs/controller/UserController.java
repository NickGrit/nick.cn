package cn.tedu.blogs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.blogs.entity.User;
import cn.tedu.blogs.service.IUserService;
import cn.tedu.blogs.util.JsonResult;

/**
 * 处理用户相关请求的控制器
 */
@RestController
@RequestMapping("users")
public class UserController extends BaseController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("reg")
	public JsonResult<Void> reg(User user) {
		userService.reg(user);
		return new JsonResult<>(SUCCESS);
	}
}


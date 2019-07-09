package cn.tedu.blogs.service;

import cn.tedu.blogs.entity.User;
import cn.tedu.blogs.service.ex.InsertException;
import cn.tedu.blogs.service.ex.UsernameDuplicateException;

/**
 * 程序运行异常之后就会被我的自定义异常捕捉。
 * 从而在控制台上显示，从而更加具有可读性
 * @author soft01
 *
 */
public interface IUserService2 {
	void reg(User user) throws UsernameDuplicateException, InsertException;

}

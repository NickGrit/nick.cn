package cn.tedu.blogs.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.blogs.service.ex.InsertException;
import cn.tedu.blogs.service.ex.ServiceException;
import cn.tedu.blogs.service.ex.UsernameDuplicateException;
import cn.tedu.blogs.util.JsonResult;

public abstract class BaseController {
	
	/**
	 * 操作成功时的响应状态代号
	 */
	protected static final Integer SUCCESS = 2000;

	
		@ExceptionHandler(ServiceException.class)
		@ResponseBody
		public JsonResult<Void> handleException(Throwable e) {
			JsonResult<Void> jr = new JsonResult<>(e);
			jr.setMessage(e.getMessage());

			if (e instanceof UsernameDuplicateException) {
				jr.setState(4000);
			} else if (e instanceof InsertException) {
				jr.setState(5000);
			}

			return jr;
		}

	}

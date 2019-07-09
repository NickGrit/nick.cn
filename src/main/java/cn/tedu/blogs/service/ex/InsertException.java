package cn.tedu.blogs.service.ex;

/**
 * 插入错误异常
 * @author soft01
 *
 */
public class InsertException extends ServiceException{

	
	private static final long serialVersionUID = -9144812140531954961L;

	public InsertException() {
		super();
	}

	public InsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InsertException(String message, Throwable cause) {
		super(message, cause);
	}

	public InsertException(String message) {
		super(message);
	}

	public InsertException(Throwable cause) {
		super(cause);
	}
		
		
}

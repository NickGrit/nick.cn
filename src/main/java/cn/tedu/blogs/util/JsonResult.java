package cn.tedu.blogs.util;

public class JsonResult<T> {
	private Integer state;
	private String message;
	private T data;
	
	// SET/GET
	
	
	
	
	
	public Integer getState() {
		return state;
	}

	public JsonResult() {
		super();
	}

	public JsonResult(Throwable e) {
		super();
		this.message = e.getMessage();
	}

	public JsonResult(Integer state) {
		super();
		this.state = state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

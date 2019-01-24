package com.xrp09.demo.exception;

import com.xrp09.demo.pojo.JSONResult;

import javax.servlet.http.HttpServletRequest;

//@RestControllerAdvice
public class IMoocAjaxExceptionHandler {

//	@ExceptionHandler(value = Exception.class)
	public JSONResult defaultErrorHandler(HttpServletRequest req,
										  Exception e) throws Exception {

		e.printStackTrace();
		return JSONResult.errorException(e.getMessage());
	}
}

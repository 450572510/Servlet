package com.oaec.test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class helloworld extends HttpServlet {
	// 1.重写Servlet。
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("请求到达Servlet");
	}
	@Override
	public void init(ServletConfig config)
	throws SecurityException{
		System.out.println("init!");
	}
}

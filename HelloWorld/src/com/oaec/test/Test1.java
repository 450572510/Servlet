package com.oaec.test;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Test1 implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Test2����init����");
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		System.out.println("�����ѵ���Servlet---");
	}

	@Override
	public String getServletInfo() {
		
		return null;
	}

	@Override
	public void destroy() {
		
	}

}

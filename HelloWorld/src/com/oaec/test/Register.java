package com.oaec.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String sex = req.getParameter("sex");
		// 1).��ѡ���� req.getParameterValues �õ�����������ʽ�ķ���ֵ
		req.getParameterValues("");
		// Ȼ�����������һ�������е�ֵ
		for (String s : ���������ڵ�ֵ) {
			System.out.println(s);
		}

	}
}

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
		// 1).多选项用 req.getParameterValues 拿到的是数组形式的返回值
		req.getParameterValues("");
		// 然后遍历上面那一步括号中的值
		for (String s : 上面括号内的值) {
			System.out.println(s);
		}

	}
}

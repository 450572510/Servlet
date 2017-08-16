package com.oaec.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 读取表单数据
 */
// 1.创建 extends 的 Httpservlet ↓
public class Register extends HttpServlet {

	// 2. doGet方法   ↓ 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("username");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter w = resp.getWriter();
		w.write(name);
		w.close();
	}

	// 3. doPost 方法   ↓
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String sex = req.getParameter("sex");

		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter writer = resp.getWriter();
		writer.write("用户名<span style='color:red'>" + username + "</span><br/>"
				+ "密码<span style='color:red'>" + password + "</span><br/>");
		writer.close();
	}
}

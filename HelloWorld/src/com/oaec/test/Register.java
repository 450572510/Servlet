package com.oaec.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * ��ȡ������
 */
// 1.���� extends �� Httpservlet ��
public class Register extends HttpServlet {

	// 2. doGet����   �� 
	
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

	// 3. doPost ����   ��
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
		writer.write("�û���<span style='color:red'>" + username + "</span><br/>"
				+ "����<span style='color:red'>" + password + "</span><br/>");
		writer.close();
	}
}

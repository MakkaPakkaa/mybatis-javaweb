package com.hry.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.hry.Impl.UserDaoImplement;

import com.hry.utils.MyBatisUtils;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//使用 request.getParameter() 方法来获取表单参数的值
		String username = request.getParameter("username");
		System.out.println(username);
		String password = request.getParameter("password");
	
		response.setContentType("text/html;charset=UTF-8");
		// 连接到sqlsession
		UserDaoImplement usrdao = new UserDaoImplement();
		//对象方法获取到接口对象
		SqlSession sqlsession = new MyBatisUtils().getSession();
		System.out.println(sqlsession);
		try {
			PrintWriter pw = response.getWriter();
			
			//true登录成功，false报错
			if(usrdao.verify(username, password, sqlsession))
			{
				response.sendRedirect("loginsuccess.jsp");
			}
			else
			{
				pw.write("<script language='javascript' chaeset = 'UTF-8'>alert('Login failed!');"+"window.location.href='login.jsp';</script>");
			}

			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		
		
		
	
	

}

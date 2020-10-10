package com.hry.servlet;

import java.io.IOException;


import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.hry.dao.UserDao;
import com.hry.pojo.User;
import com.hry.utils.MyBatisUtils;


public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegistServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		//使用 request.getParameter() 方法来获取表单参数的值
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username);
		
		// 连接到sqlsession
		SqlSession sqlsession = new MyBatisUtils().getSession();
		//对象方法获取到接口对象
		UserDao userDao = sqlsession.getMapper(UserDao.class);
	
		User user = new User();
		//set方法
		user.setUsername(username);
	    user.setPassword(password);
		System.out.println(user);
	    int i = userDao.registerUser(user);
	    
	    sqlsession.commit(); //提交事务
		sqlsession.close();
		//判断跳转
        if (i > 0){
            response.sendRedirect("login.jsp");
        }
		
		
	}

}

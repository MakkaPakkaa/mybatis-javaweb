package com.hry.Impl;

import org.apache.ibatis.session.SqlSession;

import com.hry.pojo.User;

public class UserDaoImplement {
	//返回Boolean值
	public boolean verify(String username, String password, SqlSession session){
		//连接selectUserByUsername
		User user = (User) session.selectOne("com.hry.dao.UserDao.selectUserByUsername", username);
		System.out.println(user);
		
	    if(user == null){
	    	session.close();
	    	return false;
	    }
	    else if(user.getUsername().equals(username) && user.getPassword().equals(password))
		{
	    	session.close();
	    	return true;
		}
		else
		{
			session.close();
			return false;
		}
	}

}

package com.hry.dao;

import org.apache.ibatis.session.SqlSession;

import com.hry.pojo.User;

public interface UserDao {
	//查询用户
	public User selectUserByUsername(String username);
	//添加用户
	int addUser(User user);
	//修改一个用户
	int updateUser(User user);
	//删除用户
	int deleteUser(User user);
	// 注册
	int registerUser(User user);
    //	验证登录
	public boolean verify( String username, String password, SqlSession session); ;
}

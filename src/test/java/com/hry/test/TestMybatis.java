package com.hry.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.hry.Impl.UserDaoImplement;
import com.hry.dao.UserDao;
import com.hry.pojo.User;
import com.hry.utils.MyBatisUtils;

public class TestMybatis {
	@Test
	public void test01() {
		// 1、连接到sqlsession
		SqlSession sqlSession = MyBatisUtils.getSession();
		//2、对象方法获取到接口对象
		UserDao userDao = sqlSession.getMapper(UserDao.class);
		//3、接口类对象，调用其中的方法
		User selectUserById = userDao.selectUserByUsername("HHH");
		
		System.out.println(selectUserById);
//		UserDaoImplement userDaoImplement=new UserDaoImplement(); 
//		Boolean ifBoolean=userDaoImplement.verify( "HHH", "123456", sqlSession);
//		System.out.println( ifBoolean);
		//		4、输出
		
		//5、关闭sqlSession
		sqlSession.close();
	}
	@Test
	public void testAddUser() {
		  SqlSession sqlSession = MyBatisUtils.getSession();
		  UserDao userDao = sqlSession.getMapper(UserDao.class);
		  
		  User user = new User("LLL","123456");
		  int i = userDao.addUser(user);
		  System.out.println("成功插入数为："+i);
		  
		  sqlSession.commit(); //提交事务
		  sqlSession.close();
	}
	
	@Test
	public void testUpdateUser() {
		  SqlSession sqlSession = MyBatisUtils.getSession();
		  UserDao userDao = sqlSession.getMapper(UserDao.class);
		  
		  User user = userDao.selectUserByUsername("HHH");
		  user.setPassword("654321");
		  int i = userDao.updateUser(user);
		  System.out.println("成功修改数为："+i);
		  
		  sqlSession.commit(); //提交事务
		  sqlSession.close();
	}
	
	@Test
	public void testDeleteUser() {
		  SqlSession sqlSession = MyBatisUtils.getSession();
		  UserDao userDao = sqlSession.getMapper(UserDao.class);
		  
		  User user = new User("LLL","123456");
		  int i = userDao.deleteUser(user);
		  System.out.println("成功删除数为："+i);
		  
		  sqlSession.commit(); //提交事务
		  sqlSession.close();
	}
	
	@Test
	public void testR() {
		  SqlSession sqlSession = MyBatisUtils.getSession();
		  UserDao userDao = sqlSession.getMapper(UserDao.class);
		  
		  User user = new User("QQQ","123456");
		  int i = userDao.registerUser(user);
		  System.out.println("成功插入数为："+i);
		  
		  sqlSession.commit(); //提交事务
		  sqlSession.close();
	}
}

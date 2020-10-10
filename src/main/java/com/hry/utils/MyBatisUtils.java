package com.hry.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	//1、初始化SqlSessionFactory
	public static SqlSessionFactory sqlSessionFactory = null;
	static {
		try {
			//2、获取配置文件
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			//3、根据配置文件构建SqlSessionFactory
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static SqlSession getSession() {
		return sqlSessionFactory.openSession();
	}
}

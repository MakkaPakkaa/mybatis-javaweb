<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>注册</title>
</head>
<body>
	<center>
    <h1 style="color:black">注册</h1>
  
    <form name="RegistForm" action="RegistServlet" method="post">   
<!--     边框粗细为0 -->
          <table Border="0" >
                <tr >               
                        <td>账号</td>
                        <td><input type="username" name="username"></td>
                </tr>
                <tr>
                        <td>密码</td>
                        <td><input type="password" name="password">
                        </td>
                </tr>
               </table>
    <br>
            <input type="submit" value="注册">
            <a href="index.jsp"><li>返回</li></a>
           
       
    </form>
    </center>
</body>
</html>
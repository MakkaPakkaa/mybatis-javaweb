<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录界面</title>
</head>
<body>
	<center>
    <h1 style="color:black">登录</h1>
  
  <form name="loginForm" action="LoginServlet" method="post">   
<!--     边框粗细为0 -->
          <table Border="0" >
                <tr >               
                        <td>账号</td>
                        <td><input type="text" name="username"></td>
                </tr>
                <tr>
                        <td>密码</td>
                        <td><input type="password" name="password">
                        </td>
                </tr>
               </table>
    <br>
                <input type="submit" value="登录">   
                <a href="index.jsp"><li>返回</li></a>
				 
    </form>
    </center>
 
 


</form>

</body>
</html>
<%@page import="cn.bdqn.bean.News_User"%>
<%@page import="cn.bdqn.service.impl.UserServiceImpl"%>
<%@page import="cn.bdqn.service.UserService"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'doLogin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <%
    	//设置编码格式
    	request.setCharacterEncoding("utf-8");
    	//获取前台用户输入
    	String username=request.getParameter("username");
    	String password=request.getParameter("password");
    	//调用service层
    	UserService service=new UserServiceImpl();
    	News_User user=service.login(username, password);//返回一个用户对象
    	//判断用户是否输入
    	if(user==null){
    		response.sendRedirect("login.jsp");//跳转到login.jsp
    	}else{
    		//把对象存储到session作用域
    		session.setAttribute("user", user);
    		response.sendRedirect("main.jsp");//跳转到main.jsp
    	}
    	
    	
     %>
  </body>
</html>

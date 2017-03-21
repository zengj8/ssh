<%@page import="org.hibernate.Query"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.shy.entity.*, com.shy.dao.*, org.hibernate.Session, org.hibernate.Transaction, Tools.HibernateUtil" %>
<%@ page import="org.hibernate.Query, java.util.*" %>

<% 
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>works curd</title>

<script type="text/javascript">
	//var myfrom=document.getElementById("myform1");

	
	function addWorks()
	{
		var myform=document.forms[0];
		myform.action="Works/addWorks_success";
		myform.method="post";
		myform.submit();
	}
	
	function updateWorks()
	{
		var myform=document.forms[0];
		myform.action="Works/updateWorks_success";
		myform.method="post";
		myform.submit();
	}
	
	function deleteWorks()
	{
		var myform=document.forms[0];
		myform.action="Works/deleteWorks_success";
		myform.method="post";
		myform.submit();
	}

</script>

</head>
<body>
	<%
		String userId = (String)session.getAttribute("userId");
		Session s = HibernateUtil.currentSession();
		Integer num = Integer.parseInt(userId);
		Query query = s.createQuery("select work from Work work where work.user.id = ?")
                .setParameter(0, num);
		List<Object[]> list = query.list();
		for(Object[] o: list) {
			out.print(o[0]);
		}
	%>
	<c:out value="${userId}"></c:out>
	${userId}
	
</body>
</html>
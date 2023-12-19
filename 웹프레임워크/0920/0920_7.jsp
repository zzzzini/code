<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 입력한 개인 정보 </title>
</head>
<body>
   Home > Personal Information Inquiry
   <hr>
   <%
   
   request.setCharacterEncoding("UTF-8");
   
   String id = request.getParameter("p_id");
   String pw = request.getParameter("p_pw");
   String name = request.getParameter("p_name");
   
   String choice = request.getParameter("choice");
   String ph01 = request.getParameter("phone1");
   String ph02 = request.getParameter("phone2");
   String ph03 = request.getParameter("phone3");
   
   String sex = request.getParameter("gender");
   String[] hob = request.getParameterValues("hobby");
   String intro = request.getParameter("Introduction");
   
   %>
   
   <p> 아이디 : <%= id %>
   <p> 비밀번호 : <%= pw %>
   <p> 이름 : <%= name %>
   <p> 연락처 : <%= choice %> <%= ph01 %>-<%= ph02 %>-<%= ph03 %>
   <p> 성별 : <%= sex %>
   <p> 취미 : 
   <%
   
   if(hob != null)
   {
	   for(int count = 0; count < hob.length; count++)
	   {
		   out.println(" " + hob[count]);
	   }
   }
   
   %>
   
   <p> 본인 소개 : <%= intro %>
</body>
</html>
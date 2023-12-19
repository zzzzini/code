<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 입력 데이터의 길이 체크 완료 </title>
</head>
<body>
    Home > 아이디와 비밀번호 입력 성공
    <hr>
    <%
    request.setCharacterEncoding("utf-8");
    String id=request.getParameter("id");
    String passwd=request.getParameter("passwd");
    %>
    
    <p> 아이디 : <%= id %>
    <p> 비밀번호 : <%= passwd %>
</body>
</html>
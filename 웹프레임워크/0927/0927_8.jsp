<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 형식의 유효성 검사 완료</title>
</head>
<body>
    Home > 데이터 형식의 유효성 검사 성공
    <hr>
    <%
    request.setCharacterEncoding("utf-8");
    String sname = request.getParameter("sname");
    String passwd = request.getParameter("passwd");
    %>
    <p> 닉네임 : <%= sname %>
    <p> 비밀번호 : <%= passwd %>
</body>
</html>
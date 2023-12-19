<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> include 액션 태그 </title>
</head>
<body>
    Home > 1025_12.jsp 파일에서 수행한 명령
    <hr>
    <%
    Date nowTime = new Date();
    %>
    현재 날짜와 시각 : <%= nowTime.toLocaleString() %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%
Connection conn = null;

String url = "jdbc:mysql://localhost:3306/odbo";
String user = "root";
String passwd = "12345678";

Class.forName("com.mysql.jdbc.Driver");
conn = DriverManager.getConnection(url, user, passwd);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
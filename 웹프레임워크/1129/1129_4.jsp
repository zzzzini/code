<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ include file = "1129_1.jsp" %>
<%
String u_id = request.getParameter("userID");
String u_pw = request.getParameter("userPW");
String u_mail = request.getParameter("userMAIL");

String sql = "insert into members(id, passwd, email) values";
sql += "('" + u_id + "', '" + u_pw + "', '" + u_mail + "')";

Statement sm = conn.createStatement();

int count = sm.executeUpdate(sql);
if(count == 1) {
	response.sendRedirect("1129_5.jsp");
} else {
	out.println("회원가입 실패!");
	response.sendRedirect("1129_3.jsp");
}

sm.close();
conn.close();
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
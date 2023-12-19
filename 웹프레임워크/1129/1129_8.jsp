<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ include file = "1129_1.jsp" %>
<%
String u_id = request.getParameter("userID");
String sql = "delete from members where id = ?";

PreparedStatement sm = conn.prepareStatement(sql);
sm.setString(1, u_id);

int count = sm.executeUpdate();

if(count == 1){
	response.sendRedirect("1129_9.jsp");
} else {
	response.sendRedirect("1129_10.jsp");
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
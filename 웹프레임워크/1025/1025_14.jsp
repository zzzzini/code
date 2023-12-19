<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> param 액션 태그 </title>
</head>
<body>
    <%
    Date nowTime = new Date();
    %>
    <jsp:forward page = "1025_15.jsp">
        <jsp:param name = "date" value = "<%= nowTime.toLocaleString() %>" />
    </jsp:forward>
</body>
</html>
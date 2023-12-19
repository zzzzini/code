<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 쿠키 삭제 </title>
</head>
<body>
    <%
    Cookie[] cooks = request.getCookies();
    
    for(int count = 0; count < cooks.length; count++)
    {
    	cooks[count].setMaxAge(0);
    	response.addCookie(cooks[count]);
    }
    
    response.sendRedirect("1025_8.jsp");
    %>
</body>
</html>
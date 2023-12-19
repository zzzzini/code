<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 쿠키 객체 정보 </title>
</head>
<body>
    Home > 쿠키 객체 정보 확인하기
    <hr>
    <%
    Cookie[] cooks = request.getCookies();
    
    out.println(" >> 쿠키의 개수 : " + cooks.length + "<br>");
    out.println("<hr>");
    
    for(int count = 0; count < cooks.length; count++)
    {
    	out.println("[" + count + "] 쿠키의 이름 : ");
    	out.println(cooks[count].getName() + "<br>");
    	out.println("[" + count + "] 쿠키의 값 : ");
    	out.println(cooks[count].getValue() + "<br>");
    	out.println("<hr>");
    }
    %>
</body>
</html>
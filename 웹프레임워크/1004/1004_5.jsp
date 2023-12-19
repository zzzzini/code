<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 세션의 유효시간 </title>
</head>
<body>
    Home > 세션의 유효시간 출력하기
    <hr>
    -- 세션 유효시간 변경 전 -- <br>
    <%
    int s_time = session.getMaxInactiveInterval() / 60;
    out.println("세션의 유효시간 : [ " + s_time + " 분 ] <br><br>");
    %>
    -- 세션 유효시간 변경 후 -- <br>
    <%
    session.setMaxInactiveInterval(60 * 5);
    s_time = session.getMaxInactiveInterval() / 60;
    out.println("세션의 유효시간 : [ " + s_time + " 분 ]");
    %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 로그인 접속 후 세션 유지 시간 </title>
</head>
<body>
    Home > 로그인 접속 후 세션을 유지한 시간 출력하기
    <hr>
    <%
    String session_id = session.getId();
    long last_time = session.getLastAccessedTime();
    long start_time = session.getCreationTime();
    long keping_time = (last_time - start_time) / 60000;
    
    out.println("1. 세션 아이디 : [ " + session_id + " ] <br>");
    out.println("2. 세션이 생성된 시간 : [ " + keping_time + " 분 ] <br>");
    %>
</body>
</html>
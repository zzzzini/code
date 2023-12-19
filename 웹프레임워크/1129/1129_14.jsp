<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ include file="1129_1.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Members List</title>
</head>
<body>
    Home > 등록 회원 관리
    <hr>
    <%
    String u_id = request.getParameter("userID");
    String u_pw = request.getParameter("userPW");
    String u_mail = request.getParameter("userMAIL");
    
    Statement sm = conn.createStatement();
    ResultSet rs = sm.executeQuery("select id, email, signuptime from members");
    
    String str = "";
    int count = 1;
    
    while (rs.next()) {
    	str += count + " : " + rs.getString("id") + " / " + rs.getString("email")
    	   + " / " + rs.getString("signuptime") + "<br>";
        count++;
    }
    out.print(str);
    
    rs.close();
    sm.close();
    conn.close();
    %>
    <hr>
    <table border="0">
        <tr>
            <td>
                <form action="1129_7.jsp" method="post" >
                    <input type="submit" value=" < 회원 탈퇴시키기 ">
                </form>
            </td>
            <td>
                <form action="1129_15.jsp" method="post" >
                    <input type="submit" value=" 로그 아웃 >">
                </form>
            </td>
        </tr>
    </table>
</body>
</html>
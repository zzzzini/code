<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 로그인</title>
</head>
<body>
    Home > 관리자 로그인
    <hr>
    <%
    String u_id = request.getParameter("uID");
    String u_pw = request.getParameter("uPW");
    
    if(u_id.equals("space") && u_pw.equals("1234"))
    {
    	session.setAttribute("memberId", u_id);
    	session.setAttribute("memberPw", u_pw);
    	
    	out.println("새로운 세션 생성 성공! <br>");
    	out.println("관리자 [ " + u_id + " ] 님이 입장하였습니다. <p>");
    }
    else
    {
    	response.sendRedirect("1129_13.jsp");
    }
    %>
    <table border="0">
        <tr>
            <td>
                <form action="1129_14.jsp" method="post">
                    <input type="submit" value=" < 등록 회원 관리하기 ">
                </form>
            </td>
            <td>
                <form action="1129_15.jsp" method="post">
                    <input type="submit" value=" 로그 아웃 >">
                </form>
            </td>
        </tr>
    </table>
</body>
</html>
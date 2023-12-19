<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 개인 정보 입력 </title>
</head>
<body>
    Home > Person Information
    <hr>
    <form action = "#" name = "person_info" method = "get">
        이름 : 
        <input type = "text" name = "p_name" size = "10"><br><br>
        
        사원코드 : 
        <input type = "text" name = "e_code" size = "10"><hr><hr>
        
        성별 : 
        <input type = "radio" name = "gender">남
        <input type = "radio" name = "gender">여 <br><br>
        
        취미 : 
        <input type = "checkbox" name = "hobby1">운동
        <input type = "checkbox" name = "hobby2">독서
        <input type = "checkbox" name = "hobby3">음악감상 <br>
        <hr> &nbsp;
        
        <input type = "submit" value = " 가입하기 " > &nbsp; &nbsp;
        <input type = "reset" value = " 다시작성 ">
   </form>
</body>
</html>
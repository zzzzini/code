<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 회원 가입 </title>
</head>
<body>
   Home > Join the Membership
   <hr>
   <form action = "0920_7.jsp" name = "person_info" method = "get">
        <fieldset style = "width:330px">
            <legend> 개인 정보 입력 </legend><p>
            
            아이디 : <br>
            <input type = "text" name = "p_id" size = "16"><br><br>
            
            비밀번호 : <br>
            <input type = "password" name = "p_pw" size = "16"><br><br>
            
            이름 : <br>
            <input type = "text" name = "p_name" size = "16"><br><br>
            
           연락처 : <br>
           <select name = "choice" style = "width:60px;height:20.5px">
                <option value = "choice"> 선택 </option>
                <option value = "KT"> KT </option>
                <option value = "SKT"> SKT </option>
                <option value = "LGU+"> LGU+ </option>
           </select>
            <input type = "text" maxlength = "3" size = "3" name = "phone1"> -
            <input type = "text" maxlength = "4" size = "4" name = "phone2"> -
            <input type = "text" maxlength = "4" size = "4" name = "phone3"><br><br>
            
            성별 : 
            <input type = "radio" name = "gender" value = "남성"> 남
            <input type = "radio" name = "gender" value = "여성"> 여 <br><br>
            
            취미 :
            <input type = "checkbox" name = "hobby" value = "운동"> 운동
            <input type = "checkbox" name = "hobby" value = "독서"> 독서
            <input type = "checkbox" name = "hobby" value = "여행"> 여행
            <input type = "checkbox" name = "hobby" value = "음악감상"> 음악감상 <br><br>
            
            본인 소개 : <br>
            <textarea name = "Introduction" cols="50" rows="3">
            </textarea>
             <hr>
             
             <div align = "center">
                <input type = "submit" value = " 가입하기 "> &nbsp;&nbsp;
                <input type = "reset" value = " 다시작성 ">
             </div><br>
        </fieldset>
   </form>

</body>
</html>
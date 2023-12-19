<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 형식의 유효성 검사</title>
<script type = "text/javascript">
function checkFun()
{
var f = document.loginForm;

var name = f.sname.value;
var regExpName = /^[a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/;

var pw = f.passwd.value;
var regExpPasswd = /^[0-9]*$/;

if (!regExpName.test(name))
    {
       alert("닉네임은 숫자로 시작할 수 없습니다.");
       f.sname.focus();
       return false;
    }
if(!regExpPasswd.test(pw))
    {
       alert("비밀번호는 숫자로만 입력해 주세요.");
       f.passwd.focus();
       return false;
    }
else return true;
}
</script>
</head>
<body>
    Home > 닉네임과 비밀번호 입력
    <hr>
    <form name = "loginForm" action = "0927_8.jsp"
    method = "post" onsubmit = "return checkFun()">
    닉네임 : <br>
    <input type = "text" name = "sname"><br><br>
    비밀번호 : <br>
    <input type = "password" name = "passwd"><br><br>
    <input type = "submit" value = " 신청하기 ">
    </form>
</body>
</html>
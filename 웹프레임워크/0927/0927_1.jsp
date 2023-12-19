<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 핸들러 함수 </title>
<script type = "text/javascript">
function checkFun()
{
	alert("추천 도서 : " + document.gradeForm.book.value + "\n" + 
			"평점 : " + document.gradeForm.grade.value);
	}
</script>
</head>
<body>
    Home > 추천 도서 평점
    <hr>
    <form name = "gradeForm">
        추천 도서 : <br>
        <input type = "text" name = "book" size = "30"><br><br>
        평점 : 
        <hr>
        <input type = "radio" name = "grade" value = "♥♥♥♥♥︎"> ♥♥♥♥♥ <br>
        <input type = "radio" name = "grade" value = "♥♥♥♥♡"> ♥♥♥♥♡ <br>
        <input type = "radio" name = "grade" value = "♥♥♥♡♡"> ♥♥♥♡♡ <br>
        <input type = "radio" name = "grade" value = "♥♥♡♡♡"> ♥♥♡♡♡ <br>
        <input type = "radio" name = "grade" value = "♥♡♡♡♡"> ♥♡♡♡♡ <br>
        <hr>&nbsp;&nbsp;
        <input type = "submit" value = " 추천하기 " onclick = "checkFun()">&nbsp;
        <input type = "reset" value = " 다시작성" >
        </form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Language Choice </title>
</head>
<body>
   Home > Language
   <hr>
   <form action = "#"  method = "get">
        <fieldset style = "width:150px">
            <legend> 언어 선택 </legend><p>
                <select name = "language">
                    <option value = "choice"> === 선택 === </option>
                    <option value = "korean"> 한국어 </option>
                    <option value = "english"> 영어 </option>
                    <option value = "chinese"> 중국어 </option>
                    <option value = "japanese"> 일본어 </option>
                    <option value = "spanish"> 스페인어 </option>
                </select>
        </fieldset>
   </form>
</body>
</html>
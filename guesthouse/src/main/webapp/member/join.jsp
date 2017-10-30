<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<a href="${initParam.rootPath }/main.jsp">메인으로 </a>
<hr>
<h1>회원가입</h1>
<form action="${initParam.rootPath}/memberInsert" method="post">


ID(email) : <input type="text" name="email"><br>
Password : <input type="password" name="password"><br>
닉네임 : <input type="text" name="nickname"><br>
휴대폰번호 : <input type="text" name="phoneNum"><br> 

<button type="submit">회원가입</button>

<br>



<c:if test="${requestScope.errorMessage != null}">
<span style="color:red"> ${requestScope.content}</span><br>
<span style="color:red">오류 : ${requestScope.errorMessage}</span>
</c:if>




</form>

</body>
</html> 

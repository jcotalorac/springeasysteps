<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
$(document).ready(function() {
	$("#id").change(function() {
		
	});
});
</script>
</head>
<body>
	<form action="registerUser" method="post">
		<pre>
		Id: <input type="text" name="id" id="id"> Name: <input type="text"
				name="name"> Email: <input type="text" name="email">
		<input type="submit" name="register">
		</pre>
	</form>
	<br/>${result}
</body>
</html>
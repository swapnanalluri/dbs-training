<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Plaese enter details</h1>
<form action="add">
<h2>
Name: <input type="text" name="name"><br>
Roll no: <input type="text" name="rollno"><br>
Age: <input type="text" name="age"><br>
<input type="submit" name="b1" value="insert"><br>
<input type="reset" name="b2" value="reset"><br>
</h2>
</form>
<form action="delete">
<h2>
Name: <input type="text" name="name">
<input type="submit" name="d1" value="delete"><br>
</h2>
</form>

</body>
</html>
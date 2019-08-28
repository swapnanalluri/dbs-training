<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add">
<h1>Technical Support Request</h1>
<hr>
Request_id: <input type="text" name="request_id"><br><br>
Email: <input type="text" name="email"><br>
Software: <select name="software">
  <option value="Microsoft Word">Microsoft Word</option>
  <option value="Microsoft Excel">Microsoft Excel</option>
</select>

Operating System: <select name="os">
  <option value="Windows">Windows</option>
  <option value="Linux">Linux</option>
</select>
Problem Description: <textarea name="problem" rows="2"></textarea>
<hr>
<button>Submit Request</button>
<a href="registerjsp.jsp">New user</a>
</form>
</body>
</html>
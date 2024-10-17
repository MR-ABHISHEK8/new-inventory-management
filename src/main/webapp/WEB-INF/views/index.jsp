<%--
  Created by IntelliJ IDEA.
  User: abhis
  Date: 17-10-2024
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hii Developer</h1>

<form action="/rest/saveUserData" method="post">
    <input type="text" id="name" name="name" placeholder="Enter Name">
    <input type="text" id="phoneno" name="phoneno" placeholder="Enter Phone No.">
    <input type="email" id="email" name="email" placeholder="Enter Email">
    <button type="submit">Save</button>
</form>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="/reg" method="post">
    <input type="text" name="name" placeholder="name">
    <br>
    <input type="number" name="age" placeholder="age">
    <br>
    <input type="text" name="login" placeholder="login">
    <br>
    <input type="password" name="password" placeholder="password">
    <br>
    <input type="number" name="id" placeholder="id">
    <br>
    <button type="submit">Registration</button>
</form>
${requestScope.message}
</body>
</html>

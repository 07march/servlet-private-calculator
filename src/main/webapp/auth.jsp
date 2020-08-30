
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Auth</title>
</head>
<body>
<form action="/autoriz" method="post">
    <input type="text" name="login" placeholder="login">
    <input type="text" name="password" placeholder="password">
    <button type="submit">Submit</button>
</form>
${requestScope.message}
</body>
</html>

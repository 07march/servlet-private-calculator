<%@ page import="by.servletapjsp.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PrivateCab</title>
</head>
<body>
<form action="/private" method="post">
    <input type="text" name="name" placeholder="${currentUser.name}">
    <input type="text" name="login" placeholder="${currentUser.login}">
    <input type="text" name="password" placeholder="${currentUser.password}">
<%--    <select name="change">--%>
<%--        <option name="name" value="name">Name</option>--%>
<%--        <option name="login" value="login">Login</option>--%>
<%--        <option name="password" value="password">Password</option>--%>
<%--    </select>--%>
    <button type="submit">Change</button>
</form>

</body>
</html>

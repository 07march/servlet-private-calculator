<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Main</title>
</head>
<body>

<%--    <%--%>
<%--        for (int i = 0; i < 10; i++) {--%>
<%--            out.println(i);--%>
<%--        }--%>
<%--    %>--%>

<%--<%!--%>
<%--    String name = "Test";--%>
<%--    String name2 = "Test";--%>
<%--    String name3 = "Test";--%>
<%--    String name4 = "Test";--%>
<%--%>--%>

<%--<h1>Hello <%=request.getAttribute("message")%></h1>--%>

<%--<%--%>
<%--    System.out.println(name);--%>
<%--    System.out.println(name2);--%>
<%--    System.out.println(name3);--%>
<%--    System.out.println(name4);--%>
<%--%>--%>

<%--<%if (2 < 5){--%>
<%--    out.println("2 < 5");--%>
<%--}%>--%>

<%--<form action="/main">--%>
<%--    <input type="text" name="name">--%>
<%--    <button type="submit">Submit</button>--%>
<%--</form>--%>
<h3> ${requestScope.message}</h3>

<c:if test="${sessionScope.currentUser == null}">
    <a href="/reg">Reg</a>
    <br>
    <a href="/autoriz">Auth</a>
</c:if>

<c:if test="${sessionScope.currentUser != null}">
    <a href="/private">PrivateCab</a>
    <br>
    <a href="/logout">Logout</a>
    <br>
    <a href="/history">History</a>
</c:if>

</body>
</html>

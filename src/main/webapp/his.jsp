<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>History</title>
</head>
<body>

<form action="/history" method="post">
    <select name="find">
        <option name="operation" value="operation">Operation</option>
        <option name="result" value="result">Result</option>
        <%--        <option name="all" value="all">AllOperations</option>--%>
    </select>

    <input type="text" name="param">
    <button type="submit">Search</button>
</form>
${requestScope.message}

<c:if test="${requestScope.visibleAll}">
    <c:forEach var="his" items="${requestScope.data}">
        <p>${his.toString()}</p>
    </c:forEach>
</c:if>
<c:if test="${requestScope.visibleFilter}">
    <c:forEach var="his" items="${requestScope.data}">
        <p>${his.toString()}</p>
    </c:forEach>
</c:if>
</body>
</html>
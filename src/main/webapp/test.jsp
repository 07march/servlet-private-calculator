
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Test</title>
</head>
<body>
<%--for(String item : list){--%>
<%----%>
<%--}--%>

<core:forEach items="${requestScope.list}" var="item">
    <h5><core:out value="Item: ${item}"/></h5>
</core:forEach>

</body>
</html>

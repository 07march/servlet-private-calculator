<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calc</title>
</head>
<body>

<form action="/calc" method="post">
    <input type="text" name="num1" placeholder="number 1">
    <br>
    <input type="text" name="num2" placeholder="number 2">
    <br>
    <input type="text" name="operation" placeholder="operation">
    <br>
    <button type="submit">Submit</button>
</form>
<h3>результат + ${requestScope.result}</h3>

</body>
</html>

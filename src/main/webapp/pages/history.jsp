<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/history" method="get">
    <ul style="list-style: decimal">
        <c:forEach items="${history}" var="res">
            <li>${res}</li>
        </c:forEach>
    </ul>
</form>
<form action="/calc">
    <button>Return Calculator</button>
</form>
<form action="/">
    <button>Return Homepage</button>
</form>

</body>
</html>

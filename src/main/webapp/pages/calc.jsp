<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <h1>Hello! It's Web Calculator_MVC ver 1.1</h1>
<%--    <img src="${pageContext.request.contextPath}images/calc_img.webp" width="200" height="200">--%>
    <img src="https://lh6.ggpht.com/sSzjjk845zcoLQl8ygiSbqmIBW_9cirFF4VLZdtfKfi7yfDrtqz6-hyDYznRMbiIfN8l=h500"width="500" height="400">
</head>
<body>
<form action="/calc" method="post">
    <input type="text" name="num1" placeholder="Number1">
    <input type="text" name="num2" placeholder="Number2">
    <select name="operation">
        <option value="sum">+</option>
        <option value="minus">-</option>
        <option value="multiply">*</option>
        <option value="div">/</option>
    </select>
    <button>Calc</button>
</form>
Result = ${result}
<form action="/">
    <button>Return in Homepage</button>
</form><form action="/history">
    <button>Show History</button>
</form>
</body>
</html>

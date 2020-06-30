<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <h1>Hello${sessionScope.user.name}! It's Web Calculator_MVC ver 1.1</h1>

    <c:if test="${!sessionScope.checkAuth}">
        <a href="/user/reg">Registration |</a>
        <a href="/user/auth">Authorisation |</a>
        <img src=" https://pbs.twimg.com/media/EA-v0BsXUAAIgTy.jpg:large"width="450" height="550">
    </c:if>


    <c:if test="${sessionScope.checkAuth}">
        <a href="/history">History |</a>
        <a href="/user/logout">Logout |</a>
        <a href="/calc">Calculator |</a>
        <img src=" http://www.produtividadenaindustria.com.br/wp-content/uploads/2015/01/Formulas.png"width="450" height="550">
    </c:if>
</head>
<body>
</body>
</html>

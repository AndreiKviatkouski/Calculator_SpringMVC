<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <h1>Hello ${sessionScope.user.name}! It's Web Calculator </h1>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

    <title>Authorization</title>
    <style>
        body{
            background-image: url("https://images.wallpaperscraft.com/image/mountains_river_trees_174732_2560x1600.jpg");
        }
    </style>
</head>
<body>
<div class="container w-25">
    <div class="row mt-5">
        <div class="col-sm">
            <form method="post" action="/user/auth">
                <div class="form-group">
                    <label for="exampleInputEmail2">Login</label>
                    <input type="text" name="login" class="form-control" id="exampleInputEmail2" aria-describedby="emailHelp" required>
                    <small id="num2" class="form-text text-muted">We'll never share your email with anyone else.</small>
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail3">Password</label>
                    <input type="password" name="password" class="form-control" id="exampleInputEmail3" aria-describedby="emailHelp" required>
                    <small id="operation" class="form-text text-muted">We'll never share your email with anyone else.</small>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>

            <c:if test="${message != null}">
                <div class="alert alert-success" role="alert">
                        ${message}
                </div>
            </c:if>

            <c:if test="${error != null}">
                <div class="alert alert-warning" role="alert">
                        ${error}
                </div>
            </c:if>
        </div>
    </div>
</div>




<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
        integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
        crossorigin="anonymous"></script>
</body>
</html>


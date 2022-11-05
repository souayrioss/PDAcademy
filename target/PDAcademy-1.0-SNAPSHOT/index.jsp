    <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

</head>
<body>
<c:if test="${ !empty message }"><p>
    <c:out value="${ message }" /></p>
</c:if>
<br/>
<form method="post" action="hello-servlet">
    <label for="email">Nom : </label>
    <input type="email" name="email" id="email" />
    <br>
    <label for="password">Nom : </label>
    <input type="password" name="password" id="password" />
    <br>
    <input type="submit" />
</form>
</body>
</html>
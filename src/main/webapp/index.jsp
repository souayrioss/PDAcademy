    <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<c:if test="${ !empty message }"><p>
    <c:out value="${ message }" /></p>
</c:if>
<br/>
<form method="post" action="hello-servlet">
    <label for="email">Nom : </label>
    <input type="text" name="email" id="email" />
    <br>
    <label for="password">Nom : </label>
    <input type="password" name="password" id="password" />
    <br>
    <input type="submit" />
</form>
</body>
</html>
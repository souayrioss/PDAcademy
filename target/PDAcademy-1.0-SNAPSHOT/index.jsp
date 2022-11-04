    <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
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
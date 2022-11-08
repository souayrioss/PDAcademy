<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 11/2/2022
  Time: 5:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>PDAcademy</title>

</head>
<body>
<c:out value="${admin.first_name}" ></c:out>
<br>
<c:out value="${sessionScope.adminConn.first_name.concat(' ').concat(sessionScope.adminConn.last_name)} " />

</body>
</html>

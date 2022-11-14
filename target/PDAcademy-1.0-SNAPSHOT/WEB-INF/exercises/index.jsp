<%--
  Created by IntelliJ IDEA.
  User: aslu
  Date: 11/7/22
  Time: 12:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>List of all activities</title>
</head>
<body>
list all activities here
<div align="center">
  <table border="1" cellpadding="5">
    <caption><h2>List of Activities</h2></caption>
    <tr>
      <th>title</th>
      <th>type</th>
      <th>description</th>
      <th>start date</th>
      <th>end date</th>
      <th>etat</th>
      <th>actions</th>
    </tr>
    <jsp:useBean id="activities" scope="request" type="java.util.List"/>
    <c:forEach items="${activities}" var="activity">
      <tr>
        <td><c:out value="${activity.title_activity}" /></td>
        <td><c:out value="${activity.activiteType}" /></td>
        <td><c:out value="${activity.description_activity}" /></td>
        <td><c:out value="${activity.start_date_activity}" /></td>
        <td><c:out value="${activity.end_date_activity}" /></td>
        <td><c:out value="${activity.etat}" /></td>

        <td>
          <a href="edit-activity?id=<c:out value='${activity.id_activity}' />">Edit</a>
          &nbsp;&nbsp;&nbsp;&nbsp;
<%--          <a href="delete?id=<c:out value='${activity.id_activity}' />">Delete</a>--%>
        </td>
      </tr>
    </c:forEach>
  </table>
</div>
</body>
</html>

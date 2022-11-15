<%--
  Created by IntelliJ IDEA.
  User: aslu
  Date: 11/14/22
  Time: 3:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
  <title>all activities</title>
</head>
<body>
list all Activities here
<div align="center">
  <table border="1" cellpadding="5">
    <caption><h2>List of activities</h2></caption>
    <tr>
      <th>title</th>
      <th>description</th>
      <th>start date</th>
      <th>end date</th>
      <th>type</th>
      <th>state</th>
      <th>responsible</th>
      <th>actions</th>
    </tr>
    <jsp:useBean id="activities" scope="request" type="java.util.List"/>
    <c:forEach items="${activities}" var="activity">
      <tr>
        <td><c:out value="${activity.title}" /></td>
        <td><c:out value="${activity.description}" /></td>
        <td><c:out value="${activity.startDate}" /></td>
        <td><c:out value="${activity.endDate}" /></td>
        <td><c:out value="${activity.activityType}" /></td>
        <td><c:out value="${activity.state}" /></td>
        <td><c:out value="${activity.responsible.getFirstName()}" /></td>
        <td>
<%--          <a href="activity?id=<c:out value='${activity.id}' />">view</a>--%>
          &nbsp;&nbsp;&nbsp;&nbsp;
          <a href="delete-activity?id=<c:out value='${activity.id}' />">Delete</a>
          &nbsp;&nbsp;
          <a href="edit-activity?id=<c:out value='${activity.id}' />">Edit</a>

        </td>
      </tr>
    </c:forEach>
  </table>
</div>
</body>
</html>

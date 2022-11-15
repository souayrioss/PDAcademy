<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aslu
  Date: 11/14/22
  Time: 3:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>all exercises</title>
</head>
<body>
list all exercises here
<div align="center">
  <table border="1" cellpadding="5">
    <caption><h2>List of exercises</h2></caption>
    <tr>
      <th>title</th>
      <th>year</th>
      <th>start date</th>
      <th>end date</th>
      <th>status</th>
      <th>Actions</th>
    </tr>
    <jsp:useBean id="exercises" scope="request" type="java.util.List"/>
    <c:forEach items="${exercises}" var="exercise">
      <tr>
        <td><c:out value="${exercise.title}" /></td>
        <td><c:out value="${exercise.year}" /></td>
        <td><c:out value="${exercise.startDate}" /></td>
        <td><c:out value="${exercise.endDate}" /></td>
        <td><c:out value="${exercise.exerciseStatus}" /></td>
        <td>
          <a href="edit-exercise?id=<c:out value='${exercise.id}' />">Edit</a>
          &nbsp;&nbsp;&nbsp;&nbsp;
          <a href="delete-exercise?id=<c:out value='${exercise.id}' />">Delete</a>
        </td>
      </tr>
    </c:forEach>
  </table>
</div>
</body>
</html>

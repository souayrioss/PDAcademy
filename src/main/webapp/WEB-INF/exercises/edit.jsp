<jsp:useBean id="exercise" scope="request" type="org.loukili.javac.entity.Exercise"/>
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
  <title>edit exercise</title>
</head>
<body>
<form method="post" action="update-exercise">
  <div>
    <input type="hidden" name="id" value="${exercise.id}">
    <label>exercise title</label><br>
    <input type="text" name="title" value="${exercise.title}">
  </div>
  <div>
    <label>exercise year</label><br>
    <input type="number" value="${exercise.year}" min="2020" max="2030" name="year">
  </div>
  <div>
    <label>start date</label>
    <input type="date" name="start-date">
  </div>
  <div>
    <label>end date</label>
    <input type="date" name="end-date">
  </div>
  <div>
    <label >exercise status</label>
    <select  name="exercise-status">
      <c:forEach items="${status}" var="enumValue">
        <option value="${enumValue}">${enumValue}</option>
      </c:forEach>
    </select>
  </div>
  <div>
    <input type="submit" name="submit" value="submit">
  </div>
</form>
</body>
</html>

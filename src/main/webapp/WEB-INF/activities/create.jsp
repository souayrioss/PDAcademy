<%--
  Created by IntelliJ IDEA.
  User: aslu
  Date: 11/14/22
  Time: 3:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>create activity</title>
</head>
<body>
<form method="post" action="insert-activity">
  <div>
    <label>activity title</label><br>
    <input type="text" name="title">
  </div>
  <div>
    <label>activity description</label><br>
    <textarea name="description" rows="4" cols="50"></textarea>
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
    <label >Choose a type for this activity:</label>
    <select  name="activity-state">
      <c:forEach items="${states}" var="enumValue">
        <option value="${enumValue}">${enumValue}</option>
      </c:forEach>
    </select>
  </div>
  <div>
    <label >Choose a type for this activity:</label>
    <select  name="activity-type">
      <c:forEach items="${activityTypes}" var="enumValue">
        <option value="${enumValue}">${enumValue}</option>
      </c:forEach>
    </select>
  </div>
  <div>
    <label >Choose a Responsible for this activity:</label>
    <select  name="responsible">
      <jsp:useBean id="responsibles" scope="request" type="java.util.List"/>
      <c:forEach items="${responsibles}" var="responsible">
        <option value="${responsible.id}">${responsible.firstName}</option>
      </c:forEach>
    </select>
  </div>
  <div>
    <input type="submit" name="submit" value="submit">
  </div>
</form>
</body>
</html>


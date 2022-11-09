<%--
  Created by IntelliJ IDEA.
  User: aslu
  Date: 11/8/22
  Time: 11:05 AM
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
    <label >Choose a type for this activity:</label>
    <select  name="activity-type">
      <c:forEach items="${activityTypes}" var="enumValue">
        <option value="${enumValue}">${enumValue}</option>
      </c:forEach>
    </select>
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
    <select  name="activity-etat">
      <c:forEach items="${etats}" var="enumValue">
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

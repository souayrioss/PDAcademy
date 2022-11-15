<jsp:useBean id="activity" scope="request" type="org.loukili.javac.entity.Activity"/>
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
  <title>edit activity</title>
</head>
<body>
<form method="post" action="update-activity">
  <div>
    <input type="hidden" name="id" value="${activity.id}">
    <label>activity title</label><br>
    <input type="text" name="title" value="${activity.title}">
  </div>
  <div>
    <label>activity description</label><br>
    <textarea name="description" rows="4" cols="50">${activity.description}</textarea>
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
    <select  name="activity-type">
      <option selected value="${activity.activityType}">${activity.activityType}</option>
      <c:forEach items="${activityTypes}" var="enumValue">
        <option value="${enumValue}">${enumValue}</option>
      </c:forEach>
    </select>
  </div>
  <div>
    <label >activity state:</label>
    <select  name="activity-state">
      <option selected value="${activity.state}">${activity.state}</option>
      <c:forEach items="${states}" var="enumValue">
        <option value="${enumValue}">${enumValue}</option>
      </c:forEach>
    </select>
  </div>
  <div>
    <label >Choose a Responsible for this activity:</label>
    <select  name="responsible">
      <option selected value="${activity.responsible.id}">${activity.responsible.firstName}</option>
      <jsp:useBean id="responsibles" scope="request" type="java.util.List"/>
      <c:forEach items="${responsibles}" var="responsible">
        <option value="${responsible.id}">${responsible.firstName}</option>
      </c:forEach>
    </select>
  </div>
  <div>
    <label >Choose exercises for this activity:</label><br>
    <select name="exercises" id="exercises" multiple>
      <jsp:useBean id="exercises" scope="request" type="java.util.List"/>
      <c:forEach items="${exercises}" var="exercise">
        <option value="${exercise.id}">${exercise.title}</option>
      </c:forEach>
    </select>
  </div>
  <div>
    <input type="submit" name="submit" value="submit">
  </div>
</form>
</body>
</html>

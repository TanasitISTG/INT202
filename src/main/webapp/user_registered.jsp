<%--
  Created by IntelliJ IDEA.
  User: God_5
  Date: 10/10/2022
  Time: 12:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registered course list</title>
</head>
<body style = "margin-left: 50px">
    <c:if test ="${message != null}">
        <h2 style = "color: red">${message}</h2>
    </c:if>
    <c:forEach items = "${courseRegistered.history}" var = "entry">
        <b>Semester: ${entry.key}</b>
        <br>
        <c:forEach items = "${entry.value}" var = "subject">
            &nbsp; &nbsp; ${subject.subjectId}, ${subject.title}, ${subject.credit}<br/>
        </c:forEach>
        <br>
    </c:forEach>
<a href="index.jsp">Back to main page</a>
</body>
</html>

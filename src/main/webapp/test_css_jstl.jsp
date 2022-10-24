<%--
  Created by IntelliJ IDEA.
  User: God_5
  Date: 10/10/2022
  Time: 10:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>test css</title>
    <style>
        .box {
            border: lightgray 1px inset;
            background-color: aliceblue;
            text-align: right;
            border-radius: 4px;
            width: 35px;
            height: 20px;
            margin: 4px;
            display: inline-block;
            padding: 2px 8px 2px 2px;
        }
    </style>
</head>
<body>
<div style="padding:10px; display:block; width:75%; margin:auto">
    <c:forEach begin="1" end="100" var="value">
        <div class="box">${value}&nbsp;</div>
    </c:forEach>
</div>
</body>
</html>

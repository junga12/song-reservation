<%--
  Created by IntelliJ IDEA.
  User: junga
  Date: 2020-05-28
  Time: 오전 12:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>reservation</title>
</head>
<body>

<table border="1">
    <tr>
        <th>no</th>
        <th>Song ID</th>
        <th>Song Name</th>
        <th>Artist ID</th>
        <th>Artist Name</th>
    </tr>
    <c:forEach items="${reservations}" var="reservation">
        <tr>
            <td>1</td>
            <td>${reservation.songId}</td>
            <td>${reservation.songName}</td>
            <td>${reservation.artistId}</td>
            <td>${reservation.artistName}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>

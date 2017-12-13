<%--
  Created by IntelliJ IDEA.
  User: Zed
  Date: 2017/12/12
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>

<table>
    <tr>
        <td>Id</td>
        <td>书名</td>
        <td>库存</td>
    </tr>
    <c:forEach var="book" items="${list}">
        <tr>
            <td>${book.bookId}</td>
            <td>${book.name}</td>
            <td>${book.number}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: yoshipc
  Date: 9/10/21
  Time: 9:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="ad" items="${ads}">
    <div class="item">
        <h3>${ad.title}</h3>
        <p>${ad.description}</p>
    </div>
</c:forEach>

</body>
</html>
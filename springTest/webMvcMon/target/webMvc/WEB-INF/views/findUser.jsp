<%--
  Created by IntelliJ IDEA.
  User: wb-xuzhenbin
  Date: 2016/6/23
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title></title>
</head>
<body>
<h1>findUser</h1>
<table>
  <c:forEach items="${users}" var="u">
    <tr>
      <td>${u.id}</td>
      <td>${u.username}</td>
      <td>${u.birthday}</td>
    </tr>
  </c:forEach>

</table>
</body>
</html>

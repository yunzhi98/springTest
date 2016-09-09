<%--
  Created by IntelliJ IDEA.
  User: wb-xuzhenbin
  Date: 2016/6/23
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ok</title>
</head>
<body>
<form action="/crawler/user/insert" method="Post">
  <input type="hidden" name="id" value="1"/>
  username: <input type="text" name="username" value="Tom"/>
  <br>
  email: <input type="text" name="email" value="tom@atguigu.com"/>
  <br>
  age: <input type="text" name="age" value="12"/>
  <br>
  <input type="submit" value="Submit"/>
</form>

</body>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
</script>

</html>

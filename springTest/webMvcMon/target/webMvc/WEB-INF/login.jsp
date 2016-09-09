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
<form action="/crawler/user/insert.json" method="post">
  <td>用户名<input type="text" name="userName" id="userName"/></td>
  <td>密码<input type="text" name="passWord" id="passWord"/></td>
  <input type="submit">
</form>

</body>
<!---
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
</script>
-->
</html>

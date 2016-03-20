<%--
  Created by IntelliJ IDEA.
  User: Lakshman
  Date: 3/6/16
  Time: 7:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logout</title>
    <%
        if (session != null) {
            session.invalidate();
            response.sendRedirect("login.jsp");
        }
    %>
</head>
<body>

</body>
</html>

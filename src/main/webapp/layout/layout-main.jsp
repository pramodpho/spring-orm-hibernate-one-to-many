<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 16/05/2019
  Time: 04:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SiteMesh example: <sitemesh:write property='title'/></title>

    <sitemesh:write property='head'/>

    <jsp:include page="inc/css.jsp"/>
    <jsp:include page="inc/js.jsp"/>
    <jsp:include page="inc/context.jsp"/>

</head>
<body>

<sitemesh:write property='title'/>
<jsp:include page="inc/header.jsp"/>

<div class='mainBody'>
    <sitemesh:write property='body'/>
</div>

<jsp:include page="inc/footer.jsp"/>

</body>
</html>

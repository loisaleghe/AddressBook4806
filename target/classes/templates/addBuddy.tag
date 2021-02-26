<%@ tag language="java" description="Application template" pageEncoding="UTF-8" %>

<%@ taglib prefix="templates" tagdir="/WEB-INF/tags/templates" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags/" %>

<%@ attribute name="css" fragment="true" %>
<%@ attribute name="js" fragment="true" %>

<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Serving Web Content</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<p th:text="'' + ${name} + 'has been added!'" />
</body>
</html>
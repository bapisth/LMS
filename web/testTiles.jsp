
<%@page import="org.apache.tiles.access.TilesAccess"%>
<%@page import="org.apache.tiles.TilesContainer"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

request.setAttribute("topStyle", "background-image: url('images/parallax/9.jpg'); padding: 120px 0;");
TilesContainer container = TilesAccess.getContainer(session.getServletContext());
container.render("laundry.testSteps", request, response); 



%>

</body>
</html>
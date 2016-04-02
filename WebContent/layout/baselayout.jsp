<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page	language="java" contentType="text/html; charset=ISO-8859-1"	pageEncoding="ISO-8859-1"%>

<html>
	<head>
		<title>Time Sheet Management - <tiles:insertAttribute name="title" ignore="true" /></title>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
		<script>
			function one(){
		    	var url = window.location.href;
		    }
		</script>
	</head>
	<body onload="one()">
		<div id="container">
			<div class="header-part"><tiles:insertAttribute name="header" ignore="true"/></div>
			<div id="menu"><tiles:insertAttribute name="menu" ignore="true"/></div>
			<div class="base-content" align="center"><tiles:insertAttribute name="content" ignore="true"/></div>
			<div class="fotter-rep"><tiles:insertAttribute name="footer" ignore="true"/></div>
		</div>
	</body>
</html>
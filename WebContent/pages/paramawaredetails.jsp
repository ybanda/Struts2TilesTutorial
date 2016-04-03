<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page	language="java" contentType="text/html; charset=ISO-8859-1"	pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<title>Request Aware</title>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link href="../css/style.css"/>
	</head>
	<body>
		<s:form>
			<div align="right">
				<s:a href="displaymenu" cssStyle="color: blue;">Menu</s:a> ||
				<s:a href="index" cssStyle="color: blue;">Logout</s:a>
			</div>
			<div>
				<table>
					<tr>
						<td>User Name </td>
						<td><s:property value="#parameters.name"/></td>
					</tr>
					<tr>
						<td>Age</td>
						<td><s:property value="#parameters.age"/> </td>
					</tr>
					<tr>
						<td>Gender</td>
						<td><s:property value="#parameters.gender"/> </td>
					</tr>
				</table>
			</div>
		</s:form>
	</body>
</html>
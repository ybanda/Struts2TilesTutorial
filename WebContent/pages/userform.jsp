<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<title>userform</title>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link href="../css/style.css"/>
	</head>
	<body>
		<s:form action="displayuser" theme="simple">
			<div align="right">
				<s:a href="displaymenu" cssStyle="color: blue;">Menu</s:a> ||
				<s:a href="index" cssStyle="color: blue;">Logout</s:a>
			</div>
			<div align="center">
				<table>
					<tr>
						<td>Name</td>
						<td><s:textfield name="userForm.name"></s:textfield> </td>
					</tr>
					<tr>
						<td>Age</td>
						<td><s:textfield name="userForm.age"></s:textfield></td>
					</tr>
					<tr>
						<td>Gender</td>
						<td><s:textfield name="userForm.gender"></s:textfield></td>
					</tr>
					<tr>
						<td>Hobby</td>
						<td><s:checkboxlist name="userForm.hobby" list="{'Music','Art','Dance'}"></s:checkboxlist> </td>
					</tr>
					<tr>
						<td>Country</td>
						<td><s:textfield name="userForm.country"></s:textfield></td>
					</tr>
					<tr>
						<td><s:submit value="Submit"></s:submit></td>
					</tr>
				</table>
			</div>
		</s:form>
	</body>
</html>
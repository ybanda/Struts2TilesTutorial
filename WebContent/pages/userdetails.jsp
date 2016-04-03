<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page	language="java" contentType="text/html; charset=ISO-8859-1"	pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<title>userdetails</title>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link href="../css/style.css"/>
	</head>
	<body>
		<s:form>
			<div align="right">
				<s:a href="displaymenu" cssStyle="color: blue;">Menu</s:a> ||
				<s:a href="index" cssStyle="color: blue;">Logout</s:a>
			</div>
			<div align="center">
				<h2>User Details</h2>
				<table border="1" style="border-collapse: collapse;" align="center" width="400px">
					<tr>
						<td class="one" align="right">User Name</td>
						<td class="two"><s:property value="userForm.name"/></td>
					</tr>
					<tr>
						<td class="one" align="right">Age</td>
						<td class="two"><s:property value="userForm.age"/></td>
					</tr>
					<tr>
						<td class="one" align="right">Gender</td>
						<td class="two"><s:property value="userForm.gender"/></td>
					</tr>
					<tr>
						<td class="one" align="right">Hobbies</td>
						<td class="two"><s:property value="userForm.hobby"/></td>
					</tr>
					<tr>
						<td class="one" align="right">Country</td>
						<td class="two"><s:property value="userForm.country"/></td>
					</tr>
				</table>
			</div>
		</s:form>
	</body>
</html>
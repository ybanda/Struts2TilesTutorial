<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@taglib uri="/struts-tags" prefix="s" %>
<html>
 
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="../css/style.css"/>
        <title>Login Page</title>
        <s:head />
</head>
 
<body>
 
<s:actionerror />
<s:form action="verify">
	<div align="right">
		<s:a href="displaymenu" cssStyle="color: blue;">Menu</s:a> ||
		<s:a href="index" cssStyle="color: blue;">Logout</s:a>
	</div>
 
    <s:textfield name="uname" label="Username" required="true"/><br>
    <s:textfield name="age" label="Age" required="true"/><br>
    <s:textfield name="mail" label="Email id" required="true"/><br>
 
    <s:submit value="Click" align="center" />
 
</s:form>
</body>
</html>
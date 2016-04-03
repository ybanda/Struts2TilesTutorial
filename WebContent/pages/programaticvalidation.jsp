<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
 
<s:actionerror/>
<s:form action="verify1">
	<div align="right">
		<s:a href="displaymenu" cssStyle="color: blue;">Menu</s:a> ||
		<s:a href="index" cssStyle="color: blue;">Logout</s:a>
	</div>
 
    <s:textfield name="uname" key="label.user" /><br>
    <s:textfield name="gender" key="label.gender" /><br>
 
    <s:submit value="Click" align="center" />
 
</s:form>
</body>
</html>
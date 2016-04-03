<%@ taglib prefix="s" uri="/struts-tags" %>
<div align="right">
				<s:a href="displaymenu" cssStyle="color: blue;">Menu</s:a> ||
				<s:a href="index" cssStyle="color: blue;">Logout</s:a>
			</div>
Hello <s:property value="uname" /><br>
Your Age is:<s:property value="age" /><br>
Your mail:<s:property value="mail" />
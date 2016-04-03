<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page	language="java" contentType="text/html; charset=ISO-8859-1"	pageEncoding="ISO-8859-1"%>

<html>
	<head>
	 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Time Sheet Management - <tiles:insertAttribute name="title" ignore="true" /></title>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <style type="text/css">
        a.bg-primary{padding:15px 10px;}
        a.bg-primary:hover,a.bg-primary:focus{color:white;}
        .tagline{margin-bottom:100px;}
    </style>    
		<script>
			function one(){
		    	var url = window.location.href;
		    }
		</script>
	</head>
	<body>
    <div class="container">
        <div class="row">
            <div class="col-md-12" id="header">
                <tiles:insertAttribute name="menu" ignore="true"/>
            </div>
        </div>
         
        <div class="row">
            <div id="body" class="container"  style="margin-top:140px;">
               <tiles:insertAttribute name="content" ignore="true"/>
            </div>
        </div>
            <div class="row">
            <div class="col-md-12" id="footer" style="margin-top:200px;border-top:1px solid gray">
                <tiles:insertAttribute name="footer" ignore="true"/>
            </div>
        </div>

    </div>
  </body>
	<%-- <body onload="one()">
		<div id="container">
			<div class="header-part"><tiles:insertAttribute name="header" ignore="true"/></div>
			<div id="menu"><tiles:insertAttribute name="menu" ignore="true"/></div>
			<div class="base-content" align="center"><tiles:insertAttribute name="content" ignore="true"/></div>
			<div class="fotter-rep"><tiles:insertAttribute name="footer" ignore="true"/></div>
		</div>
	</body> --%>
</html>
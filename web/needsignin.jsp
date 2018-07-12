<%-- 
    Document   : needsignin
    Created on : Jul 10, 2018, 9:40:15 PM
    Author     : tuans
--%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Ohayo!</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="./css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="./css/home.css" type="text/css"/>
<script src="./js/home.js"></script>
</head>
<body>
    <jsp:useBean id="ib" class="bean.RecentActivitiesBean" scope="session"/>
    <jsp:setProperty name="ib" property="*"/>
<div class="main">
    <%@include file="header.jsp" %> 
    <h1>Hello World!</h1>
    <div class="footer">
    <div class="footer_resize">
      <p class="lf">Copyright &copy; <a href="#">Domain Name</a>. All Rights Reserved</p>
          <p class="rf">Design by <a target="_blank" href="http://www.dreamtemplate.com/">DreamTemplate</a></p>
          <div style="clear:both;"></div>
        </div>
      </div>
</div>
</body>
</html>

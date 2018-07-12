<%-- 
    Document   : mywords
    Created on : May 28, 2018, 9:29:37 AM
    Author     : Laptop VINHLINK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%request.setCharacterEncoding("UTF-8");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Ohayo! | Test</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="./css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="./css/home.css" type="text/css"/>
<link rel="stylesheet" href="./css/test.css" type="text/css"/>
<link rel="stylesheet" href="./css/learningStyle.css" type="text/css"/>
<script src="./js/home.js"></script>
</head>
<body>
<div class="main">
    <%@include file="header.jsp" %> 
  <!--  -->
  <!-- the contents here -->
    <div class="main_content">
        <jsp:useBean id="b" class="bean.LessonBean" scope="session"/>
        <jsp:useBean id="test" class="bean.TestBean" scope="session"/>

            <jsp:setProperty name="b" property="*"/>


                <h2 id="title_learning">Test</h2>
                <h2 id="table_title_learning">できる日本語</h2>
                <h3 id="title_choose_lesson"> Choose one lesson</h3>

                <c:forEach var="i" items="${b.lessons}">
                    <c:url var="lessonContent" value="test_type.jsp">
                        <c:param name="lessonID" value="${i.id}"/>
                        <c:param name="lessonName" value="${i.name}"/>
                    </c:url>
                    <div class="container_lessons"> 
                        <a href="${lessonContent}">Lesson ${i.id}： ${i.name}</a>
                    </div>
                </c:forEach>


            <div class="pagination">
                

                <c:forEach begin="1" end="${b.pages}" step="1" var="i">
                    <c:url var="next" value="learning.jsp">
                        <c:param name="page" value="${i}">${i}</c:param>
                    </c:url>


                    <c:if test="${i == param.page}">
                        <a href="${next}" class="active">${i}</a>
                    </c:if>

                    <c:if test="${i != param.page }">
                        <a href="${next}">${i}</a>
                    </c:if>

                </c:forEach>


            </div>
      
    </div>

    <!-- footer here -->
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
    
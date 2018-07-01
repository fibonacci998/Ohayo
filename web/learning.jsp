
<%-- 
    Document   : learning
    Created on : May 28, 2018, 9:21:11 AM
    Author     : Laptop VINHLINK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ohayo | Learning</title>
        <link href="./css/style.css" rel="stylesheet" type="text/css" />
        <link href="./css/learningStyle.css" rel="stylesheet" type="text/css" />
    </head>
    <body>

        <%@include file="header.jsp" %> 
        <div class="main_content">
            <jsp:useBean id="b" class="bean.LessonBean" scope="session"/>
            <jsp:setProperty name="b" property="*"/>

            <div class="main_content"> 
                <h2 id="title_learning">Learning</h2>
                <h2 id="table_title_learning">できる日本語</h2>
                <h3 id="title_choose_lesson"> Choose one lesson</h3>

                <c:forEach var="i" items="${b.lessons}">
                    <c:url var="lessonContent" value="LessonServlet">
                        <c:param name="lessonID" value="${i.id}"/>
                        <c:param name="lessonName" value="${i.name}"/>
                    </c:url>
                    <div class="container_lessons"> 
                        <a href="${lessonContent}">Lesson ${i.id}： ${i.name}</a>
                    </div>
                </c:forEach>

            </div>

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

                <table>
                </table>
            </div>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>

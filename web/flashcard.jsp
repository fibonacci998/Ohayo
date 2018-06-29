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
        <link href="./css/flashcard.css" rel="stylesheet" type="text/css" />

    </head>
    <body>

        <%@include file="header.jsp" %> 
        <jsp:useBean id="w" class="bean.FlashcardBean" scope="session"/>
        <jsp:setProperty name="w" property="*"/>

        <div class="main_content"> 
            <h2 id="title_learning">Learn flashcard</h2>
            <h2 id="table_title_learning">できる日本語</h2>
        </div>
        <div class="main_content_flashcard">

            <c:forEach var="i" items="${w.words}">
                <div class="container_flashcard"> 
                    <a> ${i.japanese}</a>
                    <a id="right"> ${i.vietnamese}</a>
                </div>
            </c:forEach>

        </div>

        <div class="pagination">
            <c:forEach begin="1" end="${w.pages}" step="1" var="i">
                <c:url var="next" value="flashcard.jsp">
                    <c:param name="page" value="${i}">${i}</c:param>
                </c:url>
                <c:if test="${i == param.page}">
                    <a href="${next}" class="active">${i}</a>
                </c:if>

                <c:if test="${i != param.page}">
                    <a href="${next}">${i}</a>
                </c:if>
            </c:forEach>
            <!--<a href="learning.jsp" id="button_forward_learn">Back to Learning</a>-->

        </div>
        <a id="button_forward_learn" href="learning.jsp"><span>Back to Learning </span></a>
        <%@include file="footer.jsp" %>
    </body>
</html>


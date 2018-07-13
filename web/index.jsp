<%-- 
    Document   : index
    Created on : May 28, 2018, 9:26:18 AM
    Author     : Laptop VINHLINK
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
            <!--  -->


            <div class="main_content">
                <h2 id="title_home" style="font-weight: bold">Lastest Activities</h2>
                <table>
                    <tr>
                        <td>
                            <h2 id="table_title_home">My recent added words </h2>

                            <div class="container_words">
                                <c:if test="${ib.recentWords.size() > 0}">
                                    <c:forEach var="i" items="${ib.recentWords}">
                                        <p>${i.japanese}  =  ${i.vietnamese}</p>
                                    </c:forEach>
                                </c:if>
                                <c:if test="${ib.recentWords.size() < 1}">
                                    <img id="emptyContent" src="./images/gitlab.png" alt="Empty" style="width:70%;"/>                      
                                
                                </c:if>
                            </div>
                            <c:if test="${ib.recentWords.size() < 1}">
                            <h2 id="title_home">You have no recent activities</h2>
                            
                            </c:if>
                            <p> </p>
                            <a id="button_home" href="mywords.jsp">Go to My Words</a>
                        </td>
                        <td>
                            <h2 id="table_title_home">My recent lessons</h2>
                            <div class="container_words">
                                <c:if test="${ib.recentLessons.size() > 0}">
                                    <c:forEach var="i" items="${ib.recentLessons}">
                                        <p>Lesson ${i.lessonId}:  ${i.lessonName}</p>
                                    </c:forEach>                                      
                                </c:if>
                                <c:if test="${ib.recentLessons.size() < 1}">
                                    <img id="emptyContent" src="./images/saketocat.png" alt="Empty" style="width:70%; float: right;">
                                </c:if>
                            </div>
                            <c:if test="${ib.recentLessons.size() < 1}">
                            <h2 id="title_home">Don't have any lessons recently</h2>
                            </c:if>
                            <p> </p>
                            <a href="learning.jsp" id="button_home">See all lessons</a>
                        </td>
                    </tr>
                </table>

            </div>
            <!--  -->
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

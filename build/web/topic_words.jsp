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
<title>Ohayo! | My words</title>
    
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="./css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="./css/home.css" type="text/css"/>
<link rel="stylesheet" href="./css/topicWord.css" type="text/css"/>
<link rel="stylesheet" href="./css/flashcard.css" type="text/css"/>
<script src="./js/home.js"></script>
<script src="./js/mywords.js"></script>
    
</head>
<body>

   <%@include file="header.jsp" %> 

  <!--  -->
  <div class="main_content">
      <jsp:useBean id="u" class="bean.UserWordBean" scope="session"/>
        <jsp:setProperty name="u" property="*"/>
        
            <h2>${u.topicName}</h2>
        <div class="main_content_flashcard">

            <c:forEach var="i" items="${u.words}">
                <div class="container_flashcard"> 
                    <a> ${i.japanese}</a>
                    <a id="right"> ${i.vietnamese}</a>
                    
                </div>

            </c:forEach>

        </div>
        

        
  </div>
        
            
        
    <!-- footer here -->
  <%@include file="footer.jsp" %>
</body>
</html>
    
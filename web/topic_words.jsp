<%-- 
    Document   : mywords
    Created on : May 28, 2018, 9:29:37 AM
    Author     : Laptop VINHLINK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Ohayo! | My words</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="./css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="./css/home.css" type="text/css"/>
<link rel="stylesheet" href="./css/mywords.css" type="text/css"/>
<link rel="stylesheet" href="./css/flashcard.css" type="text/css"/>
<script src="./js/home.js"></script>
<script src="./js/mywords.js"></script>
</head>
<body>

  <div class="header">
      
      <div class="sign_home">
      <span onclick="document.getElementById('id01').style.display='block'">Sign in</span> or <span onclick="document.getElementById('id02').style.display='block'">Sign up</span>
    </div>
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <li><a href="index.jsp"><span>Home Page</span></a></li>
          <li><a href="book.jsp"><span>Book</span></a></li>
          <li><a href="learning.jsp"><span>Learning</span></a></li>
          <li><a href="minigames.jsp"><span>Mini games</span></a></li>
          <li><a href="test.jsp"><span>Test</span></a></li>
          <li class="active"><a href="mywords.jsp"><span>My words</span></a></li>
        </ul>
      </div>
      <div class="logo">
        <h1><a href="index.jsp">Ohayo<span>!</span></a></h1>
      </div>
      <div class="clr"></div>
      
    </div>  
  </div>
    <!-- Modal -->


  <div id="id01" class="modal">
  
      <form class="modal-content animate" action="/action_page.php">
        <div class="imgcontainer">
          <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
          <img src="../images/avatar.jpg" width="100px" alt="Avatar" class="avatar"/>
        </div>
    
        <div class="container">
          <label for="uname"><b>Username</b></label>
          <input type="text" placeholder="Enter Username" name="uname" required>
    
          <label for="psw"><b>Password</b></label>
          <input type="password" placeholder="Enter Password" name="psw" required>
          <label>
            <input type="checkbox" checked="checked" name="remember"> Remember me
          </label>  
          <button type="submit">Login</button>
        </div>
      </form>
    </div>


    
    <div id="id02" class="modal">
  
        <form class="modal-content animate" action="/action_page.php">
          <div class="imgcontainer">
              <span onclick="document.getElementById('id02').style.display='none'" class="close" title="Close Modal">&times;</span>
          </div>
          <div class="container">
            <label for="uname"><b>Username</b></label>
            <input type="text" placeholder="Enter Username" name="uname" required>
      
            <label for="psw"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="psw" required>

            <label for="psw"><b>Enter Password Again</b></label>
            <input type="password" placeholder="Enter Password Again" name="psw" required>
            <button type="submit">Sign up</button>
          </div>
        </form>
      </div>


  <!--  -->
  <div class="main_content">
      <jsp:useBean id="u" class="bean.UserWordBean" scope="session"/>
        <jsp:setProperty name="u" property="*"/>
        <jsp:setProperty name="topicID" property="*"/>
        <
        <div class="main_content"> 
            <h2 id="title_learning">Learn flashcard</h2>
            <h2 id="table_title_learning">できる日本語</h2>
        </div>
        <div class="main_content_flashcard">
            <c:if test="${empty words}">
                <div class="container_flashcard"> 
                    <p>Nothing to show</p>
                </div>
            </c:if>
            <c:otherwise>
            <c:forEach var="i" items="${u.words}">
                <div class="container_flashcard"> 
                    <a> ${i.japanese}</a>
                    <a id="right"> ${i.vietnamese}</a>
                </div>
            </c:forEach>
            </c:otherwise>
        </div>

        <div class="pagination">
            <c:forEach begin="1" end="${u.pages}" step="1" var="i">
                <c:url var="next" value="topic_words.jsp">
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
    
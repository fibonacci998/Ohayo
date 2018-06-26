<%-- 
    Document   : dictionary
    Created on : May 28, 2018, 9:24:10 AM
    Author     : Laptop VINHLINK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Ohayo! | Dictionary</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="./css/style.css" rel="stylesheet" type="text/css" />
<link href="./css/book.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="./css/home.css" type="text/css"/>
<script src="./js/home.js"></script>
</head>
<body>
<div class="main">
  <div class="header">
    <div class="sign_home">
      <span onclick="document.getElementById('id01').style.display='block'">Sign in</span> or <span onclick="document.getElementById('id02').style.display='block'">Sign up</span>
    </div>
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <li><a href="index.jsp"><span>Home Page</span></a></li>
          <li  class="active"><a href="book.jsp"><span>Book</span></a></li>
          <li><a href="learning.jsp"><span>Learning</span></a></li>
          <li><a href="minigames.jsp"><span>Mini games</span></a></li>
          <li><a href="test.jsp"><span>Test</span></a></li>
          <li><a href="mywords.jsp"><span>My words</span></a></li>
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
  <!-- Begin content -->
  <div class="main_content">
    <div class="div_content">
        <h2 id="title_book_page">Books may help you</h2>

        <!-- row 1 -->
        <div class="book_border_left">
          <img src="./images/minna.jpg" width="100%">
          <p class="book_title">Minna no Nihongo</p>
        </div>

        <div class="book_border_left">
          <img src="./images/shinka.jpg" width="100%" height="424px">
          <p class="book_title">Shin kanzen masutā</p>
        </div>

        <div class="book_border_right">
          <img src="./images/JBgrammar.jpg" width="100%" height="424px">
          <p class="book_title">Basic Japanese Grammar</p>
        </div>

        <!-- row 2 -->
        <div class="book_border_left">
          <img src="./images/JapaneseParticles.jpg" width="100%" height="424px">
          <p class="book_title">Japanese Particles</p>
        </div>

        <div class="book_border_left">
          <img src="./images/steppu .jpg" width="100%" height="424px">
          <p class="book_title">Kanken gakushū steppu </p>
        </div>

        <div class="book_border_right">
          <img src="./images/Readers.jpg" width="100%" height="424px">
          <p class="book_title">Taishūkan Readers</p>
        </div>
    </div>
  </div>
  <!-- End of Content -->


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

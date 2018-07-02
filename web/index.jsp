<%-- 
    Document   : index
    Created on : May 28, 2018, 9:26:18 AM
    Author     : Laptop VINHLINK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<div class="main">^
  <div class="header">

    <div class="sign_home">
      <span onclick="document.getElementById('id01').style.display='block'">Sign in</span> or <span onclick="document.getElementById('id02').style.display='block'">Sign up</span>
    </div>

    <div class="header_resize">
      <div class="menu_nav">
        
        <ul>
          <li class="active"><a href="index.jsp"><span>Home Page</span></a></li>
          <li><a href="book.jsp"><span>Book</span></a></li>
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


  <div class="main_content">
    <h2 id="title_home">Lastest Activities</h2>
    <table>
      <tr>
        <td>
          <h2 id="table_title_home">My recent added words</h2>
          <div class="container_words">
            <p>Word 1 = meaning 1</p>
            <p>Word 2 = meaning 2</p>
            <p>word 3 = meaning 3</p>
            <p>word 4 = meaning 4</p>
            <p>word 5 = meaning 5</p>
            <p>word 6 = meaning 6</p>
            <p>word 7 = meaning 7</p>
          </div>
          <a id="button_home" href="#">Go to My Words</a>
        </td>
        <td>
          <h2 id="table_title_home">My recent lessons</h2>
          <div class="container_words">
            <a href="#">Lesson 1 </a>
            <a href="#">Lesson 2 </a>
            <a href="#">Lesson 3 </a>
            <a href="#">Lesson 4 </a>
            <a href="#">Lesson 5 </a>
            <a href="#">Lesson 6 </a>
            <a href="#">Lesson 7 </a>
          </div>
          <a href="#" id="button_home">See all lessons</a>
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
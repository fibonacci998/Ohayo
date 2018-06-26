<%-- 
    Document   : header.jsp
    Created on : Jun 16, 2018, 9:51:01 PM
    Author     : Laptop VINHLINK
--%>

<div class="main">
    <div class="header">
<link rel="stylesheet" href="./css/home.css" type="text/css"/>
<script src="./js/home.js"></script>
        <div class="sign_home">
      <span onclick="document.getElementById('id01').style.display='block'">Sign in</span> or <span onclick="document.getElementById('id02').style.display='block'">Sign up</span>
    </div>
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <li><a href="index.jsp"><span>Home Page</span></a></li>
          <li><a href="book.jsp"><span>Book</span></a></li>
          <li class="active"><a href="learning.jsp"><span>Learning</span></a></li>
          <li><a href="minigames.jsp"><span>Mini games</span></a></li>
          <li ><a href="test.jsp"><span>Test</span></a></li>
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
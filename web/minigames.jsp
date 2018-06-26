<%-- 
    Document   : minigames
    Created on : May 28, 2018, 9:27:43 AM
    Author     : Laptop VINHLINK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Game Menu</title>
<link href="css/Game.css" rel="stylesheet" type="text/css">

</head>

	
<body>
	<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <li><a href="index.jsp"><span>Home Page</span></a></li>
          <li><a href="book.jsp"><span>Dictionary</span></a></li>
          <li><a href="learning.jsp"><span>Learning</span></a></li>
          <li class="active"><a href="GameMenu.jsp"><span>Mini games </span></a></li>
          <li><a href="test.jsp"><span>Test</span></a></li>
          <li><a href="mywords.jsp"><span>My words</span></a></li>
        </ul>
      </div>
      <div class="logo">
        <h1><a href="css/index.jsp">Ohayo<span>!</span></a></h1>
      </div>
        <div class="clr"> 
        </div>
		
		
		<button class="btn-game-menu" onClick="location.href='minigames_FlashCard.jsp' " >
			Flash Card
			
			
		</button> 
		<button class="btn-game-menu"  >
			Zeus battle
		</button> 
		<p style=" margin-left:200px">
		<button class="btn-game-menu">
			Clound Storm
		</button> 
		</p>
        </div>
	  
	  
	  
		</div>
		<div class="footer">
    <div class="footer_resize">
      <p class="lf">Copyright &copy; <a href="#">Domain Name</a>. All Rights Reserved</p>
          <p class="rf">Design by <a target="_blank" href="http://www.dreamtemplate.com/">DreamTemplate</a></p>
          <div style="clear:both;">
		</div>
    </div>
      </div>
		</div>
</body>
</html>


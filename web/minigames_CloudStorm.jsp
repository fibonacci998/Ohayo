<%-- 
    Document   : minigames_CloudStorm
    Created on : Jul 2, 2018, 9:00:29 PM
    Author     : tuans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Ohayo! | Mini games</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="./css/home.css" type="text/css"/>
    <script src="./js/home.js"></script>
    <link href="css/Game.css" rel="stylesheet" type="text/css" />
    <meta name="description" content="Typing romaji and listen to the voice of native speaker!." />
    <meta property="og:image" content="img/ogImage.png" />
    <meta property="og:description" content="Typing romaji and listen to the voice of native speaker!" />
    <meta http-equiv="content-language" content="en" />
    <link rel="icon" href="img/logoGame.png">
        <link type="text/css" rel="stylesheet" href="main.css" />
        <link href='https://fonts.googleapis.com/css?family=Lato:400,700' rel='stylesheet' type='text/css' />
        <link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css'>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.2/modernizr.js"></script>
</head>
<body>
    <div class="main">
        <div class="header">
            <div class="sign_home">
                <span onclick="document.getElementById('id01').style.display = 'block'">Sign in</span> or <span onclick="document.getElementById('id02').style.display = 'block'">Sign up</span>
            </div>
            <div class="header_resize">
                <div class="menu_nav">
                    <ul>
                        <li><a href="index.jsp"><span>Home Page</span></a></li>
                        <li><a href="book.jsp"><span>Book</span></a></li>
                        <li><a href="learning.jsp"><span>Learning</span></a></li>
                        <li class="active"><a href="minigames.jsp"><span>Mini games</span></a></li>
                        <li ><a href="test.jsp"><span>Test</span></a></li>
                        <li ><a href="mywords.jsp"><span>My words</span></a></li>
                    </ul>
                </div>
                <div class="logo">
                    <h1><a href="index.jsp">Ohayo<span>!</span></a></h1>
                </div>
                <div class="clr"></div>
            </div> 
        </div>
        <div>
            <div style="height:800px;width:100%;padding: auto">
                <iframe src="CloudStormGame/index.html" style="top: 0; left: 5%; width: 99%; height: 100%;"/> 
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

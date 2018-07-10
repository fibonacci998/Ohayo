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
        <script src="./js/home.js"></script>
    </head>


    <body>
        <div class="main">
            <%@include file="header.jsp" %> 
            <!--  -->
            <div class="main_content">
                <button class="btn-game-menu" onClick="location.href = 'minigames_FlashCard.jsp'" >
                    Flash Card
                </button> 
                <button class="btn-game-menu"  >
                    Zeus battle
                </button> 
                <p style=" margin-left:23%">
                    <button class="btn-game-menu"  onClick="location.href = 'minigames_CloudStorm.jsp'" >
                        Cloud Storm
                    </button> 
                </p>
            </div>
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>


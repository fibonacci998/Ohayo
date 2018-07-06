<%-- 
    Document   : minigames_FlashCard
    Created on : Jun 27, 2018, 5:48:51 AM
    Author     : Wasd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Ohayo!| Flash Card</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
      
            <link href="./css/Game.css" rel="stylesheet" type="text/css">
            <script src="./js/home.js"></script>

    </head>
    <body >
        <div class="main">
            <div class="header">
                <div class="sign_home">
                    <span onclick="document.getElementById('id01').style.display = 'block'">Sign in</span> 
                    or <span onclick="document.getElementById('id02').style.display = 'block'">Sign up</span>
                </div>
                <div class="header_resize">
                    <div class="menu_nav">
                        <ul>
                            <li><a href="index.jsp"><span>Home Page</span></a></li>
                            <li><a href="book.jsp"><span>Book</span></a></li>
                            <li><a href="learning.jsp"><span>Learning</span></a></li>
                            <li class="active"><a href="minigames.jsp"><span>Mini games</span></a>

                            </li>
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
            <!-- Modal -->


            <div id="id01" class="modal">

                <form class="modal-content animate" action="/action_page.php">
                    <div class="imgcontainer">
                        <span onclick="document.getElementById('id01').style.display = 'none'" class="close" title="Close Modal">&times;</span>
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
                                            <span onclick="document.getElementById('id02').style.display = 'none'" class="close" title="Close Modal">&times;</span>
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
                                                        </div>
                                                        <div class="main_content">
                                                            <div class = "game-backround">
                                                                <label class="info-label">Time : </label>
                                                                <label class="info">0</label>
                                                                <p>
                                                                    <label class="info-label">Step</label>
                                                                    <label class="info">  0</label>
                                                                </p>

                                                                <button class="button-start"  >
                                                                    Let's Start !
                                                                </button>
                                                                <div class="game-zone" align="center">
                                                                    <p>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>1</p>
                                                                        </button>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>2</p>
                                                                        </button>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>3	</p>
                                                                        </button>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>4</p>
                                                                        </button>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>5</p>
                                                                        </button>
                                                                    </p>
                                                                    <p>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>6</p>
                                                                        </button>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>7</p>
                                                                        </button>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>8</p>
                                                                        </button>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>9</p>
                                                                        </button>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>10</p>
                                                                        </button>
                                                                    </p>
                                                                    <p>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>11</p>
                                                                        </button>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>12</p>
                                                                        </button>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>13</p>
                                                                        </button>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>14</p>
                                                                        </button>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>15</p>
                                                                        </button>
                                                                    </p>
                                                                    <p>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>16</p>
                                                                        </button>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>17</p>
                                                                        </button>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>18</p>
                                                                        </button>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>19</p>
                                                                        </button>
                                                                        <button class="button-card" >
                                                                            <p>Card</p>
                                                                            <p>20</p>
                                                                        </button>
                                                                    </p>
                                                                </div>  
                                                            </div>
                                                        </div>
        
        <!-- end main content -->
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

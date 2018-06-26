<%-- 
    Document   : learning
    Created on : May 28, 2018, 9:21:11 AM
    Author     : Laptop VINHLINK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ohayo | Learning</title>
        <link href="./css/style.css" rel="stylesheet" type="text/css" />
        <link href="./css/learningStyle.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div class="main">
            <div class="header">
                <div class="header_resize">
                    <div class="menu_nav">
                        <ul>
                            <li><a href="index.jsp"><span>Home Page</span></a></li>
                            <li><a href="book.jsp"><span>Dictionary</span></a></li>
                            <li class="active"><a href="learning.jsp"><span>Learning</span></a></li>
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

            <div class="main_content">
                <h2 id="title_learning">Learning</h2>
                <h2 id="table_title_learning">できる日本語</h2>
                <table>
                    <h3 id="title_choose_lesson"> Choose one lesson</h3>
                    <tr>

                        <td>

                            <div class="container_words">
                                <a href="#">Lesson 1： はじめまして</a>
                                <a href="#">Lesson 2： かいもの</a>
                                <a href="#">Lesson 3： スケジュール</a>
                                <a href="#">Lesson 4： わたしのくに</a>
                                <a href="#">Lesson 5： やしみのひ</a>
                                <a href="#">Lesson 6： いっしょに</a>
                                <a href="#">Lesson 7： ともだちのいえ</a>
                            </div>
                            <a id="button_begin" href="#">Begin</a>
                        </td>
                        <td>

                            <div class="container_words">
                                <a href="#">Lesson 8： はじめまして</a>
                                <a href="#">Lesson 9： かいもの</a>
                                <a href="#">Lesson 10： スケジュール</a>
                                <a href="#">Lesson 11： わたしのくに</a>
                                <a href="#">Lesson 12： やしみのひ</a>
                                <a href="#">Lesson 13： いっしょに</a>
                                <a href="#">Lesson 14： ともだちのいえ</a>
                            </div>
                            <a href="#" id="button_next">More courses</a>
                        </td>
                    </tr>
                </table>

            </div>

        </div>       

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

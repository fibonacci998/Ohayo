<%-- 
    Document   : dictionary
    Created on : May 28, 2018, 9:24:10 AM
    Author     : Laptop VINHLINK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Ohayo! | Book</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href="./css/style.css" rel="stylesheet" type="text/css" />
        <link href="./css/book.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" href="./css/home.css" type="text/css"/>
        <script src="./js/home.js"></script>
    </head>
    <body>
        <div class="main">
            <%@include file="header.jsp" %> 
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

<%-- 
    Document   : learning
    Created on : May 28, 2018, 9:21:11 AM
    Author     : Laptop VINHLINK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%request.setCharacterEncoding("UTF-8");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ohayo | Test</title>
        <link href="./css/style.css" rel="stylesheet" type="text/css" />
        <link href="./css/flashcard.css" rel="stylesheet" type="text/css" />

    </head>
    <body>

        <div class="header">
    <link rel="stylesheet" href="./css/home.css" type="text/css"/>
    <script src="./js/home.js"></script>
    <div class="sign_home">
        <span onclick="document.getElementById('id01').style.display = 'block'">Sign in</span> or <span onclick="document.getElementById('id02').style.display = 'block'">Sign up</span>
    </div>
    <div class="header_resize">
        <div class="menu_nav">
            <ul>
                <li><a href="index.jsp"><span>Home Page</span></a></li>
                <li><a href="book.jsp"><span>Book</span></a></li>
                <li><a href="learning.jsp"><span>Learning</span></a></li>
                <li><a href="minigames.jsp"><span>Mini games</span></a></li>
                <li class="active"><a href="test.jsp"><span>Test</span></a></li>
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


<c:if test="${error != null}">
    <script>
        alert("${error}");
    </script>
</c:if>
<div id="id02" class="modal">

    <form class="modal-content animate" action="SignupServlet" method="POST">
        <div class="imgcontainer">
            <span onclick="document.getElementById('id02').style.display = 'none'" class="close" title="Close Modal">&times;</span>
        </div>
        <div class="container">
            <label for="txtEmail"><b>Email</b></label>
            <input type="email" id="email" placeholder="Enter Email" name="txtEmail" required>
            <br>
            <label for="txtUsername"><b>Username</b></label>
            <input type="text" placeholder="Enter Username" name="txtUsername" required>

            <label for="txtPassword"><b>Password</b></label>
            <input type="password" id="password" placeholder="Enter Password" name="txtPassword" required>

            <label for="txtRePassword"><b>Enter Password Again</b></label>
            <input type="password" id="repassword" placeholder="Enter Password Again" name="txtRePassword" required>

            <button type="submit" id="validate">Sign up</button>
        </div>
        <h2 id="result"></h2>
    </form>
</div>
<script>
    function validateEmail(email) {
        var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return re.test(email);
    }

    function validate() {
        var $result = $("#result");
        var email = $("#email").val();
        var password = $("#password").val();
        var repassword = $("#repassword").val();
        $result.text("");

        if (validateEmail(email) && password == repassword) {
            $result.text("Submitting your information :)");
            $result.css("color", "green");
            return true;
        } else {
            if (!validateEmail(email)) {
                $result.text(email + " is not valid :(");
                $result.css("color", "red");
            } else {
                $result.text("Re password is not same as password");
                $result.css("color", "red");
            }

        }


        return false;
    }

    $("#validate").bind("click", validate);
</script>



<!--  -->
        <jsp:useBean id="test" class="bean.TestBean" scope="session"/>
        <jsp:setProperty name="test" property="*"/>
        <div class="main_content"> 
            <h2 id="title_learning">Test</h2>
            <h2 id="table_title_learning">${test.lessonName}</h2>
        </div>
        <div class="main_content_flashcard">
                
            <c:forEach var="i" items="${questionList}">
                <div class="container_flashcard"> 
                    <a> ${i.question}</a>
                    <a id="right">
                        <select name="question ${i}">
                            <option value="${i.ans1}">${i.ans1}</option>
                            <option value="${i.ans2}">${i.ans2}</option>
                            <option value="${i.ans3}">${i.ans3}</option>
                            <option value="${i.ans4}">${i.ans4}</option>
                        </select>
                    </a>
                </div>
            </c:forEach>

        </div>

        <div class="pagination">
            

        </div>
        <a id="button_forward_learn" href="TestScoreServlet"><span>Submit </span></a>
        <%@include file="footer.jsp" %>
    </body>
</html>


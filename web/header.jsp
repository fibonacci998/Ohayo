<%-- 
    Document   : header.jsp
    Created on : Jun 16, 2018, 9:51:01 PM
    Author     : Laptop VINHLINK
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

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
            <span onclick="document.getElementById('id01').style.display = 'none'" class="close" title="Close Modal">&times;</span>
            <img src="./images/avatar.jpg" width="100px" alt="Avatar" class="avatar"/>
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
<c:if test="${loginError != null}">
    <script>
        alert("${loginError}");
        forward(needsignin.jsp);
    </script>
</c:if>

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
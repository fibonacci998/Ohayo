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
        hello ${sessionScope.usernameSession}
        <a href="SignoutServlet">Sign out</a>
    </div>
    <div class="header_resize">
        <div class="menu_nav">
            <ul>
                <li><a href="index.jsp"><span>Home Page</span></a></li>
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
<%-- 
    Document   : test_Type
    Created on : Jul 10, 2018, 11:25:24 PM
    Author     : Wasd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="test" class="bean.TestBean" scope="session"/>
        <jsp:setProperty name="test" property="*"/>
        <h1>Choose type:</h1>
        <form action="TestServlet" method="POST">
            <input type="checkbox" name="test_type" value="multipleChoice">Multiple Choice<br/>
            <input type="checkbox" name="test_type" value="Writing">Writing<br/>
            <input type="hidden" name="lessonID" value="${test.lessonID}"/>
            <input type="submit" name="submit" value="Done"/>
        </form>
    </body>
</html>

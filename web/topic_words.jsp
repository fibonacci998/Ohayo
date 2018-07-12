<%-- 
    Document   : mywords
    Created on : May 28, 2018, 9:29:37 AM
    Author     : Laptop VINHLINK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%request.setCharacterEncoding("UTF-8");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Ohayo! | My words</title>
    
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="./css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="./css/home.css" type="text/css"/>
<link rel="stylesheet" href="./css/topicWord.css" type="text/css"/>
<link rel="stylesheet" href="./css/mywords.css" type="text/css"/>
<link rel="stylesheet" href="./css/flashcard.css" type="text/css"/>
<script src="./js/home.js"></script>
<script src="./js/mywords.js"></script>
  
</head>
<body>

   <%@include file="header.jsp" %> 

  <!--  -->
  <div class="main_content">
      <jsp:useBean id="u" class="bean.UserWordBean" scope="session"/>
        <jsp:setProperty name="u" property="*"/>
        
            <h2>${u.topicName}</h2>
            <button id="button_add_mywords">Add topic</button>
        <div class="main_content_flashcard">

            <c:forEach var="i" items="${u.words}">
                <div class="container_flashcard"> 
                    <a> ${i.japanese}</a>
                    <a id="right"> ${i.vietnamese}</a>
              
                </div>
             <button id="button_delete_mywords">Delete topic</button>         
            </c:forEach>
            
        </div>
        <button id="button_add_mywords">Add topic</button>


        
  </div>
<!-- The add topic Modal -->
    <!-- Trigger/Open The Modal -->

<!-- The Modal -->
<div id="addModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content">
    <span class="close">&times;</span>
    <form action="TopicWordServlet" method="POST">
    <input type="text" name="japanese" placeholder="Enter japanese" style="width: 50%;margin: 5px"></input><br/>
    <input type="text" name="vietnamese" placeholder="Enter vietnamese" style="width: 50%;margin: 5px"></input><br/>
    <input id ="button_add_topic" type="submit" name="add" value="add" style="padding: 10px; margin: 5px"/>
    </form>
  </div>

</div>


</div>
<script>
    // Get the modal
var addModal = document.getElementById('addModal');
// Get the button that opens the modal
var btnAdd = document.getElementById("button_add_mywords");
// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close");

// When the user clicks the button, open the modal 
btnAdd.onclick = function() {
    addModal.style.display = "block";
};
// When the user clicks on <span> (x), close the modal
span.onclick = function() {
    addModal.style.display = "none";
};

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target === addModal) {
        addModal.style.display = "none";
    }
};
</script>
<!--end add topic modal -->
    <!-- footer here -->
  <%@include file="footer.jsp" %>
</body>
</html>
    
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
<link rel="stylesheet" href="./css/mywords.css" type="text/css"/>
<script type="text/javascript" src="./js/home.js"></script>
<script type="text/javascript" src="./js/mywords.js"></script>
</head>
<body>
<!-- header -->
   <%@include file="header.jsp" %> 
  <!--  -->
  <!-- the contents here -->
  <div class="main_content">
      <h2 id="title">My words</h2>
      <jsp:useBean id="t" class="bean.TopicBean" scope="session"/>
      <jsp:setProperty name="t" property="*"/>
         <!-- show list topics-->
      <div class="select_container_mywords">

      <c:forEach var="i" items="${t.topics}">
              <c:url var="topicContent" value="topic_words.jsp">
                  <c:param name="topicID" value="${i.topicID}"/>
                  <c:param name="topicName" value="${i.topicName}"/>
              </c:url>
       
          <a href="${topicContent}">${i.topicName}</a>
          </c:forEach>
      </div>
      <!--end show list topics-->
      <!-- group button -->
      <div class="group_button_mywords">
      <button id="button_add_mywords">Add topic</button>
      <button id="button_delete_mywords">Delete topic</button>
      
      </div>
      
    <!-- The add topic Modal -->
    <!-- Trigger/Open The Modal -->

<!-- The Modal -->
<div id="addModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content">
    <span class="close">&times;</span>
    <form action="MyWordsServlet" method="POST">
    <input type="text" name="topicName" placeholder="Enter topic name" style="width: 50%;margin: 5px"></input>
    <input id ="button_add_topic" type="submit" name="add" value="add" style="padding: 10px; margin: 5px"/>
    </form>
  </div>

</div>

<div id="deleteModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content">
    <span class="close">&times;</span>
    <form action="DeleteWordServlet" method="POST">
    <!-- modal delete content-->
      <c:forEach var="i" items="${t.topics}">
          <input type="checkbox" name="topics" value="${i.topicID}">${i.topicName}</input><br/>
          </c:forEach>
          <br/>
          <input id="button_delete_topic" type="submit" name="delete" value="delete selected" style="margin: 5px 300px;padding:10px;"/>
    </form>
  </div>

</div>
<script>
    // Get the modal
var addModal = document.getElementById('addModal');
var deleteModal = document.getElementById('deleteModal');
// Get the button that opens the modal
var btnAdd = document.getElementById("button_add_mywords");
var btnDel = document.getElementById("button_delete_mywords");
// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close");

// When the user clicks the button, open the modal 
btnAdd.onclick = function() {
    addModal.style.display = "block";
};
btnDel.onclick = function() {
    deleteModal.style.display = "block";
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
    if (event.target === deleteModal) {
        deleteModal.style.display = "none";
};


// Get the button that opens the modal


};
</script>
<!--end add topic modal -->
  </div>
    <!-- footer here -->
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
    
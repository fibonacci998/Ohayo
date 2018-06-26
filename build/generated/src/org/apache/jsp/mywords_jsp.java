package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mywords_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>Ohayo! | My words</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"./css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/home.css\" type=\"text/css\"/>\n");
      out.write("<script src=\"./js/home.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"main\">\n");
      out.write("  <div class=\"header\">\n");
      out.write("      \n");
      out.write("      <div class=\"sign_home\">\n");
      out.write("      <span onclick=\"document.getElementById('id01').style.display='block'\">Sign in</span> or <span onclick=\"document.getElementById('id02').style.display='block'\">Sign up</span>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"header_resize\">\n");
      out.write("      <div class=\"menu_nav\">\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"index.html\"><span>Home Page</span></a></li>\n");
      out.write("          <li><a href=\"dictionary.html\"><span>Dictionary</span></a></li>\n");
      out.write("          <li><a href=\"learning.html\"><span>Learning</span></a></li>\n");
      out.write("          <li><a href=\"GameMenu.html\"><span>Mini games</span></a></li>\n");
      out.write("          <li><a href=\"test.html\"><span>Test</span></a></li>\n");
      out.write("          <li class=\"active\"><a href=\"mywords.html\"><span>My words</span></a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <h1><a href=\"index.html\">Ohayo<span>!</span></a></h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      \n");
      out.write("    </div> \n");
      out.write("  </div>\n");
      out.write("    <!-- Modal -->\n");
      out.write("\n");
      out.write("\n");
      out.write("  <div id=\"id01\" class=\"modal\">\n");
      out.write("  \n");
      out.write("      <form class=\"modal-content animate\" action=\"/action_page.php\">\n");
      out.write("        <div class=\"imgcontainer\">\n");
      out.write("          <span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("          <img src=\"../images/avatar.jpg\" width=\"100px\" alt=\"Avatar\" class=\"avatar\"/>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("        <div class=\"container\">\n");
      out.write("          <label for=\"uname\"><b>Username</b></label>\n");
      out.write("          <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required>\n");
      out.write("    \n");
      out.write("          <label for=\"psw\"><b>Password</b></label>\n");
      out.write("          <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n");
      out.write("          <label>\n");
      out.write("            <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me\n");
      out.write("          </label>  \n");
      out.write("          <button type=\"submit\">Login</button>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div id=\"id02\" class=\"modal\">\n");
      out.write("  \n");
      out.write("        <form class=\"modal-content animate\" action=\"/action_page.php\">\n");
      out.write("          <div class=\"imgcontainer\">\n");
      out.write("              <span onclick=\"document.getElementById('id02').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <label for=\"uname\"><b>Username</b></label>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required>\n");
      out.write("      \n");
      out.write("            <label for=\"psw\"><b>Password</b></label>\n");
      out.write("            <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n");
      out.write("\n");
      out.write("            <label for=\"psw\"><b>Enter Password Again</b></label>\n");
      out.write("            <input type=\"password\" placeholder=\"Enter Password Again\" name=\"psw\" required>\n");
      out.write("            <button type=\"submit\">Sign up</button>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!--  -->\n");
      out.write("  <!-- the contents here -->\n");
      out.write("    <div class=\"main_content\">\n");
      out.write("      <h2 id=\"title\">My words</h2>\n");
      out.write("      <div class=\"select_container_mywords\">\n");
      out.write("        <a href=\"#\">1. Topic 1</a>\n");
      out.write("        <a href=\"#\">2. Topic 2</a>\n");
      out.write("        <a href=\"#\">3. Topic 3</a>\n");
      out.write("        <a href=\"#\">4. Topic 4</a>\n");
      out.write("        <a href=\"#\">5. Topic 5</a>\n");
      out.write("        <a href=\"#\">6. Topic 6</a>\n");
      out.write("        <a href=\"#\">7. Topic 7</a>\n");
      out.write("        <a href=\"#\">8. Topic 8</a>\n");
      out.write("        <a href=\"#\">9. Topic 9</a>\n");
      out.write("        <a href=\"#\">10. Topic 10</a>\n");
      out.write("        <a href=\"#\">11. Topic 11</a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"group_button_mywords\">\n");
      out.write("      <a id=\"button_add_mywords\"  href=\"#\">Add topic</a>\n");
      out.write("      <a id=\"button_open_mywords\" href=\"#\">Open topic</a>\n");
      out.write("      <a id=\"button_delete_mywords\"  href=\"#\">Delete topic</a>\n");
      out.write("      \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- footer here -->\n");
      out.write("  <div class=\"footer\">\n");
      out.write("    <div class=\"footer_resize\">\n");
      out.write("      <p class=\"lf\">Copyright &copy; <a href=\"#\">Domain Name</a>. All Rights Reserved</p>\n");
      out.write("          <p class=\"rf\">Design by <a target=\"_blank\" href=\"http://www.dreamtemplate.com/\">DreamTemplate</a></p>\n");
      out.write("          <div style=\"clear:both;\"></div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("    ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

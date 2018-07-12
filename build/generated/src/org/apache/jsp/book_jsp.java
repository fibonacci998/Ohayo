package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class book_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Ohayo! | Book</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link href=\"./css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"./css/book.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/home.css\" type=\"text/css\"/>\r\n");
      out.write("<script src=\"./js/home.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div class=\"sign_home\">\r\n");
      out.write("      <span onclick=\"document.getElementById('id01').style.display='block'\">Sign in</span> or <span onclick=\"document.getElementById('id02').style.display='block'\">Sign up</span>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"header_resize\">\r\n");
      out.write("      <div class=\"menu_nav\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><a href=\"index.jsp\"><span>Home Page</span></a></li>\r\n");
      out.write("          <li  class=\"active\"><a href=\"book.jsp\"><span>Book</span></a></li>\r\n");
      out.write("          <li><a href=\"learning.jsp\"><span>Learning</span></a></li>\r\n");
      out.write("          <li><a href=\"minigames.jsp\"><span>Mini games</span></a></li>\r\n");
      out.write("          <li><a href=\"test.jsp\"><span>Test</span></a></li>\r\n");
      out.write("          <li><a href=\"mywords.jsp\"><span>My words</span></a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"logo\">\r\n");
      out.write("        <h1><a href=\"index.jsp\">Ohayo<span>!</span></a></h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("      \r\n");
      out.write("    </div> \r\n");
      out.write("  </div>\r\n");
      out.write("    <!-- Modal -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div id=\"id01\" class=\"modal\">\r\n");
      out.write("  \r\n");
      out.write("      <form class=\"modal-content animate\" action=\"/action_page.php\">\r\n");
      out.write("        <div class=\"imgcontainer\">\r\n");
      out.write("          <span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\r\n");
      out.write("          <img src=\"../images/avatar.jpg\" width=\"100px\" alt=\"Avatar\" class=\"avatar\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <label for=\"uname\"><b>Username</b></label>\r\n");
      out.write("          <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required>\r\n");
      out.write("    \r\n");
      out.write("          <label for=\"psw\"><b>Password</b></label>\r\n");
      out.write("          <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\r\n");
      out.write("          <label>\r\n");
      out.write("            <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me\r\n");
      out.write("          </label>  \r\n");
      out.write("          <button type=\"submit\">Login</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"id02\" class=\"modal\">\r\n");
      out.write("  \r\n");
      out.write("        <form class=\"modal-content animate\" action=\"/action_page.php\">\r\n");
      out.write("          <div class=\"imgcontainer\">\r\n");
      out.write("              <span onclick=\"document.getElementById('id02').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <label for=\"uname\"><b>Username</b></label>\r\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required>\r\n");
      out.write("      \r\n");
      out.write("            <label for=\"psw\"><b>Password</b></label>\r\n");
      out.write("            <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\r\n");
      out.write("\r\n");
      out.write("            <label for=\"psw\"><b>Enter Password Again</b></label>\r\n");
      out.write("            <input type=\"password\" placeholder=\"Enter Password Again\" name=\"psw\" required>\r\n");
      out.write("            <button type=\"submit\">Sign up</button>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!--  -->\r\n");
      out.write("  <!-- Begin content -->\r\n");
      out.write("  <div class=\"main_content\">\r\n");
      out.write("    <div class=\"div_content\">\r\n");
      out.write("        <h2 id=\"title_book_page\">Books may help you</h2>\r\n");
      out.write("\r\n");
      out.write("        <!-- row 1 -->\r\n");
      out.write("        <div class=\"book_border_left\">\r\n");
      out.write("          <img src=\"./images/minna.jpg\" width=\"100%\">\r\n");
      out.write("          <p class=\"book_title\">Minna no Nihongo</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"book_border_left\">\r\n");
      out.write("          <img src=\"./images/shinka.jpg\" width=\"100%\" height=\"424px\">\r\n");
      out.write("          <p class=\"book_title\">Shin kanzen masutā</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"book_border_right\">\r\n");
      out.write("          <img src=\"./images/JBgrammar.jpg\" width=\"100%\" height=\"424px\">\r\n");
      out.write("          <p class=\"book_title\">Basic Japanese Grammar</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- row 2 -->\r\n");
      out.write("        <div class=\"book_border_left\">\r\n");
      out.write("          <img src=\"./images/JapaneseParticles.jpg\" width=\"100%\" height=\"424px\">\r\n");
      out.write("          <p class=\"book_title\">Japanese Particles</p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"book_border_left\">\r\n");
      out.write("          <img src=\"./images/steppu .jpg\" width=\"100%\" height=\"424px\">\r\n");
      out.write("          <p class=\"book_title\">Kanken gakushū steppu </p>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"book_border_right\">\r\n");
      out.write("          <img src=\"./images/Readers.jpg\" width=\"100%\" height=\"424px\">\r\n");
      out.write("          <p class=\"book_title\">Taishūkan Readers</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- End of Content -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div class=\"footer\">\r\n");
      out.write("    <div class=\"footer_resize\">\r\n");
      out.write("      <p class=\"lf\">Copyright &copy; <a href=\"#\">Domain Name</a>. All Rights Reserved</p>\r\n");
      out.write("          <p class=\"rf\">Design by <a target=\"_blank\" href=\"http://www.dreamtemplate.com/\">DreamTemplate</a></p>\r\n");
      out.write("          <div style=\"clear:both;\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("</div>\r\n");
      out.write("      </body>\r\n");
      out.write("</html>\r\n");
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

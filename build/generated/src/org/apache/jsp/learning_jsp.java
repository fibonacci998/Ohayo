package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class learning_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ohayo | Learning</title>\n");
      out.write("        <link href=\"./css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"./css/learningStyle.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"header_resize\">\n");
      out.write("                    <div class=\"menu_nav\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"index.jsp\"><span>Home Page</span></a></li>\n");
      out.write("                            <li><a href=\"dictionary.jsp\"><span>Dictionary</span></a></li>\n");
      out.write("                            <li class=\"active\"><a href=\"learning.jsp\"><span>Learning</span></a></li>\n");
      out.write("                            <li><a href=\"minigames.jsp\"><span>Mini games</span></a></li>\n");
      out.write("                            <li><a href=\"test.jsp\"><span>Test</span></a></li>\n");
      out.write("                            <li><a href=\"mywords.jsp\"><span>My words</span></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <h1><a href=\"index.html\">Ohayo<span>!</span></a></h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clr\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"main_content\">\n");
      out.write("                <h2 id=\"title_learning\">Learning</h2>\n");
      out.write("                <h2 id=\"table_title_learning\">できる日本語</h2>\n");
      out.write("                <table>\n");
      out.write("                    <h3 id=\"title_choose_lesson\"> Choose one lesson</h3>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td>\n");
      out.write("\n");
      out.write("                            <div class=\"container_words\">\n");
      out.write("                                <a href=\"#\">Lesson 1： はじめまして</a>\n");
      out.write("                                <a href=\"#\">Lesson 2： かいもの</a>\n");
      out.write("                                <a href=\"#\">Lesson 3： スケジュール</a>\n");
      out.write("                                <a href=\"#\">Lesson 4： わたしのくに</a>\n");
      out.write("                                <a href=\"#\">Lesson 5： やしみのひ</a>\n");
      out.write("                                <a href=\"#\">Lesson 6： いっしょに</a>\n");
      out.write("                                <a href=\"#\">Lesson 7： ともだちのいえ</a>\n");
      out.write("                            </div>\n");
      out.write("                            <a id=\"button_begin\" href=\"#\">Begin</a>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("\n");
      out.write("                            <div class=\"container_words\">\n");
      out.write("                                <a href=\"#\">Lesson 8： はじめまして</a>\n");
      out.write("                                <a href=\"#\">Lesson 9： かいもの</a>\n");
      out.write("                                <a href=\"#\">Lesson 10： スケジュール</a>\n");
      out.write("                                <a href=\"#\">Lesson 11： わたしのくに</a>\n");
      out.write("                                <a href=\"#\">Lesson 12： やしみのひ</a>\n");
      out.write("                                <a href=\"#\">Lesson 13： いっしょに</a>\n");
      out.write("                                <a href=\"#\">Lesson 14： ともだちのいえ</a>\n");
      out.write("                            </div>\n");
      out.write("                            <a href=\"#\" id=\"button_next\">More courses</a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>       \n");
      out.write("\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"footer_resize\">\n");
      out.write("                <p class=\"lf\">Copyright &copy; <a href=\"#\">Domain Name</a>. All Rights Reserved</p>\n");
      out.write("                <p class=\"rf\">Design by <a target=\"_blank\" href=\"http://www.dreamtemplate.com/\">DreamTemplate</a></p>\n");
      out.write("                <div style=\"clear:both;\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

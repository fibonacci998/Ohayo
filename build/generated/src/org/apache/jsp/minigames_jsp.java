package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class minigames_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <title>Game Menu</title>\r\n");
      out.write("        <link href=\"css/Game.css\" rel=\"stylesheet\" type=\"text/css\">      \r\n");
      out.write("        <script src=\"./js/home.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/home.css\" type=\"text/css\"/>\r\n");
      out.write("    <script src=\"./js/home.js\"></script>\r\n");
      out.write("    <div class=\"sign_home\">\r\n");
      out.write("        <span onclick=\"document.getElementById('id01').style.display = 'block'\">Sign in</span> or <span onclick=\"document.getElementById('id02').style.display = 'block'\">Sign up</span>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"header_resize\">\r\n");
      out.write("        <div class=\"menu_nav\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"index.jsp\"><span>Home Page</span></a></li>\r\n");
      out.write("                <li><a href=\"book.jsp\"><span>Book</span></a></li>\r\n");
      out.write("                <li><a href=\"learning.jsp\"><span>Learning</span></a></li>\r\n");
      out.write("                <li><a href=\"minigames.jsp\"><span>Mini games</span></a></li>\r\n");
      out.write("                <li ><a href=\"test.jsp\"><span>Test</span></a></li>\r\n");
      out.write("                <li><a href=\"mywords.jsp\"><span>My words</span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <h1><a href=\"index.jsp\">Ohayo<span>!</span></a></h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"clr\"></div>\r\n");
      out.write("\r\n");
      out.write("    </div> \r\n");
      out.write("</div>\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"id01\" class=\"modal\">\r\n");
      out.write("\r\n");
      out.write("    <form class=\"modal-content animate\" action=\"/action_page.php\">\r\n");
      out.write("        <div class=\"imgcontainer\">\r\n");
      out.write("            <span onclick=\"document.getElementById('id01').style.display = 'none'\" class=\"close\" title=\"Close Modal\">&times;</span>\r\n");
      out.write("            <img src=\"./images/avatar.jpg\" width=\"100px\" alt=\"Avatar\" class=\"avatar\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <label for=\"uname\"><b>Username</b></label>\r\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required>\r\n");
      out.write("\r\n");
      out.write("            <label for=\"psw\"><b>Password</b></label>\r\n");
      out.write("            <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\r\n");
      out.write("            <label>\r\n");
      out.write("                <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me\r\n");
      out.write("            </label>  \r\n");
      out.write("            <button type=\"submit\">Login</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<div id=\"id02\" class=\"modal\">\r\n");
      out.write("\r\n");
      out.write("    <form class=\"modal-content animate\" action=\"SignupServlet\" method=\"POST\">\r\n");
      out.write("        <div class=\"imgcontainer\">\r\n");
      out.write("            <span onclick=\"document.getElementById('id02').style.display = 'none'\" class=\"close\" title=\"Close Modal\">&times;</span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <label for=\"txtEmail\"><b>Email</b></label>\r\n");
      out.write("            <input type=\"email\" id=\"email\" placeholder=\"Enter Email\" name=\"txtEmail\" required>\r\n");
      out.write("            <br>\r\n");
      out.write("            <label for=\"txtUsername\"><b>Username</b></label>\r\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Username\" name=\"txtUsername\" required>\r\n");
      out.write("\r\n");
      out.write("            <label for=\"txtPassword\"><b>Password</b></label>\r\n");
      out.write("            <input type=\"password\" id=\"password\" placeholder=\"Enter Password\" name=\"txtPassword\" required>\r\n");
      out.write("\r\n");
      out.write("            <label for=\"txtRePassword\"><b>Enter Password Again</b></label>\r\n");
      out.write("            <input type=\"password\" id=\"repassword\" placeholder=\"Enter Password Again\" name=\"txtRePassword\" required>\r\n");
      out.write("\r\n");
      out.write("            <button type=\"submit\" id=\"validate\">Sign up</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <h2 id=\"result\"></h2>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    function validateEmail(email) {\r\n");
      out.write("        var re = /^(([^<>()[\\]\\\\.,;:\\s@\\\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\\\"]+)*)|(\\\".+\\\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$/;\r\n");
      out.write("        return re.test(email);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function validate() {\r\n");
      out.write("        var $result = $(\"#result\");\r\n");
      out.write("        var email = $(\"#email\").val();\r\n");
      out.write("        var password = $(\"#password\").val();\r\n");
      out.write("        var repassword = $(\"#repassword\").val();\r\n");
      out.write("        $result.text(\"\");\r\n");
      out.write("\r\n");
      out.write("        if (validateEmail(email) && password == repassword) {\r\n");
      out.write("            $result.text(\"Submitting your information :)\");\r\n");
      out.write("            $result.css(\"color\", \"green\");\r\n");
      out.write("            return true;\r\n");
      out.write("        } else {\r\n");
      out.write("            if (!validateEmail(email)) {\r\n");
      out.write("                $result.text(email + \" is not valid :(\");\r\n");
      out.write("                $result.css(\"color\", \"red\");\r\n");
      out.write("            } else {\r\n");
      out.write("                $result.text(\"Re password is not same as password\");\r\n");
      out.write("                $result.css(\"color\", \"red\");\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    $(\"#validate\").bind(\"click\", validate);\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--  -->");
      out.write(" \r\n");
      out.write("            <!--  -->\r\n");
      out.write("            <div class=\"main_content\">\r\n");
      out.write("                <button class=\"btn-game-menu\" onClick=\"location.href = 'minigames_FlashCard.jsp'\" >\r\n");
      out.write("                    Flash Card\r\n");
      out.write("                </button> \r\n");
      out.write("                <button class=\"btn-game-menu\"  >\r\n");
      out.write("                    Zeus battle\r\n");
      out.write("                </button> \r\n");
      out.write("                <p style=\" margin-left:23%\">\r\n");
      out.write("                    <button class=\"btn-game-menu\"  onClick=\"location.href = 'minigames_CloudStorm.jsp'\" >\r\n");
      out.write("                        Cloud Storm\r\n");
      out.write("                    </button> \r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("    <div class=\"footer_resize\">\r\n");
      out.write("        <p class=\"lf\">Copyright &copy; <a href=\"#\">Domain Name</a>. All Rights Reserved</p>\r\n");
      out.write("        <p class=\"rf\">Design by <a target=\"_blank\" href=\"http://www.dreamtemplate.com/\">DreamTemplate</a></p>\r\n");
      out.write("        <div style=\"clear:both;\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginError != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <script>\r\n");
        out.write("        alert(\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\");\r\n");
        out.write("        forward(needsignin.jsp);\r\n");
        out.write("    </script>\r\n");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("    <script>\r\n");
        out.write("        alert(\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\");\r\n");
        out.write("    </script>\r\n");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}

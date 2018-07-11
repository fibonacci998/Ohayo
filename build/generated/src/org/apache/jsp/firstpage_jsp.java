package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class firstpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Welcome to Ohayo :)</title>\n");
      out.write("\n");
      out.write("        <!-- CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:400,100,300,500\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/font-awesome/css/font-awesome.min.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/form-elements.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <!-- Favicon and touch icons -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/ico/favicon.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"assets/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"assets/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"assets/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"assets/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <!-- Top content -->\n");
      out.write("        <div class=\"top-content\">\n");
      out.write("        \t\n");
      out.write("            <div class=\"inner-bg\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                \t\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-8 col-sm-offset-2 text\">\n");
      out.write("                            <h1><strong>Ohayo</strong></h1>\n");
      out.write("                            <div class=\"description\">\n");
      out.write("                            \t<p>\n");
      out.write("\t                            \tOhayo is a website that useful assistant for you to learn Japanese\n");
      out.write("                            \t</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("                        \t\n");
      out.write("                        \t<div class=\"form-box\">\n");
      out.write("\t                        \t<div class=\"form-top\">\n");
      out.write("\t                        \t\t<div class=\"form-top-left\">\n");
      out.write("\t                        \t\t\t<h3>Login to our site</h3>\n");
      out.write("\t                            \t\t<p>Enter username and password to sign in:</p>\n");
      out.write("\t                        \t\t</div>\n");
      out.write("\t                        \t\t<div class=\"form-top-right\">\n");
      out.write("\t                        \t\t\t<i class=\"fa fa-lock\"></i>\n");
      out.write("\t                        \t\t</div>\n");
      out.write("\t                            </div>\n");
      out.write("\t                            <div class=\"form-bottom\">\n");
      out.write("\t\t\t\t                    <form role=\"form\" action=\"SigninServlet\" method=\"post\" class=\"login-form\">\n");
      out.write("\t\t\t\t                    \t<div class=\"form-group\">\n");
      out.write("\t\t\t\t                    \t\t<label class=\"sr-only\" for=\"txtUsername\">Username</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"text\" name=\"txtUsername\" placeholder=\"Username...\" class=\"form-username form-control\" id=\"form-username\">\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t                        \t<label class=\"sr-only\" for=\"txtPassword\">Password</label>\n");
      out.write("\t\t\t\t                        \t<input type=\"password\" name=\"txtPassword\" placeholder=\"password...\" class=\"form-password form-control\" id=\"form-password\">\n");
      out.write("\t\t\t\t                        </div>\n");
      out.write("\t\t\t\t                        <button type=\"submit\" class=\"btn\">Sign in!</button>\n");
      out.write("\t\t\t\t                    </form>\n");
      out.write("\t\t\t                    </div>\n");
      out.write("\t\t                    </div>\t                        \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-sm-1 middle-border\"></div>\n");
      out.write("                        <div class=\"col-sm-1\"></div>\n");
      out.write("                        \t\n");
      out.write("                        <div class=\"col-sm-5\">\n");
      out.write("                        \t\n");
      out.write("                        \t<div class=\"form-box\">\n");
      out.write("                                    <div class=\"form-top\">\n");
      out.write("                                            <div class=\"form-top-left\">\n");
      out.write("                                                    <h3>Sign up now</h3>\n");
      out.write("                                            <p>Fill in the form below to get instant access:</p>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-top-right\">\n");
      out.write("                                                    <i class=\"fa fa-pencil\"></i>\n");
      out.write("                                            </div>\n");
      out.write("\t                            </div>\n");
      out.write("\t                            <div class=\"form-bottom\">\n");
      out.write("                                        <form role=\"form\" action=\"SignupServlet\" method=\"post\" class=\"registration-form\">\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                    <label class=\"sr-only\" for=\"txtEmail\">Email</label>\n");
      out.write("                                                    <input type=\"text\" name=\"txtEmail\" placeholder=\"Email...\" class=\"form-email form-control\" id=\"form-email\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label class=\"sr-only\" for=\"txtUsername\">Username</label>\n");
      out.write("                                                <input type=\"text\" name=\"txtUsername\" placeholder=\"Username...\" class=\"form-username form-control\" id=\"form-username\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label class=\"sr-only\" for=\"txtPassword\">Password</label>\n");
      out.write("                                                <input type=\"password\" name=\"txtPassword\" placeholder=\"Password...\" class=\"form-password form-control\" id=\"form-password\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label class=\"sr-only\" for=\"txtRePassword\">Re password</label>\n");
      out.write("                                                <input type=\"password\" name=\"txtRePassword\" placeholder=\"Re Password...\" class=\"form-repassword form-control\" id=\"form-repassword\">\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <button type=\"submit\" class=\"btn\">Sign me up!</button>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                        \t</div>\n");
      out.write("                        \t\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Javascript -->\n");
      out.write("        <script src=\"assets/js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.backstretch.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/scripts.js\"></script>\n");
      out.write("        \n");
      out.write("        <!--[if lt IE 10]>\n");
      out.write("            <script src=\"assets/js/placeholder.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <script>\n");
        out.write("                alert(\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\");\n");
        out.write("            </script>\n");
        out.write("        ");
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
}

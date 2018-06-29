package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class topic_005fwords_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<link rel=\"stylesheet\" href=\"./css/mywords.css\" type=\"text/css\"/>\n");
      out.write("<script src=\"./js/home.js\"></script>\n");
      out.write("<script src=\"./js/mywords.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <div class=\"header\">\n");
      out.write("      \n");
      out.write("      <div class=\"sign_home\">\n");
      out.write("      <span onclick=\"document.getElementById('id01').style.display='block'\">Sign in</span> or <span onclick=\"document.getElementById('id02').style.display='block'\">Sign up</span>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"header_resize\">\n");
      out.write("      <div class=\"menu_nav\">\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"index.jsp\"><span>Home Page</span></a></li>\n");
      out.write("          <li><a href=\"book.jsp\"><span>Book</span></a></li>\n");
      out.write("          <li><a href=\"learning.jsp\"><span>Learning</span></a></li>\n");
      out.write("          <li><a href=\"minigames.jsp\"><span>Mini games</span></a></li>\n");
      out.write("          <li><a href=\"test.jsp\"><span>Test</span></a></li>\n");
      out.write("          <li class=\"active\"><a href=\"mywords.jsp\"><span>My words</span></a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <h1><a href=\"index.jsp\">Ohayo<span>!</span></a></h1>\n");
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
      out.write("  ");
      bean.UserWordBean w = null;
      synchronized (session) {
        w = (bean.UserWordBean) _jspx_page_context.getAttribute("w", PageContext.SESSION_SCOPE);
        if (w == null){
          w = new bean.UserWordBean();
          _jspx_page_context.setAttribute("w", w, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("w"), request);
      out.write("\n");
      out.write("\n");
      out.write("  <div class=\"main_content\"> \n");
      out.write("            <h2 id=\"title_learning\">Learn flashcard</h2>\n");
      out.write("            <h2 id=\"table_title_learning\">できる日本語</h2>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main_content_flashcard\">\n");
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("            <!--<a href=\"learning.jsp\" id=\"button_forward_learn\">Back to Learning</a>-->\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <a id=\"button_forward_learn\" href=\"mywords.jsp\"><span>Back to Topics </span></a>\n");
      out.write("    <!-- footer here -->\n");
      out.write("  <div class=\"footer\">\n");
      out.write("    <div class=\"footer_resize\">\n");
      out.write("      <p class=\"lf\">Copyright &copy; <a href=\"#\">Domain Name</a>. All Rights Reserved</p>\n");
      out.write("          <p class=\"rf\">Design by <a target=\"_blank\" href=\"http://www.dreamtemplate.com/\">DreamTemplate</a></p>\n");
      out.write("          <div style=\"clear:both;\"></div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("i");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${w.words}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <div class=\"container_flashcard\"> \n");
          out.write("                    <a> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.japanese}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                    <a id=\"right\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.vietnamese}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                </div>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mywords_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_param_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_var_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_param_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_url_var_value.release();
    _jspx_tagPool_c_param_value_name_nobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Ohayo! | My words</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link href=\"./css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/home.css\" type=\"text/css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/mywords.css\" type=\"text/css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./js/home.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./js/mywords.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- header -->\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("      \r\n");
      out.write("      <div class=\"sign_home\">\r\n");
      out.write("      <span onclick=\"document.getElementById('id01').style.display='block'\">Sign in</span> or <span onclick=\"document.getElementById('id02').style.display='block'\">Sign up</span>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"header_resize\">\r\n");
      out.write("      <div class=\"menu_nav\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li><a href=\"index.jsp\"><span>Home Page</span></a></li>\r\n");
      out.write("          <li><a href=\"book.jsp\"><span>Book</span></a></li>\r\n");
      out.write("          <li><a href=\"learning.jsp\"><span>Learning</span></a></li>\r\n");
      out.write("          <li><a href=\"minigames.jsp\"><span>Mini games</span></a></li>\r\n");
      out.write("          <li><a href=\"test.jsp\"><span>Test</span></a></li>\r\n");
      out.write("          <li class=\"active\"><a href=\"mywords.jsp\"><span>My words</span></a></li>\r\n");
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
      out.write("  <!-- the contents here -->\r\n");
      out.write("  <div class=\"main_content\">\r\n");
      out.write("      <h2 id=\"title\">My words</h2>\r\n");
      out.write("      ");
      bean.TopicBean t = null;
      synchronized (session) {
        t = (bean.TopicBean) _jspx_page_context.getAttribute("t", PageContext.SESSION_SCOPE);
        if (t == null){
          t = new bean.TopicBean();
          _jspx_page_context.setAttribute("t", t, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("b"), request);
      out.write("\r\n");
      out.write("         \r\n");
      out.write("      <div class=\"select_container_mywords\">\r\n");
      out.write("          ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      <div class=\"group_button_mywords\">\r\n");
      out.write("      <button id=\"button_add_mywords\">Add topic</button>\r\n");
      out.write("      <button id=\"button_delete_mywords\">Delete topic</button>\r\n");
      out.write("      \r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("    <!-- The add topic Modal -->\r\n");
      out.write("    <!-- Trigger/Open The Modal -->\r\n");
      out.write("\r\n");
      out.write("<!-- The Modal -->\r\n");
      out.write("<div id=\"addModal\" class=\"modal\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Modal content -->\r\n");
      out.write("  <div class=\"modal-content\">\r\n");
      out.write("    <span class=\"close\">&times;</span>\r\n");
      out.write("    <form action=\"POST\">\r\n");
      out.write("    <input type=\"text\" name=\"topicName\" placeholder=\"Enter topic name\" style=\"width: 50%;margin: 5px\"></input>\r\n");
      out.write("    <input id =\"button_add_topic\" type=\"submit\" name=\"add\" value=\"add\" style=\"padding: 10px; margin: 5px\"/>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"deleteModal\" class=\"modal\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Modal content -->\r\n");
      out.write("  <div class=\"modal-content\">\r\n");
      out.write("    <span class=\"close\">&times;</span>\r\n");
      out.write("    <form action=\"POST\">\r\n");
      out.write("    <!-- modal delete content-->\r\n");
      out.write("    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("          <br/>\r\n");
      out.write("          <input id=\"button_delete_topic\" type=\"submit\" name=\"delete\" value=\"delete selected\" style=\"margin: 5px 300px;padding:10px;\"/>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    // Get the modal\r\n");
      out.write("var addModal = document.getElementById('addModal');\r\n");
      out.write("var deleteModal = document.getElementById('deleteModal');\r\n");
      out.write("// Get the button that opens the modal\r\n");
      out.write("var btnAdd = document.getElementById(\"button_add_mywords\");\r\n");
      out.write("var btnDel = document.getElementById(\"button_delete_mywords\");\r\n");
      out.write("// Get the <span> element that closes the modal\r\n");
      out.write("var span = document.getElementsByClassName(\"close\");\r\n");
      out.write("\r\n");
      out.write("// When the user clicks the button, open the modal \r\n");
      out.write("btnAdd.onclick = function() {\r\n");
      out.write("    addModal.style.display = \"block\";\r\n");
      out.write("};\r\n");
      out.write("btnDel.onclick = function() {\r\n");
      out.write("    deleteModal.style.display = \"block\";\r\n");
      out.write("};\r\n");
      out.write("// When the user clicks on <span> (x), close the modal\r\n");
      out.write("span.onclick = function() {\r\n");
      out.write("    addModal.style.display = \"none\";\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("// When the user clicks anywhere outside of the modal, close it\r\n");
      out.write("window.onclick = function(event) {\r\n");
      out.write("    if (event.target === addModal) {\r\n");
      out.write("        addModal.style.display = \"none\";\r\n");
      out.write("    }\r\n");
      out.write("    if (event.target === deleteModal) {\r\n");
      out.write("        deleteModal.style.display = \"none\";\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("// Get the button that opens the modal\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("};\r\n");
      out.write("</script>\r\n");
      out.write("<!--end add topic modal -->\r\n");
      out.write("  </div>\r\n");
      out.write("    <!-- footer here -->\r\n");
      out.write("  <div class=\"footer\">\r\n");
      out.write("    <div class=\"footer_resize\">\r\n");
      out.write("      <p class=\"lf\">Copyright &copy; <a href=\"#\">Domain Name</a>. All Rights Reserved</p>\r\n");
      out.write("          <p class=\"rf\">Design by <a target=\"_blank\" href=\"http://www.dreamtemplate.com/\">DreamTemplate</a></p>\r\n");
      out.write("          <div style=\"clear:both;\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty topics}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("          <p>Nothing to show</p>\r\n");
        out.write("      ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty topics}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_forEach_0.setVar("i");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.topics}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("              ");
          if (_jspx_meth_c_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("       \r\n");
          out.write("          <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${topicContent}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("          ");
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

  private boolean _jspx_meth_c_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_url_0.setVar("topicContent");
    _jspx_th_c_url_0.setValue("#");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_0[0]++;
        _jspx_th_c_url_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                  ");
        if (_jspx_meth_c_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("                  ");
        if (_jspx_meth_c_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        out.write("\r\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_url_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_0[0]--;
    }
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_0 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_0.setPageContext(_jspx_page_context);
    _jspx_th_c_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_0);
    _jspx_th_c_param_0.setName("topicID");
    _jspx_th_c_param_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_0 = _jspx_th_c_param_0.doStartTag();
    if (_jspx_th_c_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_0);
    return false;
  }

  private boolean _jspx_meth_c_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_1 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_1.setPageContext(_jspx_page_context);
    _jspx_th_c_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_0);
    _jspx_th_c_param_1.setName("topicName");
    _jspx_th_c_param_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_1 = _jspx_th_c_param_1.doStartTag();
    if (_jspx_th_c_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty topics}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("          <p>Nothing to show</p>\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty topics}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_forEach_1.setVar("i");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.topics}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("              ");
          if (_jspx_meth_c_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\r\n");
          out.write("       \r\n");
          out.write("          <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${topicContent}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_url_1.setVar("topicContent");
    _jspx_th_c_url_1.setValue("#");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_1[0]++;
        _jspx_th_c_url_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_url_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                  ");
        if (_jspx_meth_c_param_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("                  ");
        if (_jspx_meth_c_param_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_url_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
          return true;
        out.write("\r\n");
        out.write("              ");
        int evalDoAfterBody = _jspx_th_c_url_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_url_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_1[0]--;
    }
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_var_value.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_param_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_2 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_2.setPageContext(_jspx_page_context);
    _jspx_th_c_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_1);
    _jspx_th_c_param_2.setName("topicID");
    _jspx_th_c_param_2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_2 = _jspx_th_c_param_2.doStartTag();
    if (_jspx_th_c_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_2);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_2);
    return false;
  }

  private boolean _jspx_meth_c_param_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_url_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_param_3 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _jspx_tagPool_c_param_value_name_nobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_param_3.setPageContext(_jspx_page_context);
    _jspx_th_c_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_url_1);
    _jspx_th_c_param_3.setName("topicName");
    _jspx_th_c_param_3.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_param_3 = _jspx_th_c_param_3.doStartTag();
    if (_jspx_th_c_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_3);
      return true;
    }
    _jspx_tagPool_c_param_value_name_nobody.reuse(_jspx_th_c_param_3);
    return false;
  }
}

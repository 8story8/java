/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2017-04-23 08:41:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar", Long.valueOf(1492936807702L));
    _jspx_dependants.put("jar:file:/C:/Users/Moon/Desktop/Saiden/Employment/java-kosta/WAS/semi-tomcat/webapps/BookieOnAndOn/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1323225978000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\n");
      out.write("#nav{\r\n");
      out.write("   font-size: 17px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".tab{\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#tags {\r\n");
      out.write("\theight: 60px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#tagsSpan {\r\n");
      out.write("\theight: 60px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#tagsI {\r\n");
      out.write("\twidth: 40px;\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("\tdocument.onkeyup = Esc;\r\n");
      out.write("\tfunction Esc() {\r\n");
      out.write("\t\tvar KeyID = event.keyCode;\r\n");
      out.write("\t\tif (KeyID == 27) {\r\n");
      out.write("\t\t\t$(\"#backgroundMusic\").attr(\"volume\", -3400);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction logout() {\r\n");
      out.write("\t\tvar f = confirm(\"로그아웃 하시겠습니까?\");\r\n");
      out.write("\t\tif (f)\r\n");
      out.write("\t\t\tlocation.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/DispatcherServlet?command=logout\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#tagsI\").mouseover(function() {\r\n");
      out.write("\t\t\t$(\"#tagsSpan\").css(\"background\", \"white\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#tagsI\").mouseout(function() {\r\n");
      out.write("\t\t\t$(\"#tagsSpan\").css(\"background\", \"\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction bookSearch() {\r\n");
      out.write("\t\tif ($(\"#tags\").val() == 0) {\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$(\"#bookSearchForm\").submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\n");
      out.write("\t\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#tags\")\r\n");
      out.write("\t\t\t\t.autocomplete(\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\tsource : function(request, response) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.ajax({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttype : \"get\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/DispatcherServlet?command=bookAutoComplete\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\"title\" : request.term\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar bookAutoCompleteList = [];\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar temp = JSON.parse(JSON\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.stringify(data));\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfor (var i = 0; i < temp.length; i++) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tbookAutoCompleteList\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.push(temp[i].title);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\treturn response(bookAutoCompleteList);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<embed id=\"backgroundMusic\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/music/boogieonandon.mp3\" width=\"0px\" height=\"0px\">\r\n");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("   ");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("   ");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      if (!_jspx_th_c_005fchoose_005f0_reused) {
        _jspx_th_c_005fchoose_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_c_005fchoose_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /template/header.jsp(92,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.mvo==null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("      <!-- Header -->\r\n");
          out.write("      <div id=\"header-wrapper\">\r\n");
          out.write("         <header id=\"header\" class=\"container\">\r\n");
          out.write("            <!-- Logo -->\r\n");
          out.write("            <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/index.jsp\"> <img\r\n");
          out.write("               src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/images/Logo.png\"\r\n");
          out.write("               style=\"width: 250px;\">\r\n");
          out.write("            </a>\r\n");
          out.write("\r\n");
          out.write("           <!-- Nav -->\r\n");
          out.write("            <nav id=\"nav\">\r\n");
          out.write("            <br>\r\n");
          out.write("               <ul>\r\n");
          out.write("                  <li class=\"current\"><a class = \"tab\"\r\n");
          out.write("                     href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/index.jsp\">welcome</a></li>\r\n");
          out.write("                  <li><a class = \"tab\"\r\n");
          out.write("                     href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/bookie/login.jsp\">로그인</a></li>\r\n");
          out.write("                  <li><a class = \"tab\"\r\n");
          out.write("                     href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/bookie/register.jsp\">회원가입</a></li>\r\n");
          out.write("                  <li><a class = \"tab\"\r\n");
          out.write("                     href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/bookie/findId.jsp\">아이디 찾기</a></li>\r\n");
          out.write("                     <li style = \"padding:0px;\">/</li>\r\n");
          out.write("                  <li style = \"margin-left:-25px;\"><a class = \"tab\"\r\n");
          out.write("                     href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/bookie/findPw.jsp\">비밀번호 찾기</a></li>\r\n");
          out.write("               </ul>\r\n");
          out.write("\r\n");
          out.write("            </nav>\r\n");
          out.write("            <br>\r\n");
          out.write("            <div class=\"container\">\r\n");
          out.write("               <div class=\"row\">\r\n");
          out.write("                  <div class=\"2u\"></div>\r\n");
          out.write("                  <div class=\"8u\">\r\n");
          out.write("                     <form\r\n");
          out.write("                        action=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/DispatcherServlet\"\r\n");
          out.write("                        id=\"bookSearchForm\">\r\n");
          out.write("                        <div class=\"ui-widget\">\r\n");
          out.write("                           <div class=\"input-group input-group-lg\">\r\n");
          out.write("                              <input type=\"hidden\" name=\"command\" value=\"bookSearch\">\r\n");
          out.write("                              <input id=\"tags\" type=\"text\" class=\"form-control\" name=\"title\"\r\n");
          out.write("                                 style=\"border-color: #cccccc\"> <span\r\n");
          out.write("                                 class=\"input-group-addon\" id=\"tagsSpan\"> <i\r\n");
          out.write("                                 class=\"fa fa-search\" id=\"tagsI\" onclick=\"bookSearch()\"></i>\r\n");
          out.write("                              </span>\r\n");
          out.write("                           </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                     </form>\r\n");
          out.write("                  </div>\r\n");
          out.write("                  <div class=\"2u\"></div>\r\n");
          out.write("               </div>\r\n");
          out.write("            </div>\r\n");
          out.write("         </header>\r\n");
          out.write("      </div>\r\n");
          out.write("   ");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      if (!_jspx_th_c_005fwhen_005f0_reused) {
        _jspx_th_c_005fwhen_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_c_005fwhen_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("      <!-- Header -->\r\n");
          out.write("      <div id=\"header-wrapper\">\r\n");
          out.write("         <header id=\"header\" class=\"container\">\r\n");
          out.write("            <div id=\"logo\">\r\n");
          out.write("               <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/index.jsp\"><img\r\n");
          out.write("                  src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/images/Logo.png\"\r\n");
          out.write("                  style=\"width: 250px;\"></a>\r\n");
          out.write("            </div>\r\n");
          out.write("             <br>\r\n");
          out.write("            <!-- Nav -->\r\n");
          out.write("            <nav id=\"nav\">\r\n");
          out.write("            <br>\r\n");
          out.write("               <ul>\r\n");
          out.write("               <li class=\"current\"><a class = \"tab\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/index.jsp\">welcome</a></li>\r\n");
          out.write("               <li><a class = \"tab\" href=\"javascript:logout()\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.mvo.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("님 &nbsp; 로그아웃</a></li>\r\n");
          out.write("               <li><a class = \"tab\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/DispatcherServlet?command=mypage\">마이페이지</a></li>\r\n");
          out.write("               <li><a class = \"tab\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/bookie/update.jsp\">회원정보수정</a></li>\r\n");
          out.write("            </ul>\r\n");
          out.write("            </nav>\r\n");
          out.write("\t\t\t\t<div class=\"container\">\r\n");
          out.write("\t\t\t\t\t<div class=\"row\">\r\n");
          out.write("\t\t\t\t\t\t<div class=\"2u\"></div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"8u\">\r\n");
          out.write("\t\t\t\t\t\t\t<form action=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/DispatcherServlet\" id=\"bookSearchForm\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"ui-widget\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group input-group-lg\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"command\" value=\"bookSearch\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<input id=\"tags\" type=\"text\" class=\"form-control\" name=\"title\" style=\"border-color: #cccccc\"> \r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\" id=\"tagsSpan\"> \r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-search\" id=\"tagsI\" onclick=\"bookSearch()\"></i>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t</form>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"2u\"></div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t</header>\r\n");
          out.write("\t\t</div>\r\n");
          out.write("   ");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      if (!_jspx_th_c_005fotherwise_005f0_reused) {
        _jspx_th_c_005fotherwise_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_c_005fotherwise_005f0);
      }
    }
    return false;
  }
}

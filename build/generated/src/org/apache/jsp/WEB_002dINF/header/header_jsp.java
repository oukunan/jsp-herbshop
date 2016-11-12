package org.apache.jsp.WEB_002dINF.header;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("    <title></title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/flat-ui.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <nav role=\"navigation\" class=\"navbar navbar-default\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button data-target=\"#navbar-collapse-08\" data-toggle=\"collapse\" class=\"navbar-toggle\" type=\"button\">\n");
      out.write("            </button>\n");
      out.write("            <a href=\"#\" class=\"navbar-brand\">IT21- HerbShop</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar-collapse-08\" class=\"collapse navbar-collapse\">\n");
      out.write("            <p class=\"navbar-text navbar-right\">Hello, <a class=\"navbar-link\" href=\"#\">Guest</a></p>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>IT21-HerbShop</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/type.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/header/header.jsp", out, false);
      out.write("\r\n");
      out.write("        <div class=\"container animated fadeIn\" id=\"edit\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <center>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <div id=\"typed-strings\">\r\n");
      out.write("                            <span>WelCome To</span>\r\n");
      out.write("                            <span>HerbShop </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <span id=\"typed\" style=\"white-space:pre; font-size: 80px\"></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </center>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>   \r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-4 text-center animated fadeIn\">\r\n");
      out.write("                <img src=\"images/7.png\"  height=\"250\" alt=\"pic1\" /><br><br>\r\n");
      out.write("                <a href=\"typeHerb.jsp\" class=\"btn  btn-primary btn-hg \">Herb (สมุนไพร)</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4 text-center animated fadeIn\">\r\n");
      out.write("                <img src=\"images/3.png\" height=\"250\"  alt=\"pic2\"  width=\"300\" height=\"300\" /><br><br>\r\n");
      out.write("                <a href=\"SearchDisease\" class=\"btn btn-primary btn-hg \">Diseases (อาการ)</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4 text-center animated fadeIn\">\r\n");
      out.write("                <img src=\"images/5.png\" height=\"250\"  alt=\"pic3\" width=\"300\" height=\"300\" /><br><br>\r\n");
      out.write("                <a href=\"SearchFood\" class=\"btn btn-primary btn-hg \">Food (อาหาร)</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/wow.min.js\"></script>\r\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"js/typed.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(function () {\r\n");
      out.write("\r\n");
      out.write("            $(\"#typed\").typed({\r\n");
      out.write("                // strings: [\"Typed.js is a <strong>jQuery</strong> plugin.\", \"It <em>types</em> out sentences.\", \"And then deletes them.\", \"Try it out!\"],\r\n");
      out.write("                stringsElement: $('#typed-strings'),\r\n");
      out.write("                typeSpeed: 100,\r\n");
      out.write("                backDelay: 500,\r\n");
      out.write("                loop: false,\r\n");
      out.write("                contentType: 'html', // or text\r\n");
      out.write("                // defaults to false for infinite loop\r\n");
      out.write("                loopCount: false,\r\n");
      out.write("                callback: function () {\r\n");
      out.write("                    foo();\r\n");
      out.write("                },\r\n");
      out.write("                resetCallback: function () {\r\n");
      out.write("                    newTyped();\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $(\".reset\").click(function () {\r\n");
      out.write("                $(\"#typed\").typed('reset');\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        function newTyped() { /* A new typed object */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function foo() {\r\n");
      out.write("            console.log(\"Callback\");\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("    <script>\r\n");
      out.write("        new WOW().init();\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
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
}

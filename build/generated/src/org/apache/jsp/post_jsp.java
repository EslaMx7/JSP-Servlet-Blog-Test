package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import org.apache.jasper.tagplugins.jstl.core.ForEach;
import java.util.List;
import web.*;

public final class post_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
 DbManager db = new DbManager();
   Post post;
if (request.getParameter("ID") != null) {
        int postID = Integer.parseInt(request.getParameter("ID").toString());
        post = db.GetPost(postID);
    } else {
        response.sendError(404, "This Article Not Found... :D");
    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"Eslam Hamouda\">\n");
      out.write("\n");
      out.write("        <title>");
      out.print( post.PostTitle);
      out.write(" | Eslam Hamouda</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Add custom CSS here -->\n");
      out.write("        <link href=\"css/modern-business.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <!-- You'll want to use a responsive image option so this logo looks good on devices - I recommend using something like retina.js (do a quick Google search for it and you'll find it) -->\n");
      out.write("                    <a class=\"navbar-brand logo\" href=\"index.jsp\">Eslam Hamouda</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"blog.jsp\">Blog</a></li>\n");
      out.write("                        <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                        <li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">About <b class=\"caret\"></b></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"portfolio-1-col.html\">About Me</a></li>\n");
      out.write("                                <li><a href=\"portfolio-2-col.html\">Contact Me</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div><!-- /.navbar-collapse -->\n");
      out.write("            </div><!-- /.container -->\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row row-offcanvas row-offcanvas-right\">\n");
      out.write("                <div class=\"col-lg-9 col-md-9 col-xs-9 col-sm-9\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"jumbotron\">\n");
      out.write("                        <h2><a href=\"#\">");
      out.print( post.PostTitle);
      out.write("</a></h2>\n");
      out.write("                        <img class=\"postimg\" src=\"");
      out.print( post.PostImage);
      out.write("\" title=\"Image Title !!!\" />\n");
      out.write("                        ");
      out.print( post.PostContent);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <hr />\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-3 col-md-3 col-xs-3 col-sm-3 sidebar-offcanvas\" id=\"sidebar\" role=\"navigation\">\n");
      out.write("                    <div class=\"well sidebar-nav\">\n");
      out.write("                        <ul class=\"nav\">\n");
      out.write("                            <li><b>Categories</b></li>\n");
      out.write("                            <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("                            <li><a href=\"#\">Programming</a></li>\n");
      out.write("                            <li><a href=\"#\">Web</a></li>\n");
      out.write("                            <hr />\n");
      out.write("                            <li><b>Social Links</b></li>\n");
      out.write("                            <li><a href=\"#\">Facebook</a></li>\n");
      out.write("                            <li><a href=\"#\">Youtube</a></li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!--/.well -->\n");
      out.write("                    <a class=\"twitter-timeline\" href=\"https://twitter.com/EslaMx7\" data-widget-id=\"386756343878541312\">Tweets by EslaMx7</a>\n");
      out.write("                    <script>!function(d, s, id) {\n");
      out.write("                            var js, fjs = d.getElementsByTagName(s)[0], p = /^http:/.test(d.location) ? 'http' : 'https';\n");
      out.write("                            if (!d.getElementById(id)) {\n");
      out.write("                                js = d.createElement(s);\n");
      out.write("                                js.id = id;\n");
      out.write("                                js.src = p + \"://platform.twitter.com/widgets.js\";\n");
      out.write("                                fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("                            }\n");
      out.write("                        }(document, \"script\", \"twitter-wjs\");</script>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!--/span-->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("            <footer>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <p>Copyright &copy; EslaMxSoft 2013</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("        </div><!-- /.container -->\n");
      out.write("\n");
      out.write("        <!-- JavaScript -->\n");
      out.write("        <script src=\"js/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"js/modern-business.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

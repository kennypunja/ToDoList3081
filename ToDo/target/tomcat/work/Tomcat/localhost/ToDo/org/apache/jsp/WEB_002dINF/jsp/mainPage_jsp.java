/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-02-11 17:22:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/resources/css/mainPage.css", Long.valueOf(1486833307000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <meta name=\"google-signin-client_id\" content=\"YOUR_CLIENT_ID.apps.googleusercontent.com\">\n");
      out.write("\n");
      out.write("    <title> List App </title>\n");
      out.write("\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\" integrity=\"sha384-3ceskX3iaEnIogmQchP8opvBy3Mi7Ce34nWjpBIwVTHfGYWQS9jwHDVRnpKKHJg7\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/tether/1.3.7/js/tether.min.js\" integrity=\"sha384-XTs3FgkjiBgo8qjEjBk0tGmf3wPrWtA6coPfQDfFEY8AnYJwjalXCiosYRBIBZX8\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.5/js/bootstrap.min.js\" integrity=\"sha384-BLiI7JTZm+JWlgKa0M0kGRpJbF2J8q+qreVrKBC47e3K6BW78kGLrCkeRX6I9RoK\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/angular-ui-router/0.4.2/angular-ui-router.js\"></script>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular-animate.js\"></script>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular-sanitize.js\"></script>\n");
      out.write("    <script src=\"https://angular-ui.github.io/bootstrap/ui-bootstrap-tpls-2.3.0.js\"></script>\n");
      out.write("    <script src=\"https://apis.google.com/js/platform.js\" async defer></script>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.5/css/bootstrap.min.css\" integrity=\"sha384-AysaV+vQoT3kOAXZkl02PThvDr8HYKPZhNT5h/CXfBThSRXQ6jW5DO2ekP5ViFdi\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        ");
      out.write(".sm3Text{\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".col-sm-3{\n");
      out.write("    background-color: #F0C653;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row-height{\n");
      out.write("    height: 100vh;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".hr {\n");
      out.write("    border-top: 1px white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".listItem {\n");
      out.write("    margin-top: 100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar {\n");
      out.write("    height: 65px;\n");
      out.write("    background-color: #DDFFA9;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#pullRight{\n");
      out.write("    position: relative;\n");
      out.write("    float:right;\n");
      out.write("    margin-right: 4px;\n");
      out.write("    margin-top: 7px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#pullLeft {\n");
      out.write("    float:left;\n");
      out.write("    margin-top: 7px;\n");
      out.write("    color: #0C6C0C;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#mainContainer {\n");
      out.write("    height: 90.5vh;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#listItem {\n");
      out.write("    display: inline-block;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-primary-outline{\n");
      out.write("    background-color: transparent;\n");
      out.write("    border-color: #ccc;\n");
      out.write("}");
      out.write("\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-sm-3 row-height\">\n");
      out.write("        <h3 style= \"margin-top: 20px\" class=\"sm3Text\"> To Do Lists </h3>\n");
      out.write("        <hr color=\"white\">\n");
      out.write("        <ul class=\"list-group\">\n");
      out.write("            <li class=\"sm3Text\">\n");
      out.write("                <h5>List1</h5>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"sm3Text\">\n");
      out.write("                <h5>List2</h5>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-9\">\n");
      out.write("        <nav class=\"navbar navbar-light bg-faded\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <h3 id=\"pullLeft\"> Current List </h3>\n");
      out.write("                <button id=\"pullRight\" class=\"btn btn-outline-success btn-sm \" type=\"submit\">Log Out </button>\n");
      out.write("                <button id=\"pullRight\" class=\"btn btn-outline-success btn-sm \" type=\"submit\">Delete List</button>\n");
      out.write("                <button id=\"pullRight\" class=\"btn btn-outline-success btn-sm \" type=\"submit\">Save List</button>\n");
      out.write("                <button id=\"pullRight\" class=\"btn btn-outline-success btn-sm \" type=\"submit\">Create List</button>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div style=\"margin-top: 10px\" class=\"container\" id=\"mainContainer\">\n");
      out.write("            <ul class=\"list-group\">\n");
      out.write("                <li id=\"listItem\" class=\"list-group-item\">\n");
      out.write("                    <h5> <strike>Task 1 </strike>\n");
      out.write("                        <button style=\"float:right\"class=\"bnt btn-sm btn-outline-success\" type=\"submit\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-arrow-down\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <button style=\"float:right\"class=\"bnt btn-sm btn-outline-success\" type=\"submit\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-arrow-up\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <button style=\"float:right\"class=\"bnt btn-sm btn-outline-success\" type=\"submit\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-trash\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <button style=\"float:right\"class=\"bnt btn-sm btn-outline-success\" type=\"submit\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-pencil\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <button style=\"float:right\"class=\"bnt btn-sm btn-outline-success\" type=\"submit\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-ok\"></span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                    </h5>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"list-group-item\">\n");
      out.write("                    <h5>Task 2\n");
      out.write("\n");
      out.write("                    </h5>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

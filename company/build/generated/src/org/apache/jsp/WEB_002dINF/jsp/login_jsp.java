package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<style>\n");
      out.write("\t\t* {\n");
      out.write("\t\t\tbox-sizing: border-box;\n");
      out.write("\t\t}\n");
      out.write("\t\t.row::after {\n");
      out.write("\t\t\tcontent: \"\";\n");
      out.write("\t\t\tclear: both;\n");
      out.write("\t\t\tdisplay: table;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t[class*=\"col-\"] {\n");
      out.write("\t\t\tfloat: left;\n");
      out.write("\t\t\tpadding: 15px;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.col-1 {width: 8.33%;}\n");
      out.write("\t\t.col-2 {width: 16.66%;}\n");
      out.write("\t\t.col-3 {width: 25%;}\n");
      out.write("\t\t.col-4 {width: 33.33%;}\n");
      out.write("\t\t.col-5 {width: 41.66%;}\n");
      out.write("\t\t.col-6 {width: 50%;}\n");
      out.write("\t\t.col-7 {width: 58.33%;}\n");
      out.write("\t\t.col-8 {width: 66.66%;}\n");
      out.write("\t\t.col-9 {width: 75%;}\n");
      out.write("\t\t.col-10 {width: 83.33%;}\n");
      out.write("\t\t.col-11 {width: 91.66%;}\n");
      out.write("\t\t.col-12 {width: 100%;}\n");
      out.write("\n");
      out.write("\t\t\t\ta:link {\n");
      out.write("\t\t\t\t\tcolor: black;\n");
      out.write("\t\t\t\t\tbackground-color: transparent;\n");
      out.write("\t\t\t\t\ttext-decoration: none;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\ta:hover {\n");
      out.write("\t\t\t\t\tcolor: black;\n");
      out.write("\t\t\t\t\tbackground-color: transparent;\n");
      out.write("\t\t\t\t\ttext-decoration: none;\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\ta:active {\n");
      out.write("\t\t\t\t\tcolor: black;\n");
      out.write("\t\t\t\t\tbackground-color: transparent;\n");
      out.write("\t\t\t\t\ttext-decoration: none;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tinput, select {\n");
      out.write("\t\t\t\t\t\twidth: 100%;\n");
      out.write("\t\t\t\t\t\tpadding: 12px 20px;\n");
      out.write("\t\t\t\t\t\tmargin: 8px 0;\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tborder: 1px solid #ccc;\n");
      out.write("\t\t\t\t\t\tborder-radius: 4px;\n");
      out.write("\t\t\t\t\t\tbox-sizing: border-box;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\tbutton {\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\twidth: 25%;\n");
      out.write("\t\t\t\t\t\tbackground-color: gray;\n");
      out.write("\t\t\t\t\t\tcolor: white;\n");
      out.write("\t\t\t\t\t\tpadding: 14px 20px;\n");
      out.write("\t\t\t\t\t\tmargin: 8px 0;\n");
      out.write("\t\t\t\t\t\tborder: none;\n");
      out.write("\t\t\t\t\t\tborder-radius: 4px;\n");
      out.write("\t\t\t\t\t\tcursor: pointer;\n");
      out.write("\t\t\t\t\t\t float: right;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\tbutton:hover {\n");
      out.write("\t\t\t\t\t\tbackground-color: black;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t</style>\n");
      out.write("\t\n");
      out.write("\t</head>\n");
      out.write("\t\n");
      out.write("\t<body>\n");
      out.write("\n");
      out.write("\t\t<div class=\"row\" >\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-1\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-2\" align=\"center\" >\n");
      out.write("\t\t\t<a href=\"aboutus.php\">ABOUT US</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-2\" align=\"center\">\n");
      out.write("\t\t\t<a href=\"services.php\">SERVICES</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-2\" align=\"center\">\n");
      out.write("\t\t\t<a href=\"CompanyMaintenanceSystem.php\"><img src=\"Header & Footer/Camera.png\" style=\"height:25%;width:25%\"></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-2\" align=\"center\">\n");
      out.write("\t\t\t<a href=\"contactus.php\">CONTACT US</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-2\" align=\"center\">\n");
      out.write("\t\t\t<a href=\"login.php\">LOGIN</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"col-1\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write(" ");

    if(session.getAttribute("id")!=null){
        response.sendRedirect("index.html");
    }


      out.write("\n");
      out.write("\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t<img src=\"Home/login.jpg\" style=\"width:100%;height:500px;\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t<h1 Style=\"background-color:gray;padding:5px\" align=\"center\">Login</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"col-12\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-3\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-6\" align=\"center\">\n");
      out.write("\t\t\t\t<form action=\"edit/validatelogin.jsp\" method=\"POST\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<label for=\"fname\">User ID</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"username\" placeholder=\"Your UserId\">\n");
      out.write("\t\t\t\t\t\t<label for=\"password\">Password</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"password\" placeholder=\"Your Password\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  \n");
      out.write("\t\t\t\t\t<button type=\"submit\" name=\"submit\" id=\"submit\">Login</button>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t<br><br><br>\n");
      out.write("\t\t\t\t<p align=\"right\">Forgot your password? <a href=\"#\" style=\"color: blue\">Click Here!</a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-3\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"col-12\" style=\"background-color:gray;height:200px;padding:1px\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-4 footer\" align=\"center\">\n");
      out.write("\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t\t<tr style=\"height:50px\">\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<img src=\"Header & Footer/62516.png\" style=\"height:5%;width:5%\">\n");
      out.write("\t\t\t\t\t\tNo 12, Ridgeway place Colombo 04\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<tr style=\"height:70px\">\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<img src=\"Header & Footer/img_286083.png\" style=\"height:5%;width:5%\">\n");
      out.write("\t\t\t\t\t\t011-2547658\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t<img src=\"Header & Footer/email.png\" style=\"height:5%;width:5%\">\n");
      out.write("\t\t\t\t\t\twww.cameraxis@gmail.com\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-4 footer\" align=\"center-left\">\n");
      out.write("\t\t\t\t\t<a href=\"https://www.facebook.com/cameraxis/\"><img src=\"Header & Footer/facebook-4dd1631e86173638d2c9aaa051dd7f8f.png\" style=\"height:9%;width:9%\"></a>&nbsp &nbsp &nbsp\n");
      out.write("\t\t\t\t\t<a href=\"https://www.instagram.com/cameraxisapp/?hl=en\"><img src=\"Header & Footer/md_5a98273a4e62e.png\" style=\"height:10%;width:10%\"></a>&nbsp &nbsp &nbsp\n");
      out.write("\t\t\t\t\t<a href=\"https://plus.google.com/+Cameraxis\"><img src=\"Header & Footer/md_5a98273aeeb5a.png\" style=\"height:9%;width:9%\"></a>&nbsp &nbsp &nbsp\n");
      out.write("\t\t\t\t\t<a href=\"https://twitter.com/cameraxis\"><img src=\"Header & Footer/md_5a98273bb9a60.png\" style=\"height:9%;width:9%\"></a>&nbsp &nbsp &nbsp\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-4 footer\" align=\"center\" style=\"height:200px\">\n");
      out.write("\t\t\t\t\t<a href=\"https://www.google.com/maps/place/Ridgeway+Pl,+Colombo/@6.8798504,79.8554955,17z/data=!3m1!4b1!4m5!3m4!1s0x3ae25bc6d5e20acd:0xd0eb67a7aefc8ff1!8m2!3d6.8798504!4d79.8576842\"><img src=\"Header & Footer/map.png\" style=\"height:100%;width:80%\"></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</body>\n");
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

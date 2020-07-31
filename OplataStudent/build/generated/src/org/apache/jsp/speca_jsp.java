package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class speca_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#fee2af\">                  ");
      out.write('\n');
      out.write('\n');

Locale.setDefault(Locale.ENGLISH);   
String dburl="jdbc:oracle:thin:@127.0.0.1:1521:XE";
String login = "qw";
String pass = "qw";
Connection con = null;
Statement stmt = null; 
ResultSet rs = null;

try{ 
     String tmp = request.getParameter("s_sel");   
     String txt = request.getParameter("s_name"); 
     String txt2 =request.getParameter("upd_name_s"); 
//   DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());         
     Class.forName("oracle.jdbc.driver.OracleDriver");
     con = DriverManager.getConnection(dburl,login,pass); 
////////////////////////////////////////////////////////////////////////////////////

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<font color=\"#8b0000\"><h2>Специальность</h2></font>\n");
      out.write("<form action=\"speca_add.jsp\" target=\"Main\">\n");
      out.write("    <input type=\"text\" value=\"\" name=\"s_name\" />\n");
      out.write("    <select name=\"s_sel\">\n");
      out.write("        <option>Add</option>\n");
      out.write("        <option>Delete</option>\n");
      out.write("        <option onclick=\"newText(this.form)\">Update</option>\n");
      out.write("    </select>\n");
      out.write("    <input type=\"submit\" value=\"OK\" name=\"upd_name_s\" />\n");
      out.write("</form><br>\n");
      out.write(" \n");

     
 //////////////////////////////////////////////////////////////////////////////////////    
String SQL5 = "select SPECIALNOST.ID, SPECIALNOST.NAME, FAKULTET.NAME, FORMA.NAME, SPECIALNOST.SUMMA from FAKULTET, FORMA, SPECIALNOST where SPECIALNOST.FORMA=FORMA.ID and SPECIALNOST.FAKULTET=FAKULTET.ID";

       stmt = con.createStatement();
       rs = stmt.executeQuery(SQL5);
       
       
   out.println("<table bgcolor=#ffcc88 border=1>");
   out.println("<tr bgcolor=#eebb88><th>ID: </th><th>Специальность: </th><th>Факультет: </th><th>Форма обучения: </th><th>Плата за год: </th></tr>");    
   while (rs.next()) {
     out.println("<tr>");
     out.println("<th>"+rs.getString("SPECIALNOST.ID")+"</th>");
     out.println("<th>"+rs.getString("SPECIALNOST.NAME")+"</th>");
     out.println("<th>"+rs.getString("FAKULTET.NAME")+"</th>");
     out.println("<th>"+rs.getString("FORMA.NAME")+"</th>");
     out.println("<th>"+rs.getString("SPECIALNOST.SUMMA")+"</th>");
     out.println("</tr>");     
    }
   out.println("</table>");
   
    rs.close() ;
    stmt.close() ;
//try{      
}catch(Exception e){
     e.printStackTrace();
     out.println("Произошла ошибка соединения к базе данных!");
 }finally{
     if (rs != null) try { rs.close(); } catch(Exception e) {}
     if (stmt != null) try { stmt.close(); } catch(Exception e) {}
     if (con != null) try { con.close(); } catch(Exception e) {}
  }

      out.write("  \n");
      out.write("<SCRIPT LANGUAGE=\"JavaScript\" TYPE=\"Text/javascript\"> \n");
      out.write("    function newText(form){\n");
      out.write("    var buf = prompt('Введите новое значение','');\n");
      out.write("    form.upd_name_s.value= buf; \n");
      out.write("    }\n");
      out.write(" </SCRIPT>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

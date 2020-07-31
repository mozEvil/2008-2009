<%@page contentType="text/html"%>
<%@ page import="java.sql.*,java.util.*"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="#fee2af">                  <%-- ide    4NU9od2L   --%>

<%
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
%>

<%
   String tmp_name = request.getParameter("spec_name");   
   String tmp_fak = request.getParameter("spec_fak"); 
   String tmp_forma =request.getParameter("spec_forma"); 
   String tmp_summa = request.getParameter("spec_summa"); 
   
 if ((tmp_name!=null)&&(tmp_fak!=null)&&(tmp_forma!=null)&&(tmp_summa!=null)){ 
if ((tmp_name!="")&&(tmp_fak!="")&&(tmp_forma!="")&&(tmp_summa!="")){%> <%--
           if (tmp.equals("Add")==true){
     --%><%    String SQL9 = "insert into specialnost(name,fakultet,forma,summa) values('"+ tmp_name +"','"+ tmp_fak +"','"+ tmp_forma +"','"+ tmp_summa +"')";
               stmt = con.createStatement();
               rs = stmt.executeQuery(SQL9);
               rs.close() ;
               stmt.close() ; %> <%--
           }else{if (tmp.equals("Delete")==true){
          try{   String SQL8a = "DELETE FROM specialnost WHERE id='" + txt + "'";
                 stmt = con.createStatement();
                 rs = stmt.executeQuery(SQL8a);             
                 rs.close() ;
                 stmt.close() ; }catch(Exception e){};
                 
          try{   String SQL8b = "DELETE FROM specialnost WHERE name='" +txt+ "'";
                 stmt = con.createStatement();
                 rs = stmt.executeQuery(SQL8b);             
                 rs.close() ;
                 stmt.close() ; }catch(Exception e){};
           }else{if (tmp.equals("Update")==true){
 //            String SQL7 = "update  ";
//             stmt = con.createStatement();
//             rs = stmt.executeQuery(SQL9);
//             rs.close() ;
//             stmt.close() ;
               }
           }
               
           }
--%> <%    }
 }

%>
<font color="#8b0000"><h2>Специальность</h2></font>
<table>
    <tr>
        <th><form action="speca_add.jsp" target="Main">
         <input type="submit" value="Добавить"/></form>
        </th>
        <th><form action="speca_del.jsp" target="Main">
         <input type="submit" value="Удалить"/></form></th>
        <th><form action="speca_upd.jsp" target="Main">
         <input type="submit" value="Изменить"/></form></th>
    </tr>
</table><br> 
<%
     
 //////////////////////////////////////////////////////////////////////////////////////    
String SQL5 = "select SPECIALNOST.ID, SPECIALNOST.NAME, FAKULTET.NAME, FORMA.NAME, SPECIALNOST.SUMMA from FAKULTET, FORMA, SPECIALNOST where SPECIALNOST.FORMA=FORMA.ID and SPECIALNOST.FAKULTET=FAKULTET.ID";

       stmt = con.createStatement();
       rs = stmt.executeQuery(SQL5);
       
       
   out.println("<table bgcolor=#ffcc88 border=1>");
   out.println("<tr bgcolor=#eebb88><th>ID: </th><th>Специальность: </th><th>Факультет: </th><th>Форма обучения: </th><th>Плата за год: </th></tr>");    
   while (rs.next()) {
     out.println("<tr>");
     out.println("<th>"+rs.getString(1)+"</th>");
     out.println("<th>"+rs.getString(2)+"</th>");
     out.println("<th>"+rs.getString(3)+"</th>");
     out.println("<th>"+rs.getString(4)+"</th>");
     out.println("<th>"+rs.getString(5)+"</th>");
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
%>  
    
    </body>
</html>
<%--
select	 SPECIALNOST.ID,
	 SPECIALNOST.NAME,
	 FAKULTET.NAME,
	 FORMA.NAME,
	 SPECIALNOST.SUMMA 
 from	 FAKULTET, FORMA, SPECIALNOST 
 where   SPECIALNOST.FORMA=FORMA.ID
 and	 SPECIALNOST.FAKULTET=FAKULTET.ID

--%>
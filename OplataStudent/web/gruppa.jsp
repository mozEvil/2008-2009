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
    String tmp_nomer = request.getParameter("grp_nomer");   
    String tmp_kurs = request.getParameter("grp_kurs"); 
    String tmp_speca = request.getParameter("grp_speca"); 
    
    if ((tmp_nomer!=null)&&(tmp_kurs!=null)&&(tmp_speca!=null)){ 
        if ((tmp_nomer!="")&&(tmp_kurs!="")&&(tmp_speca!="")){%> <%--
           if (tmp.equals("Add")==true){
     --%><%    String SQL1 = "insert into gruppa(nomer,kurs,specialnost) values('"+ tmp_nomer +"','"+ tmp_kurs +"','"+ tmp_speca +"')";
               stmt = con.createStatement();
               rs = stmt.executeQuery(SQL1);
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


   
<font color="#8b0000"><h2>Группа</h2></font>
<table>
    <tr>
        <th><form action="gruppa_add.jsp" target="Main">
         <input type="submit" value="Добавить"/></form>
        </th>
        <th><form action="gruppa_del.jsp" target="Main">
         <input type="submit" value="Удалить"/></form></th>
        <th><form action="gruppa_upd.jsp" target="Main">
         <input type="submit" value="Изменить"/></form></th>
    </tr>
</table><br> 
 
<%
     
 //////////////////////////////////////////////////////////////////////////////////////    
String SQL = "select GRUPPA.ID,GRUPPA.NOMER,GRUPPA.KURS,SPECIALNOST.NAME from SPECIALNOST,GRUPPA where GRUPPA.SPECIALNOST=SPECIALNOST.ID";

       stmt = con.createStatement();
       rs = stmt.executeQuery(SQL);
       
       
   out.println("<table bgcolor=#ffcc88 border=1>");
   out.println("<tr bgcolor=#eebb88><th>ID: </th><th>Группа №: </th><th>Курс: </th><th>Специальность: </th></tr>");    
   while (rs.next()) {
     out.println("<tr>");
     out.println("<th>"+rs.getString(1)+"</th>");
     out.println("<th>"+rs.getString(2)+"</th>");
     out.println("<th>"+rs.getString(3)+"</th>");
     out.println("<th>"+rs.getString(4)+"</th>");
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
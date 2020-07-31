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
   String tmp_id = request.getParameter("pl_id");   
   String tmp_day = request.getParameter("pl_day"); 
   String tmp_month = request.getParameter("pl_month"); 
   String tmp_year = request.getParameter("pl_year"); 
   String tmp_summa = request.getParameter("pl_summa"); 
   
//   DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());         
     Class.forName("oracle.jdbc.driver.OracleDriver");
     con = DriverManager.getConnection(dburl,login,pass); 
////////////////////////////////////////////////////////////////////////////////////
      //  if ((tmp_id!=null)&&(tmp_day!=null)&&(tmp_summa!=null)&&(tmp_month!=null)&&(tmp_year!=null)){ 
       //  if ((tmp_id!="")&&(tmp_day!="")&&(tmp_summa!="")&&(tmp_month!="")&&(tmp_year!="")){
    //    String SQL1 = "insert into platezh(id,data,summa) values('"+ tmp_id +"','"+ tmp_day+"."+tmp_month+"."+tmp_year+"','"+ tmp_summa +"')";
       if ((tmp_id!=null)&&(tmp_summa!=null)&&(tmp_year!=null)){ 
         if ((tmp_id!="")&&(tmp_summa!="")&&(tmp_year!="")){
          String SQL1 = "insert into platezh(id,data,summa) values('"+ tmp_id +"','"+ tmp_year + "','"+ tmp_summa +"')";
               stmt = con.createStatement();
               rs = stmt.executeQuery(SQL1);
               rs.close() ;
               stmt.close() ;
         }
        }
     
%>

<font color="#8b0000"><h2>Платежи</h2></font>
<table>
    <tr>
        <th><form action="platezh_add.jsp" target="Main">
         <input type="submit" value="Добавить"/></form></th>
        <th><form action="platezh_search.jsp" target="Main">
         <input type="submit" value="Поиск"/></form></th>
    </tr>
</table><br> 
 
<%
     
 //////////////////////////////////////////////////////////////////////////////////////    
String SQL = "select PLATEZH.ID,GRUPPA.NOMER,STUDENT.FNAME,STUDENT.INAME,PLATEZH.DATA,PLATEZH.SUMMA from GRUPPA,STUDENT,PLATEZH where PLATEZH.ID=STUDENT.ID and STUDENT.GRUPPA=GRUPPA.ID ORDER BY platezh.data";

       stmt = con.createStatement();
       rs = stmt.executeQuery(SQL);
       
       
   out.println("<table bgcolor=#ffcc88 border=1>");
   out.println("<tr bgcolor=#eebb88><th>ID: </th><th>Группа: </th><th>Фамилия: </th><th>Имя: </th><th>Дата оплаты: </th><th>Сумма платежа: </th></tr>");    
   while (rs.next()) {
     out.println("<tr>");
     out.println("<th>"+rs.getString(1)+"</th>");
     out.println("<th>"+rs.getString(2)+"</th>");
     out.println("<th>"+rs.getString(3)+"</th>");
     out.println("<th>"+rs.getString(4)+"</th>");
     out.println("<th>"+rs.getString(5)+"</th>");
     out.println("<th>"+rs.getString(6)+"</th>");
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
select	 PLATEZH.ID,GRUPPA.NOMER,STUDENT.FNAME,STUDENT.INAME,PLATEZH.DATA,PLATEZH.SUMMA
 from	 GRUPPA,STUDENT,PLATEZH 
 where   PLATEZH.ID=STUDENT.ID
 and	 STUDENT.GRUPPA=GRUPPA.ID
--%>

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
   
//   DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
     Class.forName("oracle.jdbc.driver.OracleDriver");
     con = DriverManager.getConnection(dburl,login,pass);
////////////////////////////////////////////////////////////////////////////////////
%>

<font color="#8b0000"><h2>Поиск задолжников</h2></font>
<table>
    <tr>
        <th><%--День:<input maxlength="2" size="1" type="text" value="01" name="sr_day">
            Месяц:<input maxlength="2" size="1" type="text" value="07" name="sr_month">--%>
            Год:<input maxlength="4" size="3" type="text" value="200" name="sr_year">
        </th>
        <th><form action="search.jsp" target="Main">
         <input type="submit" value="Найти"/></form>
        </th>
    </tr>
</table><br> 
 
<%

 //////////////////////////////////////////////////////////////////////////////////////
String SQL = "select STUDENT.ID,GRUPPA.KURS,GRUPPA.NOMER,STUDENT.FNAME,STUDENT.INAME,SPECIALNOST.NAME,SPECIALNOST.SUMMA,PLATEZH.SUMMA,PLATEZH.DATA,STUDENT.VID from SPECIALNOST,GRUPPA,PLATEZH,STUDENT where STUDENT.ID=PLATEZH.ID and STUDENT.GRUPPA=GRUPPA.ID and GRUPPA.SPECIALNOST=SPECIALNOST.ID";

       stmt = con.createStatement();
       rs = stmt.executeQuery(SQL);
       
       
   out.println("<table bgcolor=#ffcc88 border=1>");
   out.println("<tr bgcolor=#eebb88><th>ID: </th><th>Курс: </th><th>Группа №: </th><th>Фамилия: </th><th>Имя: </th><th>Специальность: </th><th>Имя: </th><th>Имя: </th><th>Имя: </th><th>Имя: </th></tr>");    
   while (rs.next()) {
     out.println("<tr>");
     out.println("<th>"+rs.getString(1)+"</th>");
     out.println("<th>"+rs.getString(2)+"</th>");
     out.println("<th>"+rs.getString(3)+"</th>");
     out.println("<th>"+rs.getString(4)+"</th>");
     out.println("<th>"+rs.getString(5)+"</th>");
     out.println("<th>"+rs.getString(6)+"</th>");
     out.println("<th>"+rs.getString(7)+"</th>");
     out.println("<th>"+rs.getString(8)+"</th>");
     out.println("<th>"+rs.getString(9)+"</th>");
     out.println("<th>"+rs.getString(10)+"</th>");
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
select STUDENT.ID,GRUPPA.KURS,GRUPPA.NOMER,STUDENT.FNAME,STUDENT.INAME,SPECIALNOST.NAME,SPECIALNOST.SUMMA,PLATEZH.SUMMA,PLATEZH.DATA,STUDENT.VID 
 from SPECIALNOST,GRUPPA,PLATEZH,STUDENT 
 where STUDENT.ID=PLATEZH.ID and STUDENT.GRUPPA=GRUPPA.ID and GRUPPA.SPECIALNOST=SPECIALNOST.ID
--%>
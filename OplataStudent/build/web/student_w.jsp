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

<%
   String tmp_fname = request.getParameter("stud_fname");   
   String tmp_iname = request.getParameter("stud_iname"); 
   String tmp_oname = request.getParameter("stud_oname"); 
   String tmp_adres = request.getParameter("stud_adres"); 
   String tmp_phone = request.getParameter("stud_phone"); 
   String tmp_gruppa = request.getParameter("stud_gruppa"); 
   String tmp_vid = request.getParameter("stud_vid"); 
   
 if ((tmp_fname!=null)&&(tmp_iname!=null)&&(tmp_oname!=null)&&(tmp_adres!=null)&&(tmp_phone!=null)&&(tmp_gruppa!=null)&&(tmp_vid!=null)){ 
  if ((tmp_fname!="")&&(tmp_iname!="")&&(tmp_oname!="")&&(tmp_adres!="")&&(tmp_phone!="")&&(tmp_gruppa!="")&&(tmp_vid!="")){%> 
<%--     if (tmp.equals("Add")==true){     --%>
    <%    String SQL9 = "insert into student(fname,iname,oname,adres,phone,gruppa,vid) values('"+ tmp_fname +"','"+ tmp_iname +"','"+ tmp_oname +"','"+ tmp_adres +"','"+ tmp_phone +"','"+ tmp_gruppa +"','"+ tmp_vid +"')";
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
        <th><form action="student_add.jsp" target="Main">
         <input type="submit" value="Добавить"/></form>
        </th>
        <th><form action="student_del.jsp" target="Main">
         <input type="submit" value="Удалить"/></form></th>
        <th><form action="student_upd.jsp" target="Main">
         <input type="submit" value="Изменить"/></form></th>
        <th><form action="student.jsp" target="Main">
         <input type="submit" value="Обычный вид"/></form></th>
        <th><form action="student_search.jsp" target="Main">
         <input type="submit" value="Поиск"/></form></th>
    </tr>
</table><br> 
 
<%
     
 //////////////////////////////////////////////////////////////////////////////////////    
String SQL = "select STUDENT.ID,GRUPPA.KURS,GRUPPA.NOMER,STUDENT.FNAME,STUDENT.INAME,STUDENT.ONAME,STUDENT.ADRES,STUDENT.PHONE,VID.NAME from GRUPPA,STUDENT,VID where STUDENT.GRUPPA=GRUPPA.ID and student.vid=vid.id";

       stmt = con.createStatement();
       rs = stmt.executeQuery(SQL);
       
       
   out.println("<table bgcolor=#ffcc88 border=1>");
   out.println("<tr bgcolor=#eebb88><th>ID: </th><th>Курс: </th><th>Группа №: </th><th>Фамилия: </th><th>Имя: </th><th>Отчество: </th><th>Домашний адрес: </th><th>Телефон: </th><th>Вид обучения: </th></tr>");    
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
select	STUDENT.ID,GRUPPA.KURS,GRUPPA.NOMER,STUDENT.FNAME,STUDENT.INAME,STUDENT.ONAME,STUDENT.ADRES,STUDENT.PHONE,STUDENT.VID 
from GRUPPA,STUDENT where STUDENT.GRUPPA=GRUPPA.ID
--%>
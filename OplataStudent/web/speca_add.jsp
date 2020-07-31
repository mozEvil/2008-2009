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
    <body bgcolor="#fee2af">
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

  String SQL = "select * from fakultet ORDER BY id";

       stmt = con.createStatement();
       rs = stmt.executeQuery(SQL);    
%> 
   

<font color="#8b0000"><h2>Специальность -> Добавить новую запись</h2></font>


 <form action="speca.jsp" target="Main">
<table border="0">
    <tr>
        <th align="left">Название: </th>  
        <th align="right"><input type="text" value="" name="spec_name"></th>
    </tr>
     <tr>
        <th align="left">Факультет: </th>  
        <th align="right"><select name="spec_fak"> 
            <% while(rs.next()){
            out.write("<option value=\"" + rs.getString("id")+ "\">" + rs.getString("name")+ "</option>");
            }%></select></th>
    </tr>
<%
   rs.close() ;
   stmt.close() ;
   
String SQL1 = "select * from forma ORDER BY id";
 stmt = con.createStatement();
 rs = stmt.executeQuery(SQL1);       
%>
    <tr>
        <th align="left">Форма обучения: </th>  
        <th align="right"><select name="spec_forma"> 
            <% while(rs.next()){
            out.write("<option value=\"" + rs.getString("id")+ "\">" + rs.getString("name")+ "</option>");
            }%></select></th>
    </tr>     
<% 
    rs.close() ;
    stmt.close() ;
%>
    <tr>
        <th align="left">Плата за год обучения: </th>  
        <th align="right"><input type="text" value="" name="spec_summa"><br></th>
    </tr>
</table>
<input type="submit" value="Добавить">
</form>
   
<%    
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

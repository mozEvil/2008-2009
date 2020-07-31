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
     String tmp = request.getParameter("f_sel");   
     String txt = request.getParameter("f_name"); 
     String txt2 =request.getParameter("upd_name_f"); 
//   DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());         
     Class.forName("oracle.jdbc.driver.OracleDriver");
     con = DriverManager.getConnection(dburl,login,pass); 
////////////////////////////////////////////////////////////////////////////////////
     
 if (txt != null){
         if(txt == ""){
             out.println("<font color=#ff0000>Вы не ввели данные</font><br>");
         }
         else{if (tmp.equals("Add")==true){
             String SQL1 = "INSERT INTO forma(name) VALUES ('" + txt + "')";
             stmt = con.createStatement();
             rs = stmt.executeQuery(SQL1);
             rs.close() ;
             stmt.close() ;
                 }
             else{if (tmp.equals("Delete")==true){
          try{   String SQL2a = "DELETE FROM forma WHERE id='" + txt + "'";
                 stmt = con.createStatement();
                 rs = stmt.executeQuery(SQL2a);             
                 rs.close() ;
                 stmt.close() ; }catch(Exception e){};
                 
          try{   String SQL2b = "DELETE FROM forma WHERE name='" +txt+ "'";
                 stmt = con.createStatement();
                 rs = stmt.executeQuery(SQL2b);             
                 rs.close() ;
                 stmt.close() ; }catch(Exception e){};
                 }
                else{if (tmp.equals("Update")==true){
          try{   String SQL3a ="UPDATE forma SET name='" + txt2 +"' WHERE name='" + txt + "'";
                 stmt = con.createStatement();
                 rs = stmt.executeQuery(SQL3a);             
                 rs.close() ;
                 stmt.close() ; }catch(Exception e){};
                 
          try{   String SQL3b ="UPDATE forma SET name='" + txt2 +"' WHERE id='" + txt + "'";
                 stmt = con.createStatement();
                 rs = stmt.executeQuery(SQL3b);             
                 rs.close() ;
                 stmt.close() ; }catch(Exception e){};
                 }
                    }                 
                  }          
             }         
}
%>
<font color="#8b0000"><h2>Форма обучения</h2></font>
<form action="forma.jsp" target="Main">
    <input type="text" value="" name="f_name" />
    <select name="f_sel">
        <option value="Add">Add</option>
        <option value="Delete">Delete</option>
        <option value="Update" onclick="newText(this.form)">Update</option>
    </select>
    <input type="submit" value="OK" name="upd_name_f" />
</form><br>
 
<%
     
 //////////////////////////////////////////////////////////////////////////////////////    
       String SQL = "Select * from forma ORDER BY id";
       stmt = con.createStatement();
       rs = stmt.executeQuery(SQL);
       
       
   out.println("<table bgcolor=#ffcc88 border=1>");
   out.println("<tr bgcolor=#eebb88><th>ID: </th><th>Форма обучения: </th></tr>");    
   while (rs.next()) {
     out.println("<tr>");
     out.println("<th>"+rs.getString("id")+"</th>");
     out.println("<th>"+rs.getString("name")+"</th>");
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
<SCRIPT LANGUAGE="JavaScript" TYPE="Text/javascript"> 
    function newText(form){
    var buf = prompt('Введите новое значение','');
    form.upd_name_f.value= buf; 
    }
 </SCRIPT>   
    
    
    </body>
</html>

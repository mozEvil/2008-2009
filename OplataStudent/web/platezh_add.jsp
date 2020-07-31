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
//   DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());         
     Class.forName("oracle.jdbc.driver.OracleDriver");
     con = DriverManager.getConnection(dburl,login,pass); 
////////////////////////////////////////////////////////////////////////////////////

  String SQL = "select student.id,gruppa.kurs,gruppa.nomer,student.fname,student.iname from student,gruppa where student.gruppa=gruppa.id ORDER BY gruppa.kurs,student.id";

       stmt = con.createStatement();
       rs = stmt.executeQuery(SQL); 
%> 


<font color="#8b0000"><h2>Платеж -> Добавить новую запись</h2></font>


 <form action="platezh.jsp" target="Main">
<table border="0">
    <tr>
        <th align="left">Выбирите студента: </th>  
        <th align="right"><select name="pl_id">
            <optgroup label="Курс | Группа | Фамилия  Имя"> 
            <% while(rs.next()){
            out.write("<option value=\"" + rs.getString(1)+ "\">"+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" "+rs.getString(5)+"</option>");
            }%></select></th>
    </tr>     
    <tr>
        <th align="left">Дата уплаты: </th>  
        <th align="right">День:<input maxlength="2" size="1" type="text" value="01" name="pl_day">
                          Месяц:<input maxlength="2" size="1" type="text" value="07" name="pl_month">
                          Год:<input maxlength="4" size="3" type="text" value="" name="pl_year"></th>
    </tr>
     <tr>
        <th align="left">Сумма платежа: </th>  
        <th align="right"><input type="text" value="" name="pl_summa"></th>
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

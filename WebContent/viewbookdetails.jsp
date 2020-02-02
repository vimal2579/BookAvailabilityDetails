<%@ page import ="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h1>
    Available Books
</h1>
<%
List result = (List) request.getAttribute("books");
String author = (String) request.getAttribute("author");
Iterator it = result.iterator();
out.println("<br>For the " +author+ ", we have <br><br>");
while(it.hasNext()){
out.println(it.next()+"<br>");
}
%>
</body>
</html>

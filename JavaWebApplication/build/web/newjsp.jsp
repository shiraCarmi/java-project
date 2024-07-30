<%-- 
    Document   : newjsp
    Created on : 03/05/2024, 09:22:13
    Author     : שלום שירה יהודית
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%for(int i=1; i<11; i++){%>
        <br>
<!--            out.println();-->
            <%for(int j=1; j<11; j++){%>
                <%out.print(i*j+"   ");%>
            <%}%>
            <%}%>
   
 
            
    </body>
</html>

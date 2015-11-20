<%-- 
    Document   : all
    Created on : Nov 6, 2015, 10:07:50 AM
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*,army.Army,army.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Star Wars Universe</title>
    </head>
    <body>
        <form method="POST" action="AllServlet">
        </form>
        
        <hr><ol> 

            <section>
                <h1>Generals</h1>
            <%
            @SuppressWarnings("unchecked") 
            List<General> generals = (List<General>)request.getAttribute("generals");
            for (General general: generals) { %>
                <li> <%= general %> </li> <%
            } %>
             </section>
        </ol><hr>     
    </body>
</html>

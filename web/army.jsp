<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*,army.Army"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Star Wars Project</title>
    </head>
 
    <body>
            <c:forEach items="${armies}" var="army">
            <c:choose>
             <c:when test="${army.getName() eq 'Galactic Republic'}">
                 <li><a href="RepublicServlet">Galactic Republic</a> </li>
                 <img src="getImageDetails?your_id=Republic" width="200" height="200" />
                 
            </c:when> 
            </c:choose>
            <c:choose>
            <c:when test="${army.getName() eq 'Seperatist Alliance'}">
            <li><a href="SeperatistServlet">Seperatist Alliance</a> </li>
            <img src="getImageDetails?your_id=Seperatist" width="200" height="200" />
            
            </c:when>
            </c:choose>
            </c:forEach>
            
                <center>
        <h1>Add New General</h1>
        <form method="POST" action="FileUploadDBServlet" enctype="multipart/form-data">
            <table border="0">
                <tr>
                    <td>Name: </td>
                    <td><input type="text" name="name" size="50"/></td>
                </tr>
                <tr>
                    <td>Army: </td>
                    <td><input type="text" name="army" size="50"/></td>
                </tr>
                
                                <tr>
                    <td>Battle ship: </td>
                    <td><input type="text" name="ship" size="50"/></td>
                </tr>
                                <tr>
                    <td>Droid: </td>
                    <td><input type="text" name="droid" size="50"/></td>
                </tr>
                                <tr>
                    <td>Droid Model: </td>
                    <td><input type="text" name="model" size="50"/></td>
                </tr>
                                <tr>
                    <td>Weapon: </td>
                    <td><input type="text" name="weapon" size="50"/></td>
                </tr>
                <tr>
                    <td>Portrait Photo: </td>
                    <td><input type="file" name="photo" size="50"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Add General">
                    </td>
                </tr>
            </table>
        </form>
    </center> 
        <iframe src="http://www.objectdb.com/pw.html?web-netbeans"
            frameborder="0" scrolling="no" width="100%" height="30"></iframe>
     </body>
 </html>

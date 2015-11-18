<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*,army.Army,army.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Star Wars Universe</title>
    </head>
    <body>
        <form method="POST" action="GeneralServlet">
        </form>
        
        <hr><ol> 

            <section>
                <h1>${reqGen}</h1> 
                
            <c:forEach items="${general}" var="currentGeneral">              
             <c:choose>
             <c:when test="${currentGeneral.name eq reqGen}"> 
                <table border="1">
                <tr>
                    <td><img src="getImageDetails?your_id=${reqGen}" width="200" height="200" /></td>
                </tr>
                <tr>
                    <td><c:out value="${currentGeneral}" /></td>
                </tr>
                
                <tr>
                    <td><c:out value="${currentGeneral.GetArmy()}" /></td>/>
                </tr>
                                <tr>
                    <td><c:out value="${currentGeneral.GetDroid()}" /></td>
                </tr>
                                <tr>
                    <td><c:out value="${currentGeneral.GetShip()}" /></td>
                </tr>
                                <tr>
                    <td><c:out value="${currentGeneral.GetWeapon()}" /></td>
                </tr>
            </table>       
            </c:when> 
            </c:choose>
            </c:forEach>    
             </section>
        <h1>Edit General</h1>
        <form method="POST" action="EditGeneralServlet?generalName=${reqGen}" enctype="multipart/form-data">
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
                        <input type="submit" value="Edit General">
                    </td>
                </tr>
            </table>
        </form> 
        </ol><hr>     
    </body>
</html>

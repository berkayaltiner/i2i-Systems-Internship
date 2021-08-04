<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
     <h1>CALCULATOR</h1>

     <form name="myForm" action="CalculateServlet" method="GET">
         
         <table>
         
          
          
           <tbody>
           
             <tr>
                <td>Number 1:</td>
                <td><input type="text" name="number1" value=""  /></td>
             
             </tr>
             <tr>
                <td>Number 2:</td>
                <td><input type="text" name="number2" value=""  /></td>

             </tr>
             <tr>
                <td>Operation:</td>
                <td>
                
                <input type="radio" name="operation" value="Add"  />Add
                <input type="radio" name="operation" value="Substract"  />Substract
                <input type="radio" name="operation" value="Multiply"  />Multiply
                <input type="radio" name="operation" value="Divide"  />Divide
                
                
                </td>
             
             </tr>
           </tbody>
           
           
         </table>
 
         <input type="submit" value="Calculate" name="submit"/>
     </form>


</body>
</html>
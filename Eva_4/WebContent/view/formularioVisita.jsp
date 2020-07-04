<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Datos Visita</title>
		<link rel="stylesheet" href="../css/style.css">
		<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
   		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script> 
   		

		<script>
	        $(function () {
	            $("#datepicker").datepicker();
	        });
    	</script>
	</head>
	
	<body>
	
		<h1>Registro de Visita</h1>
		
		<form action="${pageContext.request.contextPath}/view/recibeVisita.jsp" method="post">
			<table>
				<tr>
					<td>Fecha:</td>
					<td><input type="text" id="datepicker"name="fecha" required/></td>
				</tr>
				<tr>
					<td>Hora:</td>
					<td><input type="text" name="hora" required/></td>
				</tr>
				<tr>
					<td>Direccion:</td>
					<td><input type="text" name="direccion" required/></td>
				</tr>
				<tr>
					<td>Lista De Chequeo:</td>
					<td><input type="text" name="listadechequeo" required/></td>
				</tr>
				<tr>
				<td><input type="submit" name="enviar" value="Enviar"></td>
				</tr>
			</table>
			
			<div><a href="${pageContext.request.contextPath}/users/profesional.jsp">Volver</a></div>
		</form>
	</body>
</html>
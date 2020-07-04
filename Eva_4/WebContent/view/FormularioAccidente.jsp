<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Registro de Accidente</title>
		<link rel="stylesheet" href="../css/style.css">
		<script>
	        $(function () {
	            $("#datepicker").datepicker();
	        });
    	</script>
	</head>
	
	<body>
		<h1>Registro de Accidente</h1>
		
		<c:if test="${true}">
			<h2>Bienvenido</h2>
		</c:if>
		
		
		<form action="exitoAccidente.jsp" method="post">
		
			<table>
			
				<tr>
					<td>Nombre:</td>
					<td><input type="text" name="nombre" required/></td>
				</tr>
				<tr>
					<td>Apellido:</td>
					<td><input type="text" name="apellido" required/></td>
				</tr>
				<tr>
					<td>Rut:</td>
					<td><input type="text" name="rut" required/></td>
				</tr>
				<tr>
					<td>Teléfono:</td>
					<td><input type="text" name="telefono" required/></td>
				</tr>
				<tr>
					<td>Correo</td>
					<td><input type="text" name="correo" required/></td>
				</tr>
				<tr>
					<td>Tipo de Accidente</td>
					<td>
						<select name="accidente" required>
			              	<option> Grave</option>
			                <option> Medio</option>
			            	<option> Leve</option>
			        	</select>
					</td>
				</tr>
				<tr>
					<td>Fecha Accidente</td>
					<td><input type="text" id="datepicker" name="fecha" required/></td>
				</tr>
				<tr>
					<td>Descripción</td>
					<td><textarea name="descripcion" rows="4" cols="50" required></textarea></td>
				</tr>
				
				<tr>
				<td><input type="submit" name="enviar" value="Enviar"></td>
				</tr>
			</table>
			<div><a href="${pageContext.request.contextPath}/index.jsp">Volver</a></div>
		</form>
	
	</body>
</html>
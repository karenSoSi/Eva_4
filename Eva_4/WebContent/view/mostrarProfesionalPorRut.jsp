<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Datos de Profesional</title>
	<link rel="stylesheet" href="../css/styleMostrar.css">
</head>


<body>
	<h1>Registro de Profesional</h1>
	<table>
		
		<tr>
			<td>Rut: </td>
			<td><c:out value="${profesional.getRutProfesional()}"/></td>
		</tr>
		<tr>
			<td>Nombre Completo: </td>
			<td><c:out value="${profesional.getNombreProfesional()}"/></td>
		</tr>

		<tr>
				<td>Dirección: </td>
				<td><c:out value="${profesional.getDirProfesional()}"/></td>
			</tr>

		<tr>
				<td>Teléfono: </td>
				<td><c:out value="${profesional.getFonoProfesional()}"/></td>
			</tr>

			<tr>
				<td>Correo Electrónico: </td>
				<td><c:out value="${profesional.getMailrProfesional()}"/></td>
			</tr>
		

		

	</table>
		<br>
		<a href="${pageContext.request.contextPath}/users/administrador.jsp" >Volver</a>
</body>
</html>
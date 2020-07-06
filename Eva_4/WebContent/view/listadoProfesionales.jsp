<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Profesionales</title>
<link rel="stylesheet" href="../css/styleListado.css">
</head>
<body>

	<h1>Listado de Profesionales</h1>

	<table>
		<tr>
			<th>Nombre Completo</th>
			<th>Rut</th>
			<th>Fecha Nacimiento</th>
			<th>Dirección</th>
			<th>Teléfono</th>
			<th>Correo electrónico</th>
			<th>Estado</th>
		</tr>

		<c:forEach items="${lista_profesional}" var="profesional">
			<tr>
				<td>${cliente.getNombreCliente()}</td>
				<td>${cliente.getRutCliente()}</td>
				<td>${cliente.getFechaNacimiento()}</td>
				<td>${cliente.getDirProfesional()}</td>
				<td>${cliente.getFonoProfesional()}</td>
				<td>${cliente.getMailProfesional()}</td>
				<td>${cliente.getEstadoProfesional()}</td>

				<td>
					<a href="${pageContext.request.contextPath}/AdminProfesional?action=eliminar">Eliminar</a>
					&nbsp; 
					<a href="${pageContext.request.contextPath}/AdminProfesional?id=actualizar">Actualizar</a>
				</td>
			</tr>
		</c:forEach>

	</table>
	
	
	<br>
	<div><a href="${pageContext.request.contextPath}/users/administrador.jsp">Volver</a></div>
	<div><a href="${pageContext.request.contextPath}/view/registrarProfesional.jsp">Nuevo Usuario</a></div>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Lista de Accidente</title>
		<link rel="stylesheet" href="../css/styleListado.css">
	</head>
	
	
	<body>
		<h1>Lista de Accidente</h1>
		
			<table>
		<tr>
			
			<th>Nombre Completo</th>
			<th>Rut</th>
			<th>Teléfono</th>
			<th>Correo Electrónico</th>
			<th>Tipo de Accidente</th>
			<th>Fecha de Accidente</th>
			<th>Hora de Accidente</th>
			<th>Descripción</th>
		</tr>

		<c:forEach items="${lista_accidente}" var="accidente">
			<tr>
				<td>${cliente.getNombreCliente()}</td>
				<td>${cliente.getRutCliente()}</td>
				<td>${cliente.getFonoCliente()}</td>
				<td>${cliente.getMailCliente()}</td>
				<td>${cliente.getTipoAccidente()}</td>
				<td>${cliente.getFechaAccidente()}</td>
				<td>${cliente.gethoraAccidente()}</td>
				<td>${cliente.getDescripcion()}</td>
				
				
				<td>
					<a href="${pageContext.request.contextPath}/AdminProfesional?action=eliminar">Eliminar</a>
					&nbsp; 
					<a href="${pageContext.request.contextPath}/AdminProfesional?id=actualizar">Actualizar</a>
				</td>
				
			</tr>
		</c:forEach>

	</table>
		
		<br>
		<a href="${pageContext.request.contextPath}/users/administrador.jsp" >Volver</a>
		
	</body>
</html>
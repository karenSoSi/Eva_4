<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Datos de Cliente</title>
<link rel="stylesheet" href="../css/styleMostrar.css">
</head>


<body>
	<h1>Información Cliente</h1>
	<table>
		
			<tr>
				<td>Rut: </td>
				<td><c:out value="${cliente.getRutCliente()}"/></td>
			</tr>
			<tr>
				<td>Nombre Completo: </td>
				<td><c:out value="${cliente.getNombreCliente()}"/></td>
			</tr>

			<tr>
				<td>Razón Social: </td>
				<td><c:out value="${cliente.getRazonSocial()}"/></td>
			</tr>

			<tr>
				<td>Giro Comercial: </td>
				<td><c:out value="${cliente.getGiro()}"/></td>
			</tr>

			<tr>
				<td>Dirección: </td>
				<td><c:out value="${cliente.getDirCliente()}"/></td>
			</tr>

			<tr>
				<td>Teléfono: </td>
				<td><c:out value="${cliente.getFonoCliente()}"/></td>
			</tr>

			<tr>
				<td>Correo: </td>
				<td><c:out value="${cliente.getMailCliente()}"/></td>
			</tr>

			<tr>
				<td>Rubro: </td>
				<td><c:out value="${cliente.getRubro()}"/></td>
			</tr>

	
	</table>
	<br>
	<a href="${pageContext.request.contextPath}/users/administrador.jsp">Volver</a>
</body>
</html>
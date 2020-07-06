<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Clientes</title>
<link rel="stylesheet" href="../css/styleListado.css">
</head>
<body>

	<h1>Listado de Clientes</h1>

	<table>
		<tr>
			<th>Rut</th>
			<th>Nombre Completo</th>
			<th>Razón Social</th>
			<th>Giro Comercial</th>
			<th>Dirección</th>
			<th>Teléfono</th>
			<th>Correo electrónico</th>
			<th>Rubro</th>
		</tr>

		<c:forEach items="${lista_clientes}" var="cliente">
			<tr>
				<td>${cliente.getRutCliente()}</td>
				<td>${cliente.getNombreCliente()}</td>
				<td>${cliente.getRazonSocial()}</td>
				<td>${cliente.getGiro()}</td>
				<td>${cliente.getDirCliente()}</td>
				<td>${cliente.getFonoCliente()}</td>
				<td>${cliente.getMailCliente()}</td>
				<td>${cliente.getRubro()}</td>
				
				<td>
					<a href="${pageContext.request.contextPath}/AdminCliente?action=eliminar">Eliminar</a>
					&nbsp; 
					<a href="${pageContext.request.contextPath}/AdminCliente?id=actualizar">Actualizar</a>
				</td>

				
			</tr>
		</c:forEach>

	</table>
	<br>
	<div><a href="${pageContext.request.contextPath}/users/administrador.jsp">Volver</a></div>
	<div><a href="${pageContext.request.contextPath}/view/registrarCliente.jsp">Nuevo Usuario</a></div>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Datos de Cliente</title>
	<link rel="stylesheet" href="../css/style.css">
</head>


<body>
	<h1>Registro de Cliente</h1>
	<table>
		<tr>
			<td><%= "ID: "%></td>
			<td><%= request.getParameter("id")%></td>
		</tr>

		<tr>
			<td><%= "Rut: "%></td>
			<td><%= request.getParameter("rut")%></td>
		</tr>

		<tr>
			<td><%= "Nombre Completo: "%></td>
			<td><%= request.getParameter("nombre")%></td>
		</tr>

		<tr>
			<td><%= "Razón Social: "%></td>
			<td><%= request.getParameter("rSocial")%></td>
		</tr>

		<tr>
			<td><%= "Giro Comercial: "%></td>
			<td><%= request.getParameter("giro")%></td>
		</tr>

		<tr>
			<td><%= "Dirección: "%></td>
			<td><%= request.getParameter("direccion")%></td>
		</tr>

		<tr>
			<td><%= "Teléfono: "%></td>
			<td><%= request.getParameter("telefono")%></td>
		</tr>

		<tr>
			<td><%= "Correo: "%></td>
			<td><%= request.getParameter("correo")%></td>
		</tr>
		
		<tr>
			<td><%= "Rubro: "%></td>
			<td><%= request.getParameter("rubro")%></td>
		</tr>

		<tr>
			<td><%= "Estado: "%></td>
			<td><%= request.getParameter("estado")%></td>
		</tr>
	</table>
	<a href="${pageContext.request.contextPath}/view/IngresarCliente.jsp" >Volver</a>
</body>
</html>
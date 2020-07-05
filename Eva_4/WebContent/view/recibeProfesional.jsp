<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Datos de Profesional</title>
	<link rel="stylesheet" href="../css/style.css">
</head>


<body>
	<h1>Registro de Profesional</h1>
	<table>
		
		<tr>
			<td><%= "Nombre Completo: "%></td>
			<td><%= request.getParameter("nombre")%></td>
		</tr>

		<tr>
			<td><%= "Rut: "%></td>
			<td><%= request.getParameter("rut")%></td>
		</tr>

		<tr>
			<td><%= "Fecha Nacimiento: "%></td>
			<td><%= request.getParameter("fNacimiento")%></td>
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
			<td><%= "Estado: "%></td>
			<td><%= request.getParameter("estado")%></td>
		</tr>
	</table>
	<a href="${pageContext.request.contextPath}/view/ingresarProfesional.jsp" >Volver</a>
</body>
</html>
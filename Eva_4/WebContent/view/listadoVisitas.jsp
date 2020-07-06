<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Datos de Visita</title>
	<link rel="stylesheet" href="../css/style.css">
</head>


<body>
	<h1>Registro de visita</h1>
	<table>
		<tr>
			<td><%= "Cliente: "%></td>
			<td><%= request.getParameter("cliente")%></td>
		</tr>
		<tr>
			<td><%= "Profesional: "%></td>
			<td><%= request.getParameter("profesional")%></td>
		</tr>
		<tr>
			<td><%= "Fecha: "%></td>
			<td><%= request.getParameter("fecha")%></td>
		</tr>

		<tr>
			<td><%= "Hora: "%></td>
			<td><%= request.getParameter("hora")%></td>
		</tr>

		<tr>
			<td><%= "Dirección: "%></td>
			<td><%= request.getParameter("direccion")%></td>
		</tr>

		<tr>
			<td><%= "Lista De Chequeo: "%></td>
			<td><%= request.getParameter("listadechequeo")%></td>
		</tr>
	</table>
	<a href="${pageContext.request.contextPath}/view/formularioVisita.jsp" >Volver</a>
</body>
</html>
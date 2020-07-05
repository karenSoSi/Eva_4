<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Datos de Capacitacion</title>
	<link rel="stylesheet" href="../css/style.css">
</head>


<body>
	<h1>Registro de Capacitacion</h1>
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
			<td><%= "Asistentes: "%></td>
			<td><%= request.getParameter("asistentes")%></td>
		</tr>

		<tr>
			<td><%= "Tema: "%></td>
			<td><%= request.getParameter("tema")%></td>
		</tr>
	</table>
	<a href="${pageContext.request.contextPath}/view/formularioCapacitacion.jsp" >Volver</a>
</body>
</html>
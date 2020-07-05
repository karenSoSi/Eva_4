<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="../css/style.css">
	</head>
	
	
	<body>
		<h1>Formulario de Accidente</h1>
		
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
				<td><%= "Teléfono: "%></td>
				<td><%= request.getParameter("telefono")%></td>
			</tr>
			
			<tr>
				<td><%= "Correo: "%></td>
				<td><%= request.getParameter("correo")%></td>
			</tr>
			
			<tr>
				<td><%= "Tipo de Accidente: "%></td>
				<td><%= request.getParameter("accidente")%></td>
			</tr>
			
			<tr>
				<td><%= "Fecha de Accidente: "%></td>
				<td><%= request.getParameter("fecha")%></td>
			</tr>
			
			<tr>
				<td><%= "Descripción: "%></td>
				<td><%= request.getParameter("descripcion")%></td>
			</tr>
		</table>
		
		<a href="${pageContext.request.contextPath}/view/FormularioAccidente.jsp" >Volver</a>
		
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Lista de Capacitación</title>
	<link rel="stylesheet" href="../css/styleListado.css">
</head>


<body>
	<h1>Lista de Capacitación</h1>
	
		<table>
		<tr>
			<th>Cliente</th>
			<th>Profesional</th>
			<th>Fecha Capacitación</th>
			<th>Hora Capacitación</th>
			<th>Asistentes</th>
			<th>Tema</th>
		</tr>

		<c:forEach items="${lista_capacitacion}" var="capacitacion">
			<tr>
				<td>${cliente.getCliente()}</td>
				<td>${cliente.getProfesional()}</td>
				<td>${cliente.getFechaCapacitacion()}</td>
				<td>${cliente.getHoraCapacitacion()}</td>
				<td>${cliente.getAsistentes()}</td>
				<td>${cliente.getTema()}</td>

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
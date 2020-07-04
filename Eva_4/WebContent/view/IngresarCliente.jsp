<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Datos Clientes</title>
		<link rel="stylesheet" href="../css/style.css">
	</head>
	
	<body>
	
		<h1>Registro de Cliente</h1>
		
		<form action="recibeCliente.jsp" method="post">
			<table>
				<tr>
					<td>ID:</td>
					<td><input type="text" name="id" required/></td>
				</tr>
				<tr>
					<td>Rut:</td>
					<td><input type="text" name="rut" required/></td>
				</tr>
				<tr>
					<td>Nombre Completo:</td>
					<td><input type="text" name="nombre" required/></td>
				</tr>
				<tr>
					<td>Razón Social:</td>
					<td><input type="text" name="rSocial" required/></td>
				</tr>
				<tr>
					<td>Giro Comercial</td>
					<td><input type="text" name="giro" required/></td>
				</tr>
				<tr>
					<td>Dirección:</td>
					<td><input type="text" name="dirección" required/></td>
				</tr>
				<tr>
					<td>Teléfono:</td>
					<td><input type="text" name="telefono" required/></td>
				</tr>
				<tr>
					<td>Correo:</td>
					<td><input type="text" name="correo" required/></td>
				</tr>
				<tr>
					<td>Rubro:</td>
					<td><input type="text" name="rubro" required/></td>
				</tr>
				<tr>
					<td>Estado:</td>
					<td><input type="text" name="estado" required/></td>
				</tr>
				<tr>
				<td><input type="submit" name="enviar" value="Enviar"></td>
				</tr>
			</table>
			
			<div><a href="${pageContext.request.contextPath}/index.jsp">Volver</a></div>
		</form>
	</body>
</html>
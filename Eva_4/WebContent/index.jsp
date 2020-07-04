<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="css/styleIndex.css">
	</head>
	
	
	<body>
		<h1>Evaluación Grupal Módulo 4</h1>
		
		
		<table>
			<tr>
				<td>
					<h3>Login Administrador</h3>
					<c:if test="${lmensaje != null}">
						<h3><c:out value="${lmensaje}"></c:out></h3>
					</c:if>
					
					<form action="${pageContext.request.contextPath}/users/administrador.jsp" method="post">
						Nombre: <input type="text" name="txtlogin" /><br/>
						Clave: <input type="password" name="txtclave" /><br/>
						<input type="submit" value="Ingresar" />
					</form>
				</td>
				
				
				<td>
					<h3>Login Profesional</h3>
					<c:if test="${lmensaje != null}">
						<h3><c:out value="${lmensaje}"></c:out></h3>
					</c:if>
					
					<form action="${pageContext.request.contextPath}/users/profesional.jsp" method="post">
						Nombre: <input type="text" name="txtlogin" /><br/>
						Clave: <input type="password" name="txtclave" /><br/>
						<input type="submit" value="Ingresar" />
					</form>
				</td>
				
				<td>
					<h3>Login Cliente</h3>
					<c:if test="${lmensaje != null}">
						<h3><c:out value="${lmensaje}"></c:out></h3>
					</c:if>
					
					<form action="${pageContext.request.contextPath}/users/cliente.jsp" method="post">
						Nombre: <input type="text" name="txtlogin" /><br/>
						Clave: <input type="password" name="txtclave" /><br/>
						<input type="submit" value="Ingresar" />
					</form>
				</td>
			</tr>
			
		</table>
				
		
		
			
		
		
		
		
	
		
	</body>
</html>
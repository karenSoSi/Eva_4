<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Crear Usuario</title>
	<link rel="stylesheet" href="../css/styleIndex.css">
	<link href="https://fonts.googleapis.com/css2?family=Fredoka+One&display=swap" rel="stylesheet">
	</head>
	
	<body>
		<jsp:useBean id="snr" class="controller.ValidarUsuario"/> 
          
        
        <jsp:setProperty name="snr" property="usuario"/> 
        <jsp:setProperty name="snr" property="clave"/> 
          
        
          
        
        <%if(snr.validar("Administrador", "A1234")){%> 
            <div class="col4">Bienvenido 
            <br>
            <a class="a" href="${pageContext.request.contextPath}/users/administrador.jsp">Ingresar</a> </div>
        <%}else{%> 
            <div class="col4"> Error! Usuario Invalido<br/> 
            <br>
            <a href="${pageContext.request.contextPath}/index.jsp">Volver</a> </div>
        <%}%>   
	</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Crear Usuario</title>
	<link rel="stylesheet" href="css/styleIndex.css">
	</head>
	
	<body>
		<jsp:useBean id="snr" class="controller.ValidarUsuario"/> 
          
        
        <jsp:setProperty name="snr" property="usuario"/> 
        <jsp:setProperty name="snr" property="clave"/> 
          
        
          
        
        <%if(snr.validar("Profesional", "P1234")){%> 
            Bienvenido <a href="${pageContext.request.contextPath}/users/profesional.jsp">Ingresar</a>
        <%}else{%> 
            Error! Usuario Invalido<br/> 
        <%}%>   
	</body>
</html>
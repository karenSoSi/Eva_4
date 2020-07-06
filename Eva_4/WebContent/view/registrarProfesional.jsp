<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Datos Profesional</title>
		<link rel="stylesheet" href="../css/style.css">
		<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
		
		<!-- datepicker sources -->
		<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
   		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script> 
   		
   		<script>
        $(function () {
            $("#datepicker").datepicker({
                dateFormat: "dd-mm-yy", 
    				firstDay: 1,
    				monthNames: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio',
    					'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
    					monthNamesShort: ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun',
    						'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic'],
    						dayNames: ['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'],
    						dayNamesShort: ['Dom', 'Lun', 'Mar', 'Mié;', 'Juv', 'Vie', 'Sáb'],
    						dayNamesMin: ['Do', 'Lu', 'Ma', 'Mi', 'Ju', 'Vi', 'Sá'],
    						weekHeader: 'Sm',
    						dateFormat: 'dd/mm/yy',
            });
        });
    	</script>
	</head>
	
	<body>
	
		<h1>Registro de Profesionales</h1>
		
		<form action="${pageContext.request.contextPath}/AdminProfesional?action=crear" method="post">
			<table>
				<tr>
					<td>Nombre Completo:</td>
					<td><input type="text" name="nombre" required/></td>
				</tr>
				<tr>
					<td>Rut:</td>
					<td><input type="text" name="rut" required/></td>
				</tr>
				
				<tr>
					<td>Fecha Nacimiento:</td>
					<td><input type="text" id="datepicker" name="fNacimiento" required/></td>
				</tr>

				<tr>
					<td>Dirección:</td>
					<td><input type="text" name="direccion" required/></td>
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
					<td>Estado:</td>
					<td><input type="text" name="estado" required/></td>
				</tr>
				<tr>
				<td><input type="submit" name="enviar" value="Enviar"></td>
				</tr>
			</table>
			<br>
			<div><a href="${pageContext.request.contextPath}/users/administrador.jsp">Volver</a></div>
		</form>
	</body>
</html>
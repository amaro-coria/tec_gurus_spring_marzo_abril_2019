<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alta de cliente - Formulario</title>
</head>
<body>
	<h2>Llene los datos para continuar</h2>

	<form:form action="/hola-mundo-web/altaCliente" modelAttribute="cliente" method="POST" >
		<table>
			<tr>
				<td><form:label for="nomCte-id" path="nomCte">Nombre del cliente</form:label></td>
				<td><form:input id="nomCte-id" path="nomCte" /></td>
			</tr>
		</table>
		<table>
			<tr>
				<td> <input type="submit" /> </td>
				<td> <input type="reset" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>
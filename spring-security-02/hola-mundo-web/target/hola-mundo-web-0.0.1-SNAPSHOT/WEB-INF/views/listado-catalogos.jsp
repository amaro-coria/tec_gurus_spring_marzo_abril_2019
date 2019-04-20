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
<title>Listado de catalogos de la base de datos</title>
</head>
<body>
	<h1>Aqui va el listado</h1>

	<table>


		<c:forEach items="${lista}" var="it">
			<tr>
				<td>${it.id}</td>
				<td>${it.codComp}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>
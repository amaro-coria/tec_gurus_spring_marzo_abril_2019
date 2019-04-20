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
<title>Listado clientes</title>
</head>
<body>
	<h2>Lista de clientes en sistema</h2>

	<table>
		<c:forEach items="${clientes}" var="cte" >
			<tr>
			  <td>Id de cliente</td>
			  <td>${cte.idCte}</td>
			  
			</tr>
			<tr>
			  <td>Nombre de cliente</td>
			  <td>${cte.nomCte}</td>
			</tr>
		</c:forEach>
	</table>
	
	Da de alta un nuevo cliente: <spring:url value="/alta-cliente"></spring:url>
</body>
</html>
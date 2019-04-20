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
<title>Insert title here</title>
</head>
<body>

  <!-- codCort, codComp, descCort, descComp -->
   <form:form action="/hola-mundo-web/altaCatalogov2Post" method="POST" modelAttribute="catalogo" >
     <form:label path="codCorto">Descripcion corta</form:label>
     <form:input path="codCorto"/>
     <form:label path="codComp">Decripcion completa</form:label>
     <form:input path="codComp"/>
     <input type="submit"></input>
   </form:form> 
</body>
</html>
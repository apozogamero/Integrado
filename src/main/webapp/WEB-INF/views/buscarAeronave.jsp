<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Buscar Aeronave</title>
</head>
<body>
	<h1>Buscar Aeronave</h1>
	
	<form:form method="post" modelAttribute="modeloAeronave" action="searchAeronave.htm">
  		<form:label path="idAeronave">ID de la aeronave:</form:label>
  		<form:input path="idAeronave"/>
		<input type="submit" value="Buscar">
	</form:form>
	
	<a href="<c:url value="bienvenida.htm"/>">Volver</a>
</body>
</html>
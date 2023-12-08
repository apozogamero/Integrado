<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Buscar Modelo</title>
</head>
<body>
	<h1>Buscar Modelo</h1>
	
	<form:form method="post" modelAttribute="modeloModelo" action="searchModelo.htm">
  		<form:label path="id">ID del modelo:</form:label>
  		<form:input path="id"/>
		<input type="submit" value="Buscar">
	</form:form>
	
	<a href="<c:url value="bienvenida.htm"/>">Volver</a>
</body>
</html>
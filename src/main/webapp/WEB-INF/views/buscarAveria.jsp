<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Buscar Avería</title>
</head>
<body>
	<h1>Buscar Avería</h1>
	
	<form:form method="post" modelAttribute="modeloAveria" action="searchAveria.htm">
  		<form:label path="id">ID de la avería:</form:label>
  		<form:input path="id"/>
		<input type="submit" value="Buscar">
	</form:form>
	
	<a href="<c:url value="bienvenida.htm"/>">Volver</a>
</body>
</html>
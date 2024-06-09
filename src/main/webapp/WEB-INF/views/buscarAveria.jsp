<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Buscar Aver�a</title>
</head>
<body>
	<h1>Buscar Aver�a</h1>
	
	<form:form method="post" modelAttribute="modeloAveria" action="searchAveria.htm">
  		<form:label path="idAveria">ID de la aver�a:</form:label>
  		<form:input path="idAveria"/>
		<input type="submit" value="Buscar">
	</form:form>
	
	<a href="<c:url value="bienvenida.htm"/>">Volver</a>
</body>
</html>
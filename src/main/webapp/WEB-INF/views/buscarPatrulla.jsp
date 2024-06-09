<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Buscar Patrulla</title>
</head>
<body>
	<h1>Buscar Patrulla</h1>
	
	<form:form method="post" modelAttribute="modeloPatrulla" action="searchPatrulla.htm">
  		<form:label path="idPatrulla">ID de la patrulla:</form:label>
  		<form:input path="idPatrulla"/>
		<input type="submit" value="Buscar">
	</form:form>
	
	<a href="<c:url value="bienvenida.htm"/>">Volver</a>
</body>
</html>
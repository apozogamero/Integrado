<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Buscar Hangar</title>
</head>
<body>
	<h1>Buscar Hangar</h1>
	
	<form:form method="post" modelAttribute="modeloHangar" action="searchHangar.htm">
  		<form:label path="idHangar">ID del hangar:</form:label>
  		<form:input path="idHangar"/>
		<input type="submit" value="Buscar">
	</form:form>
	
	<a href="<c:url value="bienvenida.htm"/>">Volver</a>
</body>
</html>
<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Buscar Maniobra</title>
</head>
<body>
	<h1>Buscar Maniobra</h1>
	
	<form:form method="post" modelAttribute="modeloManiobra" action="searchManiobra.htm">
  		<form:label path="idManiobra">ID de la maniobra:</form:label>
  		<form:input path="idManiobra"/>
		<input type="submit" value="Buscar">
	</form:form>
	
	<a href="<c:url value="bienvenida.htm"/>">Volver</a>
</body>
</html>
<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Lista Pilotos</title>
	<style>
        table {
        	border: 1px solid black;
        }
        td {
        	font-weight: bold;
        	background-color: black;
        	color: white;
        	width: 100px;
        	text-align: center;
        	border: 1px solid black;
        }
        th {
        	font-weight: bold;
        	background-color: white;
        	color: black;
        	width: 100px;
        	text-align: center;
        	border: 1px solid black;
        }
	</style>
</head>
<body>
	<h1>Lista de pilotos</h1>

	<table>
		<tr>
			<td>ID</td>
			<td>Nombre</td>
			<td>DNI</td>
			<td>Sexo</td>
			<td>Edad</td>
		</tr>
		<c:forEach var="emp" items="${model.listaPil}">
			<tr>
				<th><c:out value="${pil.id}"></c:out></th>
				<th><c:out value="${pil.nombre}"></c:out></th>
				<th><c:out value="${pil.dni}"></c:out></th>
				<th><c:out value="${pil.sexo}"></c:out></th>
				<th><c:out value="${pil.edad}"></c:out></th>
			</tr>
		</c:forEach>
	</table>
	
	<br/>
	<a href="<c:url value="bienvenida.htm"/>">Volver</a>
</body>
</html></html>
<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Resultado de la búsqueda</title>
	<style>
        table {
        	border: 1px solid black;
        }
        td {
        	font-weight: bold;
        	background-color: black;
        	color: white;
        	width: 120px;
        	text-align: center;
        	border: 1px solid black;
        }
        th {
        	font-weight: bold;
        	background-color: white;
        	color: black;
        	width: 120px;
        	text-align: center;
        	border: 1px solid black;
        }
	</style>
</head>
<body>
	<h1>Resultado de la búsqueda con ID <c:out value="${model.id}"></c:out></h1>

	<table>
		<tr>
			<td>ID</td>
			<td>Nombre</td>
			<td>Aeronaves</td>
			<td>Maniobras</td>
		</tr>
		<tr>
			<th><c:out value="${model.id}"></c:out></th>
			<th><c:out value="${model.nombre}"></c:out></th>
			<th>
				<c:forEach var="aeronave" items="${model.aeronaveList}">
				<c:out value="${aeronave.nombre}"></c:out><br/>
				</c:forEach>
			</th>
			<th>
				<c:forEach var="maniobra" items="${model.maniobraList}">
				<c:out value="${maniobra.id}"></c:out><br/>
				</c:forEach>
			</th>
		</tr>
	</table>
	
	<br/>
	<a href="<c:url value="bienvenida.htm"/>">Volver</a>
	<a href="<c:url value="getPatrulla.htm"/>">Buscar otra patrulla</a>
</body>
</html></html>
<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Lista Hangares</title>
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
	<h1>Lista de hangares</h1>

	<table>
		<tr>
			<td>ID</td>
			<td>Nombre</td>
			<td>Capacidad</td>
			<td>Aeronaves</td>
		</tr>
		<c:forEach var="han" items="${model.listaHan}">
			<tr>
				<th><c:out value="${han.id}"></c:out></th>
				<th><c:out value="${han.nombre}"></c:out></th>
				<th><c:out value="${han.capacidad}"></c:out></th>
				<th>
					<c:forEach var="aeronave" items="${han.aeronaveList}">
					<c:out value="${aeronave.nombre}"></c:out><br/>
					</c:forEach>
				</th>
			</tr>
		</c:forEach>
	</table>
	
	<br/>
	<a href="<c:url value="bienvenida.htm"/>">Volver</a>
	<a href="<c:url value="getHangar.htm"/>">Buscar hangar</a>
</body>
</html></html>
<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Lista Patrullas</title>
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
	<h1>Lista de patrullas</h1>

	<table>
		<tr>
			<td>ID</td>
			<td>Nombre</td>
			<td>Aeronaves</td>
			<td>Maniobras</td>
		</tr>
		<c:forEach var="pat" items="${model.listaPat}">
			<tr>
				<th><c:out value="${pat.id}"></c:out></th>
				<th><c:out value="${pat.nombre}"></c:out></th>
				<th>
					<c:forEach var="aeronave" items="${pat.aeronaveList}">
					<c:out value="${aeronave.nombre}"></c:out><br/>
					</c:forEach>
				</th>
				<th>
					<c:forEach var="maniobra" items="${pat.maniobraList}">
					<c:out value="${maniobra.id}"></c:out><br/>
					</c:forEach>
				</th>
			</tr>
		</c:forEach>
	</table>
	
	<br/>
	<a href="<c:url value="bienvenida.htm"/>">Volver</a>
	<a href="<c:url value="getPatrulla.htm"/>">Buscar patrulla</a>
</body>
</html></html>
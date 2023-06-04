<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Lista Aeronaves</title>
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
	<h1>Lista de aeronaves</h1>

	<table>
		<tr>
			<td>ID</td>
			<td>Nombre</td>
			<td>Modelo</td>
			<td>Piloto</td>
		</tr>
		<c:forEach var="aer" items="${model.listaAer}">
			<tr>
				<th><c:out value="${aer.id}"></c:out></th>
				<th><c:out value="${aer.nombre}"></c:out></th>
				<th><c:out value="${aer.modelo.nombre}"></c:out></th>
				<th><c:out value="${aer.piloto.nombre}"></c:out></th>
			</tr>
		</c:forEach>
	</table>
	
	<br/>
	<a href="<c:url value="bienvenida.htm"/>">Volver</a>
</body>
</html></html>
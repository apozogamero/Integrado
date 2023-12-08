<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Resultado de la b�squeda</title>
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
	<h1>Resultado de la b�squeda con ID <c:out value="${model.id}"></c:out></h1>

	<table>
		<tr>
			<td>ID</td>
			<td>Nombre</td>
			<td>Modelo</td>
			<td>Piloto</td>
			<td>Hangar</td>
			<td>Patrulla</td>
			<td>Aver�as</td>
		</tr>
		<tr>
			<th><c:out value="${model.id}"></c:out></th>
			<th><c:out value="${model.nombre}"></c:out></th>
			<th><c:out value="${model.modelo.nombre}"></c:out></th>
			<th><c:out value="${model.piloto.nombre}"></c:out></th>
			<th><c:out value="${model.hangar.id}"></c:out></th>
			<th><c:out value="${model.patrulla.nombre}"></c:out></th>
			<th>
				<c:forEach var="averia" items="${model.averiaList}">
				<c:out value="${averia.id}"></c:out><br/>
				</c:forEach>
			</th>
		</tr>
	</table>
	
	<br/>
	<a href="<c:url value="bienvenida.htm"/>">Volver</a>
	<a href="<c:url value="getAeronave.htm"/>">Buscar otra aeronave</a>
</body>
</html></html>
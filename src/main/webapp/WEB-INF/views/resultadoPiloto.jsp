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
	<h1>Resultado de la búsqueda con ID <c:out value="${model.idPiloto}"></c:out></h1>

	<table>
		<tr>
			<td>ID</td>
			<td>Nombre</td>
			<td>DNI</td>
			<td>Sexo</td>
			<td>Edad</td>
 			<td>Aeronave</td>
		</tr>
		<tr>
			<th><c:out value="${model.idPiloto}"></c:out></th>
			<th><c:out value="${model.nombre}"></c:out></th>
			<th><c:out value="${model.dni}"></c:out></th>
			<th><c:out value="${model.sexo}"></c:out></th>
			<th><c:out value="${model.edad}"></c:out></th>
			<th><c:out value="${model.aeronave.idAeronave}"></c:out></th>
		</tr>
	</table>
	
	<br/>
	<a href="<c:url value="bienvenida.htm"/>">Volver</a>
	<a href="<c:url value="getPiloto.htm"/>">Buscar otro piloto</a>
</body>
</html></html>
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
	<h1>Resultado de la búsqueda con ID <c:out value="${model.idManiobra}"></c:out></h1>

	<table>
		<tr>
			<td>ID</td>
			<td>Patrullas</td>
			<td>Descripción</td>
			<td>Fecha</td>
		</tr>
		<tr>
			<th><c:out value="${model.idManiobra}"></c:out></th>
			<th>
				<c:forEach var="patrulla" items="${model.patrullaList}">
				<c:out value="${patrulla.nombre}"></c:out><br/>
				</c:forEach>
			</th>
			<th><c:out value="${model.descripcion}"></c:out></th>
			<th><c:out value="${model.fecha}"></c:out></th>
		</tr>
	</table>
	
	<br/>
	<a href="<c:url value="bienvenida.htm"/>">Volver</a>
	<a href="<c:url value="getManiobra.htm"/>">Buscar otra maniobra</a>
</body>
</html></html>
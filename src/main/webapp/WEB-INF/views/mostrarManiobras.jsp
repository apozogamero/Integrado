<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Lista Maniobras</title>
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
	<h1>Lista de maniobras</h1>

	<table>
		<tr>
			<td>ID</td>
			<td>Patrullas</td>
			<td>Descripción</td>
			<td>Fecha</td>
		</tr>
		<c:forEach var="man" items="${model}">
			<tr>
				<th><c:out value="${man.idManiobra}"></c:out></th>
 				<th>
					<c:forEach var="patrulla" items="${man.patrullaList}">
					<c:out value="${patrulla.nombre}"></c:out><br/>
					</c:forEach>
				</th>
				<th><c:out value="${man.descripcion}"></c:out></th>
				<th><c:out value="${man.fecha}"></c:out></th>
				<th><a href="editManiobra/${man.idManiobra}" class="btn btn-warning">Edit</a></th>
				<th><a href="deleteManiobra/${man.idManiobra}" class="btn btn-danger">Delete</a></th>
			</tr>
		</c:forEach>
	</table>
	
	<br/>
	<a href="addManiobra">Añadir maniobra</a><br/>
	<a href="<c:url value="bienvenida.htm"/>">Volver</a><br/>
	<a href="<c:url value="getManiobra.htm"/>">Buscar maniobra</a>
</body>
</html>
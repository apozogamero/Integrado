<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Lista Averias</title>
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
	<h1>Lista de averías</h1>

	<table>
		<tr>
			<td>ID</td>
			<td>Aeronave</td>
			<td>Descripción</td>
			<td>Fecha</td>
		</tr>
		<c:forEach var="ave" items="${model}">
			<tr>
				<th><c:out value="${ave.idAveria}"></c:out></th>
				<th><c:out value="${ave.aeronave.nombre}"></c:out></th>
				<th><c:out value="${ave.descripcion}"></c:out></th>
				<th><c:out value="${ave.fecha}"></c:out></th>
				<th><a href="editAveria/${ave.idAveria}" class="btn btn-warning">Edit</a></th>
				<th><a href="deleteAveria/${ave.idAveria}" class="btn btn-danger">Delete</a></th>
			</tr>
		</c:forEach>
	</table>
	
	<br/>
	<a href="addAveria">Añadir avería</a><br/>
	<a href="<c:url value="bienvenida.htm"/>">Volver</a><br/>
	<a href="<c:url value="getAveria.htm"/>">Buscar avería</a>
</body>
</html>
<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Lista Modelos</title>
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
	<h1>Lista de modelos</h1>

	<table>
		<tr>
			<td>ID</td>
			<td>Nombre</td>
			<td>Aeronaves</td>
		</tr>
		<c:forEach var="mo" items="${model.listaMod}">
			<tr>
				<th><c:out value="${mo.id}"></c:out></th>
				<th><c:out value="${mo.nombre}"></c:out></th>
<%-- 				<th><c:out value="${mo.aeronaveList}"></c:out></th> --%>
			</tr>
		</c:forEach>
	</table>
	
	<br/>
	<a href="<c:url value="bienvenida.htm"/>">Volver</a>
</body>
</html></html>
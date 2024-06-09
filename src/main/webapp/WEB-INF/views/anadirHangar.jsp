<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Añadir Hangar</title>
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


	<div class="container mt-3">

		<h1>Añadir Hangar</h1>
		<form action="insertHangar" method="post">

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="nombre">Nombre</label> <input type="text"
							class="form-control" id="nombre" name="nombre">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="capacidad">Capacidad</label> <input type="number"
							class="form-control" id="capacidad" name="capacidad">
					</div>
				</div>
			</div>

			<a href="${pageContext.request.contextPath }/"
				class="btn btn-warning"> Back </a>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>

</body>
</html>
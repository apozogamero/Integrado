<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Editar Piloto</title>
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

		<h1>Editar Piloto</h1>
		<form action="updatePiloto" method="post">

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="idPiloto">ID</label> <input type="text"
							value="${model.idPiloto}" class="form-control" id="idPiloto" name="idPiloto"
							readonly="readonly">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="nombre">Nombre</label> <input type="text"
							value="${model.nombre}" class="form-control" id="nombre" name="nombre">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="dni">DNI</label> <input type="text"
							value="${model.dni}" class="form-control" id="dni" name="dni">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="sexo">Sexo</label> <input
							type="text" value="${model.sexo}" class="form-control" id="sexo"
							name="sexo">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="edad">Edad</label> <input type="number"
							value="${model.edad}" class="form-control" id="edad" name="edad">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="idAeronave">Aeronave</label> <input
							type="text" value="${model.idAeronave}" class="form-control" id="idAeronave"
							name="idAeronave">
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
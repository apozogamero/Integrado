<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Editar Averia</title>
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

		<h1>Editar Averia</h1>
		<form action="updateAveria" method="post">

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="idAveria">ID</label> <input type="text"
							value="${model.idAveria}" class="form-control" id="idAveria" name="idAveria"
							readonly="readonly">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="descripcion">Descripción</label> <input type="text"
							value="${model.descripcion}" class="form-control" id="descripcion" name="descripcion">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="fecha">Fecha</label> <input type="date"
							value="${model.fecha}" class="form-control" id="fecha" name="fecha">
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
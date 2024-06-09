<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>A�adir Maniobra</title>
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

		<h1>A�adir Maniobra</h1>
		<form action="insertManiobra" method="post">

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="descripcion">Descripci�n</label> <input type="text"
							class="form-control" id="descripcion" name="descripcion">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="designation">Fecha</label> <input type="date"
							class="form-control" id="fecha" name="fecha">
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
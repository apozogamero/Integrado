<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
 	<meta charset="UTF-8">
 	<title>Index</title>
 	<style>
        body {
            text-align: center;
        }
        h1 {
        	width: 100%;
        	margin: 30px 0;
        }
        div {
        	width: 250px;
        	padding: 15px 10px;
        	border: 1px solid black;
        	margin: 0 auto;
        	text-align: center;
        }
 	</style>
</head>
<body>
	<h1>Integrado</h1>
	<div>
    	<a href="<c:url value="getPilotoAll.htm"/>">PILOTOS</a>
	</div>
	<div>
    	<a href="<c:url value="getAeronaveAll.htm"/>">AERONAVES</a>
	</div>
	<div>
    	<a href="<c:url value="getModeloAll.htm"/>">MODELOS</a>
	</div>
	<div>
    	<a href="<c:url value="getHangarAll.htm"/>">HANGARES</a>
	</div>
	<div>
    	<a href="<c:url value="getPatrullaAll.htm"/>">PATRULLAS</a>
	</div>
	<div>
    	<a href="<c:url value="getManiobraAll.htm"/>">MANIOBRAS</a>
	</div>
	<div>
    	<a href="<c:url value="getAveriaAll.htm"/>">AVERÍAS</a>
	</div>
</body>
</html>
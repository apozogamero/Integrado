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
    	<a href="getPilotoAll">PILOTOS</a>
	</div>
	<div>
    	<a href="getAeronaveAll">AERONAVES</a>
	</div>
	<div>
    	<a href="getModeloAll">MODELOS</a>
	</div>
	<div>
    	<a href="getHangarAll">HANGARES</a>
	</div>
	<div>
    	<a href="getPatrullaAll">PATRULLAS</a>
	</div>
	<div>
    	<a href="getManiobraAll">MANIOBRAS</a>
	</div>
	<div>
    	<a href="getAveriaAll">AVERÍAS</a>
	</div>
</body>
</html>
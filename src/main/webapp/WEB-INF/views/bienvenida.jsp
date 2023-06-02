<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
<head>
 	<meta charset="UTF-8">
 	<title>Index</title>
 	<style>
        body {
            text-align: center;
            display: flex;
            justify-content: center;
            flex-flow: row wrap;
        }
        h1 {
        	width: 100%;
        	margin-bottom: 50px;
        }
        div {
        	width: 250px;
        	padding: 15px 10px;
        	border: 1px solid black;
        	margin: 0 10px;
        }
 	</style>
</head>
<body>
	<h1>Integrado</h1>
	<div>
    	<a href="<c:url value="getPilotoAll.htm"/>">Mostrar todos los pilotos</a>
	</div>
</body>
</html>
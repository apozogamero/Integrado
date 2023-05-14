<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
    <h1><fmt:message key="heading"/></h1>
    <p><fmt:message key="greeting"/> <c:out value="${model.now}"/></p>
    <h3>Pilotos</h3>
    <c:forEach items="${model.pilotos}" var="piloto">
      <c:out value="${piloto.nombre}"/> <i>$<c:out value="${piloto.edad}"/></i><br><br>
    </c:forEach>
  </body>
</html>
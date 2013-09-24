<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:useBean id="service" class="classesDeConexao.ConexaoComWsDeputados" />

</head>
<body>

	<form method="post">
		<select name="Partido">
			<c:forEach var="partido" items="${service.partidos}">
				<option value=${partido }>${partido}</option>
			</c:forEach>
		</select> <input type="submit" value="pesquisar" />

	</form>
</body>
</html>
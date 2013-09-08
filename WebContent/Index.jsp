<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>teste</title>

<%@ page import="classesDeConexao.ConexaoComWsDeputados" %>
</head>
<body>

<%
	ConexaoComWsDeputados deputados = new ConexaoComWsDeputados();
	
	String string = "Waltasasfan";
	
	out.println(deputados.procurarDeputadoNome(string));
	

%>


</body>
</html>
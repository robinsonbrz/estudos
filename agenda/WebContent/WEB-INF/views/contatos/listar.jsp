<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html> 

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Agenda de Contato</title>
</head>
 
<body>
	<h2>Listar contatos</h2> 
	<ul> 
	<c:forEach items="${contatos}" var="contato">
		<li>
		${contato.nome} - ${contato.telefone} - 
		<a href="/agenda/contatos/editar/${contato.id}">editar</a> - 
		<a href="/agenda/contatos/exibir/${contato.id}">exibir</a> - 
		<a href="/agenda/contatos/deletar/${contato.id}">deletar</a> 
		</li>
	</c:forEach>
	</ul>
	<a href="/agenda/contatos/novo">Novo</a> 
	<br><br>
</body>
</html>
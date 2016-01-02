<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <title>Lista de Produtos!!!</title>
      
      <link rel="stylesheet" type="text/css"
         href="../bootstrap/css/bootstrap.css">
   </head>
   <body>
      <div class="success">
      
         <h1>Lista de Produtos</h1>
     	 <h1>Listagem de Produtos do ${usuarioLogado.usuario.nome}</h1>
         <table class="table table-striped table-hover ">
            <thead>
               <tr class="success">
                  <td>Nome</td>
                  <td>Valor</td>
                  <td>Quantidade</td>
                  <td>Deletar</td>
               </tr>
            </thead>
            <tbody>
               <c:forEach items="${produtoList }" var="produto">
                  <tr>
                     <td>${produto.nome }</td>
                     <td>${produto.valor }</td>
                     <td>${produto.quantidade }</td>
                     <td>
                        <form action="<c:url  value='/produto/remover'/>" method="POST">
                           <input type="hidden" name="_method" value="DELETE">
                           <input type="hidden" name="produto.id" value="${produto.id}">
                           <input type="submit" value="Excluir">
                        </form>
                     </td>
                  <tr>
               </c:forEach>
            </tbody>
         </table>
		<c:if test="${not empty mensagem}">
    		<div class="alert alert-success">${mensagem}</div>
		</c:if>
      </div>
   </body>
</html>
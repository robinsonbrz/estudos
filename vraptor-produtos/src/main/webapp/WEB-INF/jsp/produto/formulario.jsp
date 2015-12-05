<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../base.css">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Projeto de Produtos</title>
    </head>
    <body>
        <div class="container">

            <h1>Adicionar Produto</h1>

           <form action="<c:url value='/produto/adiciona'/>" method="POST">
                Nome:
                <input class="form-control" type="text" name="produto.nome"/>
                Valor:
                <input class="form-control" type="text" name="produto.valor"/>
                Quantidade:
                <input class="form-control" type="text" name="produto.quantidade"/>
                <button type="submit" class="btn btn-primary">Adicionar</button>
            </form>

        </div>
    </body>
</html>
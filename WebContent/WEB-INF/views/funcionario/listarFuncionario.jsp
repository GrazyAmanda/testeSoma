<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Lista Pessoa</title>
</head>
<body>
	<a href="cadastroFuncionario">Novo</a>
	<br />
	<br />
	<table>
		<tr>
			<th>Matricula</th>
			<th>Nome</th>
			<th>Funcao</th>
			
		</tr>
		<c:forEach items="${funcionario}" var="pessoa">
			<tr>
				<td>${pessoa.id}</td>
				<td>${pessoa.nome}</td>
				<td>${pessoa.tipoCargo.descricao}</td>
			
			</tr>
			<td><a href="removePessoa?id=${pessoa.id}">Remover</a></td>
			<td><a href="editarPessoa?id=${pessoa.id}">Alterar</a></td>
		</c:forEach>
	</table>
</body>
</html>
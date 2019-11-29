<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Lista Pessoa</title>
</head>
<body>
	<a href="cadastroOperacao">Novo</a>
	<br />
	<br />
	<table>
		<tr>
			<th>Data Operação</th>
			<th>Tipo Operação</th>
			<th>Tipo Operação</th>
			
		</tr>
		<c:forEach items="${extrato}" var="pessoa">
			<tr>
				<td>${extrato.dataResgisto}</td>
				<td>${extrato.tipoOperacao.descricao}</td>
				<td>${extrato.valor}</td>
			
			</tr>
			<td><a href="removeExtrato?id=${pessoa.id}">Remover</a></td>
			
		</c:forEach>
	</table>
</body>
</html>
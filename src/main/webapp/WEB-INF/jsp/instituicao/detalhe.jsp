<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>App AT Sistemas de Curso</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="panel-group">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h2>.::CADASTRO DE NOVA INSTITUIÇÃO::.</h2>
				</div>
				
				<div class="panel-body">
					<div class="btn-group">
						<form action="/home">
							<button type="submit" class="btn btn-link">Home</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
		<c:if test="${not empty mensagem}">
<div class="alert alert-warning">
  <strong>.::ATENÇÃO::.</strong> ${mensagem}
</div>
</c:if>
		<form action="/instituicao/incluir" method="post">
		
			<div class="form-group">
			<label>Informe o nome:</label>
				<input type="text" name="nome" class="form-control">
			</div>
			
			<div class="form-group">
			<label>Informe o e-mail:</label>
				<input type="email" name="email" class="form-control">
			</div>
			
			<div class="form-group">
			<label>Informe o endereço:</label>
				<input type="text" name="endereco" class="form-control">
			</div>
			
			<div class="form-group">
			<label>Informe a categoria:</label>
				<input type="text" name="categoria" class="form-control">
			</div>
			
			<button type="submit">Cadastrar</button>
		</form>

		<c:if test="${not empty lista}">
			<h4><strong> <p class="text-center bg-info">.::LISTA DAS INSTITUIÇOES::.</p></strong></h4>

			<table class="table table-striped">
				<thead>
					<tr>
						<th>Nome</th>
						<th></th>
					</tr>
				</thead>
				<tbody>

					<c:forEach var="i" items="${lista}">
						<tr>
							<td>${i.nome}</td>
							<td> <a href="/instituicao/${i.id}/excluir">Excluir</a> </td>
				
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<c:if test="${empty lista}">
			<h4><p class="text-center bg-danger"><strong>.::Nenhuma Instituição Cadastrada::.</p></strong></h4>
		</c:if>
	</div>
</body>
</html>
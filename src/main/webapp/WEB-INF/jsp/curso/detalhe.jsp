<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>App AT Sistemas de Curso</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="panel-group">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h2>.::CADASTRO DE NOVO CURSO::.</h2>
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


<div class="form-group">
			<label>Informe o Usuário </label>
					<select class="form-control" name="usuario.id"> 
					<c:forEach var="u" items="${usuarios}">
					<option value="${u.id}">${u.nome} :||: ${u.email}</option>
					</c:forEach>
				</select>		
			</div>

		<form action="/curso/incluir" method="post">
			<div class="form-group">
			<label>Informe a descrição:</label>
				<input type="text" name="descricao" class="form-control">
			</div>
			
			<div class="form-group">

			<label>Informe a duração do curso:</label>
				<input type="text" name="duracao" class="form-control">
			</div>
			
			<div class="form-group">
			<label>Informe a modalidade (Presencial ou Live):</label>
				<input type="text" name="modalidade" class="form-control">
			</div>
			<div class="form-group">
			<label>Informe a Instituição</label>
				<select class="form-control" name="instituicao.id"> 
					<c:forEach var="a" items="${allinstituicao}">
					<option value="${a.id}">${a.nome}</option>
					</c:forEach>
				</select>		
			</div>
			<button type="submit">Cadastrar</button>
		</form>

		<c:if test="${not empty lista}">
			<h4> <strong> <p class="text-center bg-info">.::LISTA DE CURSOS::.</p></strong> </h4>

			<table class="table table-striped">
				<thead>
					<tr>
						<th>Descrição</th>

						<th>Instituição</th>
						<th></th>
					</tr>
				</thead>
				<tbody>

					<c:forEach var="c" items="${lista}">
						<tr>
							<td>${c.descricao}</td>

							<td>${c.instituicao.nome}</td>

							<td> <a href="/curso/${c.id}/excluir">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		<c:if test="${empty lista}">
			<h4><p class="text-center bg-danger"><strong>.::Nenhum Curso Cadastrado::.</p></strong></h4>
		</c:if>
	</div>
</body>
</html>
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
					<h2>.::SISTEMA DE CURSOS::.</h2>
				</div>
			</div>
		</div>
		<div class="panel-body">
			<div class="btn-group">
				<form action="/usuario">
					<button type="submit" class="btn btn-link">Novo usuário</button>
				</form>
			</div>
		</div>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-warning">
				<strong>.::ATENÇÃO::.</strong> ${mensagem}
			</div>
		</c:if>
		<form action="/usuario/login" method="post"> 

			<div class="form-group">
				<label>Informe o e-mail:</label> <input type="email" name="email"
					class="form-control">
			</div>

			<div class="form-group">
				<label>Informe a senha:</label> <input type="password" name="senha"
					class="form-control">
			</div>

			<div class="panel-body">
				<div class="btn-group">
					<form action="/index"> 
						<button type="submit">Acessar</button>
					</form>
				</div>
			</div>
		</form>
	</div>
</body>
</html>
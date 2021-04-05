<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
					<h2>${user.nome}</h2>
					<h3>${user.email}</h3>
					<h3><a href=${user.git}>GIT</a></h3>
		</div>		
				<div class="panel-body">
					<div class="btn-group">
						<form action="/">
							<button type="submit" class="btn btn-link">Voltar</button>
						</form>
					</div>
				</div>
				<div class="panel-body">
					<div class="btn-group">
						<form action="/instituicao">
							<button type="submit" class="btn btn-link">Nova Instituição</button>
						</form>

					</div>
				</div>
				<div class="panel-body">
					<div class="btn-group">
						<form action="/curso">
							<button type="submit" class="btn btn-link">Novo Curso</button>
						</form>

					</div>
				</div>
			</div>
		</div>
</body>
</html>
	
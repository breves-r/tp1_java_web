<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastre-se</title>
</head>
<body>

	<%
	String usr = (String)request.getAttribute("usr");
	%>
	
	<div class="container">	
		<form action="cadastro" method="get">
			<h3>Bem-vinde, <%=usr%>!!</h3>
			<h3>Cadastramento realizado com sucesso!!!</h3>
			
			<button type="submit">Voltar</button>
		</form>		
	</div>
</body>
</html>
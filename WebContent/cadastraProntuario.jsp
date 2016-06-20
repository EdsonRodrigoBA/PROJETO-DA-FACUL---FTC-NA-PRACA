<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" type="text/css"
	href="./Bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="./Bootstrap/css/bootstrap-theme.min.css" />
<link rel="stylesheet" type="text/css" href="./Bootstrap/css/meu.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="background2.jpg">
	<jsp:include page="menu.jsp"></jsp:include>

	<div style="margin-left: 200px; padding-top: 5px;" >
		<form action="ClienteServelet?acao=cadastraCliente" method="post">
		<fieldset style="padding-top: 30px; padding: 0 auto;">
			<div class="row">
				<div class="form-group col-md-2">
					<label for="exampleInputEmail1">CODIGO</label> <input type="text"
						maxlength="11" class="form-control" id="cliCPF"
						placeholder="INFORME O CODIGO" required autofocus name="clicpf" >
				</div>
			
				<div class="form-group col-md-3">
					<label for="exampleInputEmail1">DATA PRONTUARIO</label> <input
						type="date" maxlength="11" class="form-control" id="cliNome" name="cliNome"
						placeholder="DATA PRONTUARIO" required autofocus>
				</div>
				
				<div class="form-group col-md-2">
					<label for="exampleInputEmail1">PROF.LOGIN</label> <input type="text"
						maxlength="9" class="form-control" id="cliRG"
						placeholder="PROF LOGIN" required autofocus name="cliRG" >
				</div>
				<div class="form-group col-md-2">
					<label for="exampleInputEmail1">CLIENTE CPF</label> <input
						type="text" class="form-control" id="exampleInputEmail1"
						placeholder="CPF DO CLIENTE" required autofocus name="cliDataNascimento">
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-4">
					<label for="exampleInputEmail1">PRONTUARIO DESCRICAO</label> <input
						type="text" class="form-control" id="exampleInputEmail1"
						placeholder="DESCRICAO PRONTUARIO" required autofocus name="cliMae">
				</div>
				<div class="form-group col-md-2">
					<label for="exampleInputEmail1">AREA CODIGO</label> <input type="text"
						class="form-control" id="exampleInputEmail1"
						placeholder="AREA CODIGO" required autofocus name="cliCep">

			</div>

			
			<hr />

			<div class="row" style="margin-left: 250px;">
				<div class="col-md-12">
					<button type="submit" class="btn btn-primary">Salvar</button>
					<a href="index.jsp" class="btn btn-default">Cancelar</a>
				</div>
			</div>
		</fieldset>
		</form>
	</div>
	
	<div style=" margin-top: 200px; " >
      <footer class="footer" style="padding-top: 20px;  ">
        <p style="margin-left: 500px; padding-top: 20px;">&copy;<b> 2016 - FTC NA PRAÇA - EDSON RODRIGO</b></p>
      </footer>
	</div>
	
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script src="./Bootstrap/js/jquery.js"></script>
	<script src="./Bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
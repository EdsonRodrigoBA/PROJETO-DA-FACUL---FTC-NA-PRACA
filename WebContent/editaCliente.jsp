<%@page import="br.ftcnapra.Model.Profissionais"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.ftcnapra.Model.Cliente"%>
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

			<%
			String msg = (String) request.getAttribute("msg");
			Cliente cliente = (Cliente) request.getAttribute("cliente");
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			Profissionais profissionais = new Profissionais();

			%>


	<div style="margin-left: 60px;">
		<form action="ClienteServelet?acao=atualiza" method="post">
		<fieldset style="padding-top: 100px; padding: 0 auto;">
			<div class="row">
				<div class="form-group col-md-2">
					<label for="exampleInputEmail1">CPF</label> <input type="text"
						maxlength="11" class="form-control" id="cliCPF"
						placeholder="Informe o CPF" required autofocus name="clicpf" value="<%=cliente.getCliCpf() %>" >
				</div>
			
				<div class="form-group col-md-3">
					<label for="exampleInputEmail1">Nome Completo</label> <input
						type="text" maxlength="11" class="form-control" id="cliNome" name="cliNome"
						placeholder="Digite o nome completo" required autofocus value="<%=cliente.getCliNome() %>">
				</div>
				
				<div class="form-group col-md-2">
					<label for="exampleInputEmail1">RG</label> <input type="text"
						maxlength="9" class="form-control" id="cliRG"
						placeholder="Digite o RG" required autofocus name="cliRG" value="<%=cliente.getCliRg() %>" >
				</div>
				<div class="form-group col-md-2">
					<label for="exampleInputEmail1">Data de Nascimento</label> <input
						type="text" class="form-control" id="exampleInputEmail1"
						placeholder="Digite  a data de nascimento" required autofocus name="cliDataNascimento" value="<%= dateFormat.format(cliente.getCliDataNascimento())%>">
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-4">
					<label for="exampleInputEmail1">Nome da Mãe</label> <input
						type="text" class="form-control" id="exampleInputEmail1"
						placeholder="Digite o nome da mãe" required autofocus name="cliMae" value="<%= cliente.getCliNomeMae() %>">
				</div>
				<div class="form-group col-md-2">
					<label for="exampleInputEmail1">Cep</label> <input type="text"
						class="form-control" id="exampleInputEmail1"
						placeholder="Digite o cep" required autofocus name="cliCep" value="<%= cliente.getCliCep() %>">
				</div>
				<div class="form-group col-md-3">
					<label for="exampleInputEmail1">Endereço</label> <input
						type="text" class="form-control" id="exampleInputEmail1"
						placeholder="Digite o endereço" required autofocus name="cliEndereco" value="<%= cliente.getCliEndereco()%>">
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-2">
					<label for="exampleInputEmail1">Número da Casa</label> <input
						type="text" class="form-control" id="exampleInputEmail1"
						placeholder="Digite o número da casa" required autofocus name="cliEnderecoNumero" value="<%=cliente.getCliEnderecoNumero()%>">
				</div>
				<div class="form-group col-md-2">
					<label for="exampleInputEmail1">Complemento</label> <input
						type="text" class="form-control" id="exampleInputEmail1"
						placeholder="Digite o complemento "required autofocus name="cliEnderecoComplemento" value="<%=cliente.getCliEnderecoComplementoto() %>">
				</div>
				<div class="form-group col-md-2">
					<label for="exampleInputEmail1">Bairro</label> <input type="text"
						class="form-control" id="exampleInputEmail1"
						placeholder="Digite o bairro" required autofocus name="cliBairro" value="<%=cliente.getCliBairro() %>">
				</div>
				<div class="form-group col-md-3">
					<label for="exampleInputEmail1">Cidade</label> <input type="text"
						class="form-control" id="exampleInputEmail1"
						placeholder="Digite a cidade" required autofocus name="cliCidade" value="<%= cliente.getCliCidde()%>">
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-1">
					<label for="exampleInputEmail1">UF</label> <input type="text"
						maxlength="2" class="form-control" id="exampleInputEmail1"
						placeholder="uf" required autofocus name="cliUF" value="<%=cliente.getCliUF()%>">
				</div>
				<div class="form-group col-md-4">
					<label for="exampleInputEmail1">Email</label> <input type="text"
						class="form-control" id="exampleInputEmail1"
						placeholder="Digite seu email" required autofocus name="cliEmail" value="<%= cliente.getCliEmail()%>">
				</div>
				<div class="form-group col-md-2">
					<label for="exampleInputEmail1">Telefone</label> <input type="text"
						maxlength="8" class="form-control" id="exampleInputEmail1"
						placeholder="Digite o número do tel." required autofocus name="cliTelefone" value="<%=cliente.getCliTelefone() %>">
				</div>
				<div class="form-group col-md-2">
					<label for="exampleInputEmail1">Celular</label> <input type="text"
						maxlength="9" class="form-control" id="exampleInputEmail1"
						placeholder="Digite o número do celular" required autofocus name="cliCelular" value="<%=cliente.getCliCelular()%>">
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-2">
					<label for="exampleInputEmail1">Data Cadastro</label> <input type="text"
						maxlength="9" class="form-control" id="exampleInputEmail1"
						placeholder="Data do Cadastro" required autofocus name="cliDataCadastro" value="<%= dateFormat.format(cliente.getCliDataCadastro())%>">
				</div>
							<div class="row">

				
				<div class="form-group col-md-2">
					<label for="exampleInputEmail1">Perfil Login</label> <input type="text"
						maxlength="9" class="form-control" id="exampleInputEmail1"
						placeholder="Digite seu Login" required required autofocus name="prfLogin" value="<%=cliente.getProfissionais() %>">
				</div>
					<div class="form-group col-md-2">
					<label for="exampleInputEmail1">Perfil Alteracao</label> <input type="text"
						maxlength="9" class="form-control" id="exampleInputEmail1"
						placeholder="Perfil Profissional" required autofocus name="cliPrfAlteracao" value="<%= cliente.getCliPerfilAlteracao()%>">
				</div>
				<div class="form-group col-md-2">
					<label for="exampleInputEmail1">Renda</label> <input type="text"
						maxlength="9" class="form-control" id="exampleInputEmail1"
						placeholder="Informe Sua Renda" required autofocus name="cliRenda" value="<%= cliente.getCliRenda() %>">
				</div>
			</div>
			


			<div class="row">
				<div class="col-md-12">
					<button type="submit" class="btn btn-primary">Salvar</button>
					<a href="template.html" class="btn btn-default">Cancelar</a>
				</div>
			</div>
		</fieldset>
		</form>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script src="./Bootstrap/js/jquery.js"></script>
	<script src="./Bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
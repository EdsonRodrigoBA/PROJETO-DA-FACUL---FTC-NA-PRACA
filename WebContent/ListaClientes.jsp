<%@page import="br.ftcnapra.Model.Cliente"%>
<%@page import="java.util.List"%>
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


	<%List<Cliente> lista = (List<Cliente>)request.getAttribute("lista"); %>
	<div class="table-responsive col-md-12">
	<table border="1" class="table table-striped" cellspacing="0" cellpadding="0">
		<tr style="background-color: black; color: white;">
			<th>CPF</th>
			<th>NOME</th>
			<th>RG</th>		
			<th>Dt.Nascimento</th>
			<th>Mae</th>			
			<th>CEP</th>			
			<th>Endereco</th>			
			<th>Numero</th>			
			<th>Completo</th>		
			<th>Bairro</th>
			<th>Cidade</th>
			<th>UF</th>
			<th>Email</th>			
			<th>Telefone</th>			
			<th>Celular</th>			
			<th>Data Cadastro</th>			
			<th>Data Alteracao</th>			
			<th>Perfil Alteracao</th>
			<th colspan="2">Acoes</th>
								
		<tr>
		<%for(Cliente cliente : lista){
		
		%>
			<tr style="font-weight: bold; font-size: 10pt; color: ">
				<td><%=cliente.getCliCpf() %></td>
				<td><%=cliente.getCliNome() %></td>
				<td><%=cliente.getCliRg() %></td>
				<td><%=cliente.getCliDataNascimento() %></td>
				<td><%=cliente.getCliNomeMae() %></td>
				<td><%=cliente.getCliCep() %></td>
				<td><%=cliente.getCliEndereco() %></td>
				<td><%=cliente.getCliEnderecoNumero() %></td>
				<td><%=cliente.getCliEnderecoComplementoto() %></td>
				<td><%=cliente.getCliBairro() %></td>
				<td><%=cliente.getCliCidde() %></td>
				<td><%=cliente.getCliUF() %></td>
				<td><%=cliente.getCliEmail() %></td>
				<td><%=cliente.getCliTelefone() %></td>
				<td><%=cliente.getCliCelular() %></td>
				<td><%=cliente.getCliDataCadastro() %></td>
				<td><%=cliente.getCliDataAlteracao() %></td>
				<td><%=cliente.getCliPerfilAlteracao()%></td>
				<td><a class="btn btn-success btn-xs" href="ClienteServelet?acao=edita&clicpf=<%=cliente.getCliCpf() %>">Editar</a></td>
				<td><a class="btn btn-danger btn-xs" href="#">Excluir</a></td>
			
			</tr>
		
		<%} %>
			
	</table>

</div>
			<div style=" margin-top: 100px; paddin-bottom: 20px" >
      <footer class="footer" style="padding-top: 400px;  padding-bottom: 50px;">
        <p style="margin-left: 500px; padding-top: 70px;">&copy;<b> 2016 - FTC NA PRAÇA - EDSON RODRIGO</b></p>
      </footer>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script src="./Bootstrap/js/jquery.js"></script>
	<script src="./Bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
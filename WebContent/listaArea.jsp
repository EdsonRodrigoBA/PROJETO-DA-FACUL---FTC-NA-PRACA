<%@page import="br.ftcnapra.Model.Area"%>
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
<script type="text/javascript" src="ConfirmaExclusaoArea.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Areas</title>
</head>
<body background="background2.jpg">
	<jsp:include page="menu.jsp"></jsp:include>

	
	<%
		List<Area> listaArea = (List<Area>)request.getAttribute("lista");
	%>
<div class="table-responsive col-md-12">
	
	<table border="1" class="table table-striped" cellspacing="0" cellpadding="0">
		<tr style="font-weight: bold; font-size: 14pt; background-color: black; color: white;" >
			<th>id </th>
			<th>Descricao</th>
			<th>Descricao</th>
			<th colspan="2" style="text-align: center;">Acoes</th>
			
			
		</tr>
		
		<%for(Area area : listaArea){%>
		<tr style="font-weight: bold; font-size: 10pt;">
			<td><%=area.getAreaCodigo() %></td>
			<td><%=area.getAreaNome() %></td>
			<td><%=area.getAreaDescricao() %></td>
			<td><a class="btn btn-success btn-xs" href="AreaServelet?acao=edita&areaCodigo=<%=area.getAreaCodigo()%>">Editar</a></td>
			<td><a class="btn btn-danger btn-xs" href="javascript:confirmaExclusao(<%=area.getAreaCodigo()%>)">Excluir</a></td>
			
		</tr>
		<%} %>	
	</table>
	</div>
	
		<div style=" margin-top: 100px; paddin-bottom: 20px" >
      <footer class="footer" style="padding-top: 400px;  padding-bottom: 50px;">
        <p style="margin-left: 500px; padding-top: 20px;">&copy;<b> 2016 - FTC NA PRAÇA - EDSON RODRIGO</b></p>
      </footer>
	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<script src="./Bootstrap/js/jquery.js"></script>
	<script src="./Bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
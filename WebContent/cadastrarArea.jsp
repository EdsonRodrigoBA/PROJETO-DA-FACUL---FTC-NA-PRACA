<%@page import="br.ftcnapra.Model.Area"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link rel="stylesheet" type="text/css" href="./Bootstrap/css/bootstrap.min.css" />
 <link rel="stylesheet" type="text/css" href="./Bootstrap/css/bootstrap-theme.min.css" />
  <link rel="stylesheet" type="text/css" href="./Bootstrap/css/meu.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Area</title>
</head>
<body background="background2.jpg">

	<jsp:include page="menu.jsp"></jsp:include>

 
	<form action="AreaServelet?acao=cadastrar" method="post">
		<fieldset style="width: 1200px; padding-top: 80px; margin: 0 auto;">
		<!-- 
				<p id="msg">
				<% String msg = (String) request.getAttribute("msg");%>
				<%= msg != null ? msg : ""%><br>
				</p>  -->

        <div class="row">
            <div class="form-group col-md-4">
                <label for="campo1">Código da Área</label>
                <input type="text" maxlength="3" class="form-control"  name="areaCodigo" required autofocus>
            </div>

            <div class="form-group col-md-4">
                <label for="campo2">Nome da Área</label>
                <input type="text" class="form-control"  name="areaNome" required autofocus>
            </div>

            <div class="form-group col-md-4">
                <label for="campo3">Descrição da Área</label>
                <input type="text" class="form-control" name="areaDescricao" >
            </div>
        </div>
        <hr />
        <div id="actions" class="row">
            <div class="col-md-12">
                <button type="submit" class="btn btn-primary">Salvar</button>
                <a href="index.html" class="btn btn-default">Cancelar</a>
            </div>
        </div>
        </fieldset>
	</form>
	
			
		<div>
      <footer class="footer" style="padding-top: 300px;  padding-bottom: 50px;">
        <p style="margin-left: 600px;">&copy; 2016 - FTC NA PRACA - EDSON RODRIGO</p>
      </footer>
	</div>
	
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="./Bootstrap/js/jquery.js"></script>
 <script src="./Bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
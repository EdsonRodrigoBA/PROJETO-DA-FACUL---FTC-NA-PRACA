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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edicao de Area</title>
</head>
<body background="background2.jpg">
	<jsp:include page="menu.jsp"></jsp:include>

	<form action="AreaServelet?acao=atualizar" method="post">
		<fieldset style="padding-top: 80px;">
		<!-- 
				<p id="msg">
				<% 
				String msg = (String) request.getAttribute("msg");
				Area area = (Area) request.getAttribute("area");
				
				%>
				<%= msg != null ? msg : ""%><br>
				</p>  -->
							
		 <div class="row" style="margin-left: 390px;">
            <div class="form-group col-md-2">
                <label for="campo1">Código da Área</label>
                <input type="text" maxlength="3" class="form-control"  name="areaCodigo" required autofocus value="<%=area.getAreaCodigo()%>">
            </div>

            <div class="form-group col-md-2">
                <label for="campo2">Nome da Área</label>
                <input type="text" class="form-control"  name="areaNome" required autofocus value="<%=area.getAreaNome()%>">
            </div>

            <div class="form-group col-md-2">
                <label for="campo3">Descrição da Área</label>
                <input type="text" class="form-control" name="areaDescricao" value="<%=area.getAreaDescricao()%>">
            </div>
        </div>
        <hr />
        <div id="actions" class="row" style="text-align: center;">
            <div class="col-md-12">
                <button type="submit" class="btn btn-primary">Salvar</button>
                <a href="Home.jsp" class="btn btn-default">Cancelar</a>
            </div>
        </div>
        </fieldset>
	</form>
	</form>
	
		<div style=" margin-top: 100px; paddin-bottom: 20px" >
      <footer class="footer" style="padding-top: 18px;  padding-bottom: 50px;">
        <p style="margin-left: 500px; padding-top: 200px;">&copy;<b> 2016 - FTC NA PRAÇA - EDSON RODRIGO</b></p>
      </footer>
	</div>
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="./Bootstrap/js/jquery.js"></script>
 <script src="./Bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
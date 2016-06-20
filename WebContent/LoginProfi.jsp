<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link rel="stylesheet" type="text/css" href="./Bootstrap/css/bootstrap.min.css" />
 <link rel="stylesheet" type="text/css" href="./Bootstrap/css/bootstrap-theme.min.css" />
  <link rel="stylesheet" type="text/css" href="./Bootstrap/css/meu.css" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="background2.jpg">

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"><Co>FTC NA PRACA</Co></a>
        </div>

    </div>
</nav>
<br>
	<form action="ProfissionalServelet" method="post" class="form-signin">
	
		<fieldset style="width: 200px; margin:0 auto; padding-top: 40px; margin-top: 40px; border-bottom-color:red; ">
				<div >
				<p id="msg" style="color: red;">
				<% String msg = (String) request.getAttribute("msg");%>
				<%= msg != null ? msg : ""%><br>
				</p>
				</div>
	
	</fieldset>
	<div class="container" style="width: 400px; margin: 0 auto; ">
		
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="text" id="inputEmail" class="form-control" placeholder="Digite seu Login" required autofocus name="nome">
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password" required name="senha">
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Grava Senha
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Logar</button>
        
 

    </div> <!-- /container -->
    
	</form>	
	
	<div style="border-top: 1px solid black; margin-top: 280px; paddin-bottom: 20px" >
      <footer class="footer" style="padding-top: 40px;  padding-bottom: 50px;">
        <p style="margin-left: 500px;">&copy; 2016,FTC NA PRAÇA - EDSON RODRIGO</p>
      </footer>
	</div>
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="./Bootstrap/js/jquery.js"></script>
 <script src="./Bootstrap/js/bootstrap.min.js"></script>

</body>
</html>
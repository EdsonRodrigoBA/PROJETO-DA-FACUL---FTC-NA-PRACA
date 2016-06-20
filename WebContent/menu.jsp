<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FTC Na PRAÇA</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">

        <!-- Logo -->
        <div class="navbar-header">
            <a href="#" class="navbar-brand">FTC NA PRAÇA</a>
        </div>

        <!-- Menu Items -->
        <div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="index.jsp">Home</a></li>
                <li><a href="#"></a></li>

                <!-- drop down menu -->
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Clientes <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="ClienteServelet?acao=listaCliente">Listar Clientes</a></li>
                        <li><a href="ClienteServelet?acao=cadastraCliente">Cadastra Clientes</a></li>
                    </ul>
                </li>
				
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Area <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="AreaServelet?acao=lista">Lista Areas</a></li>
                        <li><a href="AreaServelet?acao=cadastrar">Cadastra Area</a></li>
                    </ul>
                </li>
              <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Prontuario <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Lista Prontuario</a></li>
                        <li><a href="cadastraProntuario.jsp">Cadastra Prontuario</a></li>
                    </ul>
                </li>
                
                
               <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Funcionarios <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="">Lista Funcionarios</a></li>
                        <li><a href="#">Cadastra Funcionarios</a></li>
                    </ul>
                </li>
                
            </ul>

            <!--right align -->
            <ul class="nav navbar-nav navbar-right">
                <li><a href="LoginProfi.jsp">SAIR</a></li>
            </ul>

        </div>

    </div>
</nav>



</body>
</html>
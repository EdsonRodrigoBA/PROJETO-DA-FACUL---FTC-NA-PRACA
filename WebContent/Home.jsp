<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

 <link rel="stylesheet" type="text/css" href="./Bootstrap/css/bootstrap.min.css" />
 <link rel="stylesheet" type="text/css" href="./Bootstrap/css/bootstrap-theme.min.css" />
  <link rel="stylesheet" type="text/css" href="./Bootstrap/css/meu.css" />
  
  		<style type="text/css">
	* { margin:0; padding:0;}
	#slide { width: 650px; overflow: hidden; height: 280px; margin: 90px auto; box-shadow: 0 0 8px #000;position: relative;}
	#slide img {position: absolute;z-index: 1; display: none; left: 0;}
	#slide p {z-index:2;position: absolute; bottom: 0; left: 0; width: 100%; padding: 10px; font-family: Arial; font-size: 14px; background: rgba(0,0,0,0.7);  color: #fff;}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="principal"> <!--Conteudo da Pagina inicial Slide Passando Automatico -->
	<figure id="slide">
		<img src="./img/Medicos.png" alt="Medicos" style="width: 700; height:250px""/>
		<img src="./img/nutricionista-1.jpg" alt="Se Alimente Bem" style="width: 650; height:250px"/>
		<img src="img/Prontuario-eletronico-melhora-saude-publica.jpg" alt="Atendimento rapido"/>
		<img src="img/enfermeiras.jpg" alt="Enfermeira" style="width: 650; height:250px" />
		<img src="img/01.jpg" alt="Enfermeira" style="width: 650; height:450px" />
		<img src="img/02.jpg" alt="Coma Bastante Frutas" style="width: 650; height:250px" />
		<img src="img/03.jpg" alt="Psicologia" style="width: 600; height:500px" />
		<img src="img/cropped-fisioterapeuta2.jpg" alt="Fisioterapia" style="width: 700;height:250px" />
	</figure>

	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
	
	<script type="text/javascript">
		$(document).ready(function(){
			$("#slide img:eq(0)").addClass("ativo").show();

			var texto = $(".ativo").attr("alt");
			$("#slide").prepend("<p>"+texto+"</p>");

			setInterval(slide,2000);

			function slide(){
				if($(".ativo").next().size()){
					$(".ativo").fadeOut().removeClass("ativo").next().fadeIn().addClass("ativo");
				}else{
					$(".ativo").fadeOut().removeClass("ativo");
					$("#slide img:eq(0)").fadeIn().addClass("ativo");
				}
				
				var texto = $(".ativo").attr("alt");
				$("#slide p").hide().html(texto).delay(500).fadeIn();
			}
		});
	</script>
	</div> <!-- FIm do Conteudo -->    
    
    
    
    <script src="./Bootstrap/js/jquery.js"></script>
 <script src="./Bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
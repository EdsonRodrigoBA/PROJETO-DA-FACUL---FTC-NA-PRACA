<html>

	<head>
		<meta charset="UTF-8">
		<title> Projeto FTC- Na Praca</title>
		<style type="text/css">
	* { margin:0; padding:0;}
	#slide { width: 700px; overflow: hidden; height: 400px; margin: 90px auto; box-shadow: 0 0 8px #000;position: relative;}
	#slide img {position: absolute;z-index: 1; display: none; left: 0;}
	#slide p {z-index:2;position: absolute; bottom: 0; left: 0; width: 100%; padding: 10px; font-family: Arial; font-size: 14px; background: rgba(0,0,0,0.7);  color: #fff;}
</style>

	<link rel="stylesheet" type="text/css" href="StiloCss.css"/> 
	
		<link type="text/css" rel="Stylesheet" href="bjqs.css" />
	
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	
	</head>

	<body background="background2.jpg">
	<jsp:include page="menu.jsp"></jsp:include>

	<div class="principal"> <!--Conteudo da Pagina inicial Slide Passando Automatico -->
	<figure id="slide">
			<img src="img/ftc.jpg" alt="FTC" style="width: 700; height:395px""/>
		<img src="img/Medicos.png" alt="Medicos" style="width: 700; height:395px""/>
					<img src="img/PRAAJOSBASTOS.jpg" alt="FTC" style="width: 700; height:395px""/>
		<img src="img/nutricionista-1.jpg" alt="Se Alimente Bem" style="width: 700; height:395px"/>
		<img src="img/Prontuario-eletronico-melhora-saude-publica.jpg" alt="Atendimento rapido" height="395px;"/>
		<img src="img/enfermeiras.jpg" alt="Enfermeira" style="width: 700; height:395px" />
		<img src="img/01.jpg" alt="Enfermeira" style="width: 690; height:450px" />
		<img src="img/02.jpg" alt="Coma Bastante Frutas" style="width: 695; height:400px" />
		<img src="img/03.jpg" alt="Psicologia" style="width: 690; height:450px" />
		<img src="img/cropped-fisioterapeuta2.jpg" alt="Fisioterapia" style="width: 700;height:380px" />
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

	<div style=" margin-top: 70px;" >
      <footer class="footer" style="padding-top: px;">
        <p style="margin-left: 500px; padding-top: 4px;">&copy;<b> 2016 - FTC NA PRAÇA - EDSON RODRIGO</b></p>
      </footer>
	</div>
	</body>

</html>
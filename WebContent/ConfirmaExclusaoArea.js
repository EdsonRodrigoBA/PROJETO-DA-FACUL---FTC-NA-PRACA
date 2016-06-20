/**
 * 
 */

function confirmaExclusao (areaCodigo){
	
	if(window.confirm("Tem Certeza Que deseja Exluir ?")){
		location.href="AreaServelet?acao=excluir&areaCodigo=" + areaCodigo;
	}
}
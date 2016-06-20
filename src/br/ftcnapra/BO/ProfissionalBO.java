package br.ftcnapra.BO;

import br.ftcnapra.DAO.ProfissionalDAO;
import br.ftcnapra.Model.Profissionais;
import exception.NegocioException;

public class ProfissionalBO {
	
	public boolean logar(Profissionais profissionais)throws NegocioException{
		boolean resultado = false;
		try{
			if(profissionais.getProfLogin() == null ||"".equals(profissionais.getProfLogin())){
				throw new NegocioException("Login Obrigatorio");
			}else if(profissionais.getProfSenha() == null || "".equals(profissionais.getProfSenha())){
				throw new NegocioException("Senha Obrigatorio");
			}else {
				ProfissionalDAO profissionalDAO = new ProfissionalDAO();
				resultado = profissionalDAO.profiSsionalLogar(profissionais);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			throw new NegocioException(e.getMessage(),e);
		}
		return resultado;
		
	}
	
	
}

package br.ftcnapra.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.ftcnapra.Model.Profissionais;
import br.ftcnapraca.conexao.Conexao;
import exception.PersistenciaExcpetion;

public class ProfissionalDAO {
	
	
	private Connection con = Conexao.getConnection();
	
	public boolean profiSsionalLogar(Profissionais profissionais) throws PersistenciaExcpetion{
		boolean resultado = false;
		String sql = "select * from tbl_profissionais where profLogin =? and profSenha = ? " ;
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, profissionais.getProfLogin());
			preparedStatement.setString(2, profissionais.getProfSenha());
			
			ResultSet resultSet =preparedStatement.executeQuery();
			resultado = resultSet.next();
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistenciaExcpetion(e.getMessage(),e);
		}
		
		return resultado;	
	}
	

}

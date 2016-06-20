package br.ftcnapra.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ftcnapra.GenericoDAO.GenericDAO;
import br.ftcnapra.Model.Area;
import br.ftcnapraca.conexao.Conexao;
import exception.NegocioException;
import exception.PersistenciaExcpetion;

public class AreaDAO implements GenericDAO<Area>{
	
	private Connection con = Conexao.getConnection();
	
	public void cadastraArea(Area area)throws PersistenciaExcpetion{
		String sql = "insert into tbl_area(AreaCodigo, AreaNome, AreaDescricao) values (?,?,?)";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			
			preparedStatement.setInt(1, area.getAreaCodigo());
			preparedStatement.setString(2, area.getAreaNome());
			preparedStatement.setString(3, area.getAreaDescricao());
			preparedStatement.execute();
		}catch(Exception e){
			e.printStackTrace();
			throw new PersistenciaExcpetion(e.getMessage(),e);
		}
		
	}

	@Override
	public void inserir(Area area) throws PersistenciaExcpetion {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Area area) throws PersistenciaExcpetion {
		String sql = "update tbl_Area set areaNome = ? , areaDescricao = ? where areacodigo = ?";

		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setString(1, area.getAreaNome() );
			preparedStatement.setString(2, area.getAreaDescricao());
			preparedStatement.setInt(3, area.getAreaCodigo());

			preparedStatement.execute();
		}catch(Exception e){
			throw new PersistenciaExcpetion(e.getMessage(),e);
			
		}
		
	}

	@Override
	public void deletar(Integer areaCodigo) throws PersistenciaExcpetion {
		String sql = "delete from tbl_Area where areaCodigo = ?";
		
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			Area area = new Area();
			preparedStatement.setInt(1, areaCodigo);
			preparedStatement.execute();
			
		}catch (Exception e) {
			throw new PersistenciaExcpetion(e.getMessage(), e);
		}

		

	}

	@Override
	public List<Area> listarTodos() throws PersistenciaExcpetion {
		
		List<Area> listaArea = new ArrayList<>();
		try {
			String sql  = "Select * from tbl_area";

			PreparedStatement preparedStatement = con.prepareStatement(sql);
			ResultSet resultSet =preparedStatement.executeQuery();
			while(resultSet.next()){
				Area area = new Area();

				area.setAreaCodigo(resultSet.getInt(1));
				area.setAreaNome(resultSet.getString(2));
				area.setAreaDescricao(resultSet.getString(3));
				listaArea.add(area);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new PersistenciaExcpetion(e.getMessage(), e);
		}
		return listaArea;
	}

	@Override
	public Area buscarPorId(Integer areaCodigo) throws PersistenciaExcpetion {
		String sql = "select * from tbl_area where areaCodigo= ?";
		Area area = null;
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1,areaCodigo);
			ResultSet resultSet =preparedStatement.executeQuery();

			if(resultSet.next()){
				 area = new Area();
				 area.setAreaCodigo(resultSet.getInt(1));
				 area.setAreaNome(resultSet.getString(2));
				 area.setAreaDescricao(resultSet.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistenciaExcpetion(e.getMessage(),e);
		}
		
		
		return area;
	}
	

}

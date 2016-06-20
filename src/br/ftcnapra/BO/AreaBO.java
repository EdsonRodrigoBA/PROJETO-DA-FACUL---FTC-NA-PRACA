package br.ftcnapra.BO;

import java.util.List;

import br.ftcnapra.DAO.AreaDAO;
import br.ftcnapra.Model.Area;
import exception.NegocioException;
import exception.PersistenciaExcpetion;

public class AreaBO {
	
	public void cadastrar(Area area) throws NegocioException{
		
		AreaDAO areaDAO = new AreaDAO();
		try {
			areaDAO.cadastraArea(area);
		} catch (Exception e) {
			e.printStackTrace();
			throw new NegocioException(e.getMessage());
		}
	}
	
	public List<Area> listaTudo() throws NegocioException{
		AreaDAO areaDAO = new AreaDAO();
		try {
			return areaDAO.listarTodos();
		} catch (Exception e) {
			e.printStackTrace();
			throw new NegocioException(e.getMessage());
		}
	}
	
	public void editar(Area area) throws NegocioException{
		try {
			AreaDAO areaDAO = new AreaDAO();
			areaDAO.atualizar(area);
		} catch (Exception e) {
			e.printStackTrace();
			throw new NegocioException(e.getMessage());
		}
	}
	
	
	public void removerArea(Integer areaCodigo) throws NegocioException{
		AreaDAO areaDAO = new AreaDAO();
		try {
			areaDAO.deletar(areaCodigo);
		} catch (PersistenciaExcpetion e) {
			e.printStackTrace();
			throw new NegocioException(e.getMessage());
		}
	}
	
	public Area buscarPorID(Integer areaCodigo) throws NegocioException{
		Area area = null;
		try {
			AreaDAO areaDAO = new AreaDAO();
			area = areaDAO.buscarPorId(areaCodigo);
		} catch (Exception e) {
			e.printStackTrace();
			throw new NegocioException(e.getMessage(),e);
		}
		return area;
	}
	


}

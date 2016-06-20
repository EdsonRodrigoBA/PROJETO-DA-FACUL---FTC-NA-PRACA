package br.ftcnapra.GenericoDAO;

import java.util.List;

import exception.PersistenciaExcpetion;

public interface GenericDAO <T> {
	
	void inserir(T objc) throws PersistenciaExcpetion;
	void atualizar(T objc)throws PersistenciaExcpetion;
	void cadastraArea(T objct) throws PersistenciaExcpetion;
	
	void deletar(Integer idPessoa)throws PersistenciaExcpetion;
	
	List<T> listarTodos()throws PersistenciaExcpetion;
	
	T buscarPorId(Integer idPessoa)throws PersistenciaExcpetion;
	

}

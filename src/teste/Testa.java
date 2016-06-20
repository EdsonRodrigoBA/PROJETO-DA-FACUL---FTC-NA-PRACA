package teste;


import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import br.ftcnapra.BO.AreaBO;
import br.ftcnapra.DAO.AreaDAO;
import br.ftcnapra.GenericoDAO.ClienteDAO;
import br.ftcnapra.Model.Area;
import br.ftcnapra.Model.Cliente;
import br.ftcnapra.Model.Profissionais;
import exception.NegocioException;
import exception.PersistenciaExcpetion;

public class Testa {
	
	public static void main(String[] args) throws PersistenciaExcpetion {
	
		try {
			cadastracli();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
		}
	
	public static void cadastracli() throws PersistenciaExcpetion{
		ClienteDAO clienteDAO = new ClienteDAO();
		try {
			List<Cliente> lista = clienteDAO.listaTodosClientes();
			for(Cliente cliente : lista){
				System.out.println(cliente.getCliCpf());
				System.out.println(cliente.getCliDataCadastro());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

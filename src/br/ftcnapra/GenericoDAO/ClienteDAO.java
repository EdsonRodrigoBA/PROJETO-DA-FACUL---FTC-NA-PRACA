package br.ftcnapra.GenericoDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ftcnapra.Model.Area;
import br.ftcnapra.Model.Cliente;
import br.ftcnapraca.conexao.Conexao;
import exception.PersistenciaExcpetion;

public class ClienteDAO {
	private Connection connection = Conexao.getConnection();
	
	public  void cadastrar(Cliente cliente)throws PersistenciaExcpetion{
		String sql = "INSERT INTO TBl_clientes (CLICPF, CLINOME, CLIRG, CLIDATANASCIMENTO,"
				+ "  CLIMAE, CLICEP, CLIENDERECO, CLIENDERECONUMERO, clienderecoComplemento,"
				+ " CLIBAIRRO, CLICIDADE, CLIUF, CLIEMAIL, CLITELEFONE, CLICELULAR, CLIDATACADASTRO, CLIDATAALTERACAO,"
				+ " PRFLOGIN, CLIPRFALTERACAO, CLIRENDA) " +
				"VALUES(?,?,?, ?, ?, ?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setLong(1, cliente.getCliCpf());
			preparedStatement.setString(2, cliente.getCliNome());
			preparedStatement.setString(3, cliente.getCliRg());
			preparedStatement.setDate(4, new Date(cliente.getCliDataNascimento().getTime()));
			preparedStatement.setString(5, cliente.getCliNomeMae());
			preparedStatement.setString(6, cliente.getCliCep());
			preparedStatement.setString(7, cliente.getCliEndereco());
			preparedStatement.setString(8, cliente.getCliEnderecoNumero());
			preparedStatement.setString(9, cliente.getCliEnderecoComplementoto());
			preparedStatement.setString(10, cliente.getCliBairro());
			preparedStatement.setString(11, cliente.getCliCidde());
			preparedStatement.setString(12, cliente.getCliUF());
			preparedStatement.setString(13, cliente.getCliEmail());
			preparedStatement.setString(14, cliente.getCliTelefone());
			preparedStatement.setString(15, cliente.getCliCelular());
			preparedStatement.setDate(16, new Date(cliente.getCliDataCadastro().getTime()));
			preparedStatement.setDate(17, new Date(cliente.getCliDataCadastro().getTime()));
			preparedStatement.setString(18, cliente.getProfissionais().getProfLogin());
			preparedStatement.setString(19, cliente.getCliPerfilAlteracao());
			preparedStatement.setBigDecimal(20, cliente.getCliRenda());
			preparedStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistenciaExcpetion(e.getMessage(),e);
		}
	}
	
	
	public List<Cliente> listaTodosClientes() throws PersistenciaExcpetion{
		String sql = "select * from tbl_clientes";
		List<Cliente> listaCliente = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				Cliente cliente = new Cliente();
				cliente.setCliCpf(resultSet.getLong("cliCPF"));
				cliente.setCliNome(resultSet.getString("cliNome"));
				cliente.setCliRg(resultSet.getString("cliRG"));
				cliente.setCliDataNascimento(resultSet.getDate("cliDataNascimento"));
				cliente.setCliNomeMae(resultSet.getString("cliMae"));
				cliente.setCliCep(resultSet.getString("cliCep"));
				cliente.setCliEndereco(resultSet.getString("cliEndereco"));
				cliente.setCliEnderecoNumero(resultSet.getString("cliEnderecoNumero"));
				cliente.setCliEnderecoComplementoto(resultSet.getString("cliEnderecoComplemento"));
				cliente.setCliBairro(resultSet.getString("cliBairro"));
				cliente.setCliCidde(resultSet.getString("cliCidade"));
				cliente.setCliUF(resultSet.getString("cliUF"));
				cliente.setCliEmail(resultSet.getString("cliEmail"));
				cliente.setCliTelefone(resultSet.getString("cliTelefone"));
				cliente.setCliCelular(resultSet.getString("cliCelular"));
				cliente.setCliDataCadastro(resultSet.getDate("cliDataCadastro"));
				cliente.setCliDataAlteracao(resultSet.getDate("cliDataAlteracao"));
				cliente.setCliPerfilAlteracao(resultSet.getString("prfLogin"));
				cliente.setCliPerfilAlteracao(resultSet.getString("cliPrfAlteracao"));
				cliente.setCliRenda(resultSet.getBigDecimal("cliRenda"));
				listaCliente.add(cliente);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistenciaExcpetion(e.getMessage(),e);

		}
		return listaCliente;
	}
	
	public void atualizaCliente(Cliente cliente) throws PersistenciaExcpetion{
		String sql = "update tbl_clientes set clinome = ?, cliRg = ?, clidataNascimento = ?, climae = ?,"
				+ "clicep = ?, cliendereco = ? , clienderecoNumero = ?, cliEnderecoComplemento = ?,"
				+ "clibairro = ? , clicidade = ?, cliUF = ?, cliemail= ?, cliTelefone = ?, clicelular = ?,"
				+ " clidatacadastro = ?, cliDataAlteracao = ?, prfLogin = ?, cliPrfAlteracao = ?,clirenda = ? where clicpf = ?";
		try{
			
			PreparedStatement preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setLong(1, cliente.getCliCpf());
			preparedStatement.setString(2, cliente.getCliNome());
			preparedStatement.setString(3, cliente.getCliRg());
			preparedStatement.setDate(4, new Date(cliente.getCliDataNascimento().getTime()));
			preparedStatement.setString(5, cliente.getCliNomeMae());
			preparedStatement.setString(6, cliente.getCliCep());
			preparedStatement.setString(7, cliente.getCliEndereco());
			preparedStatement.setString(8, cliente.getCliEnderecoNumero());
			preparedStatement.setString(9, cliente.getCliEnderecoComplementoto());
			preparedStatement.setString(10, cliente.getCliBairro());
			preparedStatement.setString(11, cliente.getCliCidde());
			preparedStatement.setString(12, cliente.getCliUF());
			preparedStatement.setString(13, cliente.getCliEmail());
			preparedStatement.setString(14, cliente.getCliTelefone());
			preparedStatement.setString(15, cliente.getCliCelular());
			preparedStatement.setDate(16, new Date(cliente.getCliDataCadastro().getTime()));
			preparedStatement.setDate(17, new Date(cliente.getCliDataCadastro().getTime()));
			preparedStatement.setString(18, cliente.getProfissionais().getProfLogin());
			preparedStatement.setString(19, cliente.getCliPerfilAlteracao());
			preparedStatement.setBigDecimal(20, cliente.getCliRenda());
			preparedStatement.execute();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public Cliente buscaporid(Long cliCPF) throws PersistenciaExcpetion{
		Cliente cliente = null;
		String sql = "select * from tbl_clientes where cliCPF = ?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, cliCPF);
			ResultSet resultSet =preparedStatement.executeQuery();
			
			if(resultSet.next()){
				cliente = new Cliente();
				cliente.setCliCpf(resultSet.getLong(1));
				cliente.setCliNome(resultSet.getString(2));
				cliente.setCliRg(resultSet.getString(3));
				cliente.setCliDataNascimento(resultSet.getDate(4));
				cliente.setCliNomeMae(resultSet.getString(5));
				cliente.setCliCep(resultSet.getString(6));
				cliente.setCliEndereco(resultSet.getString(7));
				cliente.setCliEnderecoNumero(resultSet.getString(8));
				cliente.setCliEnderecoComplementoto(resultSet.getString(9));
				cliente.setCliBairro(resultSet.getString(10));
				cliente.setCliCidde(resultSet.getString(11));
				cliente.setCliUF(resultSet.getString(12));
				cliente.setCliEmail(resultSet.getString(13));
				cliente.setCliTelefone(resultSet.getString(14));
				cliente.setCliCelular(resultSet.getString(15));
				cliente.setCliDataCadastro(resultSet.getDate(16));
				cliente.setCliDataAlteracao(resultSet.getDate(17));
				cliente.setCliPerfilAlteracao(resultSet.getString(18));
				cliente.setCliPerfilAlteracao(resultSet.getString(19));
				cliente.setCliRenda(resultSet.getBigDecimal(20));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return cliente;
		
	}
	
	public void deletar(Long clicpf)throws PersistenciaExcpetion{
		
		String sql = "delete from tbl_clientes where clicpf = ?";
		try {
			PreparedStatement preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setLong(1,clicpf);
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}

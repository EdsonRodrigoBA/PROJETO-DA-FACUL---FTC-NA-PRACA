package br.ftcnapra.servelet;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ftcnapra.DAO.AreaDAO;
import br.ftcnapra.GenericoDAO.ClienteDAO;
import br.ftcnapra.Model.Cliente;
import br.ftcnapra.Model.Profissionais;

/**
 * Servlet implementation class ClienteServelet
 */
@WebServlet("/ClienteServelet")
public class ClienteServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("acao");
		String proximaPage = "cadastraCliente.jsp";
		DateFormat format = new SimpleDateFormat("dd-MM-yyyy");

		try {
			if(acao.equals("cadastraCliente")){
				String cliCPF = request.getParameter("clicpf");
				String cliNome = request.getParameter("cliNome");
				String cliRG = request.getParameter("cliRG");
				String cliDataNascimento = request.getParameter("cliDataNascimento");
				String cliMae = request.getParameter("cliMae");
				String cliCep = request.getParameter("cliCep");
				String cliEndereco = request.getParameter("cliEndereco");
				String cliEnderecoNumero = request.getParameter("cliEnderecoNumero");
				String cliEnderecoComplemento = request.getParameter("cliEnderecoComplemento");
				String cliBairro = request.getParameter("cliBairro");
				String cliCidade = request.getParameter("cliCidade");
				String cliUF = request.getParameter("cliUF");
				String cliEmail = request.getParameter("cliEmail");
				String cliTelefone = request.getParameter("cliTelefone");
				String cliCelular = request.getParameter("cliCelular");
				String cliDataCadastro = request.getParameter("cliDataCadastro");
				String prfLogin = request.getParameter("prfLogin");
				String cliPrfAlteracao = request.getParameter("cliPrfAlteracao");
				String cliRenda = request.getParameter("cliRenda");
	
				Cliente cliente = new Cliente();

				cliente.setCliCpf(Long.parseLong(cliCPF));
				cliente.setCliNome(cliNome);
				cliente.setCliRg(cliRG);
				cliente.setCliDataNascimento(format.parse(cliDataNascimento));
				cliente.setCliNomeMae(cliMae);
				cliente.setCliCep(cliCep);
				cliente.setCliEndereco(cliEndereco);
				cliente.setCliEnderecoNumero(cliEnderecoNumero);
				cliente.setCliEnderecoComplementoto(cliEnderecoComplemento);
	
				cliente.setCliBairro(cliBairro);
				cliente.setCliCidde(cliCidade);
				cliente.setCliUF(cliUF);
				cliente.setCliEmail(cliEmail);
				cliente.setCliTelefone(cliTelefone);
				cliente.setCliCelular(cliCelular);
				cliente.setCliDataCadastro(format.parse(cliDataCadastro));
				Profissionais profissionais = new Profissionais();
				profissionais.setProfLogin(prfLogin);
				cliente.setProfissionais(profissionais);
				cliente.setCliPerfilAlteracao(cliPrfAlteracao);
				BigDecimal bigDecimal = new BigDecimal(cliRenda);
				cliente.setCliRenda(bigDecimal);
				ClienteDAO clienteDAO = new ClienteDAO();
				clienteDAO.cadastrar(cliente);
				request.setAttribute("msg", "Cadastrado com Sucesso");
				proximaPage = "ClienteServelet?acao=listaCliente";
				
			}else if(acao.equals("listaCliente")){
				ClienteDAO clienteDAO = new ClienteDAO();
				List<Cliente> lista = clienteDAO.listaTodosClientes();
				request.setAttribute("lista", lista);
				proximaPage = "ListaClientes.jsp";

			}else if(acao.equals("edita")){
				String cliCPF = request.getParameter("clicpf");
				ClienteDAO clienteDAO = new ClienteDAO();
				Cliente cliente = clienteDAO.buscaporid(Long.parseLong(cliCPF));
				request.setAttribute("cliente", cliente);
				proximaPage = "editaCliente.jsp";
				
				
			}else if(acao.equals("atualiza")){
				
				String cliCPF = request.getParameter("clicpf");
				String cliNome = request.getParameter("cliNome");
				String cliRG = request.getParameter("cliRG");
				String cliDataNascimento = request.getParameter("cliDataNascimento");
				String cliMae = request.getParameter("cliMae");
				String cliCep = request.getParameter("cliCep");
				String cliEndereco = request.getParameter("cliEndereco");
				String cliEnderecoNumero = request.getParameter("cliEnderecoNumero");
				String cliEnderecoComplemento = request.getParameter("cliEnderecoComplemento");
				String cliBairro = request.getParameter("cliBairro");
				String cliCidade = request.getParameter("cliCidade");
				String cliUF = request.getParameter("cliUF");
				String cliEmail = request.getParameter("cliEmail");
				String cliTelefone = request.getParameter("cliTelefone");
				String cliCelular = request.getParameter("cliCelular");
				String cliDataCadastro = request.getParameter("cliDataCadastro");
				String prfLogin = request.getParameter("prfLogin");
				String cliPrfAlteracao = request.getParameter("cliPrfAlteracao");
				String cliRenda = request.getParameter("cliRenda");
				
				Cliente cliente = new Cliente();
				cliente.setCliCpf(Long.parseLong(cliCPF));
				cliente.setCliNome(cliNome);
				cliente.setCliRg(cliRG);
				cliente.setCliDataNascimento(format.parse(cliDataNascimento));
				cliente.setCliNomeMae(cliMae);
				cliente.setCliCep(cliCep);
				cliente.setCliEndereco(cliEndereco);
				cliente.setCliEnderecoNumero(cliEnderecoNumero);
				cliente.setCliEnderecoComplementoto(cliEnderecoComplemento);
	
				cliente.setCliBairro(cliBairro);
				cliente.setCliCidde(cliCidade);
				cliente.setCliUF(cliUF);
				cliente.setCliEmail(cliEmail);
				cliente.setCliTelefone(cliTelefone);
				cliente.setCliCelular(cliCelular);
				cliente.setCliDataCadastro(format.parse(cliDataCadastro));
				Profissionais profissionais = new Profissionais();
				profissionais.setProfLogin(prfLogin);
				cliente.setProfissionais(profissionais);
				cliente.setCliPerfilAlteracao(cliPrfAlteracao);
				BigDecimal bigDecimal = new BigDecimal(cliRenda);
				cliente.setCliRenda(bigDecimal);
				ClienteDAO clienteDAO = new ClienteDAO();
				
				clienteDAO.atualizaCliente(cliente);
				proximaPage = "ClienteServelet?acao=listaCliente";	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(proximaPage);
		requestDispatcher.forward(request, response);
	}

}

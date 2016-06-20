package br.ftcnapra.servelet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import br.ftcnapra.BO.AreaBO;
import br.ftcnapra.DAO.AreaDAO;
import br.ftcnapra.Model.Area;
import exception.NegocioException;

/**
 * Servlet implementation class AreaServelet
 */
@WebServlet("/AreaServelet")
public class AreaServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("acao");
		String proxima = "cadastrarArea.jsp";

		AreaBO areaBO = new AreaBO();
		try {
			if (acao.equals("cadastrar")) {
				String codigo = request.getParameter("areaCodigo");
				String areaNome = request.getParameter("areaNome");
				String areaDescricao = request.getParameter("areaDescricao");

				Area area = new Area();
				area.setAreaCodigo(Integer.parseInt(codigo));
				area.setAreaNome(areaNome);
				area.setAreaDescricao(areaDescricao);

				areaBO.cadastrar(area);
				request.setAttribute("msg", "Cadastrado com Sucesso");
				proxima = "AreaServelet?acao=lista";

			}else if(acao.equals("lista")){
				List<Area> listaArea = areaBO.listaTudo();
				request.setAttribute("lista", listaArea);
				proxima = "listaArea.jsp";
				
			}else if(acao.equals("edita")){
				String areaCode = request.getParameter("areaCodigo");
				Area area = areaBO.buscarPorID(Integer.parseInt(areaCode));
				request.setAttribute("area", area);
				proxima = "editarArea.jsp";
				
			}else if(acao.equals("atualizar")){
				String codigo = request.getParameter("areaCodigo");
				String areaNome = request.getParameter("areaNome");
				String areaDescricao = request.getParameter("areaDescricao");
				Area area = new Area();
				area.setAreaCodigo(Integer.parseInt(codigo));
				area.setAreaNome(areaNome);
				area.setAreaDescricao(areaDescricao);
				AreaDAO areaDAO = new AreaDAO();
				areaDAO.atualizar(area);
				proxima = "AreaServelet?acao=lista";
			}else if(acao.equals("excluir")){
				String codigo = request.getParameter("areaCodigo");
				areaBO.removerArea(Integer.parseInt(codigo));
				proxima = "AreaServelet?acao=lista";

			}

		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", "Erro ao cadastrar");
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(proxima);
		requestDispatcher.forward(request, response);

	}

}

package br.ftcnapra.servelet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ftcnapra.BO.AreaBO;
import br.ftcnapra.BO.ProfissionalBO;
import br.ftcnapra.Model.Area;
import br.ftcnapra.Model.Profissionais;
import exception.NegocioException;

/**
 * Servlet implementation class ProfissionalServelet
 */
@WebServlet("/ProfissionalServelet")
public class ProfissionalServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProfissionalBO profissionalBO = new ProfissionalBO();
		Profissionais profissionais = new Profissionais();
		
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		HttpSession httpSession = request.getSession();
		
		profissionais.setProfLogin((nome));
		profissionais.setProfSenha(senha);
		
		
		String proxima = "index.jsp";
		try {
			boolean resposta = profissionalBO.logar(profissionais);
			if(!resposta){
				request.setAttribute("msg", "Usuario / Senha Invalidos");
				proxima = "LoginProfi.jsp";
			}else{
				AreaBO areaBO = new AreaBO();
				List<Area> listArea = areaBO.listaTudo();
				httpSession.setAttribute("lista", listArea);
			}
		} catch (NegocioException e) {
			e.printStackTrace();
			proxima = "LoginProfi.jsp";
			request.setAttribute("msg", "Usuario / Senha Invalido");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(proxima);
		dispatcher.forward(request, response);
		
	}

}

package br.edu.infnet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.model.domain.Usuario;


public class CadastroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CadastroController() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.html").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario usuario = new Usuario(request.getParameter("nome"), request.getParameter("email"), request.getParameter("senha"));
		
		request.setAttribute("usr", usuario.getNome());
		
		request.getRequestDispatcher("confirmacao.jsp").forward(request, response);
		
	}

}

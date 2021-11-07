package com.gaunhoibom.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gaunhoibom.model.NguoiDungModel;
import com.gaunhoibom.service.impl.NguoiDungService;


@WebServlet(urlPatterns = {"/Login"})
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Inject
	NguoiDungService nguoidungService;
	
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ss = request.getSession();
		if(ss!=null) {
			ss.invalidate();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Views/web/login.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		NguoiDungModel n1 = new NguoiDungModel();
		String uname = request.getParameter("uname").toString();
		String pass = request.getParameter("pass").toString();
		n1.setPassword(pass);
		n1.setEmail(uname);
		if(nguoidungService.checkAccount(n1)) {
			if(n1.getVaitro()==2) {
				HttpSession ss = request.getSession();
				ss.setAttribute("account", n1);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
				dispatcher.forward(request, response);
			}
			else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("/AdminIndex.jsp");
				dispatcher.forward(request, response);
			}
		}else {
			request.setAttribute("ErrorLogin", "Login Failed!");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Views/web/login.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
	}

}

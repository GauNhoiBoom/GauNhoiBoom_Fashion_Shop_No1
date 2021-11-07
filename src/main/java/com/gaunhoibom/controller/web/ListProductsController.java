package com.gaunhoibom.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gaunhoibom.service.impl.SanPhamService;

@WebServlet(urlPatterns = {"/ListProducts"})
public class ListProductsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	private SanPhamService sanphamService;
	
    public ListProductsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("bstID")==null && request.getParameter("dmID")==null) {
			request.setAttribute("allsp", sanphamService.findAll());
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Views/web/ListProducts.jsp");
			dispatcher.forward(request, response);
		}if(request.getParameter("bstID")!=null) {
			Long bstID = Long.parseLong(request.getParameter("bstID"));
			request.setAttribute("allsp", sanphamService.findCollectionID(bstID));
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Views/web/ListProducts.jsp");
			dispatcher.forward(request, response);
		}if(request.getParameter("dmID")!=null) {
			Long dmID = Long.parseLong(request.getParameter("dmID"));
			request.setAttribute("allsp", sanphamService.findCategoryID(dmID));
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Views/web/ListProducts.jsp");
			dispatcher.forward(request, response);
		}		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

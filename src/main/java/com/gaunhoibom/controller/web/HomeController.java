package com.gaunhoibom.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gaunhoibom.dao.impl.DanhMucDAO;
import com.gaunhoibom.service.impl.DanhMucService;
import com.gaunhoibom.service.impl.HangSanXuatService;
import com.gaunhoibom.service.impl.SanPhamService;


@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet {

	@Inject
	private DanhMucService danhmucService; 
	@Inject
	private HangSanXuatService hangsanxuatService;
	@Inject
	private SanPhamService sanphamService;
	
	private static final long serialVersionUID = 4833444709318464569L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listdm", danhmucService.findAll());
		request.setAttribute("listhsx", hangsanxuatService.findAll());
		request.setAttribute("listWoman", sanphamService.findCollectionID(1L));
		request.setAttribute("listMan", sanphamService.findCollectionID(2L));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Views/web/home.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
}

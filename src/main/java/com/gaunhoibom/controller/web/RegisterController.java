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

@WebServlet(urlPatterns = { "/Register" })
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	private NguoiDungService nguoidungService;

	public RegisterController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession ss = request.getSession();
		if (ss != null) {
			ss.invalidate();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Views/web/register.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String email = request.getParameter("user");
		String hoten = request.getParameter("fullname");
		String diachi = request.getParameter("addrees");
		String sdt = request.getParameter("phone");
		String gioitinh = request.getParameter("gender");
		String pass = request.getParameter("pass");
		String cfpass = request.getParameter("cfpass");
		if (pass.equals(cfpass) == false) {
			request.setAttribute("errorConFirmPass", "Mật khẩu không đồng nhất");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Views/web/register.jsp");
			dispatcher.forward(request, response);
		} else {
			NguoiDungModel a = new NguoiDungModel();
			a.setEmail(email);
			a.setPassword(pass);
			a.setHoten(hoten);
			a.setGioitinh(gioitinh);
			a.setDiachi(diachi);
			a.setSodienthoai(sdt);
			a.setVaitro(2L);// Delault user
			Long idNguoiDungNew = nguoidungService.addNguoiDung(a);
			request.setAttribute("Success", "Đăng ký thành công ID" + idNguoiDungNew);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Views/web/login.jsp");
			dispatcher.forward(request, response);
		}

	}

}

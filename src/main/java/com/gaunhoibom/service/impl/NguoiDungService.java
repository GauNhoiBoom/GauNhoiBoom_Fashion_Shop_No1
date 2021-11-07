package com.gaunhoibom.service.impl;

import javax.inject.Inject;

import com.gaunhoibom.dao.impl.NguoiDungDAO;
import com.gaunhoibom.model.NguoiDungModel;
import com.gaunhoibom.service.INguoiDungService;

public class NguoiDungService implements INguoiDungService {

	@Inject
	private NguoiDungDAO nguoidungDAO;
	@Override
	public boolean checkAccount(NguoiDungModel a) {
		return nguoidungDAO.checkAccount(a);
	}
	@Override
	public Long addNguoiDung(NguoiDungModel a) {
		return nguoidungDAO.insertNguoi_Dung(a);
	}

}

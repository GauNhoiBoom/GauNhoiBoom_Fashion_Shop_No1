package com.gaunhoibom.service;

import com.gaunhoibom.model.NguoiDungModel;

public interface INguoiDungService {
	boolean checkAccount(NguoiDungModel a);
	Long addNguoiDung(NguoiDungModel a);
}

package com.gaunhoibom.dao;

import com.gaunhoibom.model.NguoiDungModel;

public interface INguoiDungDAO {
	boolean checkAccount(NguoiDungModel a);
	Long insertNguoi_Dung(NguoiDungModel a);
}

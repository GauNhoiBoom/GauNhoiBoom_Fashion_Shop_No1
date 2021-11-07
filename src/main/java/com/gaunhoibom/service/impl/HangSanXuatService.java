package com.gaunhoibom.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.gaunhoibom.dao.impl.HangSanXuatDAO;
import com.gaunhoibom.model.HangSanXuatModel;
import com.gaunhoibom.service.IHangSanXuatService;

public class HangSanXuatService implements IHangSanXuatService {

	@Inject
	private HangSanXuatDAO hangsanxuatdao;
	@Override
	public List<HangSanXuatModel> findAll() {
		return hangsanxuatdao.findAll();
	}

}

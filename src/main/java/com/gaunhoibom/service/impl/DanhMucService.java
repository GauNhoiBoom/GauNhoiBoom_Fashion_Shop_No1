package com.gaunhoibom.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.gaunhoibom.dao.impl.DanhMucDAO;
import com.gaunhoibom.model.DanhMucModel;
import com.gaunhoibom.service.IDanhMucService;

public class DanhMucService implements IDanhMucService {

	@Inject
	private DanhMucDAO danhmucDAO;
	
	@Override
	public List<DanhMucModel> findAll() {
		
		return danhmucDAO.findAll();
	}
	
}

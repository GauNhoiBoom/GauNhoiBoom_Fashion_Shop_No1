package com.gaunhoibom.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.gaunhoibom.dao.impl.SanPhamDAO;
import com.gaunhoibom.model.SanPhamModel;
import com.gaunhoibom.service.ISanPhamService;

public class SanPhamService implements ISanPhamService{

	@Inject
	private SanPhamDAO sanphamDAO;
	@Override
	public List<SanPhamModel> findCollectionID(Long id) {
		
		return sanphamDAO.findbyCollectionID(id);
	}
	@Override
	public List<SanPhamModel> findbyID(Long id) {
		return sanphamDAO.findbyID(id);
	}
	@Override
	public List<SanPhamModel> findAll() {
		
		return sanphamDAO.findall();
	}
	@Override
	public List<SanPhamModel> findCategoryID(Long id) {
		return sanphamDAO.findbyCategoryID(id);
	}

}

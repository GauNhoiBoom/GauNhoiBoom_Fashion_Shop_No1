package com.gaunhoibom.service;

import java.util.List;

import com.gaunhoibom.model.SanPhamModel;

public interface ISanPhamService {
	List<SanPhamModel> findCollectionID(Long id);
	List<SanPhamModel> findbyID(Long id);
	List<SanPhamModel> findAll();
	List<SanPhamModel> findCategoryID(Long id);
}

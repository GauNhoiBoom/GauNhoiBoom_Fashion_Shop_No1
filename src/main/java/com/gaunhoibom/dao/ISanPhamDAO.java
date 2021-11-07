package com.gaunhoibom.dao;

import java.util.List;

import com.gaunhoibom.model.SanPhamModel;

public interface ISanPhamDAO {
	List<SanPhamModel> findbyCollectionID(Long id);
	List<SanPhamModel> findbyCategoryID(Long id);
	List<SanPhamModel> findbyID(Long id);
	List<SanPhamModel> findall();
}

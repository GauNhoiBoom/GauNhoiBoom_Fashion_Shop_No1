package com.gaunhoibom.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gaunhoibom.dao.ISanPhamDAO;
import com.gaunhoibom.model.SanPhamModel;

public class SanPhamDAO extends AbstractDAO implements ISanPhamDAO  {
	
	
	
	
	@Override
	public List<SanPhamModel> findbyCollectionID(Long id) {
		Connection conn = null; 
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		List<SanPhamModel> list = new ArrayList<SanPhamModel>();
		String sql = "SELECT * FROM san_pham WHERE bosuutap = "+id;
		
		
		conn = getConnection();
		try {
			ptmt = conn.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				SanPhamModel a = new SanPhamModel();
				a.setId(rs.getLong("id"));
				a.setTensanpham(rs.getString("tensanpham"));
				a.setDanhmuc(rs.getLong("danhmuc"));
				a.setHangsanxuat(rs.getLong("hangsanxuat"));
				a.setBosuutap(rs.getLong("bosuutap"));
				a.setGia(rs.getFloat("gia"));
				a.setDaban(rs.getInt("daban"));
				a.setTonkho(rs.getInt("tonkho"));
				a.setMota(rs.getString("mota"));
				
				list.add(a);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(ptmt!=null) {
					ptmt.close();
				}if(rs!=null) {
					rs.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	@Override
	public List<SanPhamModel> findbyID(Long id) {
		Connection conn = null; 
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		List<SanPhamModel> list = new ArrayList<SanPhamModel>();
		String sql = "SELECT * FROM san_pham WHERE id = "+id;
		
		
		conn = getConnection();
		try {
			ptmt = conn.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				SanPhamModel a = new SanPhamModel();
				a.setId(rs.getLong("id"));
				a.setTensanpham(rs.getString("tensanpham"));
				a.setDanhmuc(rs.getLong("danhmuc"));
				a.setHangsanxuat(rs.getLong("hangsanxuat"));
				a.setBosuutap(rs.getLong("bosuutap"));
				a.setGia(rs.getFloat("gia"));
				a.setDaban(rs.getInt("daban"));
				a.setTonkho(rs.getInt("tonkho"));
				a.setMota(rs.getString("mota"));
				
				list.add(a);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(ptmt!=null) {
					ptmt.close();
				}if(rs!=null) {
					rs.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	@Override
	public List<SanPhamModel> findall() {
		Connection conn = null; 
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		List<SanPhamModel> list = new ArrayList<SanPhamModel>();
		String sql = "SELECT * FROM san_pham ";
		
		
		conn = getConnection();
		try {
			ptmt = conn.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				SanPhamModel a = new SanPhamModel();
				a.setId(rs.getLong("id"));
				a.setTensanpham(rs.getString("tensanpham"));
				a.setDanhmuc(rs.getLong("danhmuc"));
				a.setHangsanxuat(rs.getLong("hangsanxuat"));
				a.setBosuutap(rs.getLong("bosuutap"));
				a.setGia(rs.getFloat("gia"));
				a.setDaban(rs.getInt("daban"));
				a.setTonkho(rs.getInt("tonkho"));
				a.setMota(rs.getString("mota"));
				
				list.add(a);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(ptmt!=null) {
					ptmt.close();
				}if(rs!=null) {
					rs.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	@Override
	public List<SanPhamModel> findbyCategoryID(Long id) {
		Connection conn = null; 
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		List<SanPhamModel> list = new ArrayList<SanPhamModel>();
		String sql = "SELECT * FROM san_pham WHERE danhmuc = "+id;
		
		
		conn = getConnection();
		try {
			ptmt = conn.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				SanPhamModel a = new SanPhamModel();
				a.setId(rs.getLong("id"));
				a.setTensanpham(rs.getString("tensanpham"));
				a.setDanhmuc(rs.getLong("danhmuc"));
				a.setHangsanxuat(rs.getLong("hangsanxuat"));
				a.setBosuutap(rs.getLong("bosuutap"));
				a.setGia(rs.getFloat("gia"));
				a.setDaban(rs.getInt("daban"));
				a.setTonkho(rs.getInt("tonkho"));
				a.setMota(rs.getString("mota"));
				
				list.add(a);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(ptmt!=null) {
					ptmt.close();
				}if(rs!=null) {
					rs.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}

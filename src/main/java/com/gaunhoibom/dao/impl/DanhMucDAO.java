package com.gaunhoibom.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gaunhoibom.dao.IDanhMucDAO;
import com.gaunhoibom.model.DanhMucModel;

public class DanhMucDAO implements IDanhMucDAO {
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/gau_store";
			String  user ="root";
			String pass ="";
			
			return DriverManager.getConnection(url,user,pass);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	@Override
	public List<DanhMucModel> findAll() {
		Connection conn= null;
		PreparedStatement ptmt = null;
		ResultSet rs =null;
		String sql = "SELECT * FROM danh_muc";
		conn = getConnection();
		List<DanhMucModel> list = new ArrayList<DanhMucModel>();
		try {
			ptmt = conn.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				DanhMucModel a = new DanhMucModel();
				a.setId(rs.getLong("id"));
				a.setTendanhmuc(rs.getString("tendanhmuc"));
				list.add(a);
			}
			
			
		} catch (SQLException e) {
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
		
		
		return list;
	}

}

package com.gaunhoibom.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gaunhoibom.dao.IHangSanXuatDAO;
import com.gaunhoibom.model.HangSanXuatModel;

public class HangSanXuatDAO implements IHangSanXuatDAO {
	
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
	public List<HangSanXuatModel> findAll() {
		Connection conn = null;
		PreparedStatement ptmt = null; 
		ResultSet rs = null;
		String sql = "SELECT * FROM hang_san_xuat";
		List<HangSanXuatModel> list = new ArrayList<HangSanXuatModel>();
		try {
			conn = getConnection();
			ptmt = conn.prepareStatement(sql);
			rs  = ptmt.executeQuery();
			while(rs.next()) {
				HangSanXuatModel a = new HangSanXuatModel();
				a.setId(rs.getLong("id"));
				a.setTenhang(rs.getString("tenhangsanxuat"));
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

package com.gaunhoibom.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gaunhoibom.dao.INguoiDungDAO;
import com.gaunhoibom.model.NguoiDungModel;

public class NguoiDungDAO implements INguoiDungDAO{
	
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
	public boolean checkAccount(NguoiDungModel a) {
		boolean kt = false;
		Connection conn= null;
		PreparedStatement ptmt = null;
		ResultSet rs =null;
		String sql = "SELECT * FROM nguoi_dung";
		conn = getConnection();
		List<NguoiDungModel> list = new ArrayList<NguoiDungModel>();
		try {
			ptmt = conn.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				NguoiDungModel nd = new NguoiDungModel();
				nd.setId(rs.getLong("id"));
				nd.setEmail(rs.getString("email"));
				nd.setPassword(rs.getString("password"));
				nd.setHoten(rs.getString("hoten"));
				nd.setDiachi(rs.getString("diachi"));
				nd.setSodienthoai(rs.getString("sdt"));
				nd.setGioitinh(rs.getString("gioitinh"));
				nd.setVaitro(rs.getLong("vaitro"));
				list.add(nd);
			}
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getEmail().equals(a.getEmail())==true && list.get(i).getPassword().equals(a.getPassword())==true) {
					a.setSodienthoai(list.get(i).getSodienthoai());
					a.setHoten(list.get(i).getHoten());
					a.setVaitro(list.get(i).getVaitro());
					kt = true;
					break;
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
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
				e2.printStackTrace();
			}
			
		}
		return kt;
			
	}

	@Override
	public Long insertNguoi_Dung(NguoiDungModel a) {
		Connection conn= null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		Long id = null;
		String sql = "INSERT INTO nguoi_dung (email,password,hoten,diachi,sdt,vaitro,gioitinh) VALUE(?,?,?,?,?,?,?)";
		try {
			conn = getConnection();
			conn.setAutoCommit(false);
			ptmt=conn.prepareStatement(sql,ptmt.RETURN_GENERATED_KEYS);
			
			ptmt.setString(1, a.getEmail());
			ptmt.setString(2,a.getPassword());
			ptmt.setString(3, a.getHoten() );
			ptmt.setString(4,a.getDiachi() );
			ptmt.setString(5,a.getSodienthoai() );
			ptmt.setLong(6, a.getVaitro());
			ptmt.setString(7, a.getGioitinh());
			
			ptmt.executeUpdate();
			rs = ptmt.getGeneratedKeys();
			if(rs.next()) {
				id = rs.getLong(1);
			}
			conn.commit();
			return id;	
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
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
				e2.printStackTrace();
			}
			
		}
		return id;
	}


}

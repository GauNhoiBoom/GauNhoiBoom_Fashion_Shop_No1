package com.gaunhoibom.model;

public class SanPhamModel {
	private Long id;
	private String tensanpham;
	private Long danhmuc;
	private Long hangsanxuat;
	private Long bosuutap;
	public Long getBosuutap() {
		return bosuutap;
	}
	public void setBosuutap(Long bosuutap) {
		this.bosuutap = bosuutap;
	}
	private float gia;
	private int daban;
	private int tonkho;
	private String mota;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	public Long getDanhmuc() {
		return danhmuc;
	}
	public void setDanhmuc(Long danhmuc) {
		this.danhmuc = danhmuc;
	}
	public Long getHangsanxuat() {
		return hangsanxuat;
	}
	public void setHangsanxuat(Long hangsanxuat) {
		this.hangsanxuat = hangsanxuat;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	public int getDaban() {
		return daban;
	}
	public void setDaban(int daban) {
		this.daban = daban;
	}
	public int getTonkho() {
		return tonkho;
	}
	public void setTonkho(int tonkho) {
		this.tonkho = tonkho;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
}

package com.gaunhoibom.model;

import java.sql.Timestamp;

public class DonHangModel {
	private Long id;
	private Long nguoidat;
	private Long sanpham;
	private Timestamp ngaydat;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNguoidat() {
		return nguoidat;
	}
	public void setNguoidat(Long nguoidat) {
		this.nguoidat = nguoidat;
	}
	public Long getSanpham() {
		return sanpham;
	}
	public void setSanpham(Long sanpham) {
		this.sanpham = sanpham;
	}
	public Timestamp getNgaydat() {
		return ngaydat;
	}
	public void setNgaydat(Timestamp ngaydat) {
		this.ngaydat = ngaydat;
	}
}

package XML;

import java.util.Date;

public class Sinhvien {
	private String id;
	private String ten;
	private String diachi;
	private Date ngaysinh;
	

	public Sinhvien(String id, String ten, String diachi, Date ngaysinh) {
		this.id = id;
		this.ten = ten;
		this.diachi = diachi;
		this.ngaysinh = ngaysinh;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
}

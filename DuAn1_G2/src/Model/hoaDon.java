/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class hoaDon {

    private int id_hoaDon;
    private String ma;
    private double tongTien;
    private Date ngayTao;
    private boolean trangThai;
    private String ghiChu;
    private boolean hinhThucThanhToan;
    private int id_khachHang;
    private int id_NhanVien;

    public hoaDon(int id_hoaDon, String ma, double tongTien, Date ngayTao, boolean trangThai, String ghiChu, boolean hinhThucThanhToan, int id_khachHang, int id_NhanVien) {
        this.id_hoaDon = id_hoaDon;
        this.ma = ma;
        this.tongTien = tongTien;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
        this.ghiChu = ghiChu;
        this.hinhThucThanhToan = hinhThucThanhToan;
        this.id_khachHang = id_khachHang;
        this.id_NhanVien = id_NhanVien;
    }

    public hoaDon() {
    }

    public int getId_hoaDon() {
        return id_hoaDon;
    }

    public void setId_hoaDon(int id_hoaDon) {
        this.id_hoaDon = id_hoaDon;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public boolean isHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(boolean hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public int getId_khachHang() {
        return id_khachHang;
    }

    public void setId_khachHang(int id_khachHang) {
        this.id_khachHang = id_khachHang;
    }

    public int getId_NhanVien() {
        return id_NhanVien;
    }

    public void setId_NhanVien(int id_NhanVien) {
        this.id_NhanVien = id_NhanVien;
    }
    
    
   
}

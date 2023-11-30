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
public class khuyenMai {

    private int id_khuyenMaiSanPham;
    private String maKM;
    private int tiemGiam;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private boolean trangThai;

    public khuyenMai() {
    }

    public khuyenMai(int id_khuyenMaiSanPham, String maKM, int tiemGiam, Date ngayBatDau, Date ngayKetThuc, boolean trangThai) {
        this.id_khuyenMaiSanPham = id_khuyenMaiSanPham;
        this.maKM = maKM;
        this.tiemGiam = tiemGiam;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.trangThai = trangThai;
    }

    public int getId_khuyenMaiSanPham() {
        return id_khuyenMaiSanPham;
    }

    public void setId_khuyenMaiSanPham(int id_khuyenMaiSanPham) {
        this.id_khuyenMaiSanPham = id_khuyenMaiSanPham;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public int getTiemGiam() {
        return tiemGiam;
    }

    public void setTiemGiam(int tiemGiam) {
        this.tiemGiam = tiemGiam;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

  
    
}

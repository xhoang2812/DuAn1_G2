/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class khachHang {
    private int id_khachHang;
    private String ma_KH;
    private String hoTen;
    private boolean gioiTinh;
    private String sdt;
    private int DiemTichLuy;

    public khachHang() {
    }

    public khachHang(int id_khachHang, String ma_KH, String hoTen, boolean gioiTinh, String sdt, int DiemTichLuy) {
        this.id_khachHang = id_khachHang;
        this.ma_KH = ma_KH;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.DiemTichLuy = DiemTichLuy;
    }

    public int getId_khachHang() {
        return id_khachHang;
    }

    public void setId_khachHang(int id_khachHang) {
        this.id_khachHang = id_khachHang;
    }

    public String getMa_KH() {
        return ma_KH;
    }

    public void setMa_KH(String ma_KH) {
        this.ma_KH = ma_KH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getDiemTichLuy() {
        return DiemTichLuy;
    }

    public void setDiemTichLuy(int DiemTichLuy) {
        this.DiemTichLuy = DiemTichLuy;
    }
    
}

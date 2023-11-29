/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class chiTietHoaDon {

    private int id_ChiTietHoaDon;
    private int soLuong;
    private double giaSp;
    private double tongTien;
    private int id_HoaDon;
    private int id_chiTietSanPham;

    public chiTietHoaDon(int id_ChiTietHoaDon, int soLuong, double giaSp, double tongTien, int id_HoaDon, int id_chiTietSanPham) {
        this.id_ChiTietHoaDon = id_ChiTietHoaDon;
        this.soLuong = soLuong;
        this.giaSp = giaSp;
        this.tongTien = tongTien;
        this.id_HoaDon = id_HoaDon;
        this.id_chiTietSanPham = id_chiTietSanPham;
    }

    public chiTietHoaDon() {
    }

    public int getId_ChiTietHoaDon() {
        return id_ChiTietHoaDon;
    }

    public void setId_ChiTietHoaDon(int id_ChiTietHoaDon) {
        this.id_ChiTietHoaDon = id_ChiTietHoaDon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaSp() {
        return giaSp;
    }

    public void setGiaSp(double giaSp) {
        this.giaSp = giaSp;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public int getId_HoaDon() {
        return id_HoaDon;
    }

    public void setId_HoaDon(int id_HoaDon) {
        this.id_HoaDon = id_HoaDon;
    }

    public int getId_chiTietSanPham() {
        return id_chiTietSanPham;
    }

    public void setId_chiTietSanPham(int id_chiTietSanPham) {
        this.id_chiTietSanPham = id_chiTietSanPham;
    }

}

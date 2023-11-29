/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class sanPham {

    private int id_sanPham;
    private String ma;
    private String ten;
    private double gia;
    private String moTa;
    private boolean trangThai;
    private String image;
    private int id_LoaiSP;
    private int id_KhuyenMai;
    private int id_Topping;
    private int id_Size;

    public sanPham() {
    }

    public sanPham(int id_sanPham, String ma, String ten, double gia, String moTa, boolean trangThai, String image, int id_LoaiSP, int id_KhuyenMai, int id_Topping, int id_Size) {
        this.id_sanPham = id_sanPham;
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.moTa = moTa;
        this.trangThai = trangThai;
        this.image = image;
        this.id_LoaiSP = id_LoaiSP;
        this.id_KhuyenMai = id_KhuyenMai;
        this.id_Topping = id_Topping;
        this.id_Size = id_Size;
    }

    public int getId_sanPham() {
        return id_sanPham;
    }

    public void setId_sanPham(int id_sanPham) {
        this.id_sanPham = id_sanPham;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId_LoaiSP() {
        return id_LoaiSP;
    }

    public void setId_LoaiSP(int id_LoaiSP) {
        this.id_LoaiSP = id_LoaiSP;
    }

    public int getId_KhuyenMai() {
        return id_KhuyenMai;
    }

    public void setId_KhuyenMai(int id_KhuyenMai) {
        this.id_KhuyenMai = id_KhuyenMai;
    }

    public int getId_Topping() {
        return id_Topping;
    }

    public void setId_Topping(int id_Topping) {
        this.id_Topping = id_Topping;
    }

    public int getId_Size() {
        return id_Size;
    }

    public void setId_Size(int id_Size) {
        this.id_Size = id_Size;
    }
    
    
}

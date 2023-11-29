/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class LoaiSanPham {
    private int id_LoaiSP;
    private String maLoaiSP;
    private String tenLoaiSP;

    public LoaiSanPham() {
    }

    public LoaiSanPham(int id_LoaiSP, String maLoaiSP, String tenLoaiSP) {
        this.id_LoaiSP = id_LoaiSP;
        this.maLoaiSP = maLoaiSP;
        this.tenLoaiSP = tenLoaiSP;
    }

    public int getId_LoaiSP() {
        return id_LoaiSP;
    }

    public void setId_LoaiSP(int id_LoaiSP) {
        this.id_LoaiSP = id_LoaiSP;
    }

    public String getMaLoaiSP() {
        return maLoaiSP;
    }

    public void setMaLoaiSP(String maLoaiSP) {
        this.maLoaiSP = maLoaiSP;
    }

    public String getTenLoaiSP() {
        return tenLoaiSP;
    }

    public void setTenLoaiSP(String tenLoaiSP) {
        this.tenLoaiSP = tenLoaiSP;
    }
    
}

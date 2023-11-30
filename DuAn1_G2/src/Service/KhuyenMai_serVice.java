/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author ADMIN
 */
import repository.DBConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Model.khuyenMai;

public class KhuyenMai_serVice {

    public List<khuyenMai> getAll() {
        ArrayList<khuyenMai> list = new ArrayList<>();
        try {
            String sql = "select*from KhuyenMaiSanPham";
            Connection cn = DBConnect.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                khuyenMai km = new khuyenMai();
                km.setId_khuyenMaiSanPham(rs.getInt(1));
                km.setMaKM(rs.getString(2));
                km.setTiemGiam(rs.getInt(3));
                km.setNgayBatDau(rs.getDate(4));
                km.setNgayKetThuc(rs.getDate(5));
                km.setTrangThai(rs.getBoolean(6));
                list.add(km);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public Integer addKM(khuyenMai km) {
        Integer row = null;
        try {
            String sql = "insert into KhuyenMaiSanPham(MaKhuyenMaiSanPham,TiemGiam,NgayBatDau,NgayKetThuc,TrangThai)\n"
                    + "values (?,?,?,?,?)";
            Connection cn = DBConnect.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, km.getMaKM());
            ps.setInt(2, km.getTiemGiam());
            ps.setDate(3, (Date) km.getNgayBatDau());
            ps.setDate(4, (Date) km.getNgayKetThuc());

            ps.setBoolean(5, km.isTrangThai());
            return ps.executeUpdate();
        } catch (Exception e) {

        }
        return row;

    }

    public Integer updateKM(khuyenMai km) {
        Integer row = null;
        String sql = "update KhuyenMaiSanPham\n"
                + "set TiemGiam =?, NgayBatDau=?, NgayKetThuc=?, TrangThai=?\n"
                + "where MaKhuyenMaiSanPham like ?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, km.getTiemGiam());
            ps.setDate(2, (Date) km.getNgayBatDau());
            ps.setDate(3, (Date)km.getNgayKetThuc());
            ps.setBoolean(4, km.isTrangThai());
            ps.setString(5, km.getMaKM());
            return ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return row;

    }
    
    public  Integer deleteKM(String maKM){
        Integer row = null;
        String sql = "delete from KhuyenMaiSanPham\n" +
"where MaKhuyenMaiSanPham like ?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, maKM);
            row = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
        
    }

}

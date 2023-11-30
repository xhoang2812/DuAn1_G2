/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Interface.DAO;
import repository.DBConnect;
import java.util.List;
import Model.nhanVien;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class nhanVien_Service implements DAO<nhanVien, String> {

    @Override
    public List<nhanVien> getAll() {
        ArrayList<nhanVien> list = new ArrayList<>();
        try {
            String sql = "select * from NhanVien";
            Connection cn = DBConnect.getConnection();
            PreparedStatement pms = cn.prepareStatement(sql);
            ResultSet rs = pms.executeQuery();
            while (rs.next()) {
                nhanVien n = new nhanVien();
                n.setId_NhanVien(rs.getInt(1));
                n.setMaNV(rs.getString(2));
                n.setHoTen(rs.getString(3));
                n.setNgaySinh(rs.getDate(4));
                n.setDiaChi(rs.getString(5));
                n.setCCCD(rs.getString(6));
                n.setGioiTinh(rs.getBoolean(7));
                n.setTrangThai(rs.getBoolean(8));
                n.setEmail(rs.getString(9));
                n.setSdt(rs.getString(10));
                n.setImageNV(rs.getString(11));
                n.setTenDangNhap(rs.getString(12));
                n.setMatKhau(rs.getString(13));
                n.setVaiTro(rs.getBoolean(14));
                list.add(n);
            }
        } catch (Exception e) {
            System.out.println("Lỗi getAll nhân viên");
        }
        return list;
    }

    @Override
    public Integer add(nhanVien tt) {
        Integer row = null;
        try {
            String sql = "insert into nhanVien(MaNhanVien, HoTen, NgaySinh, DiaChi,CCCD, GioiTinh, TrangThai, Email, SoDienThoai, TenDangNhap, MatKhau, VaiTro)\n"
                    + "			values(?,?,?,?,?,?,?,?,?,?,?,?)";
            Connection cn = DBConnect.getConnection();
            PreparedStatement pms = cn.prepareStatement(sql);
            pms.setObject(1, tt.getMaNV());
            pms.setObject(2, tt.getHoTen());
            pms.setObject(3, (Date) tt.getNgaySinh());
            pms.setObject(4, tt.getDiaChi());
            pms.setObject(5, tt.getCCCD());
            pms.setObject(6, tt.isGioiTinh());
            pms.setObject(7, tt.isTrangThai());
            pms.setObject(8, tt.getEmail());
            pms.setObject(9, tt.getSdt());
            pms.setObject(10, tt.getTenDangNhap());
            pms.setObject(11, tt.getMatKhau());
            pms.setObject(12, tt.isVaiTro());
            row = pms.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }

    @Override
    public Integer update(nhanVien tt) {
        Integer row = null;
        try {
            String sql = "update NhanVien\n"
                    + "set MaNhanVien = ?, HoTen = ?,  NgaySinh = ?, DiaChi = ?, CCCD = ?, GioiTinh = ?, TrangThai =?, Email = ?, SoDienThoai = ?, TenDangNhap = ?, MatKhau = ?, VaiTro = ?\n"
                    + "where id_NhanVien like ?";
            Connection cn = DBConnect.getConnection();
            PreparedStatement pms = cn.prepareStatement(sql);
            pms.setObject(1, tt.getMaNV());
            pms.setObject(2, tt.getHoTen());
            pms.setObject(3, (Date) tt.getNgaySinh());
            pms.setObject(4, tt.getDiaChi());
            pms.setObject(5, tt.getCCCD());
            pms.setObject(6, tt.isGioiTinh());
            pms.setObject(7, tt.isTrangThai());
            pms.setObject(8, tt.getEmail());
            pms.setObject(9, tt.getSdt());
            pms.setObject(10, tt.getTenDangNhap());
            pms.setObject(11, tt.getMatKhau());
            pms.setObject(12, tt.isVaiTro());
            pms.setObject(13, tt.getId_NhanVien());
            row = pms.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }

    @Override
    public Integer xoa(String ma) {
        Integer row = null;
        try {
            String sql = "delete NhanVien\n"
                    + "where MaNhanVien like ?";
            Connection cn = DBConnect.getConnection();
            PreparedStatement pms = cn.prepareStatement(sql);
            pms.setString(1, ma);
            row = pms.executeUpdate();
        } catch (Exception e) {
            System.out.println("Lối xóa service");
        }
        return row;
    }

    @Override
    public List<nhanVien> timKemTheoID(String ma) {
        ArrayList<nhanVien> listTK = new ArrayList<>();
        try {
            String sql = "select * from NhanVien\n"
                    + "where MaNhanVien like ?";
            Connection cn = DBConnect.getConnection();
            PreparedStatement pms = cn.prepareStatement(sql);
            pms.setString(1, ma);
            ResultSet rs = pms.executeQuery();
            while (rs.next()) {
                nhanVien n = new nhanVien();
                n.setId_NhanVien(rs.getInt(1));
                n.setMaNV(rs.getString(2));
                n.setHoTen(rs.getString(3));
                n.setNgaySinh(rs.getDate(4));
                n.setDiaChi(rs.getString(5));
                n.setCCCD(rs.getString(6));
                n.setGioiTinh(rs.getBoolean(7));
                n.setTrangThai(rs.getBoolean(8));
                n.setEmail(rs.getString(9));
                n.setSdt(rs.getString(10));
                n.setImageNV(rs.getString(11));
                n.setTenDangNhap(rs.getString(12));
                n.setMatKhau(rs.getString(13));
                n.setVaiTro(rs.getBoolean(14));
                listTK.add(n);
            }
        } catch (Exception e) {
            System.out.println("Lỗi getAll tìm kiếm nhân viên");
        }
        return listTK;
    }

    public nhanVien selected_by_ma(String ma) {

        try {
            String sql = "select * from NhanVien\n"
                    + "where tenDangNhap like ?";
            Connection cn = DBConnect.getConnection();
            PreparedStatement pms = cn.prepareStatement(sql);
            pms.setString(1, ma);
            ResultSet rs = pms.executeQuery();
            while (rs.next()) {
                nhanVien n = new nhanVien();
                n.setId_NhanVien(rs.getInt(1));
                n.setMaNV(rs.getString(2));
                n.setHoTen(rs.getString(3));
                n.setNgaySinh(rs.getDate(4));
                n.setDiaChi(rs.getString(5));
                n.setCCCD(rs.getString(6));
                n.setGioiTinh(rs.getBoolean(7));
                n.setTrangThai(rs.getBoolean(8));
                n.setEmail(rs.getString(9));
                n.setSdt(rs.getString(10));
                n.setImageNV(rs.getString(11));
                n.setTenDangNhap(rs.getString(12));
                n.setMatKhau(rs.getString(13));
                n.setVaiTro(rs.getBoolean(14));
                return n;
            }
        } catch (Exception e) {
            System.out.println("selected by id");
        }
        return null;
    }

}

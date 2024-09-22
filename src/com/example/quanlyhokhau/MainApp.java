/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.quanlyhokhau;

import com.example.quanlyhokhau.dao.HoKhauDAO;
import com.example.quanlyhokhau.dao.NhanKhauDAO;
import com.example.quanlyhokhau.dao.TamTruTamVangDAO;
import com.example.quanlyhokhau.dao.QuanLyHoatDongDAO;
import com.example.quanlyhokhau.dao.ThuPhiDichVuDAO;
import com.example.quanlyhokhau.dao.QuanLyBienDongDanCuDAO;
import com.example.quanlyhokhau.models.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainApp {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/quanly"; // Thay bằng tên cơ sở dữ liệu của bạn
        var user = "root"; // Tài khoản MySQL của bạn
        var password = ""; // Mật khẩu MySQL của bạn (nếu có)

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Kết nối MySQL thành công");
            System.out.println("Cơ sở dữ liệu đang kết nối: " + conn.getCatalog());

            // Truy vấn bảng HoKhau
            String sqlHoKhau = "SELECT * FROM HoKhau";
            PreparedStatement prHoKhau = conn.prepareStatement(sqlHoKhau);
            ResultSet rsHoKhau = prHoKhau.executeQuery();
            System.out.println("=== Dữ liệu bảng HoKhau ===");
            while (rsHoKhau.next()) {
                System.out.print(rsHoKhau.getInt("ID_HoKhau") + "-");
                System.out.print(rsHoKhau.getString("SoHoKhau") + "-");
                System.out.print(rsHoKhau.getString("HoTenChuHo") + "-");
                System.out.print(rsHoKhau.getString("DiaChi") + "-");
                System.out.print(rsHoKhau.getDate("NgayCapHoKhau") + "\n");
            }

            // Truy vấn bảng NhanKhau
            String sqlNhanKhau = "SELECT * FROM NhanKhau";
            PreparedStatement prNhanKhau = conn.prepareStatement(sqlNhanKhau);
            ResultSet rsNhanKhau = prNhanKhau.executeQuery();
            System.out.println("=== Dữ liệu bảng NhanKhau ===");
            while (rsNhanKhau.next()) {
                System.out.print(rsNhanKhau.getInt("ID_NhanKhau") + "-");
                System.out.print(rsNhanKhau.getString("HoTen") + "-");
                System.out.print(rsNhanKhau.getDate("NgaySinh") + "-");
                System.out.print(rsNhanKhau.getString("NoiSinh") + "-");
                System.out.print(rsNhanKhau.getDate("NgayDangKyThuongTru") + "-");
                System.out.print(rsNhanKhau.getString("SoCMND_CCCD") + "-");
                System.out.print(rsNhanKhau.getString("NgheNghiep") + "-");
                System.out.print(rsNhanKhau.getString("QuanHeVoiChuHo") + "\n");
            }

            // Truy vấn bảng TamTruTamVang
            String sqlTamTruTamVang = "SELECT * FROM TamTruTamVang";
            PreparedStatement prTamTruTamVang = conn.prepareStatement(sqlTamTruTamVang);
            ResultSet rsTamTruTamVang = prTamTruTamVang.executeQuery();
            System.out.println("=== Dữ liệu bảng TamTruTamVang ===");
            while (rsTamTruTamVang.next()) {
                System.out.print(rsTamTruTamVang.getInt("ID_TamTruTamVang") + "-");
                System.out.print(rsTamTruTamVang.getString("Loai") + "-");
                System.out.print(rsTamTruTamVang.getDate("NgayBatDau") + "-");
                System.out.print(rsTamTruTamVang.getDate("NgayKetThuc") + "-");
                System.out.print(rsTamTruTamVang.getString("NoiDen_NoDi") + "\n");
            }

            // Truy vấn bảng QuanLyHoatDong
            String sqlQuanLyHoatDong = "SELECT * FROM QuanLyHoatDong";
            PreparedStatement prQuanLyHoatDong = conn.prepareStatement(sqlQuanLyHoatDong);
            ResultSet rsQuanLyHoatDong = prQuanLyHoatDong.executeQuery();
            System.out.println("=== Dữ liệu bảng QuanLyHoatDong ===");
            while (rsQuanLyHoatDong.next()) {
                System.out.print(rsQuanLyHoatDong.getInt("ID_HoatDong") + "-");
                System.out.print(rsQuanLyHoatDong.getString("TenSuKien") + "-");
                System.out.print(rsQuanLyHoatDong.getTimestamp("ThoiGian") + "-");
                System.out.print(rsQuanLyHoatDong.getString("DiaDiem") + "-");
                System.out.print(rsQuanLyHoatDong.getString("NoiDung") + "\n");
            }

            // Truy vấn bảng ThuPhiDichVu
            String sqlThuPhiDichVu = "SELECT * FROM ThuPhiDichVu";
            PreparedStatement prThuPhiDichVu = conn.prepareStatement(sqlThuPhiDichVu);
            ResultSet rsThuPhiDichVu = prThuPhiDichVu.executeQuery();
            System.out.println("=== Dữ liệu bảng ThuPhiDichVu ===");
            while (rsThuPhiDichVu.next()) {
                System.out.print(rsThuPhiDichVu.getInt("ID_HoKhau") + "-");
                System.out.print(rsThuPhiDichVu.getInt("Thang") + "-");
                System.out.print(rsThuPhiDichVu.getDouble("PhiQuanLy") + "-");
                System.out.print(rsThuPhiDichVu.getDouble("PhiDien") + "-");
                System.out.print(rsThuPhiDichVu.getDouble("PhiNuoc") + "-");
                System.out.print(rsThuPhiDichVu.getDouble("PhiVeSinh") + "-");
                System.out.print(rsThuPhiDichVu.getDouble("TongCong") + "-");
                System.out.print(rsThuPhiDichVu.getString("TrangThai") + "\n");
            }

            // Truy vấn bảng QuanLyBienDongDanCu
            String sqlQuanLyBienDongDanCu = "SELECT * FROM QuanLyBienDongDanCu";
            PreparedStatement prQuanLyBienDongDanCu = conn.prepareStatement(sqlQuanLyBienDongDanCu);
            ResultSet rsQuanLyBienDongDanCu = prQuanLyBienDongDanCu.executeQuery();
            System.out.println("=== Dữ liệu bảng QuanLyBienDongDanCu ===");
            while (rsQuanLyBienDongDanCu.next()) {
                System.out.print(rsQuanLyBienDongDanCu.getInt("ID_BienDong") + "-");
                System.out.print(rsQuanLyBienDongDanCu.getInt("ID_NhanKhau") + "-");
                System.out.print(rsQuanLyBienDongDanCu.getString("LoaiBienDong") + "-");
                System.out.print(rsQuanLyBienDongDanCu.getDate("NgayBienDong") + "-");
                System.out.print(rsQuanLyBienDongDanCu.getString("GhiChu") + "\n");
            }

        } catch (SQLException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

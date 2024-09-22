/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.quanlyhokhau.dao;

import com.example.quanlyhokhau.DatabaseConnection;
import com.example.quanlyhokhau.models.NhanKhau;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NhanKhauDAO {
    public List<NhanKhau> getAllNhanKhau() {
        List<NhanKhau> nhanKhauList = new ArrayList<>();
        String query = "SELECT * FROM NhanKhau";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                NhanKhau nhanKhau = new NhanKhau(
                        resultSet.getInt("ID_NhanKhau"),
                        resultSet.getString("HoTen"),
                        resultSet.getDate("NgaySinh"),
                        resultSet.getString("NoiSinh"),
                        resultSet.getDate("NgayDangKyThuongTru"),
                        resultSet.getString("SoCMND_CCCD"),
                        resultSet.getDate("NgayCapCMND_CCCD"),
                        resultSet.getString("NoiCapCMND_CCCD"),
                        resultSet.getString("NgheNghiep"),
                        resultSet.getString("QuanHeVoiChuHo"),
                        resultSet.getInt("ID_HoKhau")
                );
                nhanKhauList.add(nhanKhau);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nhanKhauList;
    }

    public void addNhanKhau(NhanKhau nhanKhau) {
        String query = "INSERT INTO NhanKhau (HoTen, NgaySinh, NoiSinh, NgayDangKyThuongTru, SoCMND_CCCD, NgayCapCMND_CCCD, NoiCapCMND_CCCD, NgheNghiep, QuanHeVoiChuHo, ID_HoKhau) VALUES (Nguyen Thi A, 1980-05-20, Ha Noi, 2024-01-15, 123456789, 2024-01-10, HaNoi, GiaoVien, Vo, 1)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, nhanKhau.getHoTen());
            preparedStatement.setDate(2, new java.sql.Date(nhanKhau.getNgaySinh().getTime()));
            preparedStatement.setString(3, nhanKhau.getNoiSinh());
            preparedStatement.setDate(4, new java.sql.Date(nhanKhau.getNgayDangKyThuongTru().getTime()));
            preparedStatement.setString(5, nhanKhau.getSoCMND_CCCD());
            preparedStatement.setDate(6, new java.sql.Date(nhanKhau.getNgayCapCMND_CCCD().getTime()));
            preparedStatement.setString(7, nhanKhau.getNoiCapCMND_CCCD());
            preparedStatement.setString(8, nhanKhau.getNgheNghiep());
             preparedStatement.setString(9, nhanKhau.getQuanHeVoiChuHo());
            preparedStatement.setInt(10, nhanKhau.getIdHoKhau());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Các phương thức khác như update, delete...
}

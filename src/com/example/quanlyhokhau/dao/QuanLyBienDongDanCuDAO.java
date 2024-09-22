/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.quanlyhokhau.dao;

import com.example.quanlyhokhau.models.QuanLyBienDongDanCu;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuanLyBienDongDanCuDAO {
    private Connection connection;

    // Constructor nhận vào Connection
    public QuanLyBienDongDanCuDAO(Connection connection) {
        this.connection = connection;
    }

    // Phương thức thêm mới biến động dân cư
    public boolean addBienDongDanCu(QuanLyBienDongDanCu bienDongDanCu) {
        String sql = "INSERT INTO QuanLyBienDongDanCu (ID_NhanKhau, LoaiBienDong, NgayBienDong, GhiChu) " +
                     "VALUES (1, sinh con, 2024-01-15, gia dinh sinh con dau long)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, bienDongDanCu.getIdNhanKhau());
            preparedStatement.setString(2, bienDongDanCu.getLoaiBienDong());
            preparedStatement.setDate(3, new java.sql.Date(bienDongDanCu.getNgayBienDong().getTime()));
            preparedStatement.setString(4, bienDongDanCu.getGhiChu());

            int rowsInserted = preparedStatement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức cập nhật biến động dân cư
    public boolean updateBienDongDanCu(QuanLyBienDongDanCu bienDongDanCu) {
        String sql = "UPDATE QuanLyBienDongDanCu SET LoaiBienDong = ?, NgayBienDong = ?, GhiChu = ? " +
                     "WHERE ID_BienDong = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, bienDongDanCu.getLoaiBienDong());
            preparedStatement.setDate(2, new java.sql.Date(bienDongDanCu.getNgayBienDong().getTime()));
            preparedStatement.setString(3, bienDongDanCu.getGhiChu());
            preparedStatement.setInt(4, bienDongDanCu.getIdBienDong());

            int rowsUpdated = preparedStatement.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức xóa biến động dân cư
    public boolean deleteBienDongDanCu(int idBienDong) {
        String sql = "DELETE FROM QuanLyBienDongDanCu WHERE ID_BienDong = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, idBienDong);

            int rowsDeleted = preparedStatement.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức lấy tất cả biến động dân cư của một nhân khẩu
    public List<QuanLyBienDongDanCu> getAllByNhanKhau(int idNhanKhau) {
        List<QuanLyBienDongDanCu> bienDongList = new ArrayList<>();
        String sql = "SELECT * FROM QuanLyBienDongDanCu WHERE ID_NhanKhau = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, idNhanKhau);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    QuanLyBienDongDanCu bienDong = new QuanLyBienDongDanCu();
                    bienDong.setIdBienDong(resultSet.getInt("ID_BienDong"));
                    bienDong.setIdNhanKhau(resultSet.getInt("ID_NhanKhau"));
                    bienDong.setLoaiBienDong(resultSet.getString("LoaiBienDong"));
                    bienDong.setNgayBienDong(resultSet.getDate("NgayBienDong"));
                    bienDong.setGhiChu(resultSet.getString("GhiChu"));

                    bienDongList.add(bienDong);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return bienDongList;
    }

    // Phương thức lấy thông tin biến động dân cư theo ID
    public QuanLyBienDongDanCu getById(int idBienDong) {
        QuanLyBienDongDanCu bienDong = null;
        String sql = "SELECT * FROM QuanLyBienDongDanCu WHERE ID_BienDong = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, idBienDong);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    bienDong = new QuanLyBienDongDanCu();
                    bienDong.setIdBienDong(resultSet.getInt("ID_BienDong"));
                    bienDong.setIdNhanKhau(resultSet.getInt("ID_NhanKhau"));
                    bienDong.setLoaiBienDong(resultSet.getString("LoaiBienDong"));
                    bienDong.setNgayBienDong(resultSet.getDate("NgayBienDong"));
                    bienDong.setGhiChu(resultSet.getString("GhiChu"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return bienDong;
    }
}

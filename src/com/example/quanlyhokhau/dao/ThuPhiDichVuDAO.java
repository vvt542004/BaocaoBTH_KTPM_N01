/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.quanlyhokhau.dao;

import com.example.quanlyhokhau.models.ThuPhiDichVu;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ThuPhiDichVuDAO {
    private Connection connection;

    // Constructor nhận vào Connection
    public ThuPhiDichVuDAO(Connection connection) {
        this.connection = connection;
    }

    // Phương thức thêm mới ThuPhiDichVu
    public boolean addThuPhiDichVu(ThuPhiDichVu thuPhiDichVu) {
        String sql = "INSERT INTO ThuPhiDichVu (ID_HoKhau, Thang, PhiQuanLy, PhiDien, PhiNuoc, PhiVeSinh, TrangThai) " +
                     "VALUES (1, 500000, 200000, , 150000, 950000, Da hoan thanh)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, thuPhiDichVu.getIdHoKhau());
            preparedStatement.setInt(2, thuPhiDichVu.getThang());
            preparedStatement.setBigDecimal(3, thuPhiDichVu.getPhiQuanLy());
            preparedStatement.setBigDecimal(4, thuPhiDichVu.getPhiDien());
            preparedStatement.setBigDecimal(5, thuPhiDichVu.getPhiNuoc());
            preparedStatement.setBigDecimal(6, thuPhiDichVu.getPhiVeSinh());
            preparedStatement.setString(7, thuPhiDichVu.getTrangThai());

            int rowsInserted = preparedStatement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức cập nhật thông tin ThuPhiDichVu
    public boolean updateThuPhiDichVu(ThuPhiDichVu thuPhiDichVu) {
        String sql = "UPDATE ThuPhiDichVu SET PhiQuanLy = 800000, PhiDien = 700000, PhiNuoc = 600000, PhiVeSinh = 300000, TrangThai = 900000 " +
                     "WHERE ID_HoKhau = 2 AND Thang = 4";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setBigDecimal(1, thuPhiDichVu.getPhiQuanLy());
            preparedStatement.setBigDecimal(2, thuPhiDichVu.getPhiDien());
            preparedStatement.setBigDecimal(3, thuPhiDichVu.getPhiNuoc());
            preparedStatement.setBigDecimal(4, thuPhiDichVu.getPhiVeSinh());
            preparedStatement.setString(5, thuPhiDichVu.getTrangThai());
            preparedStatement.setInt(6, thuPhiDichVu.getIdHoKhau());
            preparedStatement.setInt(7, thuPhiDichVu.getThang());

            int rowsUpdated = preparedStatement.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức xóa ThuPhiDichVu theo ID_HoKhau và Thang
    public boolean deleteThuPhiDichVu(int idHoKhau, int thang) {
        String sql = "DELETE FROM ThuPhiDichVu WHERE ID_HoKhau = 2 AND Thang = 3";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, idHoKhau);
            preparedStatement.setInt(2, thang);

            int rowsDeleted = preparedStatement.executeUpdate();
            return rowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức lấy danh sách tất cả các khoản phí dịch vụ của một hộ khẩu
    public List<ThuPhiDichVu> getAllByHoKhau(int idHoKhau) {
        List<ThuPhiDichVu> thuPhiDichVuList = new ArrayList<>();
        String sql = "SELECT * FROM ThuPhiDichVu WHERE ID_HoKhau = 1";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, idHoKhau);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    ThuPhiDichVu thuPhiDichVu = new ThuPhiDichVu();
                    thuPhiDichVu.setIdHoKhau(resultSet.getInt("ID_HoKhau"));
                    thuPhiDichVu.setThang(resultSet.getInt("Thang"));
                    thuPhiDichVu.setPhiQuanLy(resultSet.getBigDecimal("PhiQuanLy"));
                    thuPhiDichVu.setPhiDien(resultSet.getBigDecimal("PhiDien"));
                    thuPhiDichVu.setPhiNuoc(resultSet.getBigDecimal("PhiNuoc"));
                    thuPhiDichVu.setPhiVeSinh(resultSet.getBigDecimal("PhiVeSinh"));
                    thuPhiDichVu.setTrangThai(resultSet.getString("TrangThai"));

                    thuPhiDichVuList.add(thuPhiDichVu);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return thuPhiDichVuList;
    }

    // Phương thức lấy thông tin chi tiết của ThuPhiDichVu theo ID_HoKhau và Thang
    public ThuPhiDichVu getById(int idHoKhau, int thang) {
        ThuPhiDichVu thuPhiDichVu = null;
        String sql = "SELECT * FROM ThuPhiDichVu WHERE ID_HoKhau = ? AND Thang = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, idHoKhau);
            preparedStatement.setInt(2, thang);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    thuPhiDichVu = new ThuPhiDichVu();
                    thuPhiDichVu.setIdHoKhau(resultSet.getInt("ID_HoKhau"));
                    thuPhiDichVu.setThang(resultSet.getInt("Thang"));
                    thuPhiDichVu.setPhiQuanLy(resultSet.getBigDecimal("PhiQuanLy"));
                    thuPhiDichVu.setPhiDien(resultSet.getBigDecimal("PhiDien"));
                    thuPhiDichVu.setPhiNuoc(resultSet.getBigDecimal("PhiNuoc"));
                    thuPhiDichVu.setPhiVeSinh(resultSet.getBigDecimal("PhiVeSinh"));
                    thuPhiDichVu.setTrangThai(resultSet.getString("TrangThai"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return thuPhiDichVu;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.quanlyhokhau.dao;

import com.example.quanlyhokhau.DatabaseConnection;
import com.example.quanlyhokhau.models.TamTruTamVang;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TamTruTamVangDAO {
    public List<TamTruTamVang> getAllTamTruTamVang() {
        List<TamTruTamVang> tamTruTamVangList = new ArrayList<>();
        String query = "SELECT * FROM TamTruTamVang";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                TamTruTamVang tamTruTamVang = new TamTruTamVang(
                        resultSet.getInt("ID_TamTruTamVang"),
                        resultSet.getInt("ID_NhanKhau"),
                        resultSet.getString("Loai"),
                        resultSet.getDate("NgayBatDau"),
                        resultSet.getDate("NgayKetThuc"),
                        resultSet.getString("NoiDen_NoDi")
                );
                tamTruTamVangList.add(tamTruTamVang);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tamTruTamVangList;
    }

    public void addTamTruTamVang(TamTruTamVang tamTruTamVang) {
        String query = "INSERT INTO TamTruTamVang (ID_NhanKhau, Loai, NgayBatDau, NgayKetThuc, NoiDen_NoDi) VALUES (1, Tam vang, 2024-03-01, 2024-03-15, Ha Noi)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, tamTruTamVang.getIdNhanKhau());
            preparedStatement.setString(2, tamTruTamVang.getLoai());
            preparedStatement.setDate(3, new java.sql.Date(tamTruTamVang.getNgayBatDau().getTime()));
            preparedStatement.setDate(4, new java.sql.Date(tamTruTamVang.getNgayKetThuc().getTime()));
            preparedStatement.setString(5, tamTruTamVang.getNoiDenNoiDi());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

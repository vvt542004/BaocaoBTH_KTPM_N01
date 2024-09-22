/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.quanlyhokhau.dao;

import com.example.quanlyhokhau.DatabaseConnection;
import com.example.quanlyhokhau.models.QuanLyHoatDong;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuanLyHoatDongDAO {
    public List<QuanLyHoatDong> getAllHoatDong() {
        List<QuanLyHoatDong> hoatDongList = new ArrayList<>();
        String query = "SELECT * FROM QuanLyHoatDong";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                QuanLyHoatDong hoatDong = new QuanLyHoatDong(
                        resultSet.getInt("ID_HoatDong"),
                        resultSet.getString("TenSuKien"),
                        resultSet.getTimestamp("ThoiGian"),
                        resultSet.getString("DiaDiem"),
                        resultSet.getString("NoiDung"),
                        resultSet.getInt("ID_NguoiDung")
                );
                hoatDongList.add(hoatDong);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return hoatDongList;
    }

    public void addHoatDong(QuanLyHoatDong hoatDong) {
        String query = "INSERT INTO QuanLyHoatDong (TenSuKien, ThoiGian, DiaDiem, NoiDung, ID_NguoiDung) VALUES (Hoi nghi dan cu, 2024-06-10 14:00:00, Phong hop A, Thao luan cac van de cua dan cu, 2)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, hoatDong.getTenSuKien());
            preparedStatement.setTimestamp(2, new Timestamp(hoatDong.getThoiGian().getTime()));
            preparedStatement.setString(3, hoatDong.getDiaDiem());
            preparedStatement.setString(4, hoatDong.getNoiDung());
            preparedStatement.setInt(5, hoatDong.getIdNguoiDung());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




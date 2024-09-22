/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.quanlyhokhau.dao;

import com.example.quanlyhokhau.DatabaseConnection;
import com.example.quanlyhokhau.models.HoKhau;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HoKhauDAO {
    public List<HoKhau> getAllHoKhau() {
        List<HoKhau> hoKhauList = new ArrayList<>();
        String query = "SELECT * FROM HoKhau";

         try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                HoKhau hoKhau = new HoKhau(
                        resultSet.getInt("ID_HoKhau"),
                        resultSet.getString("SoHoKhau"),
                        resultSet.getString("HoTenChuHo"),
                        resultSet.getString("DiaChi"),
                        resultSet.getDate("NgayCapHoKhau")
                );
                hoKhauList.add(hoKhau);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return hoKhauList;
    }

    public void addHoKhau(HoKhau hoKhau) {
        String query = "INSERT INTO HoKhau (SoHoKhau, HoTenChuHo, DiaChi, NgayCapHoKhau) VALUES (001, Nguyen Van B, so 13 duong ABD phuong 1 quan 2, 2024-05-19 )";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, hoKhau.getSoHoKhau());
            preparedStatement.setString(2, hoKhau.getHoTenChuHo());
            preparedStatement.setString(3, hoKhau.getDiaChi());
            preparedStatement.setDate(4, new java.sql.Date(hoKhau.getNgayCapHoKhau().getTime()));

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Các phương thức khác như update, delete...
}


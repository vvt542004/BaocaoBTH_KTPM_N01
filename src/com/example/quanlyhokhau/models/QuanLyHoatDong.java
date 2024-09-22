/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.quanlyhokhau.models;

import java.sql.Timestamp;

public class QuanLyHoatDong {
    private int idHoatDong;
    private String tenSuKien;
    private Timestamp thoiGian;
    private String diaDiem;
    private String noiDung;
    private int idNguoiDung;

    // Constructor không tham số
    public QuanLyHoatDong() {
    }

    // Constructor có tham số
    public QuanLyHoatDong(int idHoatDong, String tenSuKien, Timestamp thoiGian, String diaDiem, String noiDung, int idNguoiDung) {
        this.idHoatDong = idHoatDong;
        this.tenSuKien = tenSuKien;
        this.thoiGian = thoiGian;
        this.diaDiem = diaDiem;
        this.noiDung = noiDung;
        this.idNguoiDung = idNguoiDung;
    }

    // Getter và Setter cho các thuộc tính

    public int getIdHoatDong() {
        return idHoatDong;
    }

    public void setIdHoatDong(int idHoatDong) {
        this.idHoatDong = idHoatDong;
    }

    public String getTenSuKien() {
        return tenSuKien;
    }

    public void setTenSuKien(String tenSuKien) {
        this.tenSuKien = tenSuKien;
    }

    public Timestamp getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Timestamp thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public int getIdNguoiDung() {
        return idNguoiDung;
    }

    public void setIdNguoiDung(int idNguoiDung) {
        this.idNguoiDung = idNguoiDung;
    }
}


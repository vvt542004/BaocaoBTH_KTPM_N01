/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.quanlyhokhau.models;

import java.util.Date;

public class QuanLyBienDongDanCu {
    private int idBienDong;
    private int idNhanKhau;
    private String loaiBienDong;
    private Date ngayBienDong;
    private String ghiChu;

    // Constructor mặc định
    public QuanLyBienDongDanCu() {
    }

    // Constructor đầy đủ tham số
    public QuanLyBienDongDanCu(int idBienDong, int idNhanKhau, String loaiBienDong, Date ngayBienDong, String ghiChu) {
        this.idBienDong = idBienDong;
        this.idNhanKhau = idNhanKhau;
        this.loaiBienDong = loaiBienDong;
        this.ngayBienDong = ngayBienDong;
        this.ghiChu = ghiChu;
    }

    // Getter và Setter cho các thuộc tính

    public int getIdBienDong() {
        return idBienDong;
    }

    public void setIdBienDong(int idBienDong) {
        this.idBienDong = idBienDong;
    }

    public int getIdNhanKhau() {
        return idNhanKhau;
    }

    public void setIdNhanKhau(int idNhanKhau) {
        this.idNhanKhau = idNhanKhau;
    }

    public String getLoaiBienDong() {
        return loaiBienDong;
    }

    public void setLoaiBienDong(String loaiBienDong) {
        this.loaiBienDong = loaiBienDong;
    }

    public Date getNgayBienDong() {
        return ngayBienDong;
    }

    public void setNgayBienDong(Date ngayBienDong) {
        this.ngayBienDong = ngayBienDong;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    // Phương thức hiển thị thông tin đối tượng
    @Override
    public String toString() {
        return "QuanLyBienDongDanCu{" +
                "idBienDong=" + idBienDong +
                ", idNhanKhau=" + idNhanKhau +
                ", loaiBienDong='" + loaiBienDong + '\'' +
                ", ngayBienDong=" + ngayBienDong +
                ", ghiChu='" + ghiChu + '\'' +
                '}';
    }
}

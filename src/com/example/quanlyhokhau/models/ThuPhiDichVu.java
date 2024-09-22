/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.quanlyhokhau.models;

import java.math.BigDecimal;

public class ThuPhiDichVu {
    private int idHoKhau;
    private int thang;
    private BigDecimal phiQuanLy;
    private BigDecimal phiDien;
    private BigDecimal phiNuoc;
    private BigDecimal phiVeSinh;
    private BigDecimal tongCong;  // Tổng cộng các khoản phí
    private String trangThai;

    // Constructor không tham số
    public ThuPhiDichVu() {
    }

    // Constructor có tham số
    public ThuPhiDichVu(int idHoKhau, int thang, BigDecimal phiQuanLy, BigDecimal phiDien, BigDecimal phiNuoc, BigDecimal phiVeSinh, String trangThai) {
        this.idHoKhau = idHoKhau;
        this.thang = thang;
        this.phiQuanLy = phiQuanLy;
        this.phiDien = phiDien;
        this.phiNuoc = phiNuoc;
        this.phiVeSinh = phiVeSinh;
        this.tongCong = phiQuanLy.add(phiDien).add(phiNuoc).add(phiVeSinh);  // Tính tổng cộng
        this.trangThai = trangThai;
    }

    // Getter và Setter cho các thuộc tính

    public int getIdHoKhau() {
        return idHoKhau;
    }

    public void setIdHoKhau(int idHoKhau) {
        this.idHoKhau = idHoKhau;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public BigDecimal getPhiQuanLy() {
        return phiQuanLy;
    }

    public void setPhiQuanLy(BigDecimal phiQuanLy) {
        this.phiQuanLy = phiQuanLy;
        updateTongCong();  // Cập nhật lại tổng cộng khi thay đổi giá trị
    }

    public BigDecimal getPhiDien() {
        return phiDien;
    }

    public void setPhiDien(BigDecimal phiDien) {
        this.phiDien = phiDien;
        updateTongCong();  // Cập nhật lại tổng cộng khi thay đổi giá trị
    }

    public BigDecimal getPhiNuoc() {
        return phiNuoc;
    }

    public void setPhiNuoc(BigDecimal phiNuoc) {
        this.phiNuoc = phiNuoc;
        updateTongCong();  // Cập nhật lại tổng cộng khi thay đổi giá trị
    }

    public BigDecimal getPhiVeSinh() {
        return phiVeSinh;
    }

    public void setPhiVeSinh(BigDecimal phiVeSinh) {
        this.phiVeSinh = phiVeSinh;
        updateTongCong();  // Cập nhật lại tổng cộng khi thay đổi giá trị
    }

    public BigDecimal getTongCong() {
        return tongCong;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    // Phương thức để cập nhật lại tổng cộng khi thay đổi phí
    private void updateTongCong() {
        this.tongCong = phiQuanLy.add(phiDien).add(phiNuoc).add(phiVeSinh);
    }
}

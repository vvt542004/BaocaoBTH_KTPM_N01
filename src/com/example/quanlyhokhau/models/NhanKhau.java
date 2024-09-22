/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.quanlyhokhau.models;

import java.sql.Date;

public class NhanKhau {
    private int idNhanKhau;
    private String hoTen;
    private Date ngaySinh;
    private String noiSinh;
    private Date ngayDangKyThuongTru;
    private String soCMND_CCCD;
    private Date ngayCapCMND_CCCD;
    private String noiCapCMND_CCCD;
    private String ngheNghiep;
    private String quanHeVoiChuHo;
    private int idHoKhau;

    // Constructor không tham số
    public NhanKhau() {
    }

    // Constructor có tham số
    public NhanKhau(int idNhanKhau, String hoTen, Date ngaySinh, String noiSinh, Date ngayDangKyThuongTru,
                    String soCMND_CCCD, Date ngayCapCMND_CCCD, String noiCapCMND_CCCD, String ngheNghiep,
                    String quanHeVoiChuHo, int idHoKhau) {
        this.idNhanKhau = idNhanKhau;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.noiSinh = noiSinh;
        this.ngayDangKyThuongTru = ngayDangKyThuongTru;
        this.soCMND_CCCD = soCMND_CCCD;
        this.ngayCapCMND_CCCD = ngayCapCMND_CCCD;
        this.noiCapCMND_CCCD = noiCapCMND_CCCD;
        this.ngheNghiep = ngheNghiep;
        this.quanHeVoiChuHo = quanHeVoiChuHo;
        this.idHoKhau = idHoKhau;
    }

    // Getter và Setter cho các thuộc tính

    public int getIdNhanKhau() {
        return idNhanKhau;
    }

    public void setIdNhanKhau(int idNhanKhau) {
        this.idNhanKhau = idNhanKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public Date getNgayDangKyThuongTru() {
        return ngayDangKyThuongTru;
    }

    public void setNgayDangKyThuongTru(Date ngayDangKyThuongTru) {
        this.ngayDangKyThuongTru = ngayDangKyThuongTru;
    }

    public String getSoCMND_CCCD() {
        return soCMND_CCCD;
    }

    public void setSoCMND_CCCD(String soCMND_CCCD) {
        this.soCMND_CCCD = soCMND_CCCD;
    }

    public Date getNgayCapCMND_CCCD() {
        return ngayCapCMND_CCCD;
    }

    public void setNgayCapCMND_CCCD(Date ngayCapCMND_CCCD) {
        this.ngayCapCMND_CCCD = ngayCapCMND_CCCD;
    }

    public String getNoiCapCMND_CCCD() {
        return noiCapCMND_CCCD;
    }

    public void setNoiCapCMND_CCCD(String noiCapCMND_CCCD) {
        this.noiCapCMND_CCCD = noiCapCMND_CCCD;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getQuanHeVoiChuHo() {
        return quanHeVoiChuHo;
    }

    public void setQuanHeVoiChuHo(String quanHeVoiChuHo) {
        this.quanHeVoiChuHo = quanHeVoiChuHo;
    }

    public int getIdHoKhau() {
        return idHoKhau;
    }

    public void setIdHoKhau(int idHoKhau) {
        this.idHoKhau = idHoKhau;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.quanlyhokhau.models;

import java.util.Date;

public class HoKhau {
    private int idHoKhau;
    private String soHoKhau;
    private String hoTenChuHo;
    private String diaChi;
    private Date ngayCapHoKhau;

    // Constructor, getters và setters
    public HoKhau(int idHoKhau, String soHoKhau, String hoTenChuHo, String diaChi, Date ngayCapHoKhau) {
        this.idHoKhau = idHoKhau;
        this.soHoKhau = soHoKhau;
        this.hoTenChuHo = hoTenChuHo;
        this.diaChi = diaChi;
        this.ngayCapHoKhau = ngayCapHoKhau;
    }

    public int getIdHoKhau() {
        return idHoKhau;
    }

    public void setIdHoKhau(int idHoKhau) {
        this.idHoKhau = idHoKhau;
    }

    public String getSoHoKhau() {
        return soHoKhau;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }

    public String getHoTenChuHo() {
        return hoTenChuHo;
    }

    public void setHoTenChuHo(String hoTenChuHo) {
        this.hoTenChuHo = hoTenChuHo;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getNgayCapHoKhau() {
        return ngayCapHoKhau;
    }

    public void setNgayCapHoKhau(Date ngayCapHoKhau) {
        this.ngayCapHoKhau = ngayCapHoKhau;
    }
}

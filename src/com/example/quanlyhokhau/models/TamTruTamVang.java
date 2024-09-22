/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.quanlyhokhau.models;

import java.util.Date;

public class TamTruTamVang {
    private int idTamTruTamVang;
    private int idNhanKhau;
    private String loai;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private String noiDenNoiDi;

    public TamTruTamVang(int idTamTruTamVang, int idNhanKhau, String loai, Date ngayBatDau, Date ngayKetThuc, String noiDenNoiDi) {
        this.idTamTruTamVang = idTamTruTamVang;
        this.idNhanKhau = idNhanKhau;
        this.loai = loai;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.noiDenNoiDi = noiDenNoiDi;
    }

    // Getters and Setters
    public int getIdTamTruTamVang() {
        return idTamTruTamVang;
    }

    public void setIdTamTruTamVang(int idTamTruTamVang) {
        this.idTamTruTamVang = idTamTruTamVang;
    }

    public int getIdNhanKhau() {
        return idNhanKhau;
    }

    public void setIdNhanKhau(int idNhanKhau) {
        this.idNhanKhau = idNhanKhau;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getNoiDenNoiDi() {
        return noiDenNoiDi;
    }

    public void setNoiDenNoiDi(String noiDenNoiDi) {
        this.noiDenNoiDi = noiDenNoiDi;
    }
}

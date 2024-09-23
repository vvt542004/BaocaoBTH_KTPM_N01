create database quanly
use quanly

CREATE TABLE HoKhau (
    ID_HoKhau INT PRIMARY KEY AUTO_INCREMENT,
    SoHoKhau VARCHAR(50) NOT NULL,
    HoTenChuHo VARCHAR(100) NOT NULL,
    DiaChi VARCHAR(255) NOT NULL,
    NgayCapHoKhau DATE NOT NULL
);


CREATE TABLE NhanKhau (
    ID_NhanKhau INT PRIMARY KEY AUTO_INCREMENT,
    HoTen VARCHAR(100) NOT NULL,
    NgaySinh DATE NOT NULL,
    NoiSinh VARCHAR(100) NOT NULL,
    NgayDangKyThuongTru DATE NOT NULL,
    SoCMND_CCCD VARCHAR(50) NOT NULL,
    NgayCapCMND_CCCD DATE NOT NULL,
    NoiCapCMND_CCCD VARCHAR(100) NOT NULL,
    NgheNghiep VARCHAR(100) NOT NULL,
    QuanHeVoiChuHo VARCHAR(50) NOT NULL,
    ID_HoKhau INT,
    FOREIGN KEY (ID_HoKhau) REFERENCES HoKhau(ID_HoKhau)
);


CREATE TABLE TamTruTamVang (
    ID_TamTruTamVang INT PRIMARY KEY AUTO_INCREMENT,
    ID_NhanKhau INT,
    Loai VARCHAR(50) NOT NULL,
    NgayBatDau DATE NOT NULL,
    NgayKetThuc DATE NOT NULL,
    NoiDen_NoDi VARCHAR(255) NOT NULL,
    FOREIGN KEY (ID_NhanKhau) REFERENCES NhanKhau(ID_NhanKhau)
);


CREATE TABLE NguoiDung (
    ID_NguoiDung INT PRIMARY KEY AUTO_INCREMENT,
    HoTenNguoiDung VARCHAR(100) NOT NULL,
    VaiTro VARCHAR(50) NOT NULL,
    TaiKhoan VARCHAR(50) NOT NULL UNIQUE,
    MatKhau VARCHAR(255) NOT NULL,
    QuyenTruyCap TEXT NOT NULL
);

CREATE TABLE QuanLyHoatDong (
    ID_HoatDong INT PRIMARY KEY AUTO_INCREMENT,
    TenSuKien VARCHAR(100) NOT NULL,
    ThoiGian DATETIME NOT NULL,
    DiaDiem VARCHAR(255) NOT NULL,
    NoiDung TEXT NOT NULL,
    ID_NguoiDung INT,
    FOREIGN KEY (ID_NguoiDung) REFERENCES NguoiDung(ID_NguoiDung)
);


CREATE TABLE ThuPhiDichVu (
    ID_HoKhau INT,
    Thang INT NOT NULL,
    PhiQuanLy DECIMAL(10, 2) NOT NULL,
    PhiDien DECIMAL(10, 2) NOT NULL,
    PhiNuoc DECIMAL(10, 2) NOT NULL,
    PhiVeSinh DECIMAL(10, 2) NOT NULL,
    TongCong DECIMAL(10, 2) AS (PhiQuanLy + PhiDien + PhiNuoc + PhiVeSinh) STORED,
    TrangThai VARCHAR(50) NOT NULL,
    PRIMARY KEY (ID_HoKhau, Thang),
    FOREIGN KEY (ID_HoKhau) REFERENCES HoKhau(ID_HoKhau)
);
CREATE TABLE QuanLyBienDongDanCu (
    ID_BienDong INT PRIMARY KEY,
    ID_NhanKhau INT,
    LoaiBienDong VARCHAR(50),
    NgayBienDong DATE,
    GhiChu TEXT,
    FOREIGN KEY (ID_NhanKhau) REFERENCES NhanKhau(ID_NhanKhau)
);




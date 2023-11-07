-- Tạo CSDL EndlessDB
CREATE DATABASE EndlessDB;
GO
USE EndlessDB;
GO

-- Tạo bảng MauSac
CREATE TABLE MauSac (
    MaMauSac INT PRIMARY KEY IDENTITY(1,1),
    TenMauSac NVARCHAR(50),
	Mota NVARCHAR(255)
);
GO

-- Tạo bảng KichThuoc
CREATE TABLE KichThuoc (
    MaKichThuoc INT PRIMARY KEY IDENTITY(1,1),
    TenKichThuoc NVARCHAR(10),
	Mota NVARCHAR(255)
);
GO

-- Tạo bảng KhuyenMai
CREATE TABLE KhuyenMai (
    MaKM INT PRIMARY KEY IDENTITY(1,1),
    TenKM NVARCHAR(255),
    MucGiamGia FLOAT,
    NgayBatDau DATE,
    NgayKetThuc DATE
);
GO

-- Tạo bảng NhanVien
CREATE TABLE NhanVien (
    MaNV INT PRIMARY KEY IDENTITY(1,1),
    TenNV NVARCHAR(255),
    MaTK VARCHAR(10) UNIQUE, 
    MatKhau NVARCHAR(50),
    NgaySinh DATE,
    SDT NVARCHAR(20),
    Email VARCHAR(50),
    DiaChi NVARCHAR(255)
);
GO

-- Tạo bảng KhachHang
CREATE TABLE KhachHang (
    MaKH INT PRIMARY KEY IDENTITY(1,1),
    TenKH NVARCHAR(255),
    SDT NVARCHAR(20),
    DiaChi NVARCHAR(255)
);
GO

-- Tạo bảng SanPham
CREATE TABLE SanPham (
    MaSP INT PRIMARY KEY IDENTITY(1,1),
    TenSP NVARCHAR(255),
    DonGia DECIMAL(18, 2),
    LoaiGiay NVARCHAR(25),
    MaKM INT,
    KhuyenMai FLOAT,
    FOREIGN KEY (MaKM) REFERENCES KhuyenMai(MaKM)
);
GO

-- Tạo bảng ChiTietSanPham
CREATE TABLE ChiTietSanPham (
    MaCTSP INT PRIMARY KEY IDENTITY(1,1),
    MaSP INT,
    MaMau INT,
    MaKT INT,
    SoLuong INT,
	MoTa NVARCHAR(255),
    FOREIGN KEY (MaSP) REFERENCES SanPham(MaSP),
    FOREIGN KEY (MaMau) REFERENCES MauSac(MaMauSac),
    FOREIGN KEY (MaKT) REFERENCES KichThuoc(MaKichThuoc)
);
GO

-- Tạo bảng NhapHang
CREATE TABLE NhapHang (
    MaDN INT PRIMARY KEY IDENTITY(1,1),
    MaCTSP INT,
    SoLuong INT,
    NgayNhap DATE,
    GhiChu NVARCHAR(100),
    FOREIGN KEY (MaCTSP) REFERENCES ChiTietSanPham(MaCTSP)
);
GO

-- Tạo bảng HoaDon
CREATE TABLE HoaDon (
    MaHD INT PRIMARY KEY IDENTITY(1,1),
    MaKH INT,
    MaNV INT,
    NgayBan DATE,
    TongTien FLOAT,
    HTThanhToan NVARCHAR(20),
    TienThanhToan FLOAT,
    MaKM INT,
	TrangThai NVARCHAR(20),	
    FOREIGN KEY (MaKH) REFERENCES KhachHang(MaKH),
    FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV),
    FOREIGN KEY (MaKM) REFERENCES KhuyenMai(MaKM)
);
GO

-- Tạo bảng HoaDonChiTiet
CREATE TABLE HoaDonChiTiet (
    MaHDCT INT PRIMARY KEY IDENTITY(1,1),
    MaHD INT,
    MaCTSP INT,
    SoLuong INT,
    FOREIGN KEY (MaHD) REFERENCES HoaDon(MaHD),
    FOREIGN KEY (MaCTSP) REFERENCES ChiTietSanPham(MaCTSP)
);
GO

-- Tạo bảng DoiHang
CREATE TABLE DoiHang (
    MaDH INT PRIMARY KEY IDENTITY(1,1),
    MaHDCT INT,
    MaSP INT,
    MaNV INT,
    SoLuong INT,
    LyDo NVARCHAR(255),
    NgayDoi DATE,
    SoTienThayDoi DECIMAL(18, 2),
    FOREIGN KEY (MaHDCT) REFERENCES HoaDonChiTiet(MaHDCT),
    FOREIGN KEY (MaSP) REFERENCES SanPham(MaSP),
    FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)
);
GO

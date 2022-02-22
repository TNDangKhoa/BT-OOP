package Buoi5.lap4;

public class SanPhamTestDrive {
    public static void main(String[] args) {
        SanPham sanPham = new SanPham();
        sanPham.nhap();
        sanPham.getThueNhapKhau();
        sanPham.xuat();

        SanPham sanPham2 = new SanPham();
        sanPham2.nhap();
        sanPham2.getThueNhapKhau();
        sanPham2.xuat();
    }
}

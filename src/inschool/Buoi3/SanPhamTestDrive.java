package inschool.Buoi3;

public class SanPhamTestDrive {
    public static void main(String[] args) {
        SanPham sanPham1 = new SanPham();
        
        sanPham1.nhapThongTinSP("dau an", 20000.0, 10.0);
        sanPham1.tinhThueNhapKhau();
        sanPham1.xuatRaManHinh();

        SanPham sanPham2 = new SanPham();

        sanPham2.nhapThongTinSP("dr.Thanh", 10000.0, 10.0);
        sanPham2.tinhThueNhapKhau();
        sanPham2.xuatRaManHinh();

    }
    
}

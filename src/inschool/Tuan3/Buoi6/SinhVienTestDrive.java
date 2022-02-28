package inschool.Tuan3.Buoi6;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(2005110002, "Tran Nguyen Dang Khoa", 7, 8);
        SinhVien sv2 = new SinhVien(2005110003, "Dinh Ngoc Dang Khoa", 8, 9);
        SinhVien sv3 = new SinhVien();
        sv3.nhap();
        System.out.println("SV1: "+ sv1.toString());
        System.out.println("SV2: "+ sv2.toString());
        System.out.println("SV3: "+ sv3.toString());
        }
}

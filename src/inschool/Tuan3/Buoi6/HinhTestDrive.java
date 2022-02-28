package inschool.Tuan3.Buoi6;

public class HinhTestDrive {
    public static void main(String[] args) {
        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.setFile("hinhVuong.aif");
        hinhVuong.xoayHinh();
        hinhVuong.choiNhac();

        HinhTron hinhTron = new HinhTron();
        hinhTron.setFile("hinhTron.aif");
        hinhTron.xoayHinh();
        hinhTron.choiNhac();

        HinhTrungBienHinh hinhTrungBienHinh = new HinhTrungBienHinh();
        hinhTrungBienHinh.setFile("amoeba.hif");

        hinhTrungBienHinh.setxPoint(10);
        hinhTrungBienHinh.setyPoint(5);

        hinhTrungBienHinh.xoayHinh();
        hinhTrungBienHinh.choiNhac();
    }
}

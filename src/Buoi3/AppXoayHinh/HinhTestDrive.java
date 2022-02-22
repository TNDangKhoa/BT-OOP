package Buoi3.AppXoayHinh;

public class HinhTestDrive {
    public static void main(String[] args) {
        
        //Hinh vuong
        HinhVuong hinhVuong = new HinhVuong("MuaXuan.aif");
        hinhVuong.phatNhac();
        hinhVuong.xoay();

        //Hinh Tron
        HinhTron hinhTron = new HinhTron("MuaHe.aif");
        hinhTron.phatNhac();
        hinhTron.xoay();

        //hinh tam giac
        HinhTamGiac hinhTamGiac = new HinhTamGiac("Rick Astley - Never Gonna Give You Up");
        hinhTamGiac.phatNhac();
        hinhTamGiac.xoay();
    }
}

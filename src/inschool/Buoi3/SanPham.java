package inschool.Buoi3;

public class SanPham {
    String name;
    double gia;
    double giamGia;
    double thueNhapKhau;

    public void nhapThongTinSP(String name, double Gia, double giamGia){
        this.name = name;
        this.gia = Gia;
        this.giamGia = giamGia;
    }


    void tinhThueNhapKhau(){
        thueNhapKhau = (gia*10)/100;
    }

    void xuatRaManHinh(){
        System.out.println("-----------------------");
        System.out.println("Ten SP: " +name);
        System.out.println("Gia: " +gia);
        System.out.println("Giam gia: " +giamGia);
        System.out.println("Thue: " +thueNhapKhau);
    }

}

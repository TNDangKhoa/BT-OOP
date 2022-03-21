package inschool.Tuan6.Buoi11.ChuyenXe;

import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private float soNgayDi;


    public ChuyenXeNgoaiThanh(){}
    
    public ChuyenXeNgoaiThanh(String maCX, String tenTaiXe, String soXe, double doanhThu, String noiDen, float soNgayDi) {
        super(maCX, tenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }
    @Override
    public String toString() {
        return "ChuyenXeNgoaiThanh [noiDen=" + noiDen + ", soNgayDi=" + soNgayDi + "]" + super.toString();
    }

    @Override
    protected void nhap() {
        super.nhap();
        Scanner nhap = InputSupport.nhap;
        System.out.print("Nhap noi den: ");
        this.noiDen = nhap.nextLine();
        System.out.print("Nhap so ngay di: ");
        this.soNgayDi = nhap.nextFloat();
        nhap.nextLine();
        nhap.close();
    }
    
}

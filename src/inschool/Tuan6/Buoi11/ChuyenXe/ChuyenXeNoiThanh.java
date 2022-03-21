package inschool.Tuan6.Buoi11.ChuyenXe;

import java.util.Scanner;

public class ChuyenXeNoiThanh extends ChuyenXe {

    private int soTuyen;
    private double soKM;

    public ChuyenXeNoiThanh(){}

    public ChuyenXeNoiThanh(String maCX, String tenTaiXe, String soXe, double doanhThu, int soTuyen, double soKM) {
        super(maCX, tenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    @Override
    public String toString() {
        return "ChuyenXeNoiThanh [soKM=" + soKM + ", soTuyen=" + soTuyen + "]" + super.toString();
    }

    @Override
    protected void nhap() {
        super.nhap();
        Scanner nhap = InputSupport.nhap;
        System.out.print("So tuyen: ");
        this.soTuyen = nhap.nextInt();
        System.out.print("so KM: ");
        this.soKM = nhap.nextDouble();
        nhap.close();
    }
   
}

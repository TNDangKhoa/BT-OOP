package inschool.Tuan6.Buoi11.ChuyenXe;

import java.util.Scanner;

public class ChuyenXe {
    private String maCX;
    private String tenTaiXe;
    private String soXe;
    private double DoanhThu;

    public String getMaCX() {
        return maCX;
    }

    public void setMaCX(String maCX) {
        this.maCX = maCX;
    }

    public String getTenTaiXe() {
        return tenTaiXe;
    }

    public void setTenTaiXe(String tenTaiXe) {
        this.tenTaiXe = tenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        DoanhThu = doanhThu;
    }

    public ChuyenXe(){};

    public ChuyenXe(String maCX, String tenTaiXe, String soXe, double doanhThu){
        this.maCX = maCX;
        this.tenTaiXe = tenTaiXe;
        this.soXe = soXe;
        this.DoanhThu = doanhThu;

    }

    @Override
    public String toString() {
        return "ChuyenXe [DoanhThu=" + DoanhThu + ", maCX=" + maCX + ", soXe=" + soXe + ", tenTaiXe=" + tenTaiXe + "]";
    };

    protected void nhap(){
        Scanner nhap = InputSupport.nhap;
        nhap.nextLine();
        System.out.println("Nhap ma: ");
        this.maCX = nhap.nextLine();
        System.out.println("Nhap doanh thu: ");
        this.DoanhThu = nhap.nextDouble();
        nhap.close();

    }
}

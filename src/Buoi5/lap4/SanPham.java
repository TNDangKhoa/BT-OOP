package Buoi5.lap4;

import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;
    private double thueNK;

    Scanner scanner = new Scanner(System.in);

    
    public SanPham(){

    }

    public SanPham(String tensp, double dongia,double giamgia){
        this.tenSP = tensp;
        this.donGia = dongia;
        this.giamGia = giamgia;
    }
    
    public SanPham(String tensp, double donGia){
        this(tensp, donGia, 0);
    }


    public double getDonGia(){
        return this.donGia;
    }

    void nhap(){

        System.out.print("Nhap ten SP:");
        tenSP = scanner.nextLine();

        System.out.print("Nhap gia SP: ");
        donGia = scanner.nextDouble();
    }
    public void getThueNhapKhau(){
        this.thueNK  = donGia / 10;;
    }
    public double setThueNhapKhau(){
        return this.thueNK;
    }
    void xuat(){
        System.out.println("Ten SP: " +tenSP);
        System.out.println("Gia SP: " +donGia);
        System.out.println("Giam gia: " +giamGia);
        System.out.println("Thue nhap khau: " +thueNK);
    }

    
}
package inschool.Tuan3.Buoi7;

import java.util.Scanner;

public class SinhVien {

    Scanner scanner = new Scanner(System.in);

    private int MSSV;
    private String ten;
    private float diemLT;
    private float diemTH;

    public SinhVien(){
        this.MSSV = 0;
        this.diemLT = 0f;
        this.diemTH = 0f;
        this.ten = null;
    };

    public SinhVien(int MSSV, String ten, float diemLT, float diemTH){
        this.MSSV = MSSV;
        this.ten = ten;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public void setmaSV(int MSSV){
        this.MSSV = MSSV;
    }

    public int getmaSV(){
        return this.MSSV;
    }

    public void sethoTen(String hoTen){
        this.ten = hoTen;
    }

    public String gethoTen(){
        return this.ten;
    }

    public void setdiemLT(float diemLT){
        this.diemLT = diemLT;
    }

    public float getdiemLT(){
        return this.diemLT;
    }

    public void setdiemTH(float diemTH){
        this.diemTH = diemTH;
    }

    public float getdiemTH(){
        return this.diemTH;
    }

    public double tinhDiemTB(){
        double diemTB;
        diemTB = (this.diemLT + this.diemTH)/2;
        return diemTB;
    }
    public String toString(){
        String str = "MSSV: "+this.MSSV+ ". Ho Ten: "+this.ten ;
        str = str + ". Diem Ly Thuyet: " +this.diemLT +". Diem Thuc Hanh: "+ this.diemTH ;
        str = str + ". Diem Trung Binh: " +
        this.tinhDiemTB();
        return str ;
    }

    public void nhap(){
        System.out.println("Nhap ma so sinh vien:");
        this.MSSV = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap ho ten sinh vien: ");
        this.ten = scanner.nextLine();
        System.out.print("Nhap diem ly thuyet: ");
        this.diemLT = scanner.nextFloat();
        System.out.print("Nhap diem thuc hanh: ");
        this.diemTH = scanner.nextFloat();
    }

    
}


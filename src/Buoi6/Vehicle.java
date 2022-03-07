package Buoi6;

import java.util.Scanner;

public class Vehicle {
    //implementation
    private String TenChuXe;
    private String LoaiXe;
    private float TriGiaXe;
    private int DungTichXiLanh;
    private float ThueTruocBa;

    Scanner nhap = new Scanner(System.in);
    
    //interface
    public Vehicle(){};

    public Vehicle(String TenChuXe, String LoaiXe, float TriGiaXe, int DungTichXiLanh){
        this.TenChuXe = TenChuXe;
        this.LoaiXe = LoaiXe;
        this.TriGiaXe = TriGiaXe;
        this.DungTichXiLanh = DungTichXiLanh;
    };

    public void setTenChuXe(String tenChuXe) {
        TenChuXe = tenChuXe;
    }

    public String getTenChuXe() {
        return TenChuXe;
    }

    public void setLoaiXe(String loaiXe) {
        LoaiXe = loaiXe;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setDungTichXiLanh(int dungTichXiLanh) {
        DungTichXiLanh = dungTichXiLanh;
    }

    public int getDungTichXiLanh() {
        return DungTichXiLanh;
    }

    public void setTriGiaXe(float triGiaXe) {
        TriGiaXe = triGiaXe;
    }

    public float getTriGiaXe() {
        return TriGiaXe;
    }

    public float TinhThue(){
        ThueTruocBa = 0.0f;
        if(this.DungTichXiLanh < 100){
            ThueTruocBa = TriGiaXe * 0.01f;
        } else if(this.DungTichXiLanh >= 100 && this.DungTichXiLanh <= 200){
            ThueTruocBa = TriGiaXe * 0.03f;
        }else{
            ThueTruocBa = TriGiaXe *0.05f;
        }
        return ThueTruocBa;
    }


}

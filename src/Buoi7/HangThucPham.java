package Buoi7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham {

    private String MaHang;
    private String TenHang;
    private float DonGia;
    private Date NSX;
    private Date NHH;

    public HangThucPham(String maHang){
        this.setMaHang(maHang);
    };

    public HangThucPham(String maHang, String tenHang, float donGia, Date NSX, Date NHH){
        this(maHang);
        setTenHang(tenHang);
        setDonGia(donGia);
        setNSX(NSX);
        setNHH(NHH);
    }
    
    public String getMaHang() {
        return MaHang;
    }

    private void setMaHang(String maHang) {
        if(maHang != ""){
            this.MaHang = maHang;
        }else{
            System.out.println("Ma hang khong duoc rong!");
        }
        
    }

    public String getTenHang() {
        return TenHang;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float donGia) {
        if(donGia > 0){
            this.DonGia = donGia;
        } else {
            System.out.println("Don gia khong hop le!");
        }
        
    }

    public void setTenHang(String tenHang) {
        if(tenHang != ""){
            this.TenHang = tenHang;
        }else{
            System.out.println("Ten hang khong duoc rong!");
        }
        
    }

    public Date getNSX() {
        return NSX;
    }

    public void setNSX(Date NSX) {
        if(NSX != null){
            this.NSX = NSX;
        }else{
            System.out.println("Ngay SX khong duoc de trong!");
        }
        
    }

    public Date getNHH() {
        return NHH;
    }

    public void setNHH(Date NHH) {
        if(NHH.after(this.NSX) && NHH != null){
            this.NHH = NHH;
        }else{
            System.out.println("Ngay het han phai sau ngay SX!");
        }
        
    }

    boolean kiemTraHethan(){
        boolean isHethan = false; //con han
        Date now = new Date();
        if(this.NHH.before(now)){
            isHethan = true;
        } else {
            isHethan = false;
        }
        return isHethan;
    }

    public String toString(){
        SimpleDateFormat ngayViet = new SimpleDateFormat("dd/mm/yyyy");
        
        String str = "Ma Hang: " + this.MaHang + " Ten Hang: " + this.TenHang;
        str += " Don Gia: " +this.DonGia + " Ngay SX: " + ngayViet.format(this.NSX) + " Ngay het han: " + ngayViet.format(this.NHH);
        return str;
    }

}

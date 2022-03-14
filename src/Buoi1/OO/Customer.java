package Buoi1.OO;

public class Customer {
    String customerName;
    String Address;

    void show(){
        System.out.println("Thong tin khach hang");
        System.out.println("Ten khach hang:" +customerName);
        System.out.println("Dia chi: " +Address);
    }
    void nhapTenKhach(String nhapTen){
        customerName = nhapTen;
    }
    void nhapDiaChi(String DiaChi){
        Address = DiaChi;
    }
}

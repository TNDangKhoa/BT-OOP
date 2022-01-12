package Buoi1.OO;

public class Employee {
    String employeeName;
    int Salary;

    void show(){
        System.out.println("Thong tin nhan vien");
        System.out.println("Ten nhan vien:" +employeeName);
        System.out.println("Luong: " +Salary);
    }
    void traLuong(int soTienTra){
        Salary += soTienTra;
    }
    void rutLuong(int soTienRut){
        Salary -= soTienRut;
    }
}

package inschool.Buoi3;

public class Student {
    String Name;
    String mssv;
    String Lop;
    String Khoa;
    String Nganh;
    double diemTB;

    //constuctor: phuong thuc dac biet
    //constuctor mac dinh ko co tham so
    public Student(/*this*/){
        this.mssv = "1234";
        this.Name = "Teo";
    }
    public Student(String name, String mssv, String lop){
        this.Name = name;
        this.mssv = mssv;
    }
    //constuctor co tham so
    public Student(/*this*/String name, String mssv, String lop, String khoa, String nganh, double diemTB){
        this(name, mssv, lop); //goi consturctor trong cung 1 class
        this.Lop = lop;
        this.Khoa = khoa;
        this.Nganh = nganh;
        this.diemTB = diemTB;
    }

    //phuong thuc object
    void inThongTin(){
        System.out.println("Ten: " +this.Name);
        System.out.println("MSSV: " +this.mssv);
        System.out.println("Lop: " +this.Lop);
        System.out.println("Khoa: " +this.Khoa);
        System.out.println("Nganh: " +this.Nganh);
        System.out.println("Diem TB: " +this.diemTB);
    }
    void hoc(){
        System.out.println("Hoc on");
    }
    void thamGiaHoatDong(){
        System.out.println("co tham gia");
    }
    void thi(){
        
    }
    void phatBieu(){
        
    }
}

package inschool.Buoi2;

public class Student {
    String Name;
    String mssv;
    String Lop;
    String Khoa;
    String Nganh;
    double diemTB;

    //constuctor: phuong thuc dac biet
    //constuctor mac dinh ko co tham so
    public Student(){
        this.mssv = "1234";
        this.Name = "Teo";
    }
    //constuctor co tham so
    public Student(String name, String mssv, String lop, String khoa){
        Name = name;
        this.mssv = mssv;
        this.Lop = lop;
        this.Khoa = khoa;
    }

    void inThongTin(){
        System.out.println("Ten: " +Name);
        System.out.println("MSSV: " +mssv);
        System.out.println("Lop: " +Lop);
        System.out.println("Khoa: " +Khoa);
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

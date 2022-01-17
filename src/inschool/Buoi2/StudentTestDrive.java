package inschool.Buoi2;

public class StudentTestDrive {
    public static void main(String[] args) {
        
        Student teoStudent = new Student();
        
        teoStudent.inThongTin();
        teoStudent.thamGiaHoatDong();
        teoStudent.hoc();

        Student khoaStudent;
        khoaStudent = new Student("Khoa", "002", "K14DCMT01", "MMT");
        khoaStudent.inThongTin();
        khoaStudent.hoc();
        khoaStudent.thamGiaHoatDong();
    }
}

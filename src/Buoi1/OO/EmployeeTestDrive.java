package Buoi1.OO;

public class EmployeeTestDrive {
    public static void main(String[] args) {
        Employee employee;
        employee = new Employee();

        //tra luong
        employee.traLuong(5000000);
        employee.show();

        //rut luong
        employee.rutLuong(2000000);
        employee.show();
    }
}

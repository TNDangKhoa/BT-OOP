package Buoi1.OO;

import java.util.Scanner;

public class CustomerTestDrive {
    public static void main(String[] args) {
        Customer customer;
        customer = new Customer();

        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten khach: ");
        String x = input.nextLine();
        customer.nhapTenKhach(x);
        
        System.out.println("Nhap dia chi: ");
        String y = input.nextLine();
        customer.nhapDiaChi(y);
        
        customer.show();

    }
}

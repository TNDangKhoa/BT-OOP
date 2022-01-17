package Buoi1.nonstructure;

import java.util.Scanner;

public class NganHang {
    public static void main(String[] args) {
        int Account_number = 252123412;
        int Account_balance = 0;
        Scanner input = new Scanner(System.in);
        //gui tien
        System.out.print("Nhap so tien can gui: ");
        int soTien = input.nextInt();
        Account_balance += soTien;
        //show
        System.out.println("Thong tin tai khoan");
        System.out.println("Ten tai khoan:" +Account_number);
        System.out.println("So du tai khoan: " +Account_balance);
        //rut tien
        int withdrawAmmout = 0;
        System.out.println("Nhap so tien muon rut: ");
        withdrawAmmout = input.nextInt();
        Account_balance -= withdrawAmmout;
        //show
        System.out.println("Thong tin tai khoan");
        System.out.println("Ten tai khoan:" +Account_number);
        System.out.println("So du tai khoan: " +Account_balance);
    }
}

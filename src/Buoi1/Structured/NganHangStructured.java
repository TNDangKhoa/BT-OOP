package Buoi1.structured;

import java.util.Scanner;

public class NganHangStructured {
    static int Account_number = 231234231;
    static int Account_balance = 0;

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    //gui tien
    System.out.print("Nhap so tien can gui: ");
    int soTien = input.nextInt();
    Account_balance += soTien;
    show();

    //rut tien
    int withdrawAmmout = 0;
    System.out.println("Nhap so tien muon rut: ");
    withdrawAmmout = input.nextInt();
    Account_balance -= withdrawAmmout;
    show();

    }
    static void show(){
        System.out.println("Thong tin tai khoan");
        System.out.println("Ten tai khoan:" +Account_number);
        System.out.println("So du tai khoan: " +Account_balance);
    }
}

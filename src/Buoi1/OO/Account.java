package Buoi1.OO;

public class Account {
    
    int Account_number = 231234231;
    int Account_balance = 0;

    //function
    void show(){
        System.out.println("Thong tin tai khoan");
        System.out.println("Ten tai khoan:" +Account_number);
        System.out.println("So du tai khoan: " +Account_balance);
    }
    void rutTien(int SoRut){
        Account_balance -= SoRut;
    }
    void guiTien(int SoGui){
        Account_balance += SoGui;
    }

}

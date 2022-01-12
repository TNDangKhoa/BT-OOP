package Buoi1.OO;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account account;
        account = new Account();

        //gui tien
        account.guiTien(20000);
        account.show();

        //rut tien
        account.rutTien(10000);
        account.show();

    }
}

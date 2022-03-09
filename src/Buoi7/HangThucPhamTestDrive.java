package Buoi7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPhamTestDrive {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        String date1 = "16/08/2017";
        Date ngaySX = format.parse(date1);
        String date2 = "19/09/2017";
        Date ngayHH = format.parse(date2);
        String date3 = "12/01/2022";
        Date ngaySX2 = format.parse(date3);
        String date4 = "12/03/2022";
        Date ngayHH2 = format.parse(date4);
        HangThucPham thucPham2 = new HangThucPham("MT21312", "con ga trong", 800_000, ngaySX, ngayHH);
        HangThucPham thucPham3 = new HangThucPham("C231231", "ca", 32_000, ngaySX2, ngayHH2);

        System.out.println("thuc pham 2: " +thucPham2.toString());
        if(thucPham2.kiemTraHethan()){
            System.out.println("het han! nhap hang moi!");
        }
        System.out.println("thuc pham 3: " +thucPham3.toString());
        if(thucPham3.kiemTraHethan()){
            System.out.println("het han! nhap hang moi!");
        }
    }
}

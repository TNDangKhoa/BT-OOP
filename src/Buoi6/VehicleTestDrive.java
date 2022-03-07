package Buoi6;

public class VehicleTestDrive {
    public static void main(String[] args) {
     
        Vehicle xe1 = new Vehicle("Tran Van A", "Future Neo", 37_000_000, 125);
        Vehicle xe2 = new Vehicle("Nguyen Thi B", "Ford Ranger", 800_000_000, 300);
        Vehicle xe3 = new Vehicle("Le Van C", "Land Scape", 1_000_000_000, 1500);

        System.out.println("Chu xe \t\t\t Loai xe \t\t Dung tich \t\t Tri Gia \t\t Thue phai tra \t");
        System.out.printf("%-24s %-24s %-20d %-24f %f \n", xe1.getTenChuXe(), xe1.getLoaiXe(), xe1.getDungTichXiLanh(),xe1.getTriGiaXe(), xe1.TinhThue());
        System.out.printf("%-24s %-24s %-20d %-24f %f \n", xe2.getTenChuXe(), xe2.getLoaiXe(), xe2.getDungTichXiLanh(),xe2.getTriGiaXe(), xe2.TinhThue());
        System.out.printf("%-24s %-24s %-20d %-24f %f\n", xe3.getTenChuXe(), xe3.getLoaiXe(), xe3.getDungTichXiLanh(),xe3.getTriGiaXe(), xe3.TinhThue());
    }
}

package Buoi3.AppXoayHinh;

public class HinhVuong {
    //attributes
    String fileAmthanh;
    //int solanphatnhac = 0
    //dai rong

    public HinhVuong(String fileAmThanh){
        this.fileAmthanh = fileAmThanh;
    }

    void xoay(){
        System.out.println("Xoay 360 do theo chieu kim dong ho");
    }

    void phatNhac(){
        System.out.println("Choi file: " +fileAmthanh);
    }
}

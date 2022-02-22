package Buoi3.AppXoayHinh;

public class HinhTron {
    //attributes
    String fileAmthanh;
    //int solanphatnhac = 0
    //dai rong

    public HinhTron(String fileAmThanh){
        this.fileAmthanh = fileAmThanh;
    }

    void xoay(){
        System.out.println("Xoay 360 do theo chieu kim dong ho");
    }

    void phatNhac(){
        System.out.println("Choi file: " +fileAmthanh);
    }
}

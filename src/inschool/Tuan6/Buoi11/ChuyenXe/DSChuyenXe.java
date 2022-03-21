package inschool.Tuan6.Buoi11.ChuyenXe;

import java.util.ArrayList;
import java.util.List;

public class DSChuyenXe {
    private List<ChuyenXeNgoaiThanh> ListNgoaiThanh = new ArrayList<>();

    private List<ChuyenXeNoiThanh> ListNoiThanh = new ArrayList<>();

    private int demTongCX = 0;
    private double doanhThuNgoaiThanh;
    private double doanhThuNoiThanh;

    public void xuat(){

        for(ChuyenXeNgoaiThanh chuyenXeNgoaiThanh:ListNgoaiThanh){
            System.out.println(chuyenXeNgoaiThanh);
        }

        for(ChuyenXeNoiThanh chuyenXeNoiThanh:ListNoiThanh){
            System.out.println(chuyenXeNoiThanh);
        }

    }

    public void them(int loaixe){
        if(loaixe == 1){
            ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh();
            chuyenXeNoiThanh.nhap();
            this.ListNoiThanh.add(chuyenXeNoiThanh);
        }else{
            ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh();
            chuyenXeNgoaiThanh.nhap();
            this.ListNgoaiThanh.add(chuyenXeNgoaiThanh);
        }
    }

    public void tinhDoanhThuMoiLoai(){
        for (ChuyenXeNoiThanh chuyenXeNoiThanh : ListNoiThanh){
            this.doanhThuNoiThanh += chuyenXeNoiThanh.getDoanhThu();
        }

        for (ChuyenXeNgoaiThanh chuyenXeNgoaiThanh : ListNgoaiThanh){
            this.doanhThuNgoaiThanh += chuyenXeNgoaiThanh.getDoanhThu();
        }

    }
}

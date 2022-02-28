package inschool.Tuan3.Buoi6;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public void setChieuDai(double chieuDai) {
        if(chieuDai > 0){
            this.chieuDai = chieuDai;
        }else{
            System.out.println("Chieu dai khong hop le!");
        }
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        if(chieuRong > 0 && chieuRong < chieuDai){
            this.chieuRong = chieuRong;
        }else{
            System.out.println("Chieu rong khong hop le!");
        }
        
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public double tinhChuVi(){
        return (this.chieuDai + this.chieuRong) *2;
    }

    public double tinhDienTich(){
        return this.chieuDai * this.chieuRong;
    }

    public String toString(){
        String str = "Chieu dai: " + this.chieuDai + ", chieu rong: " + this.chieuRong;
        str = str + " dien tich: " + this.tinhDienTich() + " chu vi: " + this.tinhChuVi();
        return str;
    }
}

package inschool.Tuan3.Buoi6;

public class HinhTrungBienHinh extends Hinh{
    private int xPoint;
    private int yPoint;

    public void setxPoint(int xPoint) {
        this.xPoint = xPoint;
    }

    public void setyPoint(int yPoint) {
        this.yPoint = yPoint;
    }

    public int getxPoint() {
        return xPoint;
    }

    public int getyPoint() {
        return yPoint;
    }

    @Override
    public void choiNhac(){
        System.out.println("Dang choi nhac .hif ---- " + this.getFile());
    }

    @Override
    public void xoayHinh(){
        System.out.println("Xoay theo diem x: " + this.xPoint + ", " + this.yPoint);
    }
}

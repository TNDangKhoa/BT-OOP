package inschool.Tuan3.Buoi6;

public class Car {
    private String carColor;
    private double carPrice = 0;

    public void setCarColor(String carColor){
        this.carColor = carColor;
    }

    public String getCarColor(){
        return this.carColor;
    }

    public void setCarPrice(double carPrice){
        if(carPrice > 0){
            this.carPrice = carPrice;
        }else{
            System.out.println("Gia khong hop le!!");
        }
    }

    public double getCarPrice(){
        return this.carPrice;
    }
}

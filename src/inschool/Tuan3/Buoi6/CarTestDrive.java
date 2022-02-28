package inschool.Tuan3.Buoi6;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car = new Car();
        
        car.setCarColor("den");
        car.setCarPrice(50000);
        System.out.println("Mau xe: " +car.getCarColor());
        System.out.println("Gia: " +car.getCarPrice());
    }
}

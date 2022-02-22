package inschool.Tuan3.Buoi5;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setSize(12);
        dog.setBreed("Italy");
        dog.setBreed("Aka");

        System.out.println("Ten cua cho: " +dog.getName());
        System.out.println("Giong cho: " +dog.getBreed());
        System.out.println("Co cua cho: " +dog.getSize());
    }
}

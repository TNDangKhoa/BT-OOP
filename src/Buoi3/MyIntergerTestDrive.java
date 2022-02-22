package Buoi3;

public class MyIntergerTestDrive {
    public static void main(String[] args) {
        MyInterger interger;
        interger = new MyInterger(3);
        interger.show();

        interger.increment();
        
        MyInterger interger2;
        interger2 = new MyInterger(1);

        System.out.println(interger2.greaterThan(interger));
        System.out.println(interger2.lessThan(interger));

    }
}

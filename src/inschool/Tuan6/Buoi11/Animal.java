package inschool.Tuan6.Buoi11;

public class Animal {

    private String name;

    public Animal(){
        System.out.println("ham tao mac dinh class animal");
    }
    
    public Animal(String name){
        this.name = name;
    }
    protected void keu(){
        System.out.println("Keu ...");
    }
}

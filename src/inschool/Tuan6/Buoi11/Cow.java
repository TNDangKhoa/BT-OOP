package inschool.Tuan6.Buoi11;

public class Cow extends Animal {
    
    public Cow(){
        System.out.println("Ham mac dinh cua class Cow");
    }

    private float Milk;

    public Cow(String name, float milk){
        super(name);
        this.Milk = milk;

    }

    @Override
    protected void keu() {
        System.out.println("Moo Mooo!");;
    }
}

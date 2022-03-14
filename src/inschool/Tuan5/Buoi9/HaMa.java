package inschool.Tuan5.Buoi9;

public class HaMa extends Animal {
    
    public void ngamMinh(){
        System.out.println("Ha ma ngam minh trong dong nuoc");
    }

    @Override
    public void keu() {
        System.out.println("Ha ma keu...");
    }

    @Override
    public void an() {
        System.out.println("Ha ma an ca");
    }
}

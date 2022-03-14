package inschool.Tuan5.Buoi9;

public class Cop extends Animal {
    public void sanMoi(){
        System.out.println("Cop san bat...");
    }

    @Override
    public void an() {
        System.out.println("Cop an nhung gi no san duoc");
    }

    @Override
    public void keu() {
        System.out.println("Cop keu rawrrrr!");
    }
    
}

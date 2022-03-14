package inschool.Tuan5.Buoi9;

public class Dog extends Animal {
    public void giauDep(){
        System.out.println("xin doi dep nhe");
    }

    @Override
    public void keu() {
        System.out.println("Cho keu: woof woof!");
    }

    @Override
    public void an() {
        System.out.println("Cho an com, xuong,...");
    }
}

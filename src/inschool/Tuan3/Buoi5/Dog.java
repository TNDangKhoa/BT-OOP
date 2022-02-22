package inschool.Tuan3.Buoi5;

public class Dog {
    //implementation
    private int size; 
    private String breed;
    private String name;
    
    //interface
    public void setSize(int size){
        if(size > 0){
            this.size = size;
        }else{
            System.out.println("kich co khong hop le!");
        }
        
    }
    
    public int getSize(){
        return this.size;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

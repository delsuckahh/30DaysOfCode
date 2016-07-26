package animal;

public class Cat extends Animal{
    
    public Cat() {
        super(9);
        System.out.println("A cat has been created.");
    }
    
    public void meow() {
        System.out.println("The cat says meow.");
    }
    
    public void prance() {
        System.out.println("The cat is prancing.");
    }
    
}

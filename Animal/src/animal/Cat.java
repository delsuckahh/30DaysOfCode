package animal;

public class Cat extends Animal{
    
    public Cat() {
        super(9);
        System.out.println("A cat has been created.");
    }
    
    public void eat() {
        System.out.println("A cat is eating.");
    }
    
    public void sleep() {
        System.out.println("A cat is sleeping.");
    }
    
    public void meow() {
        System.out.println("A cat says meow.");
    }
    
    public void prance() {
        System.out.println("A cat is prancing.");
    }
    
}


abstract class Animal {

    abstract void makeSound();


    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    
    public void makeSound() {
        System.out.println("Bark bark");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();      
    }
}

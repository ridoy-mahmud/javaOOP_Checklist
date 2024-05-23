// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    public abstract int animalCount(int n);
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public int animalCount(int n) {
        return n;
    }
}

public class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        Animal au; // Create Refrence of the Abstruct Class
        au = new Pig(); // Copy the refaracne to Pig Class
        au.animalSound();
        au.sleep();
        System.out.println("Number of animals: " + au.animalCount(43));
    }
}





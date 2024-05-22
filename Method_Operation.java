public class Method_Operation {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    static void fule(int fule) {
        System.out.println("Fule consumption is - " + fule);
    }

    // Main method
    public static void main(String[] args) {
        myStaticMethod(); // We can directly Call the static method
        // myPublicMethod(); We can not directly Call the Public method
        Method_Operation myObj = new Method_Operation(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object

        myObj.fullThrottle();
        myObj.speed(69);
        fule(78);

    }
}

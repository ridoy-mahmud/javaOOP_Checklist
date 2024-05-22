// Abstract class
abstract class Sunstar {
    abstract void printInfo();
}

// Abstraction performed using extends
class Employee extends Sunstar {
    void printInfo() {
        String name = "Ridoy";
        int age = 24;
        float salary = 80000.56F;
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

public class asbtructClass {
    public static void main(String args[]) {
        Sunstar s = new Employee();
        s.printInfo();
    }
}

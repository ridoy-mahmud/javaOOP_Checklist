import java.util.*;

public class construcotorWorking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        construcotorWorking obMain = new construcotorWorking();
        System.out.print("Enter your name - ");
        String Name = sc.nextLine();
        System.out.print("Enter your age - ");
        int Age = Integer.parseInt(sc.nextLine());
        getPar ob2 = new getPar(Name, Age);
        System.out.println("Your name is " + ob2.name + " and age is " + ob2.age);
        AreaCalc obj2 = new AreaCalc(45, 65);
        System.out.println(obj2.width);
    }

    public class AreaCalc {
        int length, width;

        // Default Constructor
        public AreaCalc() {
            length = 0;
            width = 0;
        }

        // Constructor with parameters
        public AreaCalc(int l, int w) {
            length = l;
            width = w;
        }
    }

    public class getPar {
        String name;
        int age;

        getPar(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}

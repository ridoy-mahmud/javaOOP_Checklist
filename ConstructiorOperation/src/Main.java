import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your name - ");
       String Name = sc.nextLine();
       System.out.print("Enter your age - ");
       int Age = Integer.parseInt(sc.nextLine());
       getPar ob1 = new getPar(Name, Age);
       System.out.println("Your name is " + ob1.name+" and age is " + ob1.age);
       AreaCalc obj2 = new AreaCalc(45,65);
       System.out.println(obj2.width);
    }
}

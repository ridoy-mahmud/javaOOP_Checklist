//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static class newObject {
        int a =20;
        void calc(){
           System.out.println("The value of a is "+a);
        }
    }
    int x = 5;
    public static void main(String[] args) {
        Main myObj1 = new Main();  // Object 1
        Main myObj2 = new Main();  // Object 2
        newObject newOb = new newObject();
        newOb.a=7;
        System.out.println(myObj2.x);
        newOb.calc();
    }
}

public class java_oop_class {
    static class newObject {
        int a = 20;

        void calc() {
            System.out.println("The value of a is " + a);
        }
    }

    int x = 5;

    public static void main(String[] args) {
        java_oop_class myObj1 = new java_oop_class(); // Object 1
        java_oop_class myObj2 = new java_oop_class(); // Object 2
        newObject newOb = new newObject();
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
        newOb.calc();
    }
}

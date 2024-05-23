public class superKey {
    // TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    public static void main(String[] args) {
        B ob = new B();
        A ob2 = new A();
        ob.display();

    }

}

class A {
    int a = 20;

    A() {
        System.out.println("Default Constructor from A");
    }

    A(int num) {
        System.out.println("Parameterized Constructor" + num);
    }

    void display() {
        System.out.println("Printing from A" + a);
    }
}

class B extends A {
    int a = 23;

    @Override
    void display() {
        super.display();
        System.out.println("Printing super class from B" + super.a);
    }

    void Message() {
        System.out.println("Hello i'm a message from B");
    }
    // B(){
    // System.out.println("B er Constructor");
    // }
}

class C {
    C() {
        super();
    }
}

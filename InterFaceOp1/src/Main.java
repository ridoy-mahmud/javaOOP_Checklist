interface A {
    void methodA();
}
interface B {
    void methodB();
}

interface C extends A, B {}
class D implements C {
    public void methodA() {
        System.out.println("Method A");
    }
    

    public void methodB() {
        System.out.println("Method B");
    }
}
public class Main {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA();
        obj.methodB();
    }
}


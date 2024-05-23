public class B  extends A{
    int a = 23;
    @Override
    void display(){
        super.display();
        System.out.println("Printing super class from B"+super.a);
    }
    void Message(){
        System.out.println("Hello i'm a message from B");
    }
//    B(){
//        System.out.println("B er Constructor");
//    }
}

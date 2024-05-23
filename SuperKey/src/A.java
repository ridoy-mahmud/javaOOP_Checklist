public class A {
    int a =20;

     A (){
         System.out.println("Default Constructor from A");
    }
    A (int num){
        System.out.println("Parameterized Constructor"+num);
    }
    void  display(){
        System.out.println("Printing from A"+a);
    }
}

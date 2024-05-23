public class Main {

    public static void main(String[] args) {
        Class1 ob1 = new Class1("The String for Class1.");
        Class2 ob2 = new Class2("The String for Class2.", 3);
        ob2.display();
        ob2.show_count();
        ob2.shwCount2();
    }
}
// Class 1
class Class1 {
    String string;

    Class1(String string) {
        this.string = string;
    }

    void display() {
        System.out.println("Displaying from Class1.");
        System.out.println("String in Class1: " + string);//The String for Class1
    }
    public void shwCount2(){
        System.out.println("Hello I'm from Class 1");
    }
}

// Class 2
class Class2 extends Class1 {
    int count;

    Class2(String string, int count) {
        super(string);
        this.count = count;
    }
    void display() {
        super.display();
        System.out.println("Displaying from Class2.");
        System.out.println("Count in Class2: " + count);
    }
    public void show_count() {
        System.out.println("Class2 " + this.count);
    }
}

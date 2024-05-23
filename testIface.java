interface call {
    void callback(int param);
}

class client implements call {
    public void callback(int p) {
        System.out.println("callback is called with " + p);
    }
}

class anotherclient implements call {
    @Override
    public void callback(int p) {
        System.out.println("p squred is " + (p * p));
    }
}

public class testIface {
    public static void main(String args[]) {
        call c = new client();
        c.callback(42);
        c = new anotherclient();
        c.callback(10);
    }
}
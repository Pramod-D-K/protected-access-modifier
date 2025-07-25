import p1.*;
import p2.B;

public class Main {
    public static void main(String[] args) {

        A st1 = new A();
        st1.b = 100;
        //st1.d = 200; not access using the parent class
        p2.B st2 = new B();
        C st3 = new C();
        st3.show();
    }
}

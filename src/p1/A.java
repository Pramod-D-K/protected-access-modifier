package p1;

public class A {
    int a;
    public int b;
    private int c;
    protected int d;

    public void setC(int c) {
        this.c = c;
    }

    public int getC() {
        return this.c;
    }
}

class D extends C{
    int i=d;
}
class E {
    A obj = new A();
    int j= obj.b;
}

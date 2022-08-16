class B {
    public B() {
// do nothing
        func();
    }
    public void func() {
        System.out.println("B.func()");
    }
}
class D extends B {
    private int num = 1;
    @Override
    public void func() {
        System.out.println("D.func() " + num);
    }
}
public class Main {
    public static void main(String[] args) {
        D d = new D();
    }
}


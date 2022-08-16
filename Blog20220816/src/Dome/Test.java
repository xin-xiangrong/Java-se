package Dome;
interface Interface {
    void show();
}
public class Test implements Interface{
    @Override
    public void show() {
        System.out.println("只执行一次show()");
    }
}
class Main {
    public static void main(String[] args) {

        Interface in = new Interface() {
            @Override
            public void show() {
                System.out.println("匿名内部类中重写show()");
            }
        };
        //调用接口方法
        in.show();
        //写法二
        new Interface() {
            @Override
            public void show() {
                System.out.println("匿名内部类中重写show()");
            }
        }.show();
    }
}

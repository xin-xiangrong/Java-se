package Dome;
class Class {
    public void show(String s){
        System.out.println("Class::show()");
    }
}
abstract class AbstractClass {
    abstract void show(String s);
}
interface Interface {
    void show(String s);
}
public class TestDome {
    public static void main(String[] args) {

        //重写普通类的方法
        new Class(){
            @Override
            public void show(String s) {
                System.out.println(s);
            }
        }.show("普通类");

        //重写抽象类的抽象方法
        new AbstractClass(){
            @Override
            void show(String s) {
                System.out.println(s);
            }
        }.show("抽象类");

        //实现接口的抽象方法
        new Interface(){
            @Override
            public void show(String s) {
                System.out.println(s);
            }
        }.show("接口");


    }
}

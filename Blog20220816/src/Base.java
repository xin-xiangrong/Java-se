public class Base {
    public Base(){
        System.out.println("Base()");
    }
}

class Derived extends Base{
    public Derived(){
// super(); // 注意子类构造方法中默认会调用基类的无参构造方法：super(),
// 用户没有写时,编译器会自动添加，而且super()必须是子类构造方法中第一条语句，
// 并且只能出现一次
        System.out.println("Derived()");
    }
}

class Test1 {
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}



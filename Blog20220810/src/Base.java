/*public class Base {
    public void methodA(){
        System.out.println("Base中的methodA()");
    }
}

public class Derived extends Base{
    public void methodB(){
        System.out.println("Derived中的methodB()方法");
    }
    public void methodC(){
        methodB(); // 访问子类自己的methodB()
        methodA(); // 访问父类继承的methodA()
// methodD(); // 编译失败，在整个继承体系中没有发现方法methodD()
    }
}

public class Base {
    public void methodA(){
        System.out.println("Base中的methodA()");
    }
    public void methodB(){
        System.out.println("Base中的methodB()");
    }
}
public class Derived extends Base{
    public void methodA(int a) {
        System.out.println("Derived中的method(int)方法");
    }
    public void methodB(){
        System.out.println("Derived中的methodB()方法");
    }
    public void methodC(){
        methodA(); // 没有传参，访问父类中的methodA()
        methodA(20); // 传递int参数，访问子类中的methodA(int)
        methodB(); // 直接访问，则永远访问到的都是子类中的methodB()，基类的无法访问到
    }
}
public class Base {
    int a;
    int b;
    public void methodA(){
        System.out.println("Base中的methodA()");
    }
    public void methodB(){
        System.out.println("Base中的methodB()");
    }
}


public class Base {
    int a;
    int b;
}
public class Derived extends Base{
    int c;
    public void method(){
        a = 10; // 访问从父类中继承下来的a
        b = 20; // 访问从父类中继承下来的b
        c = 30; // 访问子类自己的c
    }
}


public class Base {
    int a;
    int b;
    int c;
}

public class Derived extends Base{
    int a; // 与父类中成员a同名，且类型相同
    char b; // 与父类中成员b同名，但类型不同
    public void method(){
        a = 100; // 访问父类继承的a，还是子类自己新增的a？
        b = 101; // 访问父类继承的b，还是子类自己新增的b?
        c = 102; // 子类没有c，访问的肯定是从父类继承下来的c
// d = 103; // 编译失败，因为父类和子类都没有定义成员变量b
    }
}


// 为了掩饰基类中不同访问权限在子类中的可见性，为了简单类B中就不设置成员方法了
// extend01包中
public class B {
    private int a;
    protected int b;
    public int c;
    int d;
}

// extend01包中
// 同一个包中的子类
public class D extends B{
    public void method(){
// super.a = 10; // 编译报错，父类private成员在相同包子类中不可见
        super.b = 20; // 父类中protected成员在相同包子类中可以直接访问
        super.c = 30; // 父类中public成员在相同包子类中可以直接访问
        super.d = 40; // 父类中默认访问权限修饰的成员在相同包子类中可以直接访问
    }
}

// extend02包中
// 不同包中的子类
public class C extends B {
    public void method(){
// super.a = 10; // 编译报错，父类中private成员在不同包子类中不可见
        super.b = 20; // 父类中protected修饰的成员在不同包子类中可以直接访问
        super.c = 30; // 父类中public修饰的成员在不同包子类中可以直接访问
//super.d = 40; // 父类中默认访问权限修饰的成员在不同包子类中不能直接访问
    }
}

// extend02包中
// 不同包中的类
public class TestC {
    public static void main(String[] args) {
        C c = new C();
        c.method();
// System.out.println(c.a); // 编译报错，父类中private成员在不同包其他类中不可见
// System.out.println(c.b); // 父类中protected成员在不同包其他类中不能直接访问
        System.out.println(c.c); // 父类中public成员在不同包其他类中可以直接访问
// System.out.println(c.d); // 父类中默认访问权限修饰的成员在不同包其他类中不能直接访问
    }
}

 */

package extend02;

import extend01.B;

// extend02包中
// 不同包中的子类
public class C extends B {
    public void method(){
      //super.a = 10; // 编译报错，父类中private成员在不同包子类中不可见
        super.b = 20; // 父类中protected修饰的成员在不同包子类中可以直接访问
        super.c = 30; // 父类中public修饰的成员在不同包子类中可以直接访问
      //super.d = 40; // 父类中默认访问权限修饰的成员在不同包子类中不能直接访问
    }

    public static void main(String[] args) {
        C cc = new C();
        cc.show();
        cc.b = 10;
        System.out.println(cc.b);
    }
} 

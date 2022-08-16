public class OutClass {
    private int a;
    static int b;
    int c;
    public static final int d = 20;

    public void methodA() {
        a = 10;
        System.out.println(a);
    }

    public static void methodB() {
        System.out.println(b);
    }

    // 实例内部类：未被static修饰
    class InnerClass {
        int c;
//实例内部类当中 不能有静态的成员变量. 非要定义，那么只能是被static final修饰的
        public static final int d = 6;

        public void methodInner() {
// 在实例内部类中可以直接访问外部类中：任意访问限定符修饰的成员
            a = 100;
            b = 200;
            methodA();
            methodB();
            System.out.println(d);
// 如果外部类和实例内部类中具有相同名称成员时，优先访问的是内部类自己的
            c = 300;
            System.out.println(c);
// 如果要访问外部类同名成员时候，必须：外部类名称.this.同名成员名字
            OutClass.this.c = 400;
            System.out.println(OutClass.this.c);
        }
    }

    public static void main(String[] args) {
// 外部类：对象创建 以及 成员访问
        OutClass outClass = new OutClass();

        System.out.println(outClass.a);
        System.out.println(outClass.b);
        System.out.println(outClass.c);
        System.out.println(InnerClass.d);
        System.out.println(d);

        outClass.methodA();
        outClass.methodB();
        System.out.println("=============实例内部类的访问=============");
// 要访问实例内部类中成员，必须要创建实例内部类的对象
// 而普通内部类定义与外部类成员定义位置相同，因此创建实例内部类对象时必须借助外部类
// 创建实例内部类对象
        OutClass.InnerClass innerClass1 = new OutClass().new InnerClass();
// 上述语法比较怪异，也可以先将外部类对象先创建出来，然后再创建实例内部类对象
        OutClass.InnerClass innerClass2 = outClass.new InnerClass();
        innerClass2.methodInner();
    }
}

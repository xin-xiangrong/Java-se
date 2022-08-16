class OuterClass2 {
    public int data1 = 1;
    int data2 = 2;
    public static int data3 = 3;

    public void test() {
        System.out.println("out::test()");
    }


    // 静态内部类：被static修饰的成员内部类
    static class InnerClass2 {
        public int data4 = 4;
        int data5 = 5;
        public static int data6 = 6;



        public void func() {
            System.out.println("out::func()");

            //test();
            // 编译失败，在静态内部类中不能直接访问外部类中的非静态成员
            //System.out.println(data1);
            //System.out.println(data2);

            //外部类的非静态成员，需要通过外部类的对象的引用才能访问。
            OuterClass2 outerClass = new OuterClass2();
            System.out.println(outerClass.data1);
            System.out.println(outerClass.data2);
            outerClass.test();

            // 在内部类中只能访问外部类的静态成员
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data5);
            System.out.println(data6);

        }
    }
    public static void main(String[] args) {
        // 静态内部类对象创建 和 成员访问
        OuterClass2.InnerClass2 innerClass2 = new OuterClass2.InnerClass2();
        innerClass2.func();

    }
}

class OutClass3 {
    int a = 10;
    public void method(){
        int b = 10;
        // 局部内部类：定义在方法体内部
        // 不能被public、static等访问限定符修饰
        class InnerClass{
            public void methodInnerClass(){
                System.out.println(a);
                System.out.println(b);
            }
        }
        // 只能在该方法体内部使用，其他位置都不能用
        InnerClass innerClass = new InnerClass();
        innerClass.methodInnerClass();
    }
    public static void main(String[] args) {
    // OutClass.InnerClass innerClass = null; 编译失败
    }
}


class Person1 {
    public String name;
    public int age;
    public Organ organ = new Organ();
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("构造方法执行");
    }
    {
        System.out.println("实例代码块执行");
    }
    static {
        System.out.println("静态代码块执行");
    }
}
class Organ {
    //...
    public Organ() {
        System.out.println("实例变量::organ");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Person1 person1 = new Person1("xin",21);
        System.out.println("==============");
        Person1 person2 = new Person1("xinxin",20);
    }
}



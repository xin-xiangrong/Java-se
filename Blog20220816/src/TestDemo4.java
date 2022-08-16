class Person2 {
    public String name;
    public int age;
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person：构造方法执行");
    }
    {
        System.out.println("Person：实例代码块执行");
    }
    static {
        System.out.println("Person：静态代码块执行");
    }
}
class Student1 extends Person2{
    public Student1(String name,int age) {
        super(name,age);
        System.out.println("Student：构造方法执行");
    }
    {
        System.out.println("Student：实例代码块执行");
    }
    static {
        System.out.println("Student：静态代码块执行");
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        Student1 student1 = new Student1("张三",19);
        System.out.println("===========================");
        Student1 student2 = new Student1("gaobo",20);

    }
    public static void main1(String[] args) {
        Person2 person1 = new Person2("bit",10);
        System.out.println("============================");
        Person2 person2 = new Person2("gaobo",20);
    }
}
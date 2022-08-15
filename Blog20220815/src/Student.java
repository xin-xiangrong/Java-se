public class Student{
    private String name;
    private int age;
    private static String classRoom;
    //实例代码块
    {
        this.name = "xin";
        this.age = 21;
        System.out.println("I am instance init()!");
    }
    // 静态代码块
    static {
        classRoom = "rj2104";
        System.out.println("I am static init()!");
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
    }
}
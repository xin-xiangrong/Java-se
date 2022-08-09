class Person {
    private String name;
    //private修饰的成员变量只能在本类中访问
    private int age;

    String sex;
    //这里不加修饰符即为默认权限，默认是default权限

    public String getName() {
        return name;
    }
    //在其他类中不能直接访问name和age，
    //但可以在本类中提供公开的（public修饰）访问方法和外界进行交互
    //这里就是对成员变量进行了封装
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("姓名："+name+" 年龄: "+age);
    }

}

public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        //person.name = "bit";//不能直接进行访问
        person.setName("XIN-XIANG荣");
        person.setAge(21);
        //通过提供Person类中提供的方法间接进行访问
        System.out.println(person.getName()+" => "+person.getAge());
    }
}


package Dome2;

import java.util.Objects;

class Person {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        Person per1 = new Person("xin", 21) ;
        Person per2 = new Person("xin", 21) ;
        System.out.println(per1.hashCode());
        System.out.println(per2.hashCode());
    }
}

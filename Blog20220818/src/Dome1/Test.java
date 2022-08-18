package Dome1;

class Person{
    private String name ;
    private int age ;
    public Person(String name, int age) {

        this.age = age ;
        this.name = name ;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false ;
        }
        if(this == obj) {
            return true ;
        }
        //不是Person类对象
        if (!(obj instanceof Person)) {
            return false ;
        }
        Person person = (Person) obj ; // 向下转型，比较属性值
        return this.name.equals(person.name) && this.age==person.age ;
    }

}
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("xin", 20);
        Person p2 = new Person("xin", 20);
        Person p3 = new Person("rong", 21);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

    }
}

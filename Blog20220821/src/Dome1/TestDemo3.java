package Dome1;

class Money {
    public double m = 666;
}
class Person implements Cloneable{
    int id;
    public Money money = new Money();

    public Person(int id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", money=" + money.m +
                '}';
    }
}
public class TestDemo3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person(1);
        Person person2 = (Person) person1.clone();

        System.out.println("通过person2修改前的结果");
        System.out.println(person1);
        System.out.println(person2);

        person2.money.m = 888;
        person2.id = 2;
        System.out.println("通过person2修改后的结果");
        System.out.println(person1);
        System.out.println(person2);
    }
}

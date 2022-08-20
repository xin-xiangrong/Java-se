
class Money implements Cloneable{
    public double m = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable{
    public int id;
    public Money money = new Money();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        Person tmp = (Person) super.clone();
        tmp.money = (Money) this.money.clone();
        return tmp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException{
        Person person = new Person();

        Person person2 = (Person)person.clone();
        person2.money.m = 1999;

        System.out.println("person："+person.money.m);

        System.out.println("person2："+person2.money.m);
    }
}


import java.util.Objects;

/* class Person {
    private String name ;
    private int age ;
    public Person(String name, int age) {
        this.age = age ;
        this.name = name ;
    }

 */

   /* @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false ;
        }
        if(this == obj) {
            return true ;
        }
        // 不是Person类对象 是不是同种类型
        if (!(obj instanceof Person)) {
            return false ;
        }


        Person per = (Person) obj;
        if(this.name.equals(per.name) && this.age == per.age) {
            return true;
        }
        return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }*/
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        //计算对象的位置
        return Objects.hash(name, age);
    }
}

class Student {

}

public class Test6 {


    public static void main(String[] args) {
        Person person1 = new Person("张三",18);
        Person person2 = new Person("张三",18);

        System.out.println(person1.equals(person2));

        System.out.println("==============");
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());


    }
}

 */

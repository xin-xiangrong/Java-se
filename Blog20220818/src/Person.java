public class Person {
    String name;
    String gender;
    int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;

    }
    public static void main(String[] args) {
        Person person = new Person("xin","男", 21);
        System.out.println(person);
    }
}
package Dome2;


import java.util.Arrays;
import java.util.Comparator;
class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}

class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("xin",10);
        Student student2 = new Student("rong",40);

        AgeComparator ageComparator = new AgeComparator();

        if(ageComparator.compare(student1,student2) > 0) {
            System.out.println("student1 > student2");
        }else if(ageComparator.compare(student1,student2) == 0){
            System.out.println("student1 = student2");
        }else{
            System.out.println("student1 < student2");
        }
    }
    public static void main1(String[] args) {
        Student[] stu = {
                new Student("ghi",18),
                new Student("def", 15),
                new Student("abc",20)
        };
        System.out.println("以年龄进行排序");
        Arrays.sort(stu, new AgeComparator());
        System.out.println(Arrays.toString(stu));

        System.out.println("再以姓名进行排序");
        Arrays.sort(stu, new NameComparator());
        System.out.println(Arrays.toString(stu));
    }
}

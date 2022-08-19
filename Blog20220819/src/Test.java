import java.util.Arrays;

class Student implements Comparable<Student>{
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

    @Override
    public int compareTo(Student o) {
        if (this.age == o.age){
            return 0;
        }else if (this.age < o.age){
            return -1;
        }else {
            return 1;
        }
    }
}
public class Test {
    public static void bubbleSort(Comparable[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j].compareTo(array[j+1]) > 0) {
                    Comparable tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Student[] stu = {
                new Student("zhansan",18),
                new Student("lisi", 20),
                new Student("zhaoliu",15)
        };
        /*int[] array = {9,8,7,6,5,4,3,2,1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));*/

        //Arrays.sort(stu);
        bubbleSort(stu);
        System.out.println(Arrays.toString(stu));
    }
}

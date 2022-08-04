public class Student {
    public String name;
    public int age;

    public void setStudent(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showStudent(){
        System.out.println(name+"->"+age);
    }

    public static void main1(String[] args) {
        Student stu = new Student();
        stu.setStudent("张三", 20);
        stu.showStudent();
    }

    //模拟实现toString
    public static String myToString(int[] array){
       if(array == null){
           return "null";
       }

       String ret = "[";
       for (int i = 0; i < array.length; i++) {
           ret += array[i];
           if(i != array.length-1){
               ret += ",";
           }
       }
       ret += "]";

       return ret;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        String ret = myToString(array);
        System.out.println(ret);
    }
}

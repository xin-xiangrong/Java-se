public class Student2{
    // ...
    private static String classRoom;
    static {
        classRoom = "rj2104";
    }

    // ...
    public static String getClassRoom(){
        return classRoom;
    }
}

class TestStudent {
    public static void main(String[] args) {
        System.out.println(Student2.getClassRoom());
    }
}

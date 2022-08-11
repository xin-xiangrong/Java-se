public class Test {
    //字符串替换
    public static void main(String[] args) {
        String str = "xinxinxiangrong";
        String str1 = str.replace('x','y');
        System.out.println(str1);
        System.out.println(str.replace("xin","bit"));
        System.out.println(str.replaceAll("xin","bit"));
        System.out.println(str.replaceFirst("xin","bit"));
    }
    //字符串转数组
    public static void main6(String[] args) {
        String str = "hello world";
        char[] ch = str.toCharArray();
        for (char s:ch) {
            System.out.println(s);
        }
        //数组转字符串
        String str2 = new String(str);
        System.out.println(str);
        //格式化输出字符串
        String str3 = String.format("%06d-%06d-%06d",2022,8,11);
        System.out.println(str3);
    }
    //大小写转换
    public static void main5(String[] args) {
        String str1 = "hello WORLD";
        String str2 = "xinxinXIANGRONG";
        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());

    }
    //字符串转换
    public static void main4(String[] args) {
        //它类转换为字符串
        String str1 = String.valueOf(1234);
        String str2 = String.valueOf(66.99);
        String str3 = String.valueOf(true);
        String str4 = String.valueOf(new Student("张三", 20));
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println("---------------------------------------");
        //字符串转为数字
        int data1 = Integer.parseInt("1234");
        double data2 = Double.parseDouble("66.88");
        System.out.println(data1);
        System.out.println(data2);

    }
    //字符/字符串的查找
    public static void main3(String[] args) {
        String  str = "xinxinxiangrong";
        char ret = str.charAt(5);
        System.out.println(ret);
        System.out.println(str.indexOf('r'));
        System.out.println(str.indexOf('x',2));
        System.out.println(str.indexOf("rong"));
        System.out.println(str.indexOf("xin", 1));
        System.out.println(str.lastIndexOf('g'));
        System.out.println(str.lastIndexOf("xin"));
        System.out.println(str.lastIndexOf('g',13));
        System.out.println(str.lastIndexOf("xin",2));
    }
    //字符串的比较
    public static void main2(String[] args) {
        String str1 = "xingxiangxiangrong";
        String str2 = "i love you";
        String str3 = "i love you";
        //System.out.println(str2.equals(str3));
        //System.out.println(str2.equals(str1));
        System.out.println(str1.compareTo(str2));
        System.out.println(str3.compareTo(str2));

    }
    //字符串的创建
    public static void main1(String[] args) {
        String str = "hello world";
        String str1 = new String(str);
        System.out.println(str);
        System.out.println(str1);
        char[] array = {'h','e','l','l','o',' ','w','o','r','l','d'};
        String str3 = new String(array);
        System.out.println(str3);
        System.out.println(array);
        int[] array1 = {1,2,3};
        System.out.println(array1);
        if(str1 == str){
            System.out.println("==");
        }
    }
}
class Student{
    String name;
    int age;

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
}

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
public class Test {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = sb1;

        // 追加：即尾插-->字符、字符串、整形数字
        sb1.append(' '); // hello
        sb1.append("world"); // hello world
        sb1.append(123); // hello world123
        System.out.println(sb1); // hello world123

        System.out.println(sb1 == sb2); // true

        System.out.println(sb1.charAt(0)); // 获取0号位上的字符 h

        System.out.println(sb1.length()); // 获取字符串的有效长度14

        System.out.println(sb1.capacity()); // 获取底层数组的总大小

        sb1.setCharAt(0, 'H'); // 设置任意位置的字符 Hello world123

        sb1.insert(0, "Hello world!!!"); // Hello world!!!Hello world123
        System.out.println(sb1);

        System.out.println(sb1.indexOf("Hello")); // 获取Hello第一次出现的位置

        System.out.println(sb1.lastIndexOf("hello")); // 获取hello最后一次出现的位置

        sb1.deleteCharAt(0); // 删除首字符
        sb1.delete(0,5); // 删除[0, 5)范围内的字符

        String str = sb1.substring(0, 5); // 截取[0, 5)区间中的字符以String的方式返回
        System.out.println(str);

        sb1.reverse(); // 字符串逆转
        str = sb1.toString(); // 将StringBuffer以String的方式返回
        System.out.println(str);
    }
    public static void main29(String[] args) {
        String str = "xinxinxianrong";
        System.out.println(str.contains("inx"));
    }
    public static void main28(String[] args) {
        String str = "xinxinxianrong";
        System.out.println(str.startsWith("xin"));
        System.out.println(str.endsWith("rong"));
    }
    public static void main27(String[] args) {
        String str = "xinxinxiangrong";
        System.out.println(str.length());
    }
    public static void main26(String[] args) {
        String str = "";
        System.out.println(str.isEmpty());
    }
    public static void main25(String[] args) {
        String str = "192.168.1.1" ;
        String[] result = str.split("\\.") ;
        for(String s: result) {
            System.out.println(s);
        }
    }
    public static void main24(String[] args) {
        String str = "      hello world      " ;
        System.out.println("["+str+"]");
        System.out.println("["+str.trim()+"]");
    }
    public static void main23(String[] args) {
        String str = "helloworld" ;
        System.out.println(str.substring(5));
        System.out.println(str.substring(0, 5));
    }
    public static void main22(String[] args) {
        String str = "hello world hello rong" ;
        String[] result = str.split(" ",2) ;
        for(String s: result) {
            System.out.println(s);
        }
    }
    public static void main21(String[] args) {
        //字符串多次拆封
        String str = "xin&xin=xiang&rong";
        String[] str1 = str.split("&");
        for (int i = 0; i < str1.length; i++) {
            String[] str2 = str1[i].split("=");
            for (String x:str2) {
                System.out.println(x);
            }
        }
        System.out.println("=================");
        String s = "name=zhangsan&age=18" ;
        String[] result = s.split("&") ;
        for (int i = 0; i < result.length; i++) {
            String[] temp = result[i].split("=") ;
            System.out.println(temp[0]+" = "+temp[1]);
        }
    }
    public static void main20(String[] args) {
        String str = "hello world hello rong";
        String[] result = str.split(" ") ; // 按照空格拆分
        for(String s: result) {
            System.out.println(s);
        }

        System.out.println("==========");

        String str1 = "xin&xin=xiang&rong";
        String[] str2 = str1.split("&|=");//按照=和&拆分
        for(String s: str2) {
            System.out.println(s);
        }
    }
    public static void main19(String[] args) {
        String str = "helloworld" ;
        System.out.println(str.replaceAll("l", "_"));
        System.out.println(str.replaceFirst("l", "_"));
    }
    public static void main18(String[] args) {
        String s1 = String.format("%d-%d-%d", 2022, 8, 29);
        System.out.println(s1);
    }

    public static void main17(String[] args) {
        String s = "hello";
        // 字符串转数组
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
        // 数组转字符串
        String s2 = new String(ch);
        System.out.println(s2);
    }

    public static void main16(String[] args) {
        String s1 = "hello";
        String s2 = "HELLO";
        // 小写转大写
        System.out.println(s1.toUpperCase());
        // 大写转小写
        System.out.println(s2.toLowerCase());
    }
    public static void main15(String[] args) {
        // 值转字符串
        String s1 = String.valueOf(1234);
        String s2 = String.valueOf(12.34);
        String s3 = String.valueOf(true);
        String s4 = String.valueOf(new Student("Hanmeimei", 18));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("=================================");
        // 字符串转数字
        //Integer、Double等是Java中的包装类型
        int data1 = Integer.parseInt("1234");
        double data2 = Double.parseDouble("12.34");
        System.out.println(data1);
        System.out.println(data2);
    }

    public static void main14(String[] args) {
        String s = "aaabbbcccaaabbbccc";
        System.out.println(s.charAt(3)); // 'b'
        System.out.println(s.indexOf('c')); // 6
        System.out.println(s.indexOf('c', 10)); // 15
        System.out.println(s.indexOf("bbb")); // 3
        System.out.println(s.indexOf("bbb", 10)); // 12
        System.out.println(s.lastIndexOf('c')); // 17
        System.out.println(s.lastIndexOf('c', 10)); // 8
        System.out.println(s.lastIndexOf("bbb")); // 12
        System.out.println(s.lastIndexOf("bbb", 10)); // 3
    }
    public static void main13(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("ac");
        String s3 = new String("ABc");
        String s4 = new String("abcdef");
        System.out.println(s1.compareToIgnoreCase(s2)); // 不同输出字符差值-1
        System.out.println(s1.compareToIgnoreCase(s3)); // 相同输出 0
        System.out.println(s1.compareToIgnoreCase(s4)); // 前k个字符完全相同，输出长度差值 -3
    }
    public static void main12(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("ac");
        String s3 = new String("abc");
        String s4 = new String("abcdef");
        System.out.println(s1.compareTo(s2)); // 不同输出字符差值-1
        System.out.println(s1.compareTo(s3)); // 相同输出 0
        System.out.println(s1.compareTo(s4)); // 前k个字符完全相同，输出长度差值 -3
    }

    public static void main11(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = new String("Hello");
// s1、s2、s3引用的是三个不同对象，因此==比较结果全部为false
        System.out.println(s1 == s2); // false
        System.out.println(s1 == s3); // false
// equals比较：String对象中的逐个字符
// 虽然s1与s2引用的不是同一个对象，但是两个对象中放置的内容相同，因此输出true
// s1与s3引用的不是同一个对象，而且两个对象中内容也不同，因此输出false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
    }
    public static void main10(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = new String("Hello");
        // s1、s2、s3引用的是三个不同对象，因此==比较结果全部为false
        System.out.println(s1 == s2); // false
        System.out.println(s1 == s3); // false
        // equals比较：String对象中的逐个字符
        // 虽然s1与s2引用的不是同一个对象，但是两个对象中放置的内容相同，因此输出true
        // s1与s3引用的不是同一个对象，而且两个对象中内容也不同，因此输出false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
    }
    public static void main9(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;
        // 对于基本类型变量，==比较两个变量中存储的值是否相同
        System.out.println(a == b); // false
        System.out.println(a == c); // true
        // 对于引用类型变量，==比较两个引用变量引用的是否为同一个对象
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = new String("world");
        String s4 = s1;
        System.out.println(s1 == s2); // false
        System.out.println(s2 == s3); // false
        System.out.println(s1 == s4); // true
    }
    public static void main8(String[] args) {
        String str = "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        for (int i = 0; i < 50; i++) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder);
    }

    public static void main7(String[] args) {
        String str = "";
        for (int i = 0; i < 50; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(i);
            str = stringBuilder.toString();
        }
        System.out.println(str);
    }

    public static void main6(String[] args) {
        String str = "";
        for (int i = 0; i < 100; i++) {
            str += i;
        }
        System.out.println(str);
    }

    public static void main5(String[] args) {
        long start = System.currentTimeMillis();
        String s = "";
        for(int i = 0; i < 10000; ++i){
            s += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("");
        for(int i = 0; i < 10000; ++i){
            sbf.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
        start = System.currentTimeMillis();
        StringBuilder sbd = new StringBuilder();
        for(int i = 0; i < 10000; ++i){
            sbd.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void main4(String[] args) {
        char[] ch = new char[]{'a', 'b', 'c'};
        String s1 = new String(ch); // s1对象并不在常量池中
        //s1.intern(); // s1.intern()；调用之后，会将s1对象的引用放入到常量池中
        String s2 = "abc"; // "abc" 在常量池中存在了，s2创建时直接用常量池中"abc"的引用
        System.out.println(s1 == s2);
    }
    // 输出false
    // 将上述方法打开之后，就会输出true
    public static void main3(String[] args) {
        // 使用常量串构造
        String s1 = "hello bit";
        System.out.println(s1);
        // 直接newString对象
        String s2 = new String("hello bit");
        System.out.println(s1);
        // 使用字符数组进行构造
        char[] array = {'h','e','l','l','o','b','i','t'};
        String s3 = new String(array);
        System.out.println(s1);
    }
    public static void main2(String[] args) {
        // s1和s2引用的是不同对象 s1和s3引用的是同一对象
        String s1 = new String("hello");
        String s2 = new String("world");
        String s3 = s1;
        System.out.println(s1.length()); // 获取字符串长度---输出5
        System.out.println(s1.isEmpty()); // 如果字符串长度为0，返回true，否则返回false
    }
    public static void main1(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // false
    }

}

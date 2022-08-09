/*import java.util.Date;
public class Test1 {
    public static void main(String[] args) {
        Date date = new Date();
        // 得到一个毫秒级别的时间戳
        System.out.println(date.getTime());
    }
}

 */
/*import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        Date date = new Date();
        // 得到一个毫秒级别的时间戳
        System.out.println(date.getTime());
    }
}

 */
/*import java.util.*;
import java.sql.*;
public class Test1 {
    public static void main(String[] args) {
        // util 和 sql 中都存在一个 Date 这样的类, 此时就会出现歧义, 编译出错
        Date date = new Date();
        System.out.println(date.getTime());
    }
}

 */

/*import java.util.*;
import java.sql.*;
public class Test1 {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        System.out.println(date.getTime());
    }
}

 */
/*import static java.lang.Math.*;
public class Test1 {
    public static void main(String[] args) {
        double x = 30;
        double y = 40;
// 静态导入的方式写起来更方便一些.
// double result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double result = sqrt(pow(x, 2) + pow(y, 2));
        System.out.println(result);
    }
}

 */
import java.lang.Math;
public class Test1 {
    public static void main(String[] args) {
        double x = 30;
        double y = 40;
        double result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(result);
    }
}
import java.util.Scanner;

public class Test {
    public static void main1(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String age = scan.next();
            String name = scan.next();
            System.out.println(age+" "+name);
        }
    }
    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public static void main2(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("输入三个整数");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int ret = max3(num1, num2, num3);
        System.out.println("最大值:>"+ret);

    }
    public static int max2(int a, int b){
        return a>b ? a : b;
    }
    public static int max3(int x, int y,int z){
        return max2(x, max2(y,z));
    }
    //求n的阶乘
    public static void main3(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n+"的阶乘为:>"+fac(n));
    }
    //求1！+2！+3！+4！+........+n!的和
    public static void main4(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        int sum = 0;
        for(i = 1; i <= n; i++){
            sum += fac(i);
        }
        System.out.println("和:>"+sum);
    }
    public static int fac(int n){
       int i = 0;
       int ret = 0;
       for(i = 1,ret = 1; i <= n; i++){
           ret *= i;
       }
       return ret;
    }
    //求斐波那契数列的第n项。(迭代实现)
    public static void main5(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("第"+n+"个斐波那契数为:>"+fib(n));
    }
    public static int fib(int n){
        int a = 1;
        int b = 1;
        int c = 0;
        if(n <= 2){
            return 1;
        }
        else{
            int i = 0;
            for(i = 1; i <= n-2; i++){
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
    //同一个类中,分别定义求两个整数的方法和三个小数之和的方法。 并执行代码，求出结果
    public static void main6(String[] args){
        System.out.println("2+5="+add(2,5));
        System.out.println("3.5+6.5+1.5="+add(3.5,1.5,6.5));
    }
    public static int add(int a, int b){
        return a + b;
    }
    public static double add(double a, double b,double c){
        return a + b + c;
    }
    public static void main(String[] args){
        cmp(66, 88);
        cmp(4.5, 8.8, 6.6);

    }
    public static void cmp(int a, int b){
        int max = a>b ? a : b;
        System.out.println(a+"、"+b+"的最大值为"+max);
    }
    public static void cmp(double a, double b, double c){
        double d = a>b ? a : b;
        double max = d > c ? d : c;
        System.out.println(a+"、"+b+"、"+c+"的最大值为"+max);
    }
}

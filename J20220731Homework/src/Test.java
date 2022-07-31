import java.util.Scanner;

public class Test {
    //递归求 N 的阶乘
    public static int fac(int n){
        if(n == 1){
            return 1;
        }
        return n * fac(n - 1);
    }
    //递归求 1 + 2 + 3 + ... + 10
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n - 1);
    }
    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
    public static void print(int n){
        if (n < 10){
            System.out.print(n+" ");
            return;
        }
        print(n / 10);
        System.out.print(n % 10+" ");
    }
    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int posSum(int n){
        if (n < 10){
            return 1;
        }
        return n % 10 + posSum(n/10);
    }
    //递归求斐波那契数列的第 N 项
    public static int fib(int n ){
        if(n <= 2){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    //递归求解汉诺塔问题

    /**
     *
     * @param n 盘子数
     * @param pos1 起始位置
     * @param pos2 中转位置
     * @param pos3 目标位置
     */
    public static void hanoi(int n, char pos1, char pos2,char pos3){
        if(n == 1){
            System.out.print(pos1+"->"+pos3+" ");
            return;
        }
        hanoi(n-1, pos1, pos3, pos2);
        System.out.print(pos1+"->"+pos3+" ");
        hanoi(n-1, pos2, pos1, pos3);
    }
    public static void main1(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        hanoi(n, 'A', 'B', 'C');
        System.out.println();
    }
    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static void main2(String[] args){
        int[] arr = new int[100];
        int i = 0;
        for(i = 0; i < arr.length;i++){
            arr[i] = (i + 1);
        }
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }
    public static void printArray(int[] arr){
        int i = 0;
        for(i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = new int[10];
        int i = 0;
        for(i = 0; i < arr.length;i++){
            arr[i] = (i + 1);
        }
        printArray(arr);
    }

}

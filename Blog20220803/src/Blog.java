import java.util.Arrays;
import java.util.Scanner;

public class Blog {
    public static void main2(String[] args) {
        add(1, 2); // 调用add(int, int)
        add(1.5, 2.5); // 调用add(double, double)
        add(1.5, 2.5, 3.5); // 调用add(double, double, double)
    }
    public static int add(int x, int y) {
        return x + y;
    }
    public static double add(double x, double y) {
        return x + y;
    }
    public static double add(double x, double y, double z) {
        return x + y + z;
    }
    public static void main1(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += fac(i);
        }
        System.out.println("sum = " + sum);
    }
    // 方法的定义
    public static int fac(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("计算 n 的阶乘中"+n+"! = " + result);
        return result;
    }
    public static int add1(int x, int y) {
        return x + y;
    }

    public static void main3(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(array[3]);
        // 数组中只有3个元素，下标一次为：0 1 2，array[3]下标越界

    }
    public static void func() {
        int[] array1 = new int[3];
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;
        int[] array2 = new int[]{1,2,3,4,5};
        array2[0] = 100;
        array2[1] = 200;
        array1 = array2;
        array1[2] = 300;
        array1[3] = 400;
        array2[4] = 500;
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }

    public static void main4(String[] args) {
        int[] arr = null;
        System.out.println(arr[0]);
    }
    public static void main5(String[] args) {
        int[] arr = {1, 2, 3};
        func(arr);
        System.out.println("arr[0] = " + arr[0]);
    }
    public static void func(int[] a) {
        a[0] = 10;
        int[][] array1 = new int[2][];
        array1[0] = new int[3];
        array1[1] = new int[4];
        System.out.println("a[0] = " + a[0]);
    }
    public static void main6(String[] args) {
        int[][] array1 = new int[2][3];
        //第一种方法
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //第二种方法
        for (int[] arr : array1) {
            for (int x : arr) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static void main7(String[] args){
        int arr[] = {1,2,3,4,5,6};
        int ret[][] = {{6,6,6},{8,8,8}};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ret[0]));
        System.out.println(Arrays.toString(ret[1]));
    }

    public static void main8(String[] args) {
        int ret[][] = {{6,6,6},{8,8,8}};
        System.out.println(Arrays.deepToString(ret));
    }
    public static void main9(String[] args) {
        int[] array = {1,3,5,7,91,11,22,44,88,18,29,17,14};

        //将数组arrayy拷贝到array2
        int[] array2 = Arrays.copyOf(array,array.length);
        //扩容array3的空间是array的2倍，同时将数组arrayy拷贝到array2
        int[] array3 = Arrays.copyOf(array,2*array.length);

        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }

    public static void main10(String[] args) {
        int[] array = {1,3,5,7,91,11,22,44,88,18,29,17,14};
        //拷贝下标为2到4的元素，包含5
        int[] array2 = Arrays.copyOfRange(array,2,5);//[2,5)
        System.out.println(Arrays.toString(array2));
    }

    public static void main11(String[] args) {
        int[] array = {1,3,5,7,91,11,22,44,88,18,29,17,14};
        int[] copy = new int[array.length];
        //局部的拷贝
        System.arraycopy(array,0,copy,3,array.length-3);
        System.out.println(Arrays.toString(copy));
    }
    public static void main12(String[] args) {
        int[] array = {1,3,5,7,91,11,22,44,88};

        int[] copy = array.clone();
        System.out.println(Arrays.toString(copy));
    }
    public static void main13(String[] args) {
        int[] array = {1,3,5,7,91,11,22,44,88};
        int[] arr = {1,3,5,7,91,11,22,44,88};

        boolean ret = Arrays.equals(array, arr);
        System.out.println(ret);
    }
    public static void main14(String[] args) {
        int[] array = {1,3,5,7,91,11,22,44,88};
        int[] arr = {1,3,5,7,91,11,22,44,88};

        Arrays.fill(arr, 6);
        Arrays.fill(array, 2, 5, 0);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));
    }
    public static void main15(String[] args) {
        int[] array = {1,3,5,7,91,11,22,44,88};
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();

        int pos = Arrays.binarySearch(array, k);

        System.out.println("下标为:>"+pos);
    }
    public static void main(String[] args) {
        int[] array = {1,5,3,2,91,11,44,22,88};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

}


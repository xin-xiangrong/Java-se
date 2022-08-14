import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static int findNum(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
    public static void main(String[] args){
        int[] arr = {1,1,2,3,4,5,5,5,5,5,5,5,5,5};
        int ret = findNum(arr);
        System.out.println(ret);
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //容易忽略
        if(n == 1){
            System.out.println(n + "不是素数");
            return;
        }
        int i;
        for (i = 2;i <= Math.sqrt(n);i++) {
            if(n%i == 0) {
                System.out.println(n + "不是素数");
                break;
            }
        }
        if(i > Math.sqrt(n)) {
            System.out.println(n + "是素数");
        }
    }
}

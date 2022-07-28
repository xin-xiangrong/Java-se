import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int ret = random.nextInt(101);
        while(true){
            System.out.println("输入你所猜的数字");
            int num = scan.nextInt();
            if(ret < num){
                System.out.println("猜大了");
            }else if(ret > num){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
        scan.close();

    }
    public static void main4(String[] args) {
        int i = 0;
        for(i = 1; i <= 100; i++) {
            if((i%3!=0) ||(i%5!=0)) {
                continue;
            }
            System.out.println(i);
        }
    }
    public static void main3(String[] args) {
        int i = 0;
        int ret = 0;
        int sum = 0;
        for(i = 1; i <= 5; i++) {
            int j = 0;
            for(j = 1, ret = 1; j <= i; j++) {
                ret *= j;
            }
            sum += ret;
        }
        System.out.println(sum);

    }  
    public static void main2(String[] args) {
        int i = 0;
        int ret = 0;
        int sum = 0;
        for(i = 1, ret = 1; i <= 5; i++){
            ret *= i;
            sum += ret;
        }
        System.out.println(sum);
    }
    public static void main1(String[] args) {
        int i = 0;
        int j = 0;
        int sumOdd = 0;
        int sumEven = 0;
        for(i = 1, j = 2; i <= 100 || j <= 100; i += 2, j += 2){
            sumOdd += i;
            sumEven += j;
        }
        System.out.println("1到100的和:>"+(sumOdd+sumEven));
        System.out.println("奇数和:>"+sumOdd);
        System.out.println("偶数和:>"+sumEven);

    }
}

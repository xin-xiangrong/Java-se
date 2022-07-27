import java.util.Scanner;

public class Test {
    //数字9 出现的次数
    //编写程序数一下 1到 100 的所有整数中出现多少个数字9
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        for(i = 0;i <= 100; i++){
            if(i%10 == 9) {
                count++;
            }
            if(i / 10 == 9) {
                count++;

            }
        }
        System.out.println(count);

    }
    //输出1000-2000之间所有的闰年
    public static void main3(String[] args) {
        int year = 0;
        for(year = 1000; year <= 2000; year++){
            if((year%4==0 && year%100!=0) || year%400==0){
                System.out.println(year);
            }
        }

    }
    //判断素数
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 0;
        for(i = 2; i < num; i++){
            if(num % i == 0){
                System.out.println("不是素数");
                break;
            }
        }
        if(i >= num){
            System.out.println("是素数");
        }
    }
    //输出1-100之间所有的素数
    public static void main1(String[] args) {
        int num = 0;
        int i = 0;
        for(num = 1; num <= 100; num++){
            for(i = 2; i < num; i++){
                if(num % i == 0){
                    break;
                }
            }
            if(i >= num){
                System.out.println(num);
            }
        }
    }

} 

import java.util.Scanner;

public class Test {
    //求一个整数，在内存当中存储时，二进制1的个数。
    public static void main1(String[] args){
        System.out.print("输入一个整数:>");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 0;
        int count = 0;
        for(i = 0; i < 32; i++){
            if(((num>>i) & 1) == 1){
                count++;
            }
        }
        //输出
        System.out.println("二进制1的个数:>"+count);
        scanner.close();
    }
    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
    public static void main2(String[] args){
        int i = 1;
        int flag = 1;
        double sum = 0;
        for(i = 1; i <= 100; i++){
            sum += 1.0/i*flag;
            flag = -flag;
        }
        System.out.println("和:>"+sum);
    }
    //求出0～n之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，
    //其各位数字的立方和确好等于该数本 身，如；153＝1^3＋5^3＋3^3，则153是一个“水仙花数“。）
    public static void main3(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入n:>");
        int n = scanner.nextInt();
        int num = 0;
        for(num = 100; num <= n; num++){
            int ret = num;
            int sum = 0;
            while(ret > 0){
                sum += (ret%10)*(ret%10)*(ret%10);
                ret /= 10;
            }
            if(sum == num){
                System.out.println(num);
            }
        }
        scanner.close();
    }
    //打印X形状
    /*import java.util.Scanner;
    public class Main{
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            while(scan.hasNextInt()){
                int n = scan.nextInt();
                int i = 0;
                int j = 0;
                for(i = 0; i < n; i++){
                    for(j = 0; j < n; j++){
                        if((i==j) || (j==n-i-1)){
                            System.out.print('*');
                        }
                        else{
                            System.out.print(' ');
                        }

                    }
                    System.out.print('\n');
                }
            }
            scan.close();
        }
    }
     */
    //输出乘法口诀表
    public static void main4(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        int j = 0;
        for(i = 1; i <= n; i++){
            for(j = 1; j <= i; j++){
                System.out.printf("%-2d*%-2d=%-3d ", j, i, i*j);
            }
            System.out.printf("\n");
        }
        scan.close();
    }
    //输出一个整数的每一位
    public static void main5(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n > 0){
            System.out.printf("%d,",n%10);
            n /= 10;
        }
        scan.close();
    }
    //编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，
    //提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
    public static void main6(String[] args){
       String password = "javayyds";
       String str = "";
       Scanner scan = new Scanner(System.in);
       int count = 0;
       for(count = 3; count > 0; count--){
           System.out.println("请输入密码");
           str = scan.nextLine();
           if(password.equals(str)){
               System.out.println("登录成功");
               break;
           }else{
               System.out.println("密码错误，请重新输入");
           }
       }
       scan.close();
    }
    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int num = scan.nextInt();
        int i= 0;
        System.out.println("偶数位序列");
        for(i = 0; i < 32; i+=2)
        {
            System.out.print((num>>i) & 1);
        }
        System.out.print('\n');
        System.out.println("奇数位序列");
        for(i = 1; i < 32; i+=2)
        {
            System.out.print((num>>i) & 1);
        }
        scan.close();
    }

    }
}

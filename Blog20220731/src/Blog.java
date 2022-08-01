import java.util.Scanner;// 需要导入 util 包

public class Blog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        while (scan.hasNextInt()) {
            int tmp = scan.nextInt();
            sum += tmp;
            num++;
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + sum / num);
        scan.close();
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你的姓名：");
        String name = sc.nextLine();

        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();

        System.out.println("请输入你的工资：");
        float salary = sc.nextFloat();

        System.out.println("你的信息如下：");
        System.out.println("姓名: "+name+"\n"+"年龄："+age+"\n"+"工资："+salary);

        sc.close(); // 注意, 要记得调用关闭方法
    }
}

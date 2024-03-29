package user;

import operations.*;

import java.util.Scanner;

public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
        this.iOperation = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("---------------------------------");
        System.out.println("Hello 管理员:>"+""+name+" 欢迎来到图书管理系统！");
        System.out.println("      1.查找图书  2.新增图书");
        System.out.println("      3.删除图书  4.显示图书");
        System.out.println("           0.退出系统");
        System.out.println("---------------------------------");
        System.out.println("请输入你的操作:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}

import java.util.Scanner;

public class Login {
    private String userName = "rong";
    private String passWoorld = "123456";

    public void loginInfo(String userName,String passWoorld) throws UserNameErrorException,PassWorldException{
        if(!this.userName.equals(userName)){
            throw new UserNameErrorException("用户名错误");
        }
        if(!this.passWoorld.equals(passWoorld)){
            throw new PassWorldException("密码错误");
        }
        System.out.println("登录成功！");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入用户名:");
        String userName = scanner.nextLine();
        System.out.println("输入密码:");
        String passWorld = scanner.nextLine();
        try{
            Login login = new Login();
            login.loginInfo(userName, passWorld);
        }catch (UserNameErrorException | PassWorldException e){
            e.printStackTrace();
        }finally{
            scanner.close();
        }
    }
}

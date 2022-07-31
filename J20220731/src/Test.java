public class Test {
    public static void print(int n){
        if(n < 10){
            System.out.println(n);
            return;
        }

        print(n/10);
        System.out.println(n%10);
    }
    public static int sum(int n){
        if(n < 10){
            return n;
        }
        return sum(n/10) + (n%10);
    }

    public static void main(String[] args) {
        print(1234);
        System.out.println(sum(1234));
    }
}

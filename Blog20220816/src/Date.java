public class Date {
    public int year;
    public int month;
    public int day;

    // 构造方法：
    // 名字与类名相同，没有返回值类型，设置为void也不行
    // 一般情况下使用public修饰
    // 在创建对象时由编译器自动调用，并且在对象的生命周期内只调用一次
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("Date(int,int,int)方法被调用了");
    }

    public void printDate() {
        System.out.println(year + "-" + month + "-" + day);
    }

    public static void main(String[] args) {
        // 此处创建了一个Date类型的对象，并没有显式调用构造方法
        Date d = new Date(2021, 6, 9);
        // 输出Date(int,int,int)方法被调用了
        d.printDate(); // 2021-6-9
    }
}





